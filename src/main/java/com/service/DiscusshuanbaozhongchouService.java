package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DiscusshuanbaozhongchouEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DiscusshuanbaozhongchouVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DiscusshuanbaozhongchouView;


/**
 * 环保众筹评论表
 *
 * @author 
 * @email 
 * @date 2021-02-26 18:15:08
 */
public interface DiscusshuanbaozhongchouService extends IService<DiscusshuanbaozhongchouEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscusshuanbaozhongchouVO> selectListVO(Wrapper<DiscusshuanbaozhongchouEntity> wrapper);
   	
   	DiscusshuanbaozhongchouVO selectVO(@Param("ew") Wrapper<DiscusshuanbaozhongchouEntity> wrapper);
   	
   	List<DiscusshuanbaozhongchouView> selectListView(Wrapper<DiscusshuanbaozhongchouEntity> wrapper);
   	
   	DiscusshuanbaozhongchouView selectView(@Param("ew") Wrapper<DiscusshuanbaozhongchouEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscusshuanbaozhongchouEntity> wrapper);
   	
}

