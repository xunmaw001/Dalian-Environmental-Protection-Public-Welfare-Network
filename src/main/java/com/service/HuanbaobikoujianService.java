package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.HuanbaobikoujianEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.HuanbaobikoujianVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.HuanbaobikoujianView;


/**
 * 环保币扣减
 *
 * @author 
 * @email 
 * @date 2021-02-26 18:15:08
 */
public interface HuanbaobikoujianService extends IService<HuanbaobikoujianEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<HuanbaobikoujianVO> selectListVO(Wrapper<HuanbaobikoujianEntity> wrapper);
   	
   	HuanbaobikoujianVO selectVO(@Param("ew") Wrapper<HuanbaobikoujianEntity> wrapper);
   	
   	List<HuanbaobikoujianView> selectListView(Wrapper<HuanbaobikoujianEntity> wrapper);
   	
   	HuanbaobikoujianView selectView(@Param("ew") Wrapper<HuanbaobikoujianEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<HuanbaobikoujianEntity> wrapper);
   	
}

