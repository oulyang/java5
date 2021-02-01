package m1d313;
/**
 * Objeck��equals����
 * Դ����
 * public boolean equals(Object obj){
 * 		return (this==obj);
 * }
 * 
 * �Ժ��̵Ĺ����ж�Ҫͨ��equals�����ж����������Ƿ���ȡ�
 * @author yyds
 *
 */
public class Test3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			//�ж����������������͵������Ƿ����ֱ���á�==���Ϳ�
			int a=100;
			int b=100;
			System.out.println(a==b);
			
			//�ж�����java�����Ƿ������equals
			User u1=new User(10,"wang");
			User u2=new User(10,"wang");
			System.out.println(u1==u2);//�жϵ���u1��u2�ĵ�ַ�����Ϊfalse
			
			boolean b1=u1.equals(u2);
			System.out.println(b1);
			
			//�������У���Ч�ʵ�
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
		
		//���뱨��
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
	//����equals
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
		//��Ϊǰ����ж�֤��objһ����һ��User
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
		//��Ϊǰ����ж�֤��objһ����һ��User
		User u=(User)obj;
		return this.age==u.age&&this.name==u.name;

	}
}


