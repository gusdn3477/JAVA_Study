import java.util.Scanner;

class Phone{
	
	public String name;
	public String tel;
	public Phone() {
		this.name = " ";
		this.tel = " ";
	}
}
public class JC15010701PR0102 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int n,i,j;
		int flag = 0;
		String name;
		
		System.out.println("15010701 ������");
		System.out.print("�ο���>>");
		n = scanner.nextInt();
		
		Phone[] ph;
		ph = new Phone[n];
		for(i=0;i<n;i++) {
			ph[i] = new Phone();
		}
		
		for(i=0;i<n;i++) {
			System.out.print("�̸��� ��ȭ��ȣ(�̸��� ��ȣ�� �� ĭ���� �Է�))>>") ;
			ph[i].name = scanner.next();
			ph[i].tel = scanner.next();
		}
		
		System.out.println("����Ǿ����ϴ�...");
		
		while(true) {
			flag = 0;
			System.out.print("�˻��� �̸�>>");
			name = scanner.next();
			
			if(name.equals("�׸�"))
				break;
			
			for(i=0;i<3;i++) {
				if(name.equals(ph[i].name)) {
					j = i;
					System.out.println(ph[j].name+"�� ��ȣ�� "+ph[j].tel +"�Դϴ�.");
				}
				else
					flag++;
			}
			if(flag==3) {
				System.out.println(name+" �� �����ϴ�.");
			}
		}

	}
}
