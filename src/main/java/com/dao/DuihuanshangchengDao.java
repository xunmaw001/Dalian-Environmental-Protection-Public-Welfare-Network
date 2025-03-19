package com.dao;

import com.entity.DuihuanshangchengEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DuihuanshangchengVO;
import com.entity.view.DuihuanshangchengView;


/**
 * 兑换商城
 * 
 * @author 
 * @email 
 * @date 2021-02-26 18:15:08
 */
public interface DuihuanshangchengDao extends BaseMapper<DuihuanshangchengEntity> {
	
	List<DuihuanshangchengVO> selectListVO(@Param("ew") Wrapper<DuihuanshangchengEntity> wrapper);
	
	DuihuanshangchengVO selectVO(@Param("ew") Wrapper<DuihuanshangchengEntity> wrapper);
	
	List<DuihuanshangchengView> selectListView(@Param("ew") Wrapper<DuihuanshangchengEntity> wrapper);

	List<DuihuanshangchengView> selectListView(Pagination page,@Param("ew") Wrapper<DuihuanshangchengEntity> wrapper);
	
	DuihuanshangchengView selectView(@Param("ew") Wrapper<DuihuanshangchengEntity> wrapper);
	
}
