package Ex171109;

import java.util.Vector;

/* 다형성 & Vector함수
 * 배열과 달리 클래스 객체도 저장 가능
 */
class Product {
	int price;		// 가격
	int bonusPoint;	// 포인트

	Product() {
		price = 0;
		bonusPoint = 0;
	}

	Product(int price) {
		this.price = price;
		bonusPoint = (int) (price / 10.0);
	}
}

class Tv extends Product {
	Tv() {
		super(100);
	}

	public String toString() {
		return "TV";
	}
}

class Computer extends Product {
	Computer() {
		super(200);
	}

	public String toString() {
		return "computer";
	}
}

class Audio extends Product {
	Audio() {
		super(50);
	}

	public String toString() {
		return "Audio";
	}
}

class Buyer1 {
	int money = 1000;	// 돈
	int bonusPoint = 0;	// 포인트
	Vector item = new Vector();
	// 10개의 객체를 저장(배열대신)저장후 자동으로 크기 증가
	
	// 사기
	void buy(Product p) {
		if (money < p.price) {
			System.out.println("잔액 부족");
			return;
		}
		money -= p.price;
		bonusPoint += p.bonusPoint;
		item.add(p);// Vector에객체추가 성공하면 true/실패하면 false반환
		System.out.println(p + "을/를 구입");
	}
	// 환불
	void refund(Product p) {
		// Vector에객체 제거
		if (item.remove(p)) {
			money += p.price;
			bonusPoint -= p.bonusPoint;
			System.out.println(p + "을/를 반품");
		} else {
			System.out.println("구입하신 제품 중 해당 제품이 없습니다");
		}
	}

	// 구매리스트와 총 합계
	void summary() {
		int sum = 0;	// 총 합계
		String itemList = "";	// 상품 리스트
		// Vector가 비어잇는지 검사
		if (item.isEmpty()) {
			System.out.println("구입하신 제품이 없습니다");
			return;
		}
		for (int i = 0; i < item.size(); i++) {// size->vector에 저장된 객체의 개수 반환
			Product p = (Product) item.get(i);// 지정된 위치의 객체 반환(형변환 필요)
			sum += p.price;
			itemList += (i == 0) ? "" + p : ", " + p;
		}
		System.out.println("구입하신 물품의 총 금액은 " + sum + "만원입니다");
		System.out.println("구입하신 제품은 " + itemList + "입니다");
	}
}

public class Ex171109_5 {

	public static void main(String[] args) {
		Buyer1 b = new Buyer1();
		Tv tv = new Tv();
		Computer com = new Computer();
		Audio audio = new Audio();

		b.buy(tv);
		b.buy(com);
		b.buy(audio);
		b.summary();
		System.out.println();
		b.refund(com);
		b.summary();
	}

}
