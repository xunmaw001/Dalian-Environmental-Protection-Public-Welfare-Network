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

import com.entity.DiscusshuanbaoshetuanEntity;
import com.entity.view.DiscusshuanbaoshetuanView;

import com.service.DiscusshuanbaoshetuanService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MD5Util;
import com.utils.MPUtil;
import com.utils.CommonUtil;


/**
 * 环保社团评论表
 * 后端接口
 * @author 
 * @email 
 * @date 2021-02-26 18:15:08
 */
@RestController
@RequestMapping("/discusshuanbaoshetuan")
public class DiscusshuanbaoshetuanController {
    @Autowired
    private DiscusshuanbaoshetuanService discusshuanbaoshetuanService;
    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,DiscusshuanbaoshetuanEntity discusshuanbaoshetuan, HttpServletRequest request){

        EntityWrapper<DiscusshuanbaoshetuanEntity> ew = new EntityWrapper<DiscusshuanbaoshetuanEntity>();
		PageUtils page = discusshuanbaoshetuanService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, discusshuanbaoshetuan), params), params));
        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,DiscusshuanbaoshetuanEntity discusshuanbaoshetuan, HttpServletRequest request){
        EntityWrapper<DiscusshuanbaoshetuanEntity> ew = new EntityWrapper<DiscusshuanbaoshetuanEntity>();
		PageUtils page = discusshuanbaoshetuanService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, discusshuanbaoshetuan), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( DiscusshuanbaoshetuanEntity discusshuanbaoshetuan){
       	EntityWrapper<DiscusshuanbaoshetuanEntity> ew = new EntityWrapper<DiscusshuanbaoshetuanEntity>();
      	ew.allEq(MPUtil.allEQMapPre( discusshuanbaoshetuan, "discusshuanbaoshetuan")); 
        return R.ok().put("data", discusshuanbaoshetuanService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(DiscusshuanbaoshetuanEntity discusshuanbaoshetuan){
        EntityWrapper< DiscusshuanbaoshetuanEntity> ew = new EntityWrapper< DiscusshuanbaoshetuanEntity>();
 		ew.allEq(MPUtil.allEQMapPre( discusshuanbaoshetuan, "discusshuanbaoshetuan")); 
		DiscusshuanbaoshetuanView discusshuanbaoshetuanView =  discusshuanbaoshetuanService.selectView(ew);
		return R.ok("查询环保社团评论表成功").put("data", discusshuanbaoshetuanView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        DiscusshuanbaoshetuanEntity discusshuanbaoshetuan = discusshuanbaoshetuanService.selectById(id);
        return R.ok().put("data", discusshuanbaoshetuan);
    }

    /**
     * 前端详情
     */
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        DiscusshuanbaoshetuanEntity discusshuanbaoshetuan = discusshuanbaoshetuanService.selectById(id);
        return R.ok().put("data", discusshuanbaoshetuan);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody DiscusshuanbaoshetuanEntity discusshuanbaoshetuan, HttpServletRequest request){
    	discusshuanbaoshetuan.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(discusshuanbaoshetuan);

        discusshuanbaoshetuanService.insert(discusshuanbaoshetuan);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody DiscusshuanbaoshetuanEntity discusshuanbaoshetuan, HttpServletRequest request){
    	discusshuanbaoshetuan.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(discusshuanbaoshetuan);

        discusshuanbaoshetuanService.insert(discusshuanbaoshetuan);
        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody DiscusshuanbaoshetuanEntity discusshuanbaoshetuan, HttpServletRequest request){
        //ValidatorUtils.validateEntity(discusshuanbaoshetuan);
        discusshuanbaoshetuanService.updateById(discusshuanbaoshetuan);//全部更新
        return R.ok();
    }
    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        discusshuanbaoshetuanService.deleteBatchIds(Arrays.asList(ids));
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
		
		Wrapper<DiscusshuanbaoshetuanEntity> wrapper = new EntityWrapper<DiscusshuanbaoshetuanEntity>();
		if(map.get("remindstart")!=null) {
			wrapper.ge(columnName, map.get("remindstart"));
		}
		if(map.get("remindend")!=null) {
			wrapper.le(columnName, map.get("remindend"));
		}


		int count = discusshuanbaoshetuanService.selectCount(wrapper);
		return R.ok().put("count", count);
	}
	


}
