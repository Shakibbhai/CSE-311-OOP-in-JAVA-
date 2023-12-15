package practice;
import java.util.Random;

public class Diceroller {
	int number;             //Global variable within a class,visible all;
	Random random;
	
	Diceroller(){
		/*Random random=new Random();
		int number=0;
		roll(random,number);
		*/
		random=new Random();
		roll();
		
		
		
	}
	/*void roll(Random random,int number) {
		number=random.nextInt(6)+1;
		System.out.println(number);
	}*/
	
	void roll() {
		number=random.nextInt(6)+1;    //only because of global varivale ,we can use anywhere,
		System.out.println(number);
	}

}
