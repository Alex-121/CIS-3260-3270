package edu.gsu.cis3270.chapter10;

public class Exercise10_01 {

	public static void main(String[] args) {
		
		Time t1 = new Time();
		Time t2 = new Time(555550000);
		Time t3 = new Time(5,23,55);
		
		
		System.out.println(t1.getHour() + ":" + t1.getMinutes() + ":" + t1.getSeconds());
		System.out.println(t2.getHour() + ":" + t2.getMinutes() + ":" + t2.getSeconds());
		System.out.println(t3.getHour() + ":" + t3.getMinutes() + ":" + t3.getSeconds());
	}

}
