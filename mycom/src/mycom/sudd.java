package mycom;

public class sudd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int a=0;
      int b=1;
      int c=0;
      System.out.println(a +"\n"+ b);
      for (int i = 0; i < 10; i++) {
		 c=a+b;
		 System.out.println(c);
		 a=b; 
		 b=c;
	}
	}

}
