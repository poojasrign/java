package methods;

public class ClassNameAsReturnType {
	public class Practice {

		Practice meth(Practice o) {

			System.out.println(o);

			System.out.println("What will be the return type of this meth");

			Practice p=new Practice();

			System.out.println(p);

			return p;

		}




		public static void main(String [] vcet) {

			ClassNameAsReturnType v=new ClassNameAsReturnType();

			System.out.println(v);

			//Practice r = v.meth(v);

			//System.out.println(r); 

		}

	}

}
