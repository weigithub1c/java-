package com.hand.HanSong;
import java.util.Scanner;

public class Shui {

	public static void main(String[] args) {
			shui2();
	}
		
	public static void shui2(){
		System.out.println("请输入工资：");
		Scanner scan = new Scanner(System.in);
		int x = scan.nextInt(); 
		int y = x - 3500 ;
		float z = 0;
		if(y < 0 && x>0){
			z = 0;
			System.out.println("所需要缴纳的税费为" + z);
		}else if(y < 1500 && y>=0){							
			z = (float) (y * 0.03);		
			System.out.println("所需要缴纳的税费为" + z);
		}else if(y >= 1500 && y <= 4500){
			z = (float) (y*0.1) ;
			System.out.println("所需要缴纳的税费为" + z);
		}else if(y > 4500 && y <= 9000){
			z = (float) (y*0.2) ;
			System.out.println("所需要缴纳的税费为" + z);
		}else if (y > 9000 && y <= 35000){
			z =(float)(y * 0.25);
			System.out.println("所需要缴纳的税费为" + z);
		}else if (y > 35000 && y <= 55000 ){
			z =(float)(y * 0.3);
			System.out.println("所需要缴纳的税费为" + z);
		}else if (y > 55000 && y <= 80000){
			z =(float)(y * 0.35);
			System.out.println("所需要缴纳的税费为" + z);
		}else if (y > 80000  ){
			z =(float)(y * 0.45);
			System.out.println("所需要缴纳的税费为" + z);
		}
		else{
			System.out.println("您输入的数字有误！");
		}
	}
	
}
