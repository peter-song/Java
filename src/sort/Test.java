/*   
 * Copyright (c) 2014-2015 Zhong Ke Fu Chuang (Beijing) Technology Co., Ltd.  All Rights Reserved.   
 *    
 */      
    
package sort;    

import java.lang.reflect.Method;
import java.util.Scanner;
    
/**   
 * @Description: TODO
 * @author peter
 * @date 2016年4月13日 下午2:28:26 
 * @version V1.0   
 */
public class Test {

	/**
	 * 冒泡排序
	 * 
	 * @Description: TODO
	 * @param @param datas
	 * @return void
	 * @throws
	 */
	public static void buddleSort(int[] datas) {
		for (int i = 0; i < datas.length; i++) {
			for (int j = i; j < datas.length; j++) {
				if (datas[i] > datas[j]) {
					int temp = datas[i];
					datas[i] = datas[j];
					datas[j] = temp;
				}
			}
			for (int data : datas) {
				System.out.print(data + " ");
			}
			System.out.println();
		}
	}

	/**
	 * 选择排序
	 * 
	 * @Description: TODO
	 * @param @param datas
	 * @return void
	 * @throws
	 */
	public static void selectionSort(int[] datas) {
		for (int i = 0; i < datas.length; i++) {
			int min = datas[i];
			int min_index = i;
			for (int j = i; j < datas.length; j++) {
				if (min > datas[j]) {
					min = datas[j];
					min_index = j;
				}
				if (min_index != i) {
					int temp = datas[i];
					datas[i] = datas[min_index];
					datas[min_index] = temp;
				}
			}
			for (int data : datas) {
				System.out.print(data + " ");
			}
			System.out.println();
		}
	}

	/**
	 * 插入排序
	 * 
	 * @Description: TODO
	 * @param @param unsorted
	 * @return void
	 * @throws
	 */
	public static void insertionSort(int[] datas) {
		for (int i = 1; i < datas.length; i++) {
			if (datas[i - 1] > datas[i]) {
				int temp = datas[i];
				int j = i;
				while (j > 0 && datas[j - 1] > temp) {
					datas[j] = datas[j - 1];
					j--;
				}
				datas[j] = temp;
			}
			for (int y : datas) {
				System.out.print(y + " ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) throws Exception {

		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		String[] methods = { "buddleSort", "selectionSort", "insertionSort" };
		for (;;) {
			System.out.println("请选择排序方式");
			String[] names = { "冒泡排序", "选择排序", "插入排序" };
			for (int i = 0; i < names.length; i++) {
				String name = names[i];
				System.out.println((i + 1) + ": " + name);
			}
			int index = 0;
			for (;;) {
				try {
					index = Integer.parseInt(input.next().trim());
					break;
				} catch (Exception e) {
					System.out.println("请输入整数");
				}
			}

			int[] datas = { 9, 8, 7, 6, 5, 4 };
			System.out.println("排序前数据");
			for (int data : datas) {
				System.out.print(data + " ");
			}
			System.out.println();
			System.out.println("排序开始...");
			String methodName = methods[index - 1];
			Class<?> clz = Test.class;
			Method method = clz.getMethod(methodName, int[].class);
			method.invoke(clz.newInstance(), datas);
			System.out.println("排序结束...");
			System.out.println();
			System.out.println("是否继续： Y, N (其它键退出)");
			String isContinue = input.next().trim();
			if (!isContinue.equalsIgnoreCase("y")) {
				System.out.println("end...");
				break;
			}
		}
	}

}
 
