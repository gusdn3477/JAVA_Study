import java.io.*;

public class JC15010701Q07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File src = new File("c:\\mytmp\\java_sample\\Timeisgold.txt");
		File dest = new File("c:\\mytmp\\java_sample\\Timeisgold2.txt");
		File src2 = new File("c:\\mytmp\\java_sample\\���¼ҽ�SW����.txt");
		File dest2 = new File("c:\\mytmp\\java_sample\\���¼ҽ�SW����2.txt");
		File src3 = new File("c:\\mytmp\\java_sample\\�ƹ��ų�.rtf");
		File dest3 = new File("c:\\mytmp\\java_sample\\�ƹ��ų�2.rtf");
		
		int c;
		
		System.out.println("1501071 ������");
		
		try {
			FileReader fr = new FileReader(src);
			FileWriter fw = new FileWriter(dest);
			while((c = fr.read()) != - 1) {
				fw.write((char)c);
			}
			
			fr.close();
			fw.close();
			System.out.println(src.getPath()+"�� "+ dest.getPath()+ "�� �����Ͽ����ϴ�.");
			
		}
		
		catch(IOException e) {
			System.out.println("���� ���� ����");
		}
		
		try {
			FileReader fr = new FileReader(src2);
			FileWriter fw = new FileWriter(dest2);
			while((c = fr.read()) != - 1) {
				fw.write((char)c);
			}
			
			fr.close();
			fw.close();
			System.out.println(src2.getPath()+"�� "+ dest2.getPath()+ "�� �����Ͽ����ϴ�.");
			
		}
		
		catch(IOException e) {
			System.out.println("���� ���� ����");
		}
		
		try {
			FileReader fr = new FileReader(src3);
			FileWriter fw = new FileWriter(dest3);
			while((c = fr.read()) != - 1) {
				fw.write((char)c);
			}
			
			fr.close();
			fw.close();
			System.out.println(src3.getPath()+"�� "+ dest3.getPath()+ "�� �����Ͽ����ϴ�.");
			
		}
		
		catch(IOException e) {
			System.out.println("���� ���� ����");
		}
	}

}
