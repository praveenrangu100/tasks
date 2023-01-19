package robintasks;
import java.util.Scanner;
public class TrailingZeros {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int n = sc.nextInt();
		System.out.println("Count of trailing 0s in " + n+ "! is "+ findTrailingZeros(n));
	}
		static int findTrailingZeros(int n){
			if (n < 0)
				return-1;
			int count=0;
			for (int i=5;n/i>=1;i*=5)
				count += n/i;
			return count;
	}
}