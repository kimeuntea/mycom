package oop06.lotto;

public class LottoServiceImpl implements LottoService {
	private int money;
	int[][] lottos;
	int[][] arr;

	@Override
	public void extractLottos(int money) {
		inputMoney(money);// 돈넣기
		int count = this.getCount(money);// 거스름돈
		int b = 0;
		int c = 0;
		int i = 0;
		lottos = new int[count][6];
		arr = new int[count][6];
		for (i = 0; i <= count - 1; i++) {//  0 <=0이면 무조건 한번실행 
			System.out.println();
			// 내부는 구형해주세요
			// isDuplication()메소드를 사용해야합니다.
			// 중족되는 않은 숫자이면
			// lottos[count][i]=num의
			// 형태로 들어가게됩니다.
			boolean a = false;

			for (int j = 0; j <= 5; j++) {
				//lottos[i][0] = 0;

				lottos[i][j] = getRandomNumber();

				arr[i][j] = lottos[i][j];
				System.out.println(lottos[i][j]);
				if (j != 0) {//처음 값은 검사하지않는다 
					for (int k = j; k > 0; k--) {				
						if (lottos[i][j] == arr[i][k - 1]) {
							System.out.println(lottos[i][j] + ":"
									+ arr[i][k - 1]);
							lottos[i][j] = getRandomNumber();
							arr[i][j] = lottos[i][j];
							System.out.println(" 새로운값 : " + lottos[i][j]);
							k = j + 1; //마지막값을 검사해야하기떄문에 
							
						}
					}
				}

			}
		}

		for (int j = 0; j <= count - 1; j++) {
			System.out.println();
			for (int j2 = 0; j2 < 6; j2++) {
				System.out.print(lottos[j][j2] + "\t");
			}
		}

	}

	@Override
	public void printLotto() {
		// TODO Auto-generated method stub

	}

	@Override
	public void inputMoney(int money) {
		this.money = money;
		lottos = new int[money / 1000][6];

	}

	@Override
	public int getRandomNumber() {
		return (int) ((Math.random() * 45) + 1);

	}

	@Override
	public boolean isDuplication() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void sort(int[] array) {
		// TODO Auto-generated method stub
		for (int i = 0; i < array.length - 1; i++) {
			for (int j = 0; j < array.length - i - 1; j++) {
				if (array[j] > array[j + 1]) {
					// getRandomNumber()
				}
			}
		}

	}

	@Override
	public int getCount(int money) {
		if (money < 1000) {
			return 0;
		}
		return (int) Math.ceil(money / 1000);

	}

}
