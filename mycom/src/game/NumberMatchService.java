package game;

public class NumberMatchService {
	static int i;

	public int game(int com, int player) {
		int result;
		if (player == com) {
			System.out.println(player + "���� !!");
			result = 1;

		} else {
			System.out.println("Ʋ�ǽ��ϴ�.");
			System.out.println("��ǻ�Ͱ� ������" + com + "�Դϴ�.");
			result = 0;
		}
		return result;
	}

	public int logic(int a) {
		NumberMatchVo matchVo = new NumberMatchVo();
		int result = 0;
		for (i = 0; i < 3; i++) {
			System.out.println("1ȸ���� 5ȸ���� �Է��Ͻÿ�");

			try {
				matchVo.setPlayer(a);
				matchVo.setCom();
			} catch (Exception e) {
				System.out.println("���ڴ� �ȵ˴ϴ�.");
				return 0;
			}

			if (matchVo.getPlayer() == 0) {
				System.out.println("�ٽ� �Է����ֽʽÿ�");

			} else {
				matchVo.setCom();
				result = game(matchVo.getCom(), matchVo.getPlayer());
				if (result == 0) {
					return 0;
				}
			}

			if (result == 1) {
				System.out.println("�������ϴ�. " + "������ �����մϴ�.");
				return 1;

			} else if (i == 2) {
				System.out.println("3ȸ���� �����߽��ϴ�." + "\n���ӿ� ���߽��ϴ�."
						+ "\n���� �����մϴ� ");
				
			}
		}
		return result;
	}

}
