package com.dao;

import com.entity.ZhongchouzhichiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ZhongchouzhichiVO;
import com.entity.view.ZhongchouzhichiView;


/**
 * 众筹支持
 * 
 * @author 
 * @email 
 * @date 2021-02-26 18:15:08
 */
public interface ZhongchouzhichiDao extends BaseMapper<ZhongchouzhichiEntity> {
	
	List<ZhongchouzhichiVO> selectListVO(@Param("ew") Wrapper<ZhongchouzhichiEntity> wrapper);
	
	ZhongchouzhichiVO selectVO(@Param("ew") Wrapper<ZhongchouzhichiEntity> wrapper);
	
	List<ZhongchouzhichiView> selectListView(@Param("ew") Wrapper<ZhongchouzhichiEntity> wrapper);

	List<ZhongchouzhichiView> selectListView(Pagination page,@Param("ew") Wrapper<ZhongchouzhichiEntity> wrapper);
	
	ZhongchouzhichiView selectView(@Param("ew") Wrapper<ZhongchouzhichiEntity> wrapper);
	
}
