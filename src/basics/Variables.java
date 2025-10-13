package basics;

public class Variables {
		int insvar=25; //global Variable
		void meth() {
			int locvar=10; //local Variable for meth()
			System.out.println(locvar);
			System.out.println(insvar);
		}
		void disp() {
			int locVar=30; //local Variable for disp()
			System.out.println(locVar);
			System.out.println(insvar);
		}
		public static void main(String[] args) {
			Variables obj1;
			obj1 =new Variables();
			System.out.println(obj1); 
			Variables obj2=new Variables();
			System.out.println(obj2);
			obj1.meth();
			obj2.disp();
		}
	}

