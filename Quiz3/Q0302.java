import java.util.Scanner;

class Rectangle{
	private int x1, x2, y1, y2;
	
	Rectangle(){
		x1 = x2 = y1 = y2 = 0;
	}
	
	Rectangle(int xx1, int yy1, int xx2, int yy2){
		x1 = xx1;
		y1 = yy1;
		x2 = xx2;
		y2 = yy2;
	}
	
	public void set(int xx1, int yy1, int xx2, int yy2) {
		x1 = xx1;
		y1 = yy1;
		x2 = xx2;
		y2 = yy2;
	}
	
	public int square() {
		int size = (x1-x2) * (y1- y2);
		if(size<0)
			size = -size;
		
		return size;
	}
	
	public void show() {
		System.out.println("("+x1+","+y1+")"+ "("+x2+","+y2+")");
	}
	
	public boolean equals(Rectangle x) {
		int width1 = (x.x1>x.x2?(x.x1-x.x2):x.x2-x.x1);
		int width2 = (x1>x2?(x1-x2):(x2-x1));
		int height1 = (x.y1>x.y2?(x.y1-x.y2):(x.y2-x.y1));
		int height2 = (y1>y2?(y1-y2):(y2-y1));
		
		if(width1 == width2 && height1 == height2) {
			return true;
		}
		else
			return false;
	}
}
public class JC15010701Q0302 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("15010701 박현우");
		Rectangle r = new Rectangle();
		Rectangle s = new Rectangle(1,1,2,3);
		
		System.out.println("r의 좌표 출력");
		r.show();
		System.out.println("s의 좌표 출력");
		s.show();
		System.out.println("s의 넓이: "+s.square());
		
		r.set(-2, 2, -1, 4);
		System.out.println("r의 좌표를 설정해준 뒤 출력");
		r.show();
		
		System.out.println("r의 넓이: "+r.square());
		
		if(r.equals(s))
			System.out.println("두 사각형의 가로와 세로가 같습니다.");
		else
			System.out.println("두 사각형의 가로와 세로가 다릅니다.");

		
	}

}
