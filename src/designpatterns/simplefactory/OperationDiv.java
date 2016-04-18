/*   
 * Copyright (c) 2014-2015 Zhong Ke Fu Chuang (Beijing) Technology Co., Ltd.  All Rights Reserved.   
 *    
 */

package designpatterns.simplefactory;

/**
 * 加法操作类，实现计算结果方法（除）
 * 
 * @Description: TODO
 * @author peter
 * @date 2016年3月31日 下午3:48:17
 * @version V1.0
 */
public class OperationDiv extends Operation {

	@Override
	public int getResult(int a, int b) {
		int r = 0;
		try {
			if (b == 0) {
				throw new ChushulingException("除数不能为0");
			} else {
				r = a / b;
			}
		} catch (ChushulingException e) {
			e.printStackTrace();
		}
		return r;
	}

}
