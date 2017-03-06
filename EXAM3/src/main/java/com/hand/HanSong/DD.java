package com.hand.HanSong;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DD {
	
 private static int  year;
 private static int month;
 private static int day;
 
 	public void getNextdays(int year,int month,int day){
	  
	  int b=0;           							//大小年的标志
	  if(year%400==0||(year%4==0&&year%100==0)){
		  b=1;
	  }
	  //判断是否为一年的最后一天
	  if(month==12 && day==31){
		  year = year + 1;
		  month = 1;
		  day =1;
	  }
	  
	  //判断是大月 1 3 5 7 8 10 12
	  else 
		  if(month==1|| month ==3 || month==5 || month==7 || month==8 || month==10 || month ==12){
		  if(day>31)     System.out.println("您输入的日期不存在");
		  else if(day==31){ 
			  month = month+1;
			  day = 1;
		  }else day = day+1;
	  }else  //判断是平年的二月还是闰年的二月
		  if(month==2){ 
			  if(b==0){
				  if(day>28) 	 System.out.println("您输入的日期不存在");
				  else if(day==28){
						  month = month+1;
						  day = 1;
					  }
					  else day = day +1;
			  }else{
				  if(day>29) 	 System.out.println("您输入的日期不存在");
				  else if(day==29){
						  month = month+1;
						  day = 1;
					  }
					  else day = day +1;
			  }
		  }else{                       //判断是小月 4 6 9 11
			  if(day>30)   System.out.println("您输入的日期不存在");
			  else if(day==30){
				  month = month+1;
				  day = 1;
			  }else   day = day +1;
			    
		  } 
	  if(month<10)   System.out.println("下一天为："+year+"-0"+month+"-"+day);
	  else           System.out.println("下一天为："+year+"-"+month+"-"+day);
  
   	}
 
 
 	public static void main(String[] args) {
	 
		  BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		  
		  try {
		   System.out.println("请输入日期：(例如：2017-01-01)");
		   String date = br.readLine();
		   
		   year = Integer.parseInt(date.substring(0, 4));
		   
		   month=Integer.parseInt(date.substring(5, 7));
		   
		   day=Integer.parseInt(date.substring(8, 10));
		   
		  } catch (NumberFormatException e) {
		   e.printStackTrace();
		  } catch (IOException e) {
		   e.printStackTrace();
		  }
		  
		  new DD().getNextdays(year, month, day);
	}
}
