import java.util.*;

class Point{
	
	private int x,y;
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public String toString() {
		return "("+x+","+y+")";
	}
	
	public int sum() {
		return x+y;
	}
}



public class JC15010701Q06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("15010701 ¹ÚÇö¿ì");
		HashMap<Integer, Point> javaScore = new HashMap<Integer, Point>();

		Point a = new Point(-10,-10);
		Point b = new Point(10, 10);
		Point c = new Point(20, 20);
		Point d = new Point(30,30);

		javaScore.put(a.sum(), a);
		javaScore.put(b.sum(), b);
		javaScore.put(c.sum(), c);
		javaScore.put(d.sum(), d);
		
		Set<Integer> keys = javaScore.keySet();
		Iterator<Integer> it = keys.iterator();
		
		String p = javaScore.toString();
		System.out.println(p);
	}

}
