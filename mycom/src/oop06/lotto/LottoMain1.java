package oop06.lotto;

import java.util.Scanner;

public class LottoMain1 {
	public static void main(String[] args) {
		 System.out.println("���������ζ� ���� ��������"); 
		      LottoServiceImpl1 lotto = new LottoServiceImpl1(); 
		      System.out.println("��ġ�� �����մϱ�?"); 
		      Scanner scanner = new Scanner(System.in); 
		      int money = scanner.nextInt(); 
		      lotto.extractLottos(money); 
		      System.out.println("�ζ� ��ȣ ���"); 
		      lotto.printLotto(); 

   	}
}
