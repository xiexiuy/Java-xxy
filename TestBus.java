package com.neuedu.part07;

public class TestBus {

	public static void main(String[] args) {
		
		payParkingFee(new BigBus(3));

	}
	
	//������̬
	public static void payParkingFee(Bus bus){
		int parkingFee = bus.parkingFee();//ctrl+1 ����ֵ
		System.out.println("ͣ���շ�"+parkingFee);
	}

}
