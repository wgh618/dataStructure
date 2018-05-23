package org.will.algorithm.test;

import org.will.algorithm.util.SortUtil;

/**
 * ClassName:TestDemo
 * Description:测试类
 * @Author Will Wu
 * @Email willwu618@gmail.com
 * @Date 2017-11-03
 */
public class TestDemo {

	public static void main(String[] args) {
		int[] param = {49,38,65,97,76,13,27,49,78,34,12,64,1,8};
		SortUtil.sortByBinaryInsert(param);
		
		for (int i = 0;i < param.length;i ++) {
			System.out.print(param[i] + " ");
		}
		/*
		System.out.println();
		System.out.println("***********选择排序*************");
		SortUtil.sortBySelect(param);
		
		for (int i = 0;i < param.length;i ++) {
			System.out.print(param[i] + " ");
		}

		System.out.println();
		System.out.println("***********冒泡排序*************");
		SortUtil.sortByBubbling(param);
		
		for (int i = 0;i < param.length;i ++) {
			System.out.print(param[i] + " ");
		}
		
		System.out.println();
		System.out.println("***********直接插入排序*************");
		SortUtil.sortByDirectInsert(param);
		
		for (int i = 0;i < param.length;i ++) {
			System.out.print(param[i] + " ");
		}*/
	}

}
