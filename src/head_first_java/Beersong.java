/*   
 * Copyright (c) 2014-2015 Zhong Ke Fu Chuang (Beijing) Technology Co., Ltd.  All Rights Reserved.   
 *    
 */

package head_first_java;

/**
 * @Description: TODO
 * @author peter
 * @date 2016年4月14日 上午10:40:23
 * @version V1.0
 */
public class Beersong {
	public static void main(String[] args) {
		int beerNum = 99;
		String word = "bottles";
		while (beerNum > 0) {
			if (beerNum == 1) {
				word = "bottle";
			}
			System.out.println(beerNum + " " + word + " of beer on the wall");
			System.out.println(beerNum + " " + word + " of beer.");
			System.out.println("Take one down.");
			System.out.println("Pass it around");
			beerNum--;

			if (beerNum > 0) {
				System.out.println(beerNum + " " + word + " of beer on the wall");
			} else {
				System.out.println("No more bottles of beer on the wall");
			}
		}
	}
}
