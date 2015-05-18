package game;

import java.util.Scanner;

public class GameRpsController {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		GameRpsService service = new GameRpsService();
		System.out.println("가위바위보 게임을 시작합니다.");
		int playerValue = scanner.nextInt();
		int com = service.Showcomvalue();
		System.out.println("당신은" + service.playershow(playerValue) + "을 냇습니다.");
		System.out.println("컴퓨터는" + service.comshow(com) + "을 내습니다.");
		System.out.println(service.game2(playerValue, com));
	}

}
