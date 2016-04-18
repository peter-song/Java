/*   
 * Copyright (c) 2014-2015 Zhong Ke Fu Chuang (Beijing) Technology Co., Ltd.  All Rights Reserved.   
 *    
 */

package designpatterns.factorymethod;

/**
 * 工厂类，提供创建操作的抽象方法
 * 
 * @Description: TODO
 * @author peter
 * @date 2016年3月30日 下午4:40:25
 * @version V1.0
 */
public abstract class Factory {
	public abstract Operation createOperation();
}
