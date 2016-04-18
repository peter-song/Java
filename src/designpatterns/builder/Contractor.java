/*   
 * Copyright (c) 2014-2015 Zhong Ke Fu Chuang (Beijing) Technology Co., Ltd.  All Rights Reserved.   
 *    
 */

package designpatterns.builder;

import designpatterns.builder.ISubContractor;

/**
 * 指挥者类，提供创建房子方法
 * 
 * @Description: TODO
 * @author peter
 * @date 2016年3月30日 下午4:25:39
 * @version V1.0
 */
public class Contractor {
	public void makeHouse(ISubContractor iSubContractor) {
		iSubContractor.addRoof();
		iSubContractor.addWall();
	}
}
