package game;

import java.util.Scanner;

public class GameRpsController {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		GameRpsService service = new GameRpsService();
		System.out.println("���������� ������ �����մϴ�.");
		int playerValue = scanner.nextInt();
		int com = service.Showcomvalue();
		System.out.println("�����" + service.playershow(playerValue) + "�� �����ϴ�.");
		System.out.println("��ǻ�ʹ�" + service.comshow(com) + "�� �����ϴ�.");
		System.out.println(service.game2(playerValue, com));
	}

}
