package com.dao;

import com.entity.DiscusshuanbaohuodongEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DiscusshuanbaohuodongVO;
import com.entity.view.DiscusshuanbaohuodongView;


/**
 * 环保活动评论表
 * 
 * @author 
 * @email 
 * @date 2021-02-26 18:15:08
 */
public interface DiscusshuanbaohuodongDao extends BaseMapper<DiscusshuanbaohuodongEntity> {
	
	List<DiscusshuanbaohuodongVO> selectListVO(@Param("ew") Wrapper<DiscusshuanbaohuodongEntity> wrapper);
	
	DiscusshuanbaohuodongVO selectVO(@Param("ew") Wrapper<DiscusshuanbaohuodongEntity> wrapper);
	
	List<DiscusshuanbaohuodongView> selectListView(@Param("ew") Wrapper<DiscusshuanbaohuodongEntity> wrapper);

	List<DiscusshuanbaohuodongView> selectListView(Pagination page,@Param("ew") Wrapper<DiscusshuanbaohuodongEntity> wrapper);
	
	DiscusshuanbaohuodongView selectView(@Param("ew") Wrapper<DiscusshuanbaohuodongEntity> wrapper);
	
}
