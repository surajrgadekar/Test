package Basics;

public class test2 extends test1 {
	public void m2() {
		System.out.println("Selenium");
	}
	public static void main(String[] args) {
		test2 T2=new test2();
		T2.m1();
		T2.m2();
		test1 T1=new test1();
		T1.m1();
		
	}

}
