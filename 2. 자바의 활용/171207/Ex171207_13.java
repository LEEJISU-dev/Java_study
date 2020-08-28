package Ex171207;

import java.util.*;

/* 컬랙션 map
 * 	- HashMap
 * 	- 전화번호 그룹별로 출력
*/
public class Ex171207_13 {

	static HashMap phoneBook = new HashMap<>();

	public static void main(String[] args) {
		addPhoneNo("친구", "이자바", "010-0000-0000");
		addPhoneNo("친구", "김자바", "010-1111-0000");
		addPhoneNo("친구", "김자바", "010-0000-2222");
		addPhoneNo("회사", "김대리", "010-4444-0000");
		addPhoneNo("회사", "김대리", "010-5555-0000");
		addPhoneNo("회사", "박대리", "010-6666-0000");
		addPhoneNo("회사", "이과장", "010-7777-0000");
		addPhoneNo("세탁", "010-8888-0000");

		printList();

	}

	static void addPhoneNo(String groupName, String name, String tel) {
		addGroup(groupName);
		HashMap group = (HashMap) phoneBook.get(groupName);
		group.put(tel, name);
	}

	static void addGroup(String groupName) {
		if (!phoneBook.containsKey(groupName))
			phoneBook.put(groupName, new HashMap());
	}

	static void addPhoneNo(String name, String tel) {
		addPhoneNo("기타", name, tel);
	}

	static void printList() {
		Set set = phoneBook.entrySet();
		Iterator it = set.iterator();

		while (it.hasNext()) {
			Map.Entry e = (Map.Entry) it.next();

			Set subSet = ((HashMap) e.getValue()).entrySet();
			Iterator subIt = subSet.iterator();

			System.out.println(" * " + e.getKey() + "[" + subSet.size() + "]");

			while (subIt.hasNext()) {
				Map.Entry subE = (Map.Entry) subIt.next();
				String telNo = (String) subE.getKey();
				String name = (String) subE.getValue();
				System.out.println(name + " " + telNo);
			}
			System.out.println();
		}

	}

}
