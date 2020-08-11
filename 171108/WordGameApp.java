package Ex171108;

import java.util.Scanner;

/* 끝말잇기 게임 */

//한 사람의 참가자 표현
class Player {
	private Scanner sc;
	private String name;	// 참가자 이름
	private String word;	// 말한 단어

	public Player(String name) {
		this.name = name;
		sc = new Scanner(System.in);
	}

	public String getName() {
		return name;
	}

	public String getWordFromUser() {
		System.out.print(name + ">>");
		word = sc.next();
		return word;
	}

	// 마지막 글자와 참가자가 말한 단어 비교해서 판단
	// 성공하면 true를 return
	public boolean checkSuccess(String lastWord) {
		int lastIndex = lastWord.length() - 1;
		// 최종 단어의 마지막 문자와 참가자가 말한 단어의 첫 문자가 같은지 비교
		if (lastWord.charAt(lastIndex) == word.charAt(0))
			return true;
		else
			return false;
	}
}

public class WordGameApp {
	private Scanner sc;
	private String startWord = "아버지";	// 시작 단어
	private Player[] player;	// 잠가자 

	public WordGameApp() {
		sc = new Scanner(System.in);
	}

	// 게임 진행하는 메소드
	public void run() {
		System.out.println("===========  끝말잇기 게임 START  ===========");
		System.out.println();
		createPlayer();// 참가자 위한 player[]생성
		String lastWord = startWord;

		System.out.println("시작 단어는 " + lastWord + "입니다.");
		int next = 0;	// 참가자들의 순서대로 증가
		while (true) {
			String newWord = player[next].getWordFromUser();
			// next참가자가 단어를 말하도록 함
			if (!player[next].checkSuccess(lastWord)) {
				System.out.println(player[next].getName() + "이(가) 졌습니다");
				break;
			}
			next++;// 다음 참가자
			next %= player.length;// next가 참가자의 개수를 넘는 것을 방지
			lastWord = newWord;
		}
	}

	// 게임 참가자 수를 입력 받고 palyer [] 생성하는 메소드
	public void createPlayer() {
		System.out.print("게임에 참가하는 인원 입력>>");
		int nPlayer = sc.nextInt();
		player = new Player[nPlayer];
		System.out.println("참가하는 사람의 이름을 입력하세요");
		// 각 참여자들의 이름 입력받기->Player객체생성
		for (int i = 0; i < nPlayer; i++) {
			String name = sc.next();
			player[i] = new Player(name);
		}
	}

	public static void main(String[] args) {
		WordGameApp game = new WordGameApp();
		game.run();

		System.out.println("");

	}

}
