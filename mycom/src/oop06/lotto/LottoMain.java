package oop06.lotto;

import java.util.Scanner;

public class LottoMain {
	public static void main(String[] args) {
		 System.out.println("���������ζ� ���� ��������"); 
		      LottoServiceImpl lotto = new LottoServiceImpl(); 
		      System.out.println("��ġ�� �����մϱ�?"); 
		      Scanner scanner = new Scanner(System.in); 
		      int money = scanner.nextInt(); 
		      lotto.extractLottos(money); 
		      System.out.println("�ζ� ��ȣ ���"); 
		      lotto.printLotto(); 

   	}
}
