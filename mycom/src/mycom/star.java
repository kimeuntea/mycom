package mycom;

public class star {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      for (int i = 0; i < 4; i++) { ///´ë°¡¸®
    	  System.out.println();
		for (int j = 0; j < 9-i; j++) {
			System.out.print(" ");
		}
		for (int j = 0; j <(i*2)+1 ; j++) {
			System.out.print("*");
		}
	}
      
      
      for (int i = 0; i < 3; i++) {
    	  System.out.println();
		for (int j = 0; j <i*2;j++) {
			System.out.print(" ");
		}
		for (int j = 0; j <19-((i*2)*2);j++ ) {
			System.out.print("*");
		
		}
	}
      
      
     for (int i = 0; i < 5; i++) {
    	 System.out.println();
		for (int j = 0; j < 4-i; j++) {
			System.out.print(" ");	
		}
		for (int j = 0; j <5-(i*2); j++) {
			System.out.print("*");
		}
		System.out.print(" ");
		
		for (int j = 0; j < (i*6); j++) {
			System.out.print(" ");
		}
		for (int j = 0; j <5-(i*2); j++) {
			System.out.print("*");
		}
	}
     
	}

}
           /*   ****** ******
             ******   ******
            ***           ***
           **               **
          *                   **/