package org.will.algorithm.util;

/**
 * ClassName:SortUtil
 * Description:排序算法类
 * @Author Will Wu
 * @Email willwu618@gmail.com
 * @Date 2017-11-03
 */
public class SortUtil {
	
	/**
	 * 自己写的排序--从小到大
	 * 找到比min还小的就和第一个数（未排好的）的交换
	 * @param param
	 * @return
	 */
	public static void sort(int[] param) {
		for (int i = 0; i < param.length; i ++) {
			int min = param[i];
			for (int j = i;j < param.length - 1;j ++) {
				if (min > param[j + 1]) {
					min = param[j + 1];
					param[j + 1] = param[i];
					param[i] = min;
				}
			}
		}
	}
	
	/**
	 * 选择排序--从小到大
	 * 在要排序的一组数中，选出最小的一个数与第一个位置的数交换；
	 * 然后在剩下的数当中再找最小的与第二个位置的数交换，如此循环到倒数第二个数和最后一个数比较为止。
	 * 时间复杂度：T(n)=O(n2)
	 * @param param
	 * @return param
	 */
	public static void sortBySelect(int[] param) {
		for (int i = 0; i < param.length; i ++) {
			int temp = param[i];
			int index = i;
			for (int j = i + 1; j < param.length; j++) {
				if (temp > param[j]) {
					temp = param[j];
					index = j;
				}
			}
			param[index] = param[i];
			param[i] = temp;
		}
	}
	
	/**
	 * 冒泡排序--从小到大
	 * 在要排序的一组数中，对当前还未排好序的范围内的全部数，自上而下对相邻的两个数依次进行比较和调整，让较大的数往下沉，较小的往上冒。
	 * 即：每当两相邻的数比较后发现它们的排序与排序要求相反时，就将它们互换。
	 * 平均时间复杂度为：T(n)=O(n2)
	 * @param param
	 * @return param
	 */
	public static void sortByBubbling(int[] param) {
		for (int i = 0; i < param.length; i ++) {
			for (int j = 0; j < param.length - i - 1; j ++) {
				if (param[j] > param[j + 1]) {
					int temp = param[j];
					param[j] = param[j + 1];
					param[j + 1] = temp;
				}
			}
		}
	}
	
	/**
	 * 直接插入排序--从小到大
	 * 每步将一个待排序的记录，按其顺序码大小插入到前面已经排序的字序列的合适位置，直到全部插入排序完为止
	 * 平均时间复杂度为：T(n)=O(n2)
	 * @param param
	 * @return param
	 */
	public static void sortByDirectInsert(int[] param) {
		for (int i = 1; i < param.length; i ++) {
			int temp = param[i];
			int j;
			for (j = i - 1; j >= 0; j--) {
				if (param[j] > temp) {
					param[j + 1] = param[j];
				} else {
					break;
				}
			}
			param[j + 1] = temp;
		}
	}

	/**
	 * 二分法插入排序--从小到大
	 * 二分法插入排序的思想和直接插入一样，只是找合适的插入位置的方式不同，这里是按二分法找到合适的位置，可以减少比较的次数。
	 * 平均时间复杂度为：T(n)=O(n2)
	 * @param param
	 * @return
	 */
	public static void sortByBinaryInsert(int[] param) {
		for (int i = 0; i < param.length; i++) {
			int temp = param[i];
			int left = 0;
			int right = i-1;
			int mid = 0;
	        while (left <= right) {
                mid = (left + right) / 2;
                if (temp < param[mid]){
                	right = mid - 1;
                } else {
                	left = mid + 1;
                }
	        }
	        for (int j = i-1; j >= left; j--) {
				param[j + 1] = param[j];
            }
            if(left != i){
				param[left] = temp;
	        }
       }
	}
}
