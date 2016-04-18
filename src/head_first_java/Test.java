/*   
 * Copyright (c) 2014-2015 Zhong Ke Fu Chuang (Beijing) Technology Co., Ltd.  All Rights Reserved.   
 *    
 */

package head_first_java;

/**
 * @Description: TODO
 * @author peter
 * @date 2016年4月14日 上午11:12:31
 * @version V1.0
 */
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p1 = new Person("xiaoxin", 20);
		Person p2 = new Person("xiaoqiang", 18);
		Person p3 = p2;

		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p3);

		int[] names = { 1, 3, 5, 7 };
		int a = 8;
		changeName(names, a);
		System.out.println(names[0]);
		System.out.println(a);
	}

	private static void changeName(int[] names, int a) {
		names[0] = 9;
		a = 0;
	}

}
