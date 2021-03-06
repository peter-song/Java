/*   
 * Copyright (c) 2014-2015 Zhong Ke Fu Chuang (Beijing) Technology Co., Ltd.  All Rights Reserved.   
 *    
 */

package designpatterns.factorymethod;

/**
 * 加法工厂类，继承工厂类，实现创建操作方法（返回相加操作对象）
 * 
 * @Description: TODO
 * @author peter
 * @date 2016年3月30日 下午4:41:38
 * @version V1.0
 */
public class FactoryAdd extends Factory {

	@Override
	public Operation createOperation() {

		return new OperationAdd();
	}

}
