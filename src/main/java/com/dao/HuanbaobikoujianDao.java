package com.dao;

import com.entity.HuanbaobikoujianEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.HuanbaobikoujianVO;
import com.entity.view.HuanbaobikoujianView;


/**
 * 环保币扣减
 * 
 * @author 
 * @email 
 * @date 2021-02-26 18:15:08
 */
public interface HuanbaobikoujianDao extends BaseMapper<HuanbaobikoujianEntity> {
	
	List<HuanbaobikoujianVO> selectListVO(@Param("ew") Wrapper<HuanbaobikoujianEntity> wrapper);
	
	HuanbaobikoujianVO selectVO(@Param("ew") Wrapper<HuanbaobikoujianEntity> wrapper);
	
	List<HuanbaobikoujianView> selectListView(@Param("ew") Wrapper<HuanbaobikoujianEntity> wrapper);

	List<HuanbaobikoujianView> selectListView(Pagination page,@Param("ew") Wrapper<HuanbaobikoujianEntity> wrapper);
	
	HuanbaobikoujianView selectView(@Param("ew") Wrapper<HuanbaobikoujianEntity> wrapper);
	
}
