package oop06.lotto;

import java.util.Scanner;

public class LottoMain1 {
	public static void main(String[] args) {
		 System.out.println("◀◀◀◀로또 시작 ▶▶▶▶"); 
		      LottoServiceImpl1 lotto = new LottoServiceImpl1(); 
		      System.out.println("얼마치를 구입합니까?"); 
		      Scanner scanner = new Scanner(System.in); 
		      int money = scanner.nextInt(); 
		      lotto.extractLottos(money); 
		      System.out.println("로또 번호 출력"); 
		      lotto.printLotto(); 

   	}
}
