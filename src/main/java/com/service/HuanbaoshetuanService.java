package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.HuanbaoshetuanEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.HuanbaoshetuanVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.HuanbaoshetuanView;


/**
 * 环保社团
 *
 * @author 
 * @email 
 * @date 2021-02-26 18:15:08
 */
public interface HuanbaoshetuanService extends IService<HuanbaoshetuanEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<HuanbaoshetuanVO> selectListVO(Wrapper<HuanbaoshetuanEntity> wrapper);
   	
   	HuanbaoshetuanVO selectVO(@Param("ew") Wrapper<HuanbaoshetuanEntity> wrapper);
   	
   	List<HuanbaoshetuanView> selectListView(Wrapper<HuanbaoshetuanEntity> wrapper);
   	
   	HuanbaoshetuanView selectView(@Param("ew") Wrapper<HuanbaoshetuanEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<HuanbaoshetuanEntity> wrapper);
   	
}

