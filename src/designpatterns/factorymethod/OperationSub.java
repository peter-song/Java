/*   
 * Copyright (c) 2014-2015 Zhong Ke Fu Chuang (Beijing) Technology Co., Ltd.  All Rights Reserved.   
 *    
 */

package designpatterns.factorymethod;

/**
 * 减法操作类，实现计算结果方法（减）
 * 
 * @Description: TODO
 * @author peter
 * @date 2016年3月30日 下午4:39:19
 * @version V1.0
 */
public class OperationSub extends Operation {

	@Override
	public int getResult(int a, int b) {
		return a - b;
	}

}
