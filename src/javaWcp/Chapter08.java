package javaWcp;

public class Chapter08 {
	public static void main(String[] args) {
		int n = 1;
		while (n < 5) {
			System.out.println(n * n);
			n++;
		}
		int[] array = {1, 2, 3, 4};
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
		for (int a : array) {
			if (a % 2 == 0) {
				continue;
			}
			System.out.println(a);
		}
	}
}
