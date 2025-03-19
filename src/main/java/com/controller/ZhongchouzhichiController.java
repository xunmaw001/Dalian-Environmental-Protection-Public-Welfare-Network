package com.controller;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Date;
import java.util.List;
import javax.servlet.http.HttpServletRequest;

import com.utils.ValidatorUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.annotation.IgnoreAuth;

import com.entity.ZhongchouzhichiEntity;
import com.entity.view.ZhongchouzhichiView;

import com.service.ZhongchouzhichiService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MD5Util;
import com.utils.MPUtil;
import com.utils.CommonUtil;


/**
 * 众筹支持
 * 后端接口
 * @author 
 * @email 
 * @date 2021-02-26 18:15:08
 */
@RestController
@RequestMapping("/zhongchouzhichi")
public class ZhongchouzhichiController {
    @Autowired
    private ZhongchouzhichiService zhongchouzhichiService;
    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,ZhongchouzhichiEntity zhongchouzhichi, HttpServletRequest request){

		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("huanbaoshetuan")) {
			zhongchouzhichi.setShetuanbianhao((String)request.getSession().getAttribute("username"));
		}
		if(tableName.equals("yonghu")) {
			zhongchouzhichi.setYonghuzhanghao((String)request.getSession().getAttribute("username"));
		}
        EntityWrapper<ZhongchouzhichiEntity> ew = new EntityWrapper<ZhongchouzhichiEntity>();
		PageUtils page = zhongchouzhichiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, zhongchouzhichi), params), params));
        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,ZhongchouzhichiEntity zhongchouzhichi, HttpServletRequest request){
        EntityWrapper<ZhongchouzhichiEntity> ew = new EntityWrapper<ZhongchouzhichiEntity>();
		PageUtils page = zhongchouzhichiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, zhongchouzhichi), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( ZhongchouzhichiEntity zhongchouzhichi){
       	EntityWrapper<ZhongchouzhichiEntity> ew = new EntityWrapper<ZhongchouzhichiEntity>();
      	ew.allEq(MPUtil.allEQMapPre( zhongchouzhichi, "zhongchouzhichi")); 
        return R.ok().put("data", zhongchouzhichiService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(ZhongchouzhichiEntity zhongchouzhichi){
        EntityWrapper< ZhongchouzhichiEntity> ew = new EntityWrapper< ZhongchouzhichiEntity>();
 		ew.allEq(MPUtil.allEQMapPre( zhongchouzhichi, "zhongchouzhichi")); 
		ZhongchouzhichiView zhongchouzhichiView =  zhongchouzhichiService.selectView(ew);
		return R.ok("查询众筹支持成功").put("data", zhongchouzhichiView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        ZhongchouzhichiEntity zhongchouzhichi = zhongchouzhichiService.selectById(id);
        return R.ok().put("data", zhongchouzhichi);
    }

    /**
     * 前端详情
     */
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        ZhongchouzhichiEntity zhongchouzhichi = zhongchouzhichiService.selectById(id);
        return R.ok().put("data", zhongchouzhichi);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody ZhongchouzhichiEntity zhongchouzhichi, HttpServletRequest request){
    	zhongchouzhichi.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(zhongchouzhichi);

        zhongchouzhichiService.insert(zhongchouzhichi);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody ZhongchouzhichiEntity zhongchouzhichi, HttpServletRequest request){
    	zhongchouzhichi.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(zhongchouzhichi);

        zhongchouzhichiService.insert(zhongchouzhichi);
        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody ZhongchouzhichiEntity zhongchouzhichi, HttpServletRequest request){
        //ValidatorUtils.validateEntity(zhongchouzhichi);
        zhongchouzhichiService.updateById(zhongchouzhichi);//全部更新
        return R.ok();
    }
    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        zhongchouzhichiService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
    /**
     * 提醒接口
     */
	@RequestMapping("/remind/{columnName}/{type}")
	public R remindCount(@PathVariable("columnName") String columnName, HttpServletRequest request, 
						 @PathVariable("type") String type,@RequestParam Map<String, Object> map) {
		map.put("column", columnName);
		map.put("type", type);
		
		if(type.equals("2")) {
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			Calendar c = Calendar.getInstance();
			Date remindStartDate = null;
			Date remindEndDate = null;
			if(map.get("remindstart")!=null) {
				Integer remindStart = Integer.parseInt(map.get("remindstart").toString());
				c.setTime(new Date()); 
				c.add(Calendar.DAY_OF_MONTH,remindStart);
				remindStartDate = c.getTime();
				map.put("remindstart", sdf.format(remindStartDate));
			}
			if(map.get("remindend")!=null) {
				Integer remindEnd = Integer.parseInt(map.get("remindend").toString());
				c.setTime(new Date());
				c.add(Calendar.DAY_OF_MONTH,remindEnd);
				remindEndDate = c.getTime();
				map.put("remindend", sdf.format(remindEndDate));
			}
		}
		
		Wrapper<ZhongchouzhichiEntity> wrapper = new EntityWrapper<ZhongchouzhichiEntity>();
		if(map.get("remindstart")!=null) {
			wrapper.ge(columnName, map.get("remindstart"));
		}
		if(map.get("remindend")!=null) {
			wrapper.le(columnName, map.get("remindend"));
		}

		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("huanbaoshetuan")) {
			wrapper.eq("shetuanbianhao", (String)request.getSession().getAttribute("username"));
		}
		if(tableName.equals("yonghu")) {
			wrapper.eq("yonghuzhanghao", (String)request.getSession().getAttribute("username"));
		}

		int count = zhongchouzhichiService.selectCount(wrapper);
		return R.ok().put("count", count);
	}
	


}
