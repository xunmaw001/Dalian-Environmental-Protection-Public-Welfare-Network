package com.dao;

import com.entity.HuanbaofenleiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.HuanbaofenleiVO;
import com.entity.view.HuanbaofenleiView;


/**
 * 环保分类
 * 
 * @author 
 * @email 
 * @date 2021-02-26 18:15:08
 */
public interface HuanbaofenleiDao extends BaseMapper<HuanbaofenleiEntity> {
	
	List<HuanbaofenleiVO> selectListVO(@Param("ew") Wrapper<HuanbaofenleiEntity> wrapper);
	
	HuanbaofenleiVO selectVO(@Param("ew") Wrapper<HuanbaofenleiEntity> wrapper);
	
	List<HuanbaofenleiView> selectListView(@Param("ew") Wrapper<HuanbaofenleiEntity> wrapper);

	List<HuanbaofenleiView> selectListView(Pagination page,@Param("ew") Wrapper<HuanbaofenleiEntity> wrapper);
	
	HuanbaofenleiView selectView(@Param("ew") Wrapper<HuanbaofenleiEntity> wrapper);
	
}
