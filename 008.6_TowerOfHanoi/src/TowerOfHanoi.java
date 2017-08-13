/*
 * Practice 008.6_Tower of hanoi
 * Date 20170813
 */

import java.util.Scanner;

public class TowerOfHanoi {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Please input numbers of tower of hanoi: ");
		int number = scanner.nextInt();
		towersOfHanoi(number, 1, 3, 2);
		
		System.out.println("Program terminate.");

	}
	
	public static void towersOfHanoi(int no, int from, int to, int temp) {
		if (no == 1)
			System.out.printf("Move no.%d plate from %d to %d.\n", no, from, to);
		else if (no % 2 == 0) {
			towersOfHanoi((no - 1), from, temp, to);
			System.out.printf("Move no.%d plate from %d to %d.\n", no, from, to);
			towersOfHanoi((no - 1), from, to, temp);
		}
		else {
			towersOfHanoi((no - 1), from, to, temp);
			System.out.printf("Move no.%d plate from %d to %d.\n", no, from, to);
			towersOfHanoi((no - 1), from, temp, to);
		}
	}

}
