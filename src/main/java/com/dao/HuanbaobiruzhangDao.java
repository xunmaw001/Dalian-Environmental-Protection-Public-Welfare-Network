package com.dao;

import com.entity.HuanbaobiruzhangEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.HuanbaobiruzhangVO;
import com.entity.view.HuanbaobiruzhangView;


/**
 * 环保币入账
 * 
 * @author 
 * @email 
 * @date 2021-02-26 18:15:08
 */
public interface HuanbaobiruzhangDao extends BaseMapper<HuanbaobiruzhangEntity> {
	
	List<HuanbaobiruzhangVO> selectListVO(@Param("ew") Wrapper<HuanbaobiruzhangEntity> wrapper);
	
	HuanbaobiruzhangVO selectVO(@Param("ew") Wrapper<HuanbaobiruzhangEntity> wrapper);
	
	List<HuanbaobiruzhangView> selectListView(@Param("ew") Wrapper<HuanbaobiruzhangEntity> wrapper);

	List<HuanbaobiruzhangView> selectListView(Pagination page,@Param("ew") Wrapper<HuanbaobiruzhangEntity> wrapper);
	
	HuanbaobiruzhangView selectView(@Param("ew") Wrapper<HuanbaobiruzhangEntity> wrapper);
	
}
