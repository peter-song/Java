/*   
 * Copyright (c) 2014-2015 Zhong Ke Fu Chuang (Beijing) Technology Co., Ltd.  All Rights Reserved.   
 *    
 */

package designpatterns.builder;

/**
 * 建造者类，提供获取房子方法
 * 
 * @Description: TODO
 * @author peter
 * @date 2016年3月30日 下午4:25:51
 * @version V1.0
 */
public interface ISubContractor {
	public abstract void addRoof();

	public abstract void addWall();

	public abstract House getHouse();
}
