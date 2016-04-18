/*   
 * Copyright (c) 2014-2015 Zhong Ke Fu Chuang (Beijing) Technology Co., Ltd.  All Rights Reserved.   
 *    
 */

package designpatterns.builder;

/**
 * 建造者模式测试
 * 
 * @Description: TODO
 * @author peter
 * @date 2016年3月30日 下午4:32:15
 * @version V1.0
 */
public class Test {
	public static void main(String[] args) {
		Contractor contractor = new Contractor();
		ISubContractor iSubContractor = new SingleFamilySubContractor();
		contractor.makeHouse(iSubContractor);
		iSubContractor.getHouse();

		ISubContractor iSubContractor2 = new TownHomeSubContractor();
		contractor.makeHouse(iSubContractor2);
		iSubContractor2.getHouse();
	}

}
