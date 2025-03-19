package com.dao;

import com.entity.HuanbaozhongchouEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.HuanbaozhongchouVO;
import com.entity.view.HuanbaozhongchouView;


/**
 * 环保众筹
 * 
 * @author 
 * @email 
 * @date 2021-02-26 18:15:08
 */
public interface HuanbaozhongchouDao extends BaseMapper<HuanbaozhongchouEntity> {
	
	List<HuanbaozhongchouVO> selectListVO(@Param("ew") Wrapper<HuanbaozhongchouEntity> wrapper);
	
	HuanbaozhongchouVO selectVO(@Param("ew") Wrapper<HuanbaozhongchouEntity> wrapper);
	
	List<HuanbaozhongchouView> selectListView(@Param("ew") Wrapper<HuanbaozhongchouEntity> wrapper);

	List<HuanbaozhongchouView> selectListView(Pagination page,@Param("ew") Wrapper<HuanbaozhongchouEntity> wrapper);
	
	HuanbaozhongchouView selectView(@Param("ew") Wrapper<HuanbaozhongchouEntity> wrapper);
	
}
