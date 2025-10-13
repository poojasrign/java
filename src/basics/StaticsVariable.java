package basics;

public class StaticsVariable {
		int num=1;
		static int num1=1;
		void disp() {
			num1++;
			num++;
			System.out.println("Ins"+num);
			System.out.println("Ststic"+num1);
		}
		public static void main(String[] args) {
			StaticsVariable s1=new StaticsVariable();
			StaticsVariable s2=new StaticsVariable();
			StaticsVariable s3=new StaticsVariable();
			s1.disp();
			s2.disp();
			s3.disp();
		}
	}

