import java.util.Scanner;

public class JC15010701Q0301 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,j;
		int N = 5;
		int sum = 0;
		int intArray[][] = new int[4][];
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("15010701 ¹ÚÇö¿ì");
		
		for(i=0;i<intArray.length;i++) {
			intArray[i] = new int[N--];
		}
		
		for(i=0;i<intArray.length;i++) {
			for(j=0;j<intArray[i].length;j++) {
				intArray[i][j] = (int)(Math.random()*100 +1);
			}
		}
		
		for(i=0;i<intArray.length;i++) {
			sum = 0;
			for(j=0;j<intArray[i].length;j++) {
				System.out.print(intArray[i][j] + " ");
				sum = sum + intArray[i][j];
			}
			System.out.println("=> Sum of this row = "+sum);
		}
		
		scanner.close();

	}

}
