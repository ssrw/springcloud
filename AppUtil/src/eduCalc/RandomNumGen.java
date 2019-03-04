package eduCalc;

import java.util.Random;

public class RandomNumGen {
	
	public static int getRandomInteger(){
		Random rand = new Random();
		int num = rand.nextInt(32768) +1;
		return num;
	}
	
	public static String getRandomIntegerAsString(){
		Random rand = new Random();
		int num = rand.nextInt(32768) +1;
		return String.valueOf(num);
	}

}
