package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ZuoyetongzhiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ZuoyetongzhiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ZuoyetongzhiView;


/**
 * 作业通知
 *
 * @author 
 * @email 
 * @date 2023-03-02 11:33:51
 */
public interface ZuoyetongzhiService extends IService<ZuoyetongzhiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ZuoyetongzhiVO> selectListVO(Wrapper<ZuoyetongzhiEntity> wrapper);
   	
   	ZuoyetongzhiVO selectVO(@Param("ew") Wrapper<ZuoyetongzhiEntity> wrapper);
   	
   	List<ZuoyetongzhiView> selectListView(Wrapper<ZuoyetongzhiEntity> wrapper);
   	
   	ZuoyetongzhiView selectView(@Param("ew") Wrapper<ZuoyetongzhiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ZuoyetongzhiEntity> wrapper);
   	

    List<Map<String, Object>> selectValue(Map<String, Object> params,Wrapper<ZuoyetongzhiEntity> wrapper);

    List<Map<String, Object>> selectTimeStatValue(Map<String, Object> params,Wrapper<ZuoyetongzhiEntity> wrapper);

    List<Map<String, Object>> selectGroup(Map<String, Object> params,Wrapper<ZuoyetongzhiEntity> wrapper);



}

