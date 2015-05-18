package game;

import java.util.Scanner;

public class NumberMatchController {
	int key() {
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		return a;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int result = 0;
		NumberMatchService matchService = new NumberMatchService();
		NumberMatchController controller = new NumberMatchController();
		result = matchService.logic(controller.key());
		if (result == 1) {
			result = matchService.logic(controller.key());
			if (result ==1) {
				
			}
		}else {
			System.out.println("Á¾·á");
		}

	}

}
