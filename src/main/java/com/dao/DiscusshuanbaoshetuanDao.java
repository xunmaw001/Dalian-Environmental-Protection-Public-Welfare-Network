package com.dao;

import com.entity.DiscusshuanbaoshetuanEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DiscusshuanbaoshetuanVO;
import com.entity.view.DiscusshuanbaoshetuanView;


/**
 * 环保社团评论表
 * 
 * @author 
 * @email 
 * @date 2021-02-26 18:15:08
 */
public interface DiscusshuanbaoshetuanDao extends BaseMapper<DiscusshuanbaoshetuanEntity> {
	
	List<DiscusshuanbaoshetuanVO> selectListVO(@Param("ew") Wrapper<DiscusshuanbaoshetuanEntity> wrapper);
	
	DiscusshuanbaoshetuanVO selectVO(@Param("ew") Wrapper<DiscusshuanbaoshetuanEntity> wrapper);
	
	List<DiscusshuanbaoshetuanView> selectListView(@Param("ew") Wrapper<DiscusshuanbaoshetuanEntity> wrapper);

	List<DiscusshuanbaoshetuanView> selectListView(Pagination page,@Param("ew") Wrapper<DiscusshuanbaoshetuanEntity> wrapper);
	
	DiscusshuanbaoshetuanView selectView(@Param("ew") Wrapper<DiscusshuanbaoshetuanEntity> wrapper);
	
}
