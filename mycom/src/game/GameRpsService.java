package game;

public class GameRpsService {
	GameRpsVo gameRpsVo = new GameRpsVo();

	public int Showcomvalue() {
		// TODO Auto-generated method stub
		return (int) ((Math.random() * 3) + 1);
	} 

	public void logic(int action) {
		if (action == 1) {
			gameRpsVo.setRock(action);
		} else if (action == 2) {
			gameRpsVo.setPaper(action);
		} else {
			gameRpsVo.setScissors(action);
		}

	}

String comshow(int com) {
		String result = "";
		switch (com) {
		case 1:
			result = "����";
			break;
		case 2:
			result = "����";
			break;
		case 3:
			result = "��";
			break;

		}
		return result;
	}
String playershow(int player) {
		String result = "";
		switch (player) {
		case 1:
			result = "����";
			break;
		case 2:
			result = "����";
			break;
		case 3:
			result = "��";
			break;

		}
		return result;
	}

	// ////////////////////////////////////////////////////
	String game2(int player, int com) {
		String result = "";
		if (player < com) {
			if (Math.abs(player - com) == 2) {
				result = "�̰���ϴ�.";
			} else {
				result = "�����ϴ�.";
			}
		} else if (player > com) {
			if (Math.abs(player - com) == 2) {
				result = "�����ϴ�. .";
			} else {
				result = "�̰���ϴ�.";
			}

		} else if (player == com) {
             result = "�����ϴ�.";
		}

		return result;
	}

}
