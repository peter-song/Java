/*   
 * Copyright (c) 2014-2015 Zhong Ke Fu Chuang (Beijing) Technology Co., Ltd.  All Rights Reserved.   
 *    
 */

package algorithm;

/**
 * 99乘法表
 * 
 * @Description: TODO
 * @author peter
 * @date 2016年4月14日 下午12:16:16
 * @version V1.0
 */
public class MultiplicationTables {
	public static void main(String[] args) {
		for (int i = 1; i <= 9; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j + "*" + i + "=" + i * j + " ");
			}
			System.out.println();
		}
	}
}
