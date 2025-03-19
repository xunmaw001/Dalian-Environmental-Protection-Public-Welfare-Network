package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.JiaruhuanbaoshetuanEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.JiaruhuanbaoshetuanVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.JiaruhuanbaoshetuanView;


/**
 * 加入环保社团
 *
 * @author 
 * @email 
 * @date 2021-02-26 18:15:08
 */
public interface JiaruhuanbaoshetuanService extends IService<JiaruhuanbaoshetuanEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<JiaruhuanbaoshetuanVO> selectListVO(Wrapper<JiaruhuanbaoshetuanEntity> wrapper);
   	
   	JiaruhuanbaoshetuanVO selectVO(@Param("ew") Wrapper<JiaruhuanbaoshetuanEntity> wrapper);
   	
   	List<JiaruhuanbaoshetuanView> selectListView(Wrapper<JiaruhuanbaoshetuanEntity> wrapper);
   	
   	JiaruhuanbaoshetuanView selectView(@Param("ew") Wrapper<JiaruhuanbaoshetuanEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<JiaruhuanbaoshetuanEntity> wrapper);
   	
}

