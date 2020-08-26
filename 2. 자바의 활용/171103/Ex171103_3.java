package Ex171103;
/* 상속 예제
 * 카드 섞기 */

// 카드 한벌 마들기
class Deck {
	final int CARD_NUM = 52;
	Card cardArr[] = new Card[CARD_NUM];

	Deck() {
		int i = 0;

		for (int k = Card.KIND_MAX; k > 0; k--)
			for (int n = 0; n < Card.NUM_MAX; n++)
				cardArr[i++] = new Card(k, n + 1);
	}

	Card pick(int index) {
		return cardArr[index];
	}

	Card pick() {
		int index = (int) (Math.random() * CARD_NUM);
		return pick(index);
	}

	// 카드 섞기
	void shuffle() {
		for (int i = 0; i < cardArr.length; i++) {
			int r = (int) (Math.random() * CARD_NUM);

			Card temp = cardArr[i];
			cardArr[i] = cardArr[r];
			cardArr[r] = temp;
		}
	}
}

// 카드 종류 정의
class Card {
	static final int KIND_MAX = 4;
	static final int NUM_MAX = 13;

	static final int SPASE = 4;
	static final int DIAMOND = 3;
	static final int HEART = 2;
	static final int CLOVER = 1;

	int kind;
	int number;

	Card() {
		this(SPASE, 1);
	}

	Card(int kind, int number) {
		this.kind = kind;
		this.number = number;
	}

	public String toString() {
		String[] kinds = { "", "CLOVER", "HEART", "DIAMOND", "SPASE" };
		String numbers = "0123456789XJQK";
		return "kind:" + kinds[this.kind] + ", number:" + numbers.charAt(this.number);
		// charAt은 numbers를 문자값으로 인식(0부터 시작)
	}
}

public class Ex171103_3 {

	public static void main(String[] args) {
		Deck d = new Deck(); // 카드 한벌 만들기
		Card c = d.pick(0); // 섞기 전 첫번째 카드 뽑기
		System.out.println(c);

		d.shuffle(); // 섞기
		c = d.pick(0); // 섞은 후 첫번째카드 뽑기
		System.out.println(c);
	}

}
