import java.util.Scanner;

public class ScannerEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count = 0;
		System.out.println("15010701 ������");
		System.out.println("�̸�, ����, ����, ü��, ���� ���θ� ��ĭ���� �и��Ͽ� �Է��ϼ���: ");
		Scanner scanner = new Scanner(System.in);
		
		String name = scanner.next();
		count++;
		System.out.print("�̸��� " + name + ", ");
		
		String city = scanner.next();
		count++;
		System.out.print("���ô� " + city + ", ");
		
		int age = scanner.nextInt();
		count++;
		System.out.print("���̴� " + age + "��, ");
		
		double weight = scanner.nextDouble();
		count++;
		System.out.print("ü���� " + weight + "kg, ");
		
		boolean isSingle = scanner.nextBoolean();
		count++;
		System.out.println("���� ���δ� " + isSingle + "�Դϴ�. ");
		scanner.close();
		
		System.out.print("�Է¹��� �������� ������ "+ count + "�� �Դϴ�.");
	}

}
