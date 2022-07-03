package day04;

import java.util.Iterator;

public class Loop2 {
	public static void main(String[] args) {
		// if안에 if
		// switch안에 if,switch
		// for 안에 if
		// for 안에 for(이중 for문)
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {				
					System.out.println("i = "+i+", j = "+j);
			}
		}
	}
}
