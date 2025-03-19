package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.YonghuhuanbaobiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.YonghuhuanbaobiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.YonghuhuanbaobiView;


/**
 * 用户环保币
 *
 * @author 
 * @email 
 * @date 2021-02-26 18:15:08
 */
public interface YonghuhuanbaobiService extends IService<YonghuhuanbaobiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<YonghuhuanbaobiVO> selectListVO(Wrapper<YonghuhuanbaobiEntity> wrapper);
   	
   	YonghuhuanbaobiVO selectVO(@Param("ew") Wrapper<YonghuhuanbaobiEntity> wrapper);
   	
   	List<YonghuhuanbaobiView> selectListView(Wrapper<YonghuhuanbaobiEntity> wrapper);
   	
   	YonghuhuanbaobiView selectView(@Param("ew") Wrapper<YonghuhuanbaobiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<YonghuhuanbaobiEntity> wrapper);
   	
}

