package Ex171207;

import java.util.*;

/* 컬랙션 set
 * 	- HashSet
 * 	- 합집합, 교집합, 차집합
*/
public class Ex171207_8 {

	public static void main(String[] args) {
		HashSet seta = new HashSet();
		HashSet setb = new HashSet();
		HashSet setHab = new HashSet();	// 합집합
		HashSet setKyo = new HashSet();	// 교집합
		HashSet setCha = new HashSet();	// 차집합

		seta.add("1");
		seta.add("2");
		seta.add("3");
		seta.add("4");
		seta.add("5");
		System.out.println("A =" + seta);

		setb.add("4");
		setb.add("5");
		setb.add("6");
		setb.add("7");
		setb.add("8");
		System.out.println("B =" + setb);

		Iterator it = setb.iterator();
		// 교집합
		while (it.hasNext()) {
			Object tmp = it.next();
			if (seta.contains(tmp))
				setKyo.add(tmp);
		}
		it = seta.iterator();
		// 차집합
		while (it.hasNext()) {
			Object tmp = it.next();
			if (!setb.contains(tmp))
				setCha.add(tmp);
		}
		it = seta.iterator();
		// 합집합
		while (it.hasNext())
			setHab.add(it.next());

		it = setb.iterator();
		// 합집합
		while (it.hasNext())
			setHab.add(it.next());

		System.out.println("A ∩ B =" + setKyo);
		System.out.println("A ∪ B =" + setHab);
		System.out.println("A - B =" + setCha);

	}

}
