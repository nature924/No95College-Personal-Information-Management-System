package com.entity.view;

import com.entity.ZuoyetongzhiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 作业通知
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2023-03-02 11:33:51
 */
@TableName("zuoyetongzhi")
public class ZuoyetongzhiView  extends ZuoyetongzhiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public ZuoyetongzhiView(){
	}
 
 	public ZuoyetongzhiView(ZuoyetongzhiEntity zuoyetongzhiEntity){
 	try {
			BeanUtils.copyProperties(this, zuoyetongzhiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
