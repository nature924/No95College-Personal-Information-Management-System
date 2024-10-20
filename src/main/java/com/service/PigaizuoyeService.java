package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.PigaizuoyeEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.PigaizuoyeVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.PigaizuoyeView;


/**
 * 批改作业
 *
 * @author 
 * @email 
 * @date 2023-03-02 11:33:51
 */
public interface PigaizuoyeService extends IService<PigaizuoyeEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<PigaizuoyeVO> selectListVO(Wrapper<PigaizuoyeEntity> wrapper);
   	
   	PigaizuoyeVO selectVO(@Param("ew") Wrapper<PigaizuoyeEntity> wrapper);
   	
   	List<PigaizuoyeView> selectListView(Wrapper<PigaizuoyeEntity> wrapper);
   	
   	PigaizuoyeView selectView(@Param("ew") Wrapper<PigaizuoyeEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<PigaizuoyeEntity> wrapper);
   	

}

