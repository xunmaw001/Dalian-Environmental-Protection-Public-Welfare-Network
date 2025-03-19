package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DiscussduihuanshangchengEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DiscussduihuanshangchengVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DiscussduihuanshangchengView;


/**
 * 兑换商城评论表
 *
 * @author 
 * @email 
 * @date 2021-02-26 18:15:08
 */
public interface DiscussduihuanshangchengService extends IService<DiscussduihuanshangchengEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscussduihuanshangchengVO> selectListVO(Wrapper<DiscussduihuanshangchengEntity> wrapper);
   	
   	DiscussduihuanshangchengVO selectVO(@Param("ew") Wrapper<DiscussduihuanshangchengEntity> wrapper);
   	
   	List<DiscussduihuanshangchengView> selectListView(Wrapper<DiscussduihuanshangchengEntity> wrapper);
   	
   	DiscussduihuanshangchengView selectView(@Param("ew") Wrapper<DiscussduihuanshangchengEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscussduihuanshangchengEntity> wrapper);
   	
}

