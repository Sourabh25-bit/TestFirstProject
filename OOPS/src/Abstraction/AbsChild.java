package Abstraction;

public class AbsChild extends AbstParent {

	@Override
	public void Parent1() {
		System.out.println("Child/Parent1");
	}
	public static void main(String[] args) {
		AbstParent obj= new AbsChild();
		obj.Parent1();
		//System.out.println("Which Method : "+obj);
	}
	

}
