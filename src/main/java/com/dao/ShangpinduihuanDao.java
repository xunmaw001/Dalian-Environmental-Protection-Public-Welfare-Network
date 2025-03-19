package com.dao;

import com.entity.ShangpinduihuanEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ShangpinduihuanVO;
import com.entity.view.ShangpinduihuanView;


/**
 * 商品兑换
 * 
 * @author 
 * @email 
 * @date 2021-02-26 18:15:08
 */
public interface ShangpinduihuanDao extends BaseMapper<ShangpinduihuanEntity> {
	
	List<ShangpinduihuanVO> selectListVO(@Param("ew") Wrapper<ShangpinduihuanEntity> wrapper);
	
	ShangpinduihuanVO selectVO(@Param("ew") Wrapper<ShangpinduihuanEntity> wrapper);
	
	List<ShangpinduihuanView> selectListView(@Param("ew") Wrapper<ShangpinduihuanEntity> wrapper);

	List<ShangpinduihuanView> selectListView(Pagination page,@Param("ew") Wrapper<ShangpinduihuanEntity> wrapper);
	
	ShangpinduihuanView selectView(@Param("ew") Wrapper<ShangpinduihuanEntity> wrapper);
	
}
