/*   
 * Copyright (c) 2014-2015 Zhong Ke Fu Chuang (Beijing) Technology Co., Ltd.  All Rights Reserved.   
 *    
 */

package designpatterns.factorymethod;

/**
 * 操作类，提供计算结果的抽象方法
 * 
 * @Description: TODO
 * @author peter
 * @date 2016年3月30日 下午4:37:46
 * @version V1.0
 */
public abstract class Operation {
	public abstract int getResult(int a, int b);
}
