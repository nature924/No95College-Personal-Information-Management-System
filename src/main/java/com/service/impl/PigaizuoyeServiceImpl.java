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


import com.dao.PigaizuoyeDao;
import com.entity.PigaizuoyeEntity;
import com.service.PigaizuoyeService;
import com.entity.vo.PigaizuoyeVO;
import com.entity.view.PigaizuoyeView;

@Service("pigaizuoyeService")
public class PigaizuoyeServiceImpl extends ServiceImpl<PigaizuoyeDao, PigaizuoyeEntity> implements PigaizuoyeService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<PigaizuoyeEntity> page = this.selectPage(
                new Query<PigaizuoyeEntity>(params).getPage(),
                new EntityWrapper<PigaizuoyeEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<PigaizuoyeEntity> wrapper) {
		  Page<PigaizuoyeView> page =new Query<PigaizuoyeView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<PigaizuoyeVO> selectListVO(Wrapper<PigaizuoyeEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public PigaizuoyeVO selectVO(Wrapper<PigaizuoyeEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<PigaizuoyeView> selectListView(Wrapper<PigaizuoyeEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public PigaizuoyeView selectView(Wrapper<PigaizuoyeEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
