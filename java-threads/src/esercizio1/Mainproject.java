package esercizio1;

public class Mainproject {

	public static void main(String[] args) {
		
		Thread asterisco = new Thread(new dadThread("*"));
		Thread hashtag = new Thread (new dadThread("#")) ; asterisco.start();
		hashtag.start();
	
	}
}
