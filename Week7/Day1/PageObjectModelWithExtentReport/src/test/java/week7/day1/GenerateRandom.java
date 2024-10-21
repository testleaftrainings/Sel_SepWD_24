package week7.day1;

public class GenerateRandom {

	public static void main(String[] args) {
		Math.random();
	    //System.out.println(Math.random());

    int randomNumber= (int)(Math.random()*9999+9999);
    System.out.println(randomNumber);

	}

}

//0.8597781937124127 *9999999999999999999999
//0.9213659039929614