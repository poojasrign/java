package methods;

public class ClassNameAsReturnType {
		ClassNameAsReturnType meth(ClassNameAsReturnType o) {
			System.out.println(o);
			System.out.println("What will be the return type of this meth");
			ClassNameAsReturnType p=new ClassNameAsReturnType();
			System.out.println(p);
			return p;
		}
		public static void main(String [] vcet) {
			ClassNameAsReturnType v=new ClassNameAsReturnType();
			System.out.println(v);
			ClassNameAsReturnType r = v.meth(v);
			System.out.println(r);
		}
}