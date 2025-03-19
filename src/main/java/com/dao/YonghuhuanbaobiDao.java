package com.dao;

import com.entity.YonghuhuanbaobiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.YonghuhuanbaobiVO;
import com.entity.view.YonghuhuanbaobiView;


/**
 * 用户环保币
 * 
 * @author 
 * @email 
 * @date 2021-02-26 18:15:08
 */
public interface YonghuhuanbaobiDao extends BaseMapper<YonghuhuanbaobiEntity> {
	
	List<YonghuhuanbaobiVO> selectListVO(@Param("ew") Wrapper<YonghuhuanbaobiEntity> wrapper);
	
	YonghuhuanbaobiVO selectVO(@Param("ew") Wrapper<YonghuhuanbaobiEntity> wrapper);
	
	List<YonghuhuanbaobiView> selectListView(@Param("ew") Wrapper<YonghuhuanbaobiEntity> wrapper);

	List<YonghuhuanbaobiView> selectListView(Pagination page,@Param("ew") Wrapper<YonghuhuanbaobiEntity> wrapper);
	
	YonghuhuanbaobiView selectView(@Param("ew") Wrapper<YonghuhuanbaobiEntity> wrapper);
	
}
