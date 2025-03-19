package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.HuanbaofenleiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.HuanbaofenleiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.HuanbaofenleiView;


/**
 * 环保分类
 *
 * @author 
 * @email 
 * @date 2021-02-26 18:15:08
 */
public interface HuanbaofenleiService extends IService<HuanbaofenleiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<HuanbaofenleiVO> selectListVO(Wrapper<HuanbaofenleiEntity> wrapper);
   	
   	HuanbaofenleiVO selectVO(@Param("ew") Wrapper<HuanbaofenleiEntity> wrapper);
   	
   	List<HuanbaofenleiView> selectListView(Wrapper<HuanbaofenleiEntity> wrapper);
   	
   	HuanbaofenleiView selectView(@Param("ew") Wrapper<HuanbaofenleiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<HuanbaofenleiEntity> wrapper);
   	
}

