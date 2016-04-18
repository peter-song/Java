/*   
 * Copyright (c) 2014-2015 Zhong Ke Fu Chuang (Beijing) Technology Co., Ltd.  All Rights Reserved.   
 *    
 */

package algorithm;

/**
 * 水仙花数
 * 
 * @Description: TODO
 * @author peter
 * @date 2016年4月14日 下午12:19:50
 * @version V1.0
 */
public class Daffodils {
	public static void main(String[] args) {
		int l = 1000;
		for (int i = 100; i < l; i++) {
			int x = i / 100;
			int y = i / 10 % 10;
			int z = i % 10;
			if (x * x * x + y * y * y + z * z * z == i) {
				System.out.println(i);
			}
		}
	}
}
