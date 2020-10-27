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
		
		System.out.println("15010701 박현우");
		System.out.print("인원수>>");
		n = scanner.nextInt();
		
		Phone[] ph;
		ph = new Phone[n];
		for(i=0;i<n;i++) {
			ph[i] = new Phone();
		}
		
		for(i=0;i<n;i++) {
			System.out.print("이름과 전화번호(이름과 번호는 빈 칸없이 입력))>>") ;
			ph[i].name = scanner.next();
			ph[i].tel = scanner.next();
		}
		
		System.out.println("저장되었습니다...");
		
		while(true) {
			flag = 0;
			System.out.print("검색할 이름>>");
			name = scanner.next();
			
			if(name.equals("그만"))
				break;
			
			for(i=0;i<3;i++) {
				if(name.equals(ph[i].name)) {
					j = i;
					System.out.println(ph[j].name+"의 번호는 "+ph[j].tel +"입니다.");
				}
				else
					flag++;
			}
			if(flag==3) {
				System.out.println(name+" 이 없습니다.");
			}
		}

	}
}
