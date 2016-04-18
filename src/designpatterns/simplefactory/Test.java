/*   
 * Copyright (c) 2014-2015 Zhong Ke Fu Chuang (Beijing) Technology Co., Ltd.  All Rights Reserved.   
 *    
 */

package designpatterns.simplefactory;

/**
 * 简单工厂模式测试
 * 
 * @Description: TODO
 * @author peter
 * @date 2016年3月31日 下午3:55:35
 * @version V1.0
 */
public class Test {

	public static void main(String[] args) {
		int a = 9;
		int b = 3;
		Operation operation1 = OperationFactory.createOperation("+");
		System.out.println(operation1.getResult(a, b));
		Operation operation2 = OperationFactory.createOperation("-");
		System.out.println(operation2.getResult(a, b));
		Operation operation3 = OperationFactory.createOperation("*");
		System.out.println(operation3.getResult(a, b));
		Operation operation4 = OperationFactory.createOperation("/");
		System.out.println(operation4.getResult(a, b));
	}

}
