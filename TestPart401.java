package com.neuedu.part04;


/**
 * 数组
 * 数组是相同类型的数据按照一定的顺序组合在一起的引用数据类型
 * 引用数据类型： 以地址形式存放
 * 如何定义？
 * 第一种定义方式  定义静态数组  数据类型[] 名 = {存放的相同类型的值，多个值之间用逗号隔开}
 * 第二种定义方式  定义动态数组  数据类型[] 名 = new 数据类型[数组大小]   数组大小不能省
 * 
 * 面试题：举出你常见的5种异常类型？
 * 
 */
public class TestPart401 {

	public static void main(String[] args) {
		
		
		char c='3';
		
		//定义数组
		int[] arr = {3,2,2,5,5,7,9,100,0};//是把new隐藏了
		System.out.println(arr);
		//数组的取值方式
		//通过值的位置（下标）来取值index,从0开始的
		System.out.println(arr[4]);
		
		//定义数组2
		//定义好数组以后，会根据定义的类型赋予默认值  int默认0   char默认空字符
		int[] arr2 = new int[60];
		System.out.println(arr2);
		System.out.println((int)arr2[59]);
		//赋值
		arr2[0]='A';
		arr2[1]='B';
		
		int a = 0X6d06d69c;
		System.out.println(a);
		
		int[] arr3 = null;
		
		//System.out.println(arr3[0]);
		//数组赋值 60个数字1--60
		int j=1;
		//通常这里的i用于数组的下标
		for(int i=0;i<60;i++){
			arr2[i]=j;
			j++;
		}
		//数组数据查看  循环输出 称为数组的遍历
		//数组的属性 length
		System.out.println(arr2.length);
		for(int i=0;i<arr2.length;i++){
			System.out.print(arr2[i]+" ");
		}
		System.out.println();
		//计算arr2的平均值
		int sum = 0;
		for(int i=0;i<arr2.length;i++){
			sum +=arr2[i];
		}
		
		System.out.println(sum/arr2.length);
		//计算arr的最大值，最小值
		//需要一个参照数
		int min =arr[0];
		int max =arr[0];
		
		for(int i=1;i<arr.length;i++){
			if(arr[i]>max){
				max = arr[i];
			}
			if(arr[i]<min){
				min = arr[i];
			}
		}
		
		System.out.println("最大值是"+max+",最小值是"+min);
	}

}
