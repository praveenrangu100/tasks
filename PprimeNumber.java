package robintasks;
import java.util.Scanner;
public class PprimeNumber {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number");
    int N = sc.nextInt();
    System.out.println("Enter the prime number");
    int P = sc.nextInt();
    highestPowerOfP(N,P);
}
    public static void highestPowerOfP(int N, int P) {
    	if(!PrimeNumber.isPrime(P)) {
    		System.out.println(P+" is not a Prime");
    	}
    	else {
    		int power = 0,n=N;
    		while (N > 0) {
    			power += N / P;
    			N /= P;
    		}
    		System.out.println("The highest power of " + P + " in " + n + "! is " + power);      
    	}
}
}
