package 컬렉션2;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public class Set반복자이터레이터 {

	public static void main(String[] args) {
		
		HashSet<String> bag = new HashSet<>();
		bag.add("휴대폰");
		bag.add("휴지");
		bag.add("볼펜");
		bag.add("볼펜");
		System.out.println(bag.size());
		System.out.println(bag);
		
		//set에서 꺼내올 떄는 iterator를 만들어주어야 한다 
		Iterator<String> it = bag.iterator();
		System.out.println(it.hasNext()); //있는 지 없는 지 체크할 때
		for (int i = 0; i < bag.size(); i++) { //3번 꺼내기
			String x = it.next();
			System.out.println(x);
		}
		System.out.println("---------------");
		Object[] bag2 = bag.toArray();
		for (Object x : bag2) {
			System.out.println(x);
		}

	}

}
