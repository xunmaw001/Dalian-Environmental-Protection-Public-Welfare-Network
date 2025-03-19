package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.HuanbaohuodongEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.HuanbaohuodongVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.HuanbaohuodongView;


/**
 * 环保活动
 *
 * @author 
 * @email 
 * @date 2021-02-26 18:15:08
 */
public interface HuanbaohuodongService extends IService<HuanbaohuodongEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<HuanbaohuodongVO> selectListVO(Wrapper<HuanbaohuodongEntity> wrapper);
   	
   	HuanbaohuodongVO selectVO(@Param("ew") Wrapper<HuanbaohuodongEntity> wrapper);
   	
   	List<HuanbaohuodongView> selectListView(Wrapper<HuanbaohuodongEntity> wrapper);
   	
   	HuanbaohuodongView selectView(@Param("ew") Wrapper<HuanbaohuodongEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<HuanbaohuodongEntity> wrapper);
   	
}

