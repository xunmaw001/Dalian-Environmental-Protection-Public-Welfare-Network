package com.dao;

import com.entity.JiaruhuanbaoshetuanEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.JiaruhuanbaoshetuanVO;
import com.entity.view.JiaruhuanbaoshetuanView;


/**
 * 加入环保社团
 * 
 * @author 
 * @email 
 * @date 2021-02-26 18:15:08
 */
public interface JiaruhuanbaoshetuanDao extends BaseMapper<JiaruhuanbaoshetuanEntity> {
	
	List<JiaruhuanbaoshetuanVO> selectListVO(@Param("ew") Wrapper<JiaruhuanbaoshetuanEntity> wrapper);
	
	JiaruhuanbaoshetuanVO selectVO(@Param("ew") Wrapper<JiaruhuanbaoshetuanEntity> wrapper);
	
	List<JiaruhuanbaoshetuanView> selectListView(@Param("ew") Wrapper<JiaruhuanbaoshetuanEntity> wrapper);

	List<JiaruhuanbaoshetuanView> selectListView(Pagination page,@Param("ew") Wrapper<JiaruhuanbaoshetuanEntity> wrapper);
	
	JiaruhuanbaoshetuanView selectView(@Param("ew") Wrapper<JiaruhuanbaoshetuanEntity> wrapper);
	
}
