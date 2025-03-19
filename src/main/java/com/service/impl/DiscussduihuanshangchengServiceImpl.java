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


import com.dao.DiscussduihuanshangchengDao;
import com.entity.DiscussduihuanshangchengEntity;
import com.service.DiscussduihuanshangchengService;
import com.entity.vo.DiscussduihuanshangchengVO;
import com.entity.view.DiscussduihuanshangchengView;

@Service("discussduihuanshangchengService")
public class DiscussduihuanshangchengServiceImpl extends ServiceImpl<DiscussduihuanshangchengDao, DiscussduihuanshangchengEntity> implements DiscussduihuanshangchengService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiscussduihuanshangchengEntity> page = this.selectPage(
                new Query<DiscussduihuanshangchengEntity>(params).getPage(),
                new EntityWrapper<DiscussduihuanshangchengEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiscussduihuanshangchengEntity> wrapper) {
		  Page<DiscussduihuanshangchengView> page =new Query<DiscussduihuanshangchengView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DiscussduihuanshangchengVO> selectListVO(Wrapper<DiscussduihuanshangchengEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DiscussduihuanshangchengVO selectVO(Wrapper<DiscussduihuanshangchengEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DiscussduihuanshangchengView> selectListView(Wrapper<DiscussduihuanshangchengEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiscussduihuanshangchengView selectView(Wrapper<DiscussduihuanshangchengEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
