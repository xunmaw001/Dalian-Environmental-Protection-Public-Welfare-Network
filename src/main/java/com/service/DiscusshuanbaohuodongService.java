package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DiscusshuanbaohuodongEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DiscusshuanbaohuodongVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DiscusshuanbaohuodongView;


/**
 * 环保活动评论表
 *
 * @author 
 * @email 
 * @date 2021-02-26 18:15:08
 */
public interface DiscusshuanbaohuodongService extends IService<DiscusshuanbaohuodongEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscusshuanbaohuodongVO> selectListVO(Wrapper<DiscusshuanbaohuodongEntity> wrapper);
   	
   	DiscusshuanbaohuodongVO selectVO(@Param("ew") Wrapper<DiscusshuanbaohuodongEntity> wrapper);
   	
   	List<DiscusshuanbaohuodongView> selectListView(Wrapper<DiscusshuanbaohuodongEntity> wrapper);
   	
   	DiscusshuanbaohuodongView selectView(@Param("ew") Wrapper<DiscusshuanbaohuodongEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscusshuanbaohuodongEntity> wrapper);
   	
}

