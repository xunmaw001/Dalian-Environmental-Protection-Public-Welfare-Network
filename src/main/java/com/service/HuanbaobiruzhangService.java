package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.HuanbaobiruzhangEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.HuanbaobiruzhangVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.HuanbaobiruzhangView;


/**
 * 环保币入账
 *
 * @author 
 * @email 
 * @date 2021-02-26 18:15:08
 */
public interface HuanbaobiruzhangService extends IService<HuanbaobiruzhangEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<HuanbaobiruzhangVO> selectListVO(Wrapper<HuanbaobiruzhangEntity> wrapper);
   	
   	HuanbaobiruzhangVO selectVO(@Param("ew") Wrapper<HuanbaobiruzhangEntity> wrapper);
   	
   	List<HuanbaobiruzhangView> selectListView(Wrapper<HuanbaobiruzhangEntity> wrapper);
   	
   	HuanbaobiruzhangView selectView(@Param("ew") Wrapper<HuanbaobiruzhangEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<HuanbaobiruzhangEntity> wrapper);
   	
}

