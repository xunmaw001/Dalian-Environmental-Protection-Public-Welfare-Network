package com.dao;

import com.entity.DiscusshuanbaozhongchouEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DiscusshuanbaozhongchouVO;
import com.entity.view.DiscusshuanbaozhongchouView;


/**
 * 环保众筹评论表
 * 
 * @author 
 * @email 
 * @date 2021-02-26 18:15:08
 */
public interface DiscusshuanbaozhongchouDao extends BaseMapper<DiscusshuanbaozhongchouEntity> {
	
	List<DiscusshuanbaozhongchouVO> selectListVO(@Param("ew") Wrapper<DiscusshuanbaozhongchouEntity> wrapper);
	
	DiscusshuanbaozhongchouVO selectVO(@Param("ew") Wrapper<DiscusshuanbaozhongchouEntity> wrapper);
	
	List<DiscusshuanbaozhongchouView> selectListView(@Param("ew") Wrapper<DiscusshuanbaozhongchouEntity> wrapper);

	List<DiscusshuanbaozhongchouView> selectListView(Pagination page,@Param("ew") Wrapper<DiscusshuanbaozhongchouEntity> wrapper);
	
	DiscusshuanbaozhongchouView selectView(@Param("ew") Wrapper<DiscusshuanbaozhongchouEntity> wrapper);
	
}
