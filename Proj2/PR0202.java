package Num2;

import java.util.Scanner;
import java.util.Vector;

abstract class Shape{
	private Shape next;
	public Shape() {
		next = null;
	}
	public void setNex(Shape obj) {
		next = obj;
	}
	public Shape getNext() {
		return next;
	}
	public abstract void draw();
}

class Line extends Shape{
	public void draw() {
		System.out.println("Line");
	}
}

class Rect extends Shape{
	public void draw() {
		System.out.println("Rect");
	}
}

class Circle extends Shape{
	public void draw() {
		System.out.println("Circle");
	}
}

public class JC15010701E2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("15010701 ������");
		System.out.println("�׷��� ������ beauty�� �����մϴ�");
		int n,m;
		Vector<Shape> vec = new Vector<Shape>();
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.print("����(1), ����(2), ��� ����(3), ����(4)>>");
			n = sc.nextInt();
			
			if(n == 1) {
				System.out.print("Line(1), Rect(2), Circle(3)>>");
				m = sc.nextInt();
				if(m == 1) {
					vec.add(new Line());
				}
				
				else if(m == 2) {
					vec.add(new Rect());
				}
				
				else if(m==3){
					vec.add(new Circle());
				}
				
				else {
					System.out.println("1~3 ������ ���� �Է��� �ּ���");
				}
			}
			
			else if(n == 2) {
				System.out.print("������ ������ ��ġ");
				m = sc.nextInt();
				
				if(vec.size()<=0 || m >= vec.size()) {
					System.out.println("������ �� �����ϴ�");
				}
				else
					vec.remove(m);
			}
			
			else if(n == 3) {
				for(int i=0;i<vec.size();i++) {
					vec.get(i).draw();
				}
			}
			
			else {
				break;
			}
		}
	}

}
