import java.io.*;

public class JC15010701Q07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File src = new File("c:\\mytmp\\java_sample\\Timeisgold.txt");
		File dest = new File("c:\\mytmp\\java_sample\\Timeisgold2.txt");
		File src2 = new File("c:\\mytmp\\java_sample\\오픈소스SW개론.txt");
		File dest2 = new File("c:\\mytmp\\java_sample\\오픈소스SW개론2.txt");
		File src3 = new File("c:\\mytmp\\java_sample\\아무거나.rtf");
		File dest3 = new File("c:\\mytmp\\java_sample\\아무거나2.rtf");
		
		int c;
		
		System.out.println("1501071 박현우");
		
		try {
			FileReader fr = new FileReader(src);
			FileWriter fw = new FileWriter(dest);
			while((c = fr.read()) != - 1) {
				fw.write((char)c);
			}
			
			fr.close();
			fw.close();
			System.out.println(src.getPath()+"를 "+ dest.getPath()+ "로 복사하였습니다.");
			
		}
		
		catch(IOException e) {
			System.out.println("파일 복사 오류");
		}
		
		try {
			FileReader fr = new FileReader(src2);
			FileWriter fw = new FileWriter(dest2);
			while((c = fr.read()) != - 1) {
				fw.write((char)c);
			}
			
			fr.close();
			fw.close();
			System.out.println(src2.getPath()+"를 "+ dest2.getPath()+ "로 복사하였습니다.");
			
		}
		
		catch(IOException e) {
			System.out.println("파일 복사 오류");
		}
		
		try {
			FileReader fr = new FileReader(src3);
			FileWriter fw = new FileWriter(dest3);
			while((c = fr.read()) != - 1) {
				fw.write((char)c);
			}
			
			fr.close();
			fw.close();
			System.out.println(src3.getPath()+"를 "+ dest3.getPath()+ "로 복사하였습니다.");
			
		}
		
		catch(IOException e) {
			System.out.println("파일 복사 오류");
		}
	}

}
