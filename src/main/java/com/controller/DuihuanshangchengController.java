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

import com.entity.DuihuanshangchengEntity;
import com.entity.view.DuihuanshangchengView;

import com.service.DuihuanshangchengService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MD5Util;
import com.utils.MPUtil;
import com.utils.CommonUtil;


/**
 * 兑换商城
 * 后端接口
 * @author 
 * @email 
 * @date 2021-02-26 18:15:08
 */
@RestController
@RequestMapping("/duihuanshangcheng")
public class DuihuanshangchengController {
    @Autowired
    private DuihuanshangchengService duihuanshangchengService;
    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,DuihuanshangchengEntity duihuanshangcheng, HttpServletRequest request){

        EntityWrapper<DuihuanshangchengEntity> ew = new EntityWrapper<DuihuanshangchengEntity>();
		PageUtils page = duihuanshangchengService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, duihuanshangcheng), params), params));
        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,DuihuanshangchengEntity duihuanshangcheng, HttpServletRequest request){
        EntityWrapper<DuihuanshangchengEntity> ew = new EntityWrapper<DuihuanshangchengEntity>();
		PageUtils page = duihuanshangchengService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, duihuanshangcheng), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( DuihuanshangchengEntity duihuanshangcheng){
       	EntityWrapper<DuihuanshangchengEntity> ew = new EntityWrapper<DuihuanshangchengEntity>();
      	ew.allEq(MPUtil.allEQMapPre( duihuanshangcheng, "duihuanshangcheng")); 
        return R.ok().put("data", duihuanshangchengService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(DuihuanshangchengEntity duihuanshangcheng){
        EntityWrapper< DuihuanshangchengEntity> ew = new EntityWrapper< DuihuanshangchengEntity>();
 		ew.allEq(MPUtil.allEQMapPre( duihuanshangcheng, "duihuanshangcheng")); 
		DuihuanshangchengView duihuanshangchengView =  duihuanshangchengService.selectView(ew);
		return R.ok("查询兑换商城成功").put("data", duihuanshangchengView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        DuihuanshangchengEntity duihuanshangcheng = duihuanshangchengService.selectById(id);
        return R.ok().put("data", duihuanshangcheng);
    }

    /**
     * 前端详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        DuihuanshangchengEntity duihuanshangcheng = duihuanshangchengService.selectById(id);
        return R.ok().put("data", duihuanshangcheng);
    }
    


    /**
     * 赞或踩
     */
    @RequestMapping("/thumbsup/{id}")
    public R thumbsup(@PathVariable("id") String id,String type){
        DuihuanshangchengEntity duihuanshangcheng = duihuanshangchengService.selectById(id);
        if(type.equals("1")) {
        	duihuanshangcheng.setThumbsupnum(duihuanshangcheng.getThumbsupnum()+1);
        } else {
        	duihuanshangcheng.setCrazilynum(duihuanshangcheng.getCrazilynum()+1);
        }
        duihuanshangchengService.updateById(duihuanshangcheng);
        return R.ok();
    }

    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody DuihuanshangchengEntity duihuanshangcheng, HttpServletRequest request){
    	duihuanshangcheng.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(duihuanshangcheng);

        duihuanshangchengService.insert(duihuanshangcheng);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody DuihuanshangchengEntity duihuanshangcheng, HttpServletRequest request){
    	duihuanshangcheng.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(duihuanshangcheng);

        duihuanshangchengService.insert(duihuanshangcheng);
        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody DuihuanshangchengEntity duihuanshangcheng, HttpServletRequest request){
        //ValidatorUtils.validateEntity(duihuanshangcheng);
        duihuanshangchengService.updateById(duihuanshangcheng);//全部更新
        return R.ok();
    }
    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        duihuanshangchengService.deleteBatchIds(Arrays.asList(ids));
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
		
		Wrapper<DuihuanshangchengEntity> wrapper = new EntityWrapper<DuihuanshangchengEntity>();
		if(map.get("remindstart")!=null) {
			wrapper.ge(columnName, map.get("remindstart"));
		}
		if(map.get("remindend")!=null) {
			wrapper.le(columnName, map.get("remindend"));
		}


		int count = duihuanshangchengService.selectCount(wrapper);
		return R.ok().put("count", count);
	}
	


}
