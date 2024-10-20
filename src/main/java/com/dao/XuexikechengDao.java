package com.dao;

import com.entity.XuexikechengEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.XuexikechengVO;
import com.entity.view.XuexikechengView;


/**
 * 学习课程
 * 
 * @author 
 * @email 
 * @date 2023-03-02 11:33:51
 */
public interface XuexikechengDao extends BaseMapper<XuexikechengEntity> {
	
	List<XuexikechengVO> selectListVO(@Param("ew") Wrapper<XuexikechengEntity> wrapper);
	
	XuexikechengVO selectVO(@Param("ew") Wrapper<XuexikechengEntity> wrapper);
	
	List<XuexikechengView> selectListView(@Param("ew") Wrapper<XuexikechengEntity> wrapper);

	List<XuexikechengView> selectListView(Pagination page,@Param("ew") Wrapper<XuexikechengEntity> wrapper);
	
	XuexikechengView selectView(@Param("ew") Wrapper<XuexikechengEntity> wrapper);
	

    List<Map<String, Object>> selectValue(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<XuexikechengEntity> wrapper);

    List<Map<String, Object>> selectTimeStatValue(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<XuexikechengEntity> wrapper);

    List<Map<String, Object>> selectGroup(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<XuexikechengEntity> wrapper);



}
