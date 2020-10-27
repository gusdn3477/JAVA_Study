import java.util.Scanner;

public class ScannerEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count = 0;
		System.out.println("15010701 박현우");
		System.out.println("이름, 도시, 나이, 체중, 독신 여부를 빈칸으로 분리하여 입력하세요: ");
		Scanner scanner = new Scanner(System.in);
		
		String name = scanner.next();
		count++;
		System.out.print("이름은 " + name + ", ");
		
		String city = scanner.next();
		count++;
		System.out.print("도시는 " + city + ", ");
		
		int age = scanner.nextInt();
		count++;
		System.out.print("나이는 " + age + "살, ");
		
		double weight = scanner.nextDouble();
		count++;
		System.out.print("체중은 " + weight + "kg, ");
		
		boolean isSingle = scanner.nextBoolean();
		count++;
		System.out.println("독신 여부는 " + isSingle + "입니다. ");
		scanner.close();
		
		System.out.print("입력받은 데이터의 갯수는 "+ count + "개 입니다.");
	}

}
