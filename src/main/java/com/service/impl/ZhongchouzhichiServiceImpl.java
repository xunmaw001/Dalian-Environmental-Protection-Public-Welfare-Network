package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.ZhongchouzhichiDao;
import com.entity.ZhongchouzhichiEntity;
import com.service.ZhongchouzhichiService;
import com.entity.vo.ZhongchouzhichiVO;
import com.entity.view.ZhongchouzhichiView;

@Service("zhongchouzhichiService")
public class ZhongchouzhichiServiceImpl extends ServiceImpl<ZhongchouzhichiDao, ZhongchouzhichiEntity> implements ZhongchouzhichiService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ZhongchouzhichiEntity> page = this.selectPage(
                new Query<ZhongchouzhichiEntity>(params).getPage(),
                new EntityWrapper<ZhongchouzhichiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ZhongchouzhichiEntity> wrapper) {
		  Page<ZhongchouzhichiView> page =new Query<ZhongchouzhichiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ZhongchouzhichiVO> selectListVO(Wrapper<ZhongchouzhichiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ZhongchouzhichiVO selectVO(Wrapper<ZhongchouzhichiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ZhongchouzhichiView> selectListView(Wrapper<ZhongchouzhichiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ZhongchouzhichiView selectView(Wrapper<ZhongchouzhichiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
