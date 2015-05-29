package grade;

import java.util.Vector;

public class GradeController {
	public static void main(String[] args) {
		GradeServiceImpl gradeServiceImpl = new GradeServiceImpl();
		GradeVO vo = new GradeVO("100","iron", 70, 84, 90);
		GradeVO vo1 = new GradeVO("200","hulk", 70, 61, 90);
		GradeVO vo2 = new GradeVO("300","thor", 50, 80, 90);
		//input
		gradeServiceImpl.input(vo);
		gradeServiceImpl.input(vo1);
		gradeServiceImpl.input(vo2);
		//���
		  System.out.println("----------------------------");
		gradeServiceImpl.print();
	  
		//�̸��˻�
	    System.out.println("-----------------------------");
	    Vector<String> vec = new Vector<String>();
		vec = gradeServiceImpl.searchGradeByName("hulk");
		for (String k : vec) {
			System.out.println(k);
		}
		//�й�  �˻����
		System.out.println("-----------------------------");
		System.out.println(gradeServiceImpl.searchByHak("100"));
		System.out.println(gradeServiceImpl.searchByHak("200"));
		System.out.println("--------------  ��������---------------");
		gradeServiceImpl.descGradeTotal();
		System.out.println("--------------  �������� ---------------");
		gradeServiceImpl.ascGradeTotal();
	}
}
