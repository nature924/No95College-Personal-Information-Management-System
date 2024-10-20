package com.entity.view;

import com.entity.XuexikechengEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 学习课程
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2023-03-02 11:33:51
 */
@TableName("xuexikecheng")
public class XuexikechengView  extends XuexikechengEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public XuexikechengView(){
	}
 
 	public XuexikechengView(XuexikechengEntity xuexikechengEntity){
 	try {
			BeanUtils.copyProperties(this, xuexikechengEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
