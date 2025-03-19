package com.dao;

import com.entity.HuanbaoshetuanEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.HuanbaoshetuanVO;
import com.entity.view.HuanbaoshetuanView;


/**
 * 环保社团
 * 
 * @author 
 * @email 
 * @date 2021-02-26 18:15:08
 */
public interface HuanbaoshetuanDao extends BaseMapper<HuanbaoshetuanEntity> {
	
	List<HuanbaoshetuanVO> selectListVO(@Param("ew") Wrapper<HuanbaoshetuanEntity> wrapper);
	
	HuanbaoshetuanVO selectVO(@Param("ew") Wrapper<HuanbaoshetuanEntity> wrapper);
	
	List<HuanbaoshetuanView> selectListView(@Param("ew") Wrapper<HuanbaoshetuanEntity> wrapper);

	List<HuanbaoshetuanView> selectListView(Pagination page,@Param("ew") Wrapper<HuanbaoshetuanEntity> wrapper);
	
	HuanbaoshetuanView selectView(@Param("ew") Wrapper<HuanbaoshetuanEntity> wrapper);
	
}
