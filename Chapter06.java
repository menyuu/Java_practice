package javaWcp;
public class Chapter06 extends Chapter05 {
	public static void main(String[] args) {
		int val = 2 + 5;
		System.out.println(val);
		val ++;
		System.out.println(val);
		val *= 5;
		System.out.print(val);
		boolean bool = val == 50;
		System.out.println(bool);
		bool = val < 50 && val % 10 == 0;
		System.out.println(bool);
	}
}
