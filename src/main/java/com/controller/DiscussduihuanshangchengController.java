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

import com.entity.DiscussduihuanshangchengEntity;
import com.entity.view.DiscussduihuanshangchengView;

import com.service.DiscussduihuanshangchengService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MD5Util;
import com.utils.MPUtil;
import com.utils.CommonUtil;


/**
 * 兑换商城评论表
 * 后端接口
 * @author 
 * @email 
 * @date 2021-02-26 18:15:08
 */
@RestController
@RequestMapping("/discussduihuanshangcheng")
public class DiscussduihuanshangchengController {
    @Autowired
    private DiscussduihuanshangchengService discussduihuanshangchengService;
    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,DiscussduihuanshangchengEntity discussduihuanshangcheng, HttpServletRequest request){

        EntityWrapper<DiscussduihuanshangchengEntity> ew = new EntityWrapper<DiscussduihuanshangchengEntity>();
		PageUtils page = discussduihuanshangchengService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, discussduihuanshangcheng), params), params));
        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,DiscussduihuanshangchengEntity discussduihuanshangcheng, HttpServletRequest request){
        EntityWrapper<DiscussduihuanshangchengEntity> ew = new EntityWrapper<DiscussduihuanshangchengEntity>();
		PageUtils page = discussduihuanshangchengService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, discussduihuanshangcheng), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( DiscussduihuanshangchengEntity discussduihuanshangcheng){
       	EntityWrapper<DiscussduihuanshangchengEntity> ew = new EntityWrapper<DiscussduihuanshangchengEntity>();
      	ew.allEq(MPUtil.allEQMapPre( discussduihuanshangcheng, "discussduihuanshangcheng")); 
        return R.ok().put("data", discussduihuanshangchengService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(DiscussduihuanshangchengEntity discussduihuanshangcheng){
        EntityWrapper< DiscussduihuanshangchengEntity> ew = new EntityWrapper< DiscussduihuanshangchengEntity>();
 		ew.allEq(MPUtil.allEQMapPre( discussduihuanshangcheng, "discussduihuanshangcheng")); 
		DiscussduihuanshangchengView discussduihuanshangchengView =  discussduihuanshangchengService.selectView(ew);
		return R.ok("查询兑换商城评论表成功").put("data", discussduihuanshangchengView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        DiscussduihuanshangchengEntity discussduihuanshangcheng = discussduihuanshangchengService.selectById(id);
        return R.ok().put("data", discussduihuanshangcheng);
    }

    /**
     * 前端详情
     */
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        DiscussduihuanshangchengEntity discussduihuanshangcheng = discussduihuanshangchengService.selectById(id);
        return R.ok().put("data", discussduihuanshangcheng);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody DiscussduihuanshangchengEntity discussduihuanshangcheng, HttpServletRequest request){
    	discussduihuanshangcheng.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(discussduihuanshangcheng);

        discussduihuanshangchengService.insert(discussduihuanshangcheng);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody DiscussduihuanshangchengEntity discussduihuanshangcheng, HttpServletRequest request){
    	discussduihuanshangcheng.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(discussduihuanshangcheng);

        discussduihuanshangchengService.insert(discussduihuanshangcheng);
        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody DiscussduihuanshangchengEntity discussduihuanshangcheng, HttpServletRequest request){
        //ValidatorUtils.validateEntity(discussduihuanshangcheng);
        discussduihuanshangchengService.updateById(discussduihuanshangcheng);//全部更新
        return R.ok();
    }
    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        discussduihuanshangchengService.deleteBatchIds(Arrays.asList(ids));
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
		
		Wrapper<DiscussduihuanshangchengEntity> wrapper = new EntityWrapper<DiscussduihuanshangchengEntity>();
		if(map.get("remindstart")!=null) {
			wrapper.ge(columnName, map.get("remindstart"));
		}
		if(map.get("remindend")!=null) {
			wrapper.le(columnName, map.get("remindend"));
		}


		int count = discussduihuanshangchengService.selectCount(wrapper);
		return R.ok().put("count", count);
	}
	


}
