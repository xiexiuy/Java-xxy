package com.neuedu.part04;


/**
 * ����
 * ��������ͬ���͵����ݰ���һ����˳�������һ���������������
 * �����������ͣ� �Ե�ַ��ʽ���
 * ��ζ��壿
 * ��һ�ֶ��巽ʽ  ���徲̬����  ��������[] �� = {��ŵ���ͬ���͵�ֵ�����ֵ֮���ö��Ÿ���}
 * �ڶ��ֶ��巽ʽ  ���嶯̬����  ��������[] �� = new ��������[�����С]   �����С����ʡ
 * 
 * �����⣺�ٳ��㳣����5���쳣���ͣ�
 * 
 */
public class TestPart401 {

	public static void main(String[] args) {
		
		
		char c='3';
		
		//��������
		int[] arr = {3,2,2,5,5,7,9,100,0};//�ǰ�new������
		System.out.println(arr);
		//�����ȡֵ��ʽ
		//ͨ��ֵ��λ�ã��±꣩��ȡֵindex,��0��ʼ��
		System.out.println(arr[4]);
		
		//��������2
		//����������Ժ󣬻���ݶ�������͸���Ĭ��ֵ  intĬ��0   charĬ�Ͽ��ַ�
		int[] arr2 = new int[60];
		System.out.println(arr2);
		System.out.println((int)arr2[59]);
		//��ֵ
		arr2[0]='A';
		arr2[1]='B';
		
		int a = 0X6d06d69c;
		System.out.println(a);
		
		int[] arr3 = null;
		
		//System.out.println(arr3[0]);
		//���鸳ֵ 60������1--60
		int j=1;
		//ͨ�������i����������±�
		for(int i=0;i<60;i++){
			arr2[i]=j;
			j++;
		}
		//�������ݲ鿴  ѭ����� ��Ϊ����ı���
		//��������� length
		System.out.println(arr2.length);
		for(int i=0;i<arr2.length;i++){
			System.out.print(arr2[i]+" ");
		}
		System.out.println();
		//����arr2��ƽ��ֵ
		int sum = 0;
		for(int i=0;i<arr2.length;i++){
			sum +=arr2[i];
		}
		
		System.out.println(sum/arr2.length);
		//����arr�����ֵ����Сֵ
		//��Ҫһ��������
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
		
		System.out.println("���ֵ��"+max+",��Сֵ��"+min);
	}

}
