package com.neuedu.part03;

import java.util.Scanner;

/**
 * ѭ�� 
 * 1.while(���ʽ){�����} ������ʽ���Ϊ�� ��ִ�д����,��������ʽ����ʱ ѭ��ֹͣ 
 * 2.do...while
 * do{�����}while(���ʽ) ��ִ��һ�δ���飬Ȼ�������ʽ��������ʽ���Ϊ�� ���ٴ�ִ�д����,��������ʽ����ʱ ѭ��ֹͣ
 * 3.for(���ʽ1;���ʽ2;���ʽ3){�����} ���ʽ1����ʼ��������ִֻ��һ�Σ����ʽ2��ѭ���ж��������Ϊ������ ���ʽ3�������仯
 * ���ʽ���Բ�д���ֺű���д
 * ѭ���ǿ���Ƕ�׵�
 *
 * debug �ȼӶϵ㣬 F6ִ�д��� F8������ǰ�ϵ�
 * ѡ����Ҫ��ʽ���Ĵ��룬ctrl+shift+F
 */
public class TestPart303 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 1;
		int b = 2;
		// ��ѭ�� ��Զ����ֹͣ��ѭ��
		while (a > b) {
			System.out.println("ִ����ѭ��");
		}
		// do...while ѭ�� ��Ĭ����ִ��һ�� ��ȥУ���������
		// ʹ�ó�������
		do {
			System.out.println("ִ����ѭ��");
		} while (a > b);

		// ���1��100�ĺ�
		int i = 1;
		int sum = 0;
		while (i <= 100) {// ʲôʱ��ֹͣѭ��
			sum += i;// sum = sum+i
			i++;
		}
		System.out.println(sum);

		sum = 0;
		i = 1;
		do {
			sum += i;// sum = sum+i
			i++;
		} while (i <= 100);
		System.out.println(sum);

		// ���1-1000��������
		int j = 1;
		int sums = 0;

		while (j <= 1000) {
			// �ж� ����
			if (j % 2 != 0) {
				sums += j;
			}
			j++;
		}
		System.out.println("1-1000��������=" + sums);
		sums = 0;
		for (int k = 1; k < 1000; k++) {// ���ʽ����ʡ��
			if (k % 2 != 0) {
				sums += k;
			}
		}
		System.out.println("1-1000��������=" + sums);
		
		//��� 5��7�� �� *��
		for(int o=1;o<=5;o++){
			System.out.println("*******");
		}
		//ѭ�����ж�
		//�ж�һ���� �Ƿ�Ϊ������������
		int num = 101;
		for(int g=2;g<num;g++){
			if(num%g == 0){
				System.out.println("��������");
				return;
			}
		}
		System.out.println("������");
		
		//һ���� 3�� ÿ���4%�����ʣ�������  ����֮��Ϣһ�����٣�
		double money = 100;
		for(int g=1;g<=3;g++){
			money *= (1+0.04);
		}
		System.out.println(money);
		//��� 5��7�� �� *��
		for(int h=1;h<=5;h++){
			for(int f=1;f<=7;f++){
				System.out.print("*");
			}
			System.out.print('\n');
		}
		//��� 1+ 1/2 + 1/3 + 1/4  ... + 1/100 �ĺ�
		
	}

}
