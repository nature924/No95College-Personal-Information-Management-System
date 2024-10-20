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


import com.dao.ZuoyetongzhiDao;
import com.entity.ZuoyetongzhiEntity;
import com.service.ZuoyetongzhiService;
import com.entity.vo.ZuoyetongzhiVO;
import com.entity.view.ZuoyetongzhiView;

@Service("zuoyetongzhiService")
public class ZuoyetongzhiServiceImpl extends ServiceImpl<ZuoyetongzhiDao, ZuoyetongzhiEntity> implements ZuoyetongzhiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ZuoyetongzhiEntity> page = this.selectPage(
                new Query<ZuoyetongzhiEntity>(params).getPage(),
                new EntityWrapper<ZuoyetongzhiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ZuoyetongzhiEntity> wrapper) {
		  Page<ZuoyetongzhiView> page =new Query<ZuoyetongzhiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ZuoyetongzhiVO> selectListVO(Wrapper<ZuoyetongzhiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ZuoyetongzhiVO selectVO(Wrapper<ZuoyetongzhiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ZuoyetongzhiView> selectListView(Wrapper<ZuoyetongzhiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ZuoyetongzhiView selectView(Wrapper<ZuoyetongzhiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

    @Override
    public List<Map<String, Object>> selectValue(Map<String, Object> params, Wrapper<ZuoyetongzhiEntity> wrapper) {
        return baseMapper.selectValue(params, wrapper);
    }

    @Override
    public List<Map<String, Object>> selectTimeStatValue(Map<String, Object> params, Wrapper<ZuoyetongzhiEntity> wrapper) {
        return baseMapper.selectTimeStatValue(params, wrapper);
    }

    @Override
    public List<Map<String, Object>> selectGroup(Map<String, Object> params, Wrapper<ZuoyetongzhiEntity> wrapper) {
        return baseMapper.selectGroup(params, wrapper);
    }




}
