package com.dao;

import com.entity.HuanbaohuodongEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.HuanbaohuodongVO;
import com.entity.view.HuanbaohuodongView;


/**
 * 环保活动
 * 
 * @author 
 * @email 
 * @date 2021-02-26 18:15:08
 */
public interface HuanbaohuodongDao extends BaseMapper<HuanbaohuodongEntity> {
	
	List<HuanbaohuodongVO> selectListVO(@Param("ew") Wrapper<HuanbaohuodongEntity> wrapper);
	
	HuanbaohuodongVO selectVO(@Param("ew") Wrapper<HuanbaohuodongEntity> wrapper);
	
	List<HuanbaohuodongView> selectListView(@Param("ew") Wrapper<HuanbaohuodongEntity> wrapper);

	List<HuanbaohuodongView> selectListView(Pagination page,@Param("ew") Wrapper<HuanbaohuodongEntity> wrapper);
	
	HuanbaohuodongView selectView(@Param("ew") Wrapper<HuanbaohuodongEntity> wrapper);
	
}
