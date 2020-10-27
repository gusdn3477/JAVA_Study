package Num1;

import java.util.Scanner;
import java.util.HashMap;
import java.util.*;

class Location{
	
	private String city;
	private int wido;
	private int gyungdo;
	
	public Location(String city, int wido, int gyungdo) {
		this.city = city;
		this.wido = wido;
		this.gyungdo = gyungdo;
	}
	
	public void show() {
		System.out.println(city + "\t" + wido + "\t" + gyungdo);
	}
	
}
public class JC15010701E1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Location [] lc = new Location[4];
		HashMap<String, Location> ha = new HashMap<String, Location>();
		int i;
		String city;
		String name;
		int wido;
		int gyungdo;
		int flag = 0;
		System.out.println("15010701 박현우");
		Scanner sc = new Scanner(System.in);
		
		System.out.println("도시,경도,위도를 입력하세요.");
		for(i=0;i<4;i++) {
			System.out.print(">> ");
			city = sc.next();
			wido = sc.nextInt();
			gyungdo = sc.nextInt();
			ha.put(city, new Location(city, wido, gyungdo));
		}
		
		System.out.println("------------------------------");
		Set<String> keys = ha.keySet();
		Iterator<String> it = keys.iterator();
		
		while(it.hasNext()) {
			String key = it.next();
			Location l = ha.get(key);
			l.show();
		}
		System.out.println("------------------------------");
		
		while(true) {
			Set<String> keys2 = ha.keySet();
			Iterator<String> it2 = keys.iterator();
			flag = 0;
			System.out.print("도시 이름 >> ");
			name = sc.next();
			if(name.equals("그만"))
				break;
			
			else{
				while(it2.hasNext()) {
					String key2 = it2.next();
					Location l2 = ha.get(key2);
					if(name.equals(key2)) {
						l2.show();
						flag = 1;
					}
				}
			}
			
			if(flag == 0) {
				System.out.println(name+"이 없습니다.");
			}
		}
		sc.close();	
	}
}
