package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DiscusshuanbaoshetuanEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DiscusshuanbaoshetuanVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DiscusshuanbaoshetuanView;


/**
 * 环保社团评论表
 *
 * @author 
 * @email 
 * @date 2021-02-26 18:15:08
 */
public interface DiscusshuanbaoshetuanService extends IService<DiscusshuanbaoshetuanEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscusshuanbaoshetuanVO> selectListVO(Wrapper<DiscusshuanbaoshetuanEntity> wrapper);
   	
   	DiscusshuanbaoshetuanVO selectVO(@Param("ew") Wrapper<DiscusshuanbaoshetuanEntity> wrapper);
   	
   	List<DiscusshuanbaoshetuanView> selectListView(Wrapper<DiscusshuanbaoshetuanEntity> wrapper);
   	
   	DiscusshuanbaoshetuanView selectView(@Param("ew") Wrapper<DiscusshuanbaoshetuanEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscusshuanbaoshetuanEntity> wrapper);
   	
}

