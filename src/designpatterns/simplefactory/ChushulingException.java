/*   
 * Copyright (c) 2014-2015 Zhong Ke Fu Chuang (Beijing) Technology Co., Ltd.  All Rights Reserved.   
 *    
 */

package designpatterns.simplefactory;

/**
 * 除数零异常
 * 
 * @Description: TODO
 * @author peter
 * @date 2016年3月31日 下午3:50:19
 * @version V1.0
 */
public class ChushulingException extends Exception {

	/**
	 * @Fields serialVersionUID : TODO
	 */
	private static final long serialVersionUID = 1L;

	public ChushulingException(String msg) {
		super(msg);
	}

}
