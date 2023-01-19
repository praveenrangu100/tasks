package robintasks;
import java.util.Scanner;

public class CivilEngineer {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter length of the room:");
		int length = sc.nextInt();
		System.out.println("Enter breadth of the room:");
		int breadth = sc.nextInt();
		suggestTiles(length,breadth);
  }

	public static void suggestTiles(int l, int b) {
		int rows,columns;
		int k=0;
		for(int i=1;i<=l&&i<=b;i++){
			rows=b/i;
			columns=l/i;
			if(l%i==0&&b%i==0) {
				k=i;
				System.out.println("The tiles sizes are "+k+"*"+ k+ "\nNo. tiles required in that size "+(rows*columns));

				
				}
			}
}
}
