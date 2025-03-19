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


import com.dao.DuihuanshangchengDao;
import com.entity.DuihuanshangchengEntity;
import com.service.DuihuanshangchengService;
import com.entity.vo.DuihuanshangchengVO;
import com.entity.view.DuihuanshangchengView;

@Service("duihuanshangchengService")
public class DuihuanshangchengServiceImpl extends ServiceImpl<DuihuanshangchengDao, DuihuanshangchengEntity> implements DuihuanshangchengService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DuihuanshangchengEntity> page = this.selectPage(
                new Query<DuihuanshangchengEntity>(params).getPage(),
                new EntityWrapper<DuihuanshangchengEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DuihuanshangchengEntity> wrapper) {
		  Page<DuihuanshangchengView> page =new Query<DuihuanshangchengView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DuihuanshangchengVO> selectListVO(Wrapper<DuihuanshangchengEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DuihuanshangchengVO selectVO(Wrapper<DuihuanshangchengEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DuihuanshangchengView> selectListView(Wrapper<DuihuanshangchengEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DuihuanshangchengView selectView(Wrapper<DuihuanshangchengEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
