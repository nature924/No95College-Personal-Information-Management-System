package com.dao;

import com.entity.ZuoyetongzhiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ZuoyetongzhiVO;
import com.entity.view.ZuoyetongzhiView;


/**
 * 作业通知
 * 
 * @author 
 * @email 
 * @date 2023-03-02 11:33:51
 */
public interface ZuoyetongzhiDao extends BaseMapper<ZuoyetongzhiEntity> {
	
	List<ZuoyetongzhiVO> selectListVO(@Param("ew") Wrapper<ZuoyetongzhiEntity> wrapper);
	
	ZuoyetongzhiVO selectVO(@Param("ew") Wrapper<ZuoyetongzhiEntity> wrapper);
	
	List<ZuoyetongzhiView> selectListView(@Param("ew") Wrapper<ZuoyetongzhiEntity> wrapper);

	List<ZuoyetongzhiView> selectListView(Pagination page,@Param("ew") Wrapper<ZuoyetongzhiEntity> wrapper);
	
	ZuoyetongzhiView selectView(@Param("ew") Wrapper<ZuoyetongzhiEntity> wrapper);
	

    List<Map<String, Object>> selectValue(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<ZuoyetongzhiEntity> wrapper);

    List<Map<String, Object>> selectTimeStatValue(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<ZuoyetongzhiEntity> wrapper);

    List<Map<String, Object>> selectGroup(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<ZuoyetongzhiEntity> wrapper);



}
