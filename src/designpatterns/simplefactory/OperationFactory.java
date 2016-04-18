/*   
 * Copyright (c) 2014-2015 Zhong Ke Fu Chuang (Beijing) Technology Co., Ltd.  All Rights Reserved.   
 *    
 */

package designpatterns.simplefactory;

/**
 * 操作工厂类，提供创建操作方法，根据操作符返回相应实现对象
 * 
 * @Description: TODO
 * @author peter
 * @date 2016年3月31日 下午3:53:03   
 * @version V1.0
 */
public class OperationFactory {
	public static Operation createOperation(String operate) {
		Operation operation = null;
		if (operate.equals("+")) {
			operation = new OperationAdd();
		} else if (operate.equals("-")) {
			operation = new OperationSub();
		} else if (operate.equals("*")) {
			operation = new OperationMul();
		} else if (operate.equals("/")) {
			operation = new OperationDiv();
		}
		return operation;
	}
}
