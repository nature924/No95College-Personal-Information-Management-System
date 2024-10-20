package com.dao;

import com.entity.PigaizuoyeEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.PigaizuoyeVO;
import com.entity.view.PigaizuoyeView;


/**
 * 批改作业
 * 
 * @author 
 * @email 
 * @date 2023-03-02 11:33:51
 */
public interface PigaizuoyeDao extends BaseMapper<PigaizuoyeEntity> {
	
	List<PigaizuoyeVO> selectListVO(@Param("ew") Wrapper<PigaizuoyeEntity> wrapper);
	
	PigaizuoyeVO selectVO(@Param("ew") Wrapper<PigaizuoyeEntity> wrapper);
	
	List<PigaizuoyeView> selectListView(@Param("ew") Wrapper<PigaizuoyeEntity> wrapper);

	List<PigaizuoyeView> selectListView(Pagination page,@Param("ew") Wrapper<PigaizuoyeEntity> wrapper);
	
	PigaizuoyeView selectView(@Param("ew") Wrapper<PigaizuoyeEntity> wrapper);
	

}
