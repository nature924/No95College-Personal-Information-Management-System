package com.entity.model;

import com.entity.PigaizuoyeEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 批改作业
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2023-03-02 11:33:51
 */
public class PigaizuoyeModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 课程分类
	 */
	
	private String kechengfenlei;
		
	/**
	 * 教师账号
	 */
	
	private String jiaoshizhanghao;
		
	/**
	 * 教师姓名
	 */
	
	private String jiaoshixingming;
		
	/**
	 * 联系方式
	 */
	
	private String lianxifangshi;
		
	/**
	 * 账号
	 */
	
	private String zhanghao;
		
	/**
	 * 学生姓名
	 */
	
	private String xueshengxingming;
		
	/**
	 * 批改日期
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date pigairiqi;
		
	/**
	 * 评分
	 */
	
	private Integer pingfen;
				
	
	/**
	 * 设置：课程分类
	 */
	 
	public void setKechengfenlei(String kechengfenlei) {
		this.kechengfenlei = kechengfenlei;
	}
	
	/**
	 * 获取：课程分类
	 */
	public String getKechengfenlei() {
		return kechengfenlei;
	}
				
	
	/**
	 * 设置：教师账号
	 */
	 
	public void setJiaoshizhanghao(String jiaoshizhanghao) {
		this.jiaoshizhanghao = jiaoshizhanghao;
	}
	
	/**
	 * 获取：教师账号
	 */
	public String getJiaoshizhanghao() {
		return jiaoshizhanghao;
	}
				
	
	/**
	 * 设置：教师姓名
	 */
	 
	public void setJiaoshixingming(String jiaoshixingming) {
		this.jiaoshixingming = jiaoshixingming;
	}
	
	/**
	 * 获取：教师姓名
	 */
	public String getJiaoshixingming() {
		return jiaoshixingming;
	}
				
	
	/**
	 * 设置：联系方式
	 */
	 
	public void setLianxifangshi(String lianxifangshi) {
		this.lianxifangshi = lianxifangshi;
	}
	
	/**
	 * 获取：联系方式
	 */
	public String getLianxifangshi() {
		return lianxifangshi;
	}
				
	
	/**
	 * 设置：账号
	 */
	 
	public void setZhanghao(String zhanghao) {
		this.zhanghao = zhanghao;
	}
	
	/**
	 * 获取：账号
	 */
	public String getZhanghao() {
		return zhanghao;
	}
				
	
	/**
	 * 设置：学生姓名
	 */
	 
	public void setXueshengxingming(String xueshengxingming) {
		this.xueshengxingming = xueshengxingming;
	}
	
	/**
	 * 获取：学生姓名
	 */
	public String getXueshengxingming() {
		return xueshengxingming;
	}
				
	
	/**
	 * 设置：批改日期
	 */
	 
	public void setPigairiqi(Date pigairiqi) {
		this.pigairiqi = pigairiqi;
	}
	
	/**
	 * 获取：批改日期
	 */
	public Date getPigairiqi() {
		return pigairiqi;
	}
				
	
	/**
	 * 设置：评分
	 */
	 
	public void setPingfen(Integer pingfen) {
		this.pingfen = pingfen;
	}
	
	/**
	 * 获取：评分
	 */
	public Integer getPingfen() {
		return pingfen;
	}
			
}
