package basics;
class Another{
	int var=10;
	static int num=50;
	void disp() {
		System.out.println(var);
	}
	static void output(){
		System.out.println(num);
	}
}
public class TwoClass {
	public static void main(String[] args) {
		Another an= new Another();
		System.out.println(an.var);
		System.out.println(Another.num);
		an.disp();
		Another.output();
	}
	

}
