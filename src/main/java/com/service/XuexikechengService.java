package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.XuexikechengEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.XuexikechengVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.XuexikechengView;


/**
 * 学习课程
 *
 * @author 
 * @email 
 * @date 2023-03-02 11:33:51
 */
public interface XuexikechengService extends IService<XuexikechengEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<XuexikechengVO> selectListVO(Wrapper<XuexikechengEntity> wrapper);
   	
   	XuexikechengVO selectVO(@Param("ew") Wrapper<XuexikechengEntity> wrapper);
   	
   	List<XuexikechengView> selectListView(Wrapper<XuexikechengEntity> wrapper);
   	
   	XuexikechengView selectView(@Param("ew") Wrapper<XuexikechengEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<XuexikechengEntity> wrapper);
   	

    List<Map<String, Object>> selectValue(Map<String, Object> params,Wrapper<XuexikechengEntity> wrapper);

    List<Map<String, Object>> selectTimeStatValue(Map<String, Object> params,Wrapper<XuexikechengEntity> wrapper);

    List<Map<String, Object>> selectGroup(Map<String, Object> params,Wrapper<XuexikechengEntity> wrapper);



}

