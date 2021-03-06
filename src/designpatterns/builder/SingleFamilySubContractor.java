/*   
 * Copyright (c) 2014-2015 Zhong Ke Fu Chuang (Beijing) Technology Co., Ltd.  All Rights Reserved.   
 *    
 */

package designpatterns.builder;

/**
 * 具体构建类1
 * 
 * @Description: TODO
 * @author peter
 * @date 2016年3月30日 下午4:26:11
 * @version V1.0
 */
public class SingleFamilySubContractor implements ISubContractor {

	private House house = new House();

	@Override
	public void addRoof() {
		System.out.println("一个小顶");
	}

	@Override
	public void addWall() {
		System.out.println("四面墙");
	}

	@Override
	public House getHouse() {
		return house;
	}

}
