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


import com.dao.XuexikechengDao;
import com.entity.XuexikechengEntity;
import com.service.XuexikechengService;
import com.entity.vo.XuexikechengVO;
import com.entity.view.XuexikechengView;

@Service("xuexikechengService")
public class XuexikechengServiceImpl extends ServiceImpl<XuexikechengDao, XuexikechengEntity> implements XuexikechengService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<XuexikechengEntity> page = this.selectPage(
                new Query<XuexikechengEntity>(params).getPage(),
                new EntityWrapper<XuexikechengEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<XuexikechengEntity> wrapper) {
		  Page<XuexikechengView> page =new Query<XuexikechengView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<XuexikechengVO> selectListVO(Wrapper<XuexikechengEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public XuexikechengVO selectVO(Wrapper<XuexikechengEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<XuexikechengView> selectListView(Wrapper<XuexikechengEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public XuexikechengView selectView(Wrapper<XuexikechengEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

    @Override
    public List<Map<String, Object>> selectValue(Map<String, Object> params, Wrapper<XuexikechengEntity> wrapper) {
        return baseMapper.selectValue(params, wrapper);
    }

    @Override
    public List<Map<String, Object>> selectTimeStatValue(Map<String, Object> params, Wrapper<XuexikechengEntity> wrapper) {
        return baseMapper.selectTimeStatValue(params, wrapper);
    }

    @Override
    public List<Map<String, Object>> selectGroup(Map<String, Object> params, Wrapper<XuexikechengEntity> wrapper) {
        return baseMapper.selectGroup(params, wrapper);
    }




}
