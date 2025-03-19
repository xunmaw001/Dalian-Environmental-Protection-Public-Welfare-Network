package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DuihuanshangchengEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DuihuanshangchengVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DuihuanshangchengView;


/**
 * 兑换商城
 *
 * @author 
 * @email 
 * @date 2021-02-26 18:15:08
 */
public interface DuihuanshangchengService extends IService<DuihuanshangchengEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DuihuanshangchengVO> selectListVO(Wrapper<DuihuanshangchengEntity> wrapper);
   	
   	DuihuanshangchengVO selectVO(@Param("ew") Wrapper<DuihuanshangchengEntity> wrapper);
   	
   	List<DuihuanshangchengView> selectListView(Wrapper<DuihuanshangchengEntity> wrapper);
   	
   	DuihuanshangchengView selectView(@Param("ew") Wrapper<DuihuanshangchengEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DuihuanshangchengEntity> wrapper);
   	
}

