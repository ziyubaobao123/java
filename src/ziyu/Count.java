package ziyu;

import java.util.Random;


public class Count {
	 //布尔型成员变量is
	char o = '+';
	//定义字符型变量o，用以接收加法或者减法符号
	 int[] sum = new int[100];
	  int m =0;
	  int n =0;
	  boolean is;
	  
	public Count(int m,int n,int sum[],boolean is) {
		this.m=m;
		this.n=n;
		this.sum=sum;
		this.is=is;
		
	}
	
	
	public  void printHeader1() {
		System.out.println("..............................");
		System.out.println("-程序输出50道100以内的加减法算式的习题-");
		System.out.println("-每次运行程序可得到一套50道题的习题及答案-");
		System.out.println("..............................");
	}//程序功能提示方法
	
	
	public void printHeader2() {
		System.out.println("..............................");
		System.out.println("-下面是习题的参考答案");
		System.out.println("..............................");
	}
	
	
	public  boolean generateEquations() {
		short ov = 0;
		Random random = new Random();
		ov = (short) random.nextInt(2);
		//ov的值为0或1
		if(ov == 1) {
			o = '+';
			is=true;
		} else {
			o = '-';
			is=false;
		}//ov为1是加法，ov为0是减法
		return is;
	}//确定加法还是减法
	
	
	public void add(int m1,int n1,int j) {
		 Random random = new Random();
		 m1  = (int) random.nextInt(101);
	     n1 = (int) random.nextInt(101);
	
		while(m1+n1>100) {
			 m1  = (int) random.nextInt(101);
		     n1 = (int) random.nextInt(101);
		}
		sum[j]=m1+n1;
		System.out.println(""+(j+1)+":\t"+m1+"+"+n1+"=");
		
	}//加法方法，结果不能大于100
	
	
	public void reduce(int m2,int n2,int k) {
		
		 Random random = new Random();
		 m2 = (int) random.nextInt(101);
	     n2 = (int) random.nextInt(101);
	     while(m2-n2<0) {
			 m2 = (int) random.nextInt(101);
		     n2= (int) random.nextInt(101);
		}
		sum[k]=m2-n2;
		System.out.println(""+(k+1)+":\t"+m2+"-"+n2+"=");
		
	}//减法方法，结果不能小于0
	
	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int m3=0;
		int n3 = 0;
		 int[] sum = new int[100];
		boolean d=false;
		Count b = new Count( m3, n3,sum,d);
	    b.printHeader1();
	  for(int i=0;i<50;i++)
	   {
	    	 
	          b.generateEquations();
	         if(b.is) 
		     b.add(b.m,b.n,i);
	         else
		     b.reduce(b.m,b.n,i);
	    }
	    b.printHeader2();
	    for(int i =0;i<50;i++) {
	    	System.out.println(""+(i+1)+":\t"+b.sum[i]);
	    	
	   }
	   
}
}