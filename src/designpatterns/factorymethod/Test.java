/*   
 * Copyright (c) 2014-2015 Zhong Ke Fu Chuang (Beijing) Technology Co., Ltd.  All Rights Reserved.   
 *    
 */

package designpatterns.factorymethod;

/**
 * 工程方法模式测试
 * 
 * @Description: TODO
 * @author peter
 * @date 2016年3月30日 下午4:43:03
 * @version V1.0
 */
public class Test {

	public static void main(String[] args) {
		int a = 10;
		int b = 5;
		Factory factory = new FactoryAdd();
		Operation operation = factory.createOperation();
		System.out.println(operation.getResult(a, b));

		factory = new FactorySub();
		operation = factory.createOperation();
		System.out.println(operation.getResult(a, b));
	}

}
