
public class JC15010701PR0101 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int intArray[][];
		int i,j;
		int a,b;
		int count = 0;
		
		intArray = new int[4][4];
		
		for(i=0;i<4;i++) {
			for(j=0;j<4;j++) {
				intArray[i][j] = 0;
			}
		}
		
		while(count<10) {
			a = (int)(Math.random()*4);
			b = (int)(Math.random()*4);
			
			if(intArray[a][b] == 0) {
				count++;
			}
			
			intArray[a][b] = (int)(Math.random()*10+1);
		}
		
		System.out.println("15010701 ¹ÚÇö¿ì");
		
		for(i=0;i<4;i++) {
			for(j=0;j<4;j++) {
				System.out.print(intArray[i][j]+"\t");
			}
			System.out.println(" ");
		}
	
	}

}
