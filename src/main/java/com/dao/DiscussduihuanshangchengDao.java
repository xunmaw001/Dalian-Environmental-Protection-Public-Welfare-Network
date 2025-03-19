package com.dao;

import com.entity.DiscussduihuanshangchengEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DiscussduihuanshangchengVO;
import com.entity.view.DiscussduihuanshangchengView;


/**
 * 兑换商城评论表
 * 
 * @author 
 * @email 
 * @date 2021-02-26 18:15:08
 */
public interface DiscussduihuanshangchengDao extends BaseMapper<DiscussduihuanshangchengEntity> {
	
	List<DiscussduihuanshangchengVO> selectListVO(@Param("ew") Wrapper<DiscussduihuanshangchengEntity> wrapper);
	
	DiscussduihuanshangchengVO selectVO(@Param("ew") Wrapper<DiscussduihuanshangchengEntity> wrapper);
	
	List<DiscussduihuanshangchengView> selectListView(@Param("ew") Wrapper<DiscussduihuanshangchengEntity> wrapper);

	List<DiscussduihuanshangchengView> selectListView(Pagination page,@Param("ew") Wrapper<DiscussduihuanshangchengEntity> wrapper);
	
	DiscussduihuanshangchengView selectView(@Param("ew") Wrapper<DiscussduihuanshangchengEntity> wrapper);
	
}
