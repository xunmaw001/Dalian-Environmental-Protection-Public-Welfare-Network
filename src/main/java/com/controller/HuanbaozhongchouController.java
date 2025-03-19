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

import com.entity.HuanbaozhongchouEntity;
import com.entity.view.HuanbaozhongchouView;

import com.service.HuanbaozhongchouService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MD5Util;
import com.utils.MPUtil;
import com.utils.CommonUtil;


/**
 * 环保众筹
 * 后端接口
 * @author 
 * @email 
 * @date 2021-02-26 18:15:08
 */
@RestController
@RequestMapping("/huanbaozhongchou")
public class HuanbaozhongchouController {
    @Autowired
    private HuanbaozhongchouService huanbaozhongchouService;
    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,HuanbaozhongchouEntity huanbaozhongchou, HttpServletRequest request){

		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("huanbaoshetuan")) {
			huanbaozhongchou.setShetuanbianhao((String)request.getSession().getAttribute("username"));
		}
        EntityWrapper<HuanbaozhongchouEntity> ew = new EntityWrapper<HuanbaozhongchouEntity>();
		PageUtils page = huanbaozhongchouService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, huanbaozhongchou), params), params));
        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,HuanbaozhongchouEntity huanbaozhongchou, HttpServletRequest request){
        EntityWrapper<HuanbaozhongchouEntity> ew = new EntityWrapper<HuanbaozhongchouEntity>();
		PageUtils page = huanbaozhongchouService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, huanbaozhongchou), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( HuanbaozhongchouEntity huanbaozhongchou){
       	EntityWrapper<HuanbaozhongchouEntity> ew = new EntityWrapper<HuanbaozhongchouEntity>();
      	ew.allEq(MPUtil.allEQMapPre( huanbaozhongchou, "huanbaozhongchou")); 
        return R.ok().put("data", huanbaozhongchouService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(HuanbaozhongchouEntity huanbaozhongchou){
        EntityWrapper< HuanbaozhongchouEntity> ew = new EntityWrapper< HuanbaozhongchouEntity>();
 		ew.allEq(MPUtil.allEQMapPre( huanbaozhongchou, "huanbaozhongchou")); 
		HuanbaozhongchouView huanbaozhongchouView =  huanbaozhongchouService.selectView(ew);
		return R.ok("查询环保众筹成功").put("data", huanbaozhongchouView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        HuanbaozhongchouEntity huanbaozhongchou = huanbaozhongchouService.selectById(id);
        return R.ok().put("data", huanbaozhongchou);
    }

    /**
     * 前端详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        HuanbaozhongchouEntity huanbaozhongchou = huanbaozhongchouService.selectById(id);
        return R.ok().put("data", huanbaozhongchou);
    }
    


    /**
     * 赞或踩
     */
    @RequestMapping("/thumbsup/{id}")
    public R thumbsup(@PathVariable("id") String id,String type){
        HuanbaozhongchouEntity huanbaozhongchou = huanbaozhongchouService.selectById(id);
        if(type.equals("1")) {
        	huanbaozhongchou.setThumbsupnum(huanbaozhongchou.getThumbsupnum()+1);
        } else {
        	huanbaozhongchou.setCrazilynum(huanbaozhongchou.getCrazilynum()+1);
        }
        huanbaozhongchouService.updateById(huanbaozhongchou);
        return R.ok();
    }

    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody HuanbaozhongchouEntity huanbaozhongchou, HttpServletRequest request){
    	huanbaozhongchou.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(huanbaozhongchou);

        huanbaozhongchouService.insert(huanbaozhongchou);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody HuanbaozhongchouEntity huanbaozhongchou, HttpServletRequest request){
    	huanbaozhongchou.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(huanbaozhongchou);

        huanbaozhongchouService.insert(huanbaozhongchou);
        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody HuanbaozhongchouEntity huanbaozhongchou, HttpServletRequest request){
        //ValidatorUtils.validateEntity(huanbaozhongchou);
        huanbaozhongchouService.updateById(huanbaozhongchou);//全部更新
        return R.ok();
    }
    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        huanbaozhongchouService.deleteBatchIds(Arrays.asList(ids));
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
		
		Wrapper<HuanbaozhongchouEntity> wrapper = new EntityWrapper<HuanbaozhongchouEntity>();
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

		int count = huanbaozhongchouService.selectCount(wrapper);
		return R.ok().put("count", count);
	}
	


}
