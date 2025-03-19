package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ZhongchouzhichiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ZhongchouzhichiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ZhongchouzhichiView;


/**
 * 众筹支持
 *
 * @author 
 * @email 
 * @date 2021-02-26 18:15:08
 */
public interface ZhongchouzhichiService extends IService<ZhongchouzhichiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ZhongchouzhichiVO> selectListVO(Wrapper<ZhongchouzhichiEntity> wrapper);
   	
   	ZhongchouzhichiVO selectVO(@Param("ew") Wrapper<ZhongchouzhichiEntity> wrapper);
   	
   	List<ZhongchouzhichiView> selectListView(Wrapper<ZhongchouzhichiEntity> wrapper);
   	
   	ZhongchouzhichiView selectView(@Param("ew") Wrapper<ZhongchouzhichiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ZhongchouzhichiEntity> wrapper);
   	
}

