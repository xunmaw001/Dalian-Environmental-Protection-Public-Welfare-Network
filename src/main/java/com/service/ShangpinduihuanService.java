package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ShangpinduihuanEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ShangpinduihuanVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ShangpinduihuanView;


/**
 * 商品兑换
 *
 * @author 
 * @email 
 * @date 2021-02-26 18:15:08
 */
public interface ShangpinduihuanService extends IService<ShangpinduihuanEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ShangpinduihuanVO> selectListVO(Wrapper<ShangpinduihuanEntity> wrapper);
   	
   	ShangpinduihuanVO selectVO(@Param("ew") Wrapper<ShangpinduihuanEntity> wrapper);
   	
   	List<ShangpinduihuanView> selectListView(Wrapper<ShangpinduihuanEntity> wrapper);
   	
   	ShangpinduihuanView selectView(@Param("ew") Wrapper<ShangpinduihuanEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ShangpinduihuanEntity> wrapper);
   	
}

