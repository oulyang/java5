package m1d313;
/**
 * Objeck类equals方法
 * 源代码
 * public boolean equals(Object obj){
 * 		return (this==obj);
 * }
 * 
 * 以后编程的过程中都要通过equals方法判断两个对象是否相等。
 * @author yyds
 *
 */
public class Test3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			//判断两个基本数据类型的数据是否相等直接用“==”就可
			int a=100;
			int b=100;
			System.out.println(a==b);
			
			//判断两个java对象是否相等用equals
			User u1=new User(10,"wang");
			User u2=new User(10,"wang");
			System.out.println(u1==u2);//判断的是u1和u2的地址，结果为false
			
			boolean b1=u1.equals(u2);
			System.out.println(b1);
			
			//可以运行，但效率低
			User u3=null;
			System.out.println(u1.equals(u3));
	}

}


class User{

	int age;
	String name;
	
	public User() {
		super();
	}

	public User(int age, String name) {
		super();
		this.age = age;
		this.name = name;
	}
	
	/*
	public boolean equals(Object obj){	
		
		int a1=this.age;
		String n1=this.name;
		
		//编译报错
		// int a2=obj.age;
		//String n2=obj.name;
		 
		
		if(obj instanceof User)
		{
			User u=(User)obj;
			int a2=u.age;
			String n2=u.name;
			if(a1==a2 && n1==n2){
				return true;
			}		
		}
		return false;	
	}
	*/
	//改良equals
	/*
	public boolean equals(Object obj){
		if(obj==null) {
			return false;
		}
		if(!(obj instanceof User)) {
			return false;
		}
		if(this==obj) {
			return true;
		}
		//因为前面的判断证明obj一定是一个User
		User u=(User)obj;
		if(this.age==u.age&&this.name==u.name) {
			return true;
		}
		return false;
	}
	*/
	public boolean equals(Object obj){
		if(obj==null||!(obj instanceof User)) {
			return false;
		}
		if(this==obj) {
			return true;
		}
		//因为前面的判断证明obj一定是一个User
		User u=(User)obj;
		return this.age==u.age&&this.name==u.name;

	}
}


