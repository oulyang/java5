package m1d312;
/**
 * Object toString()方法
 * 源代码
 *     public String toString() {
        	return getClass().getName() + '@' + Integer.toHexString(hashCode());
    }
 * 源代码中toString()方法的默认实现是
 * 		类名@对象的内存地址转化为十六进制的形式
 * 
 * toString()的设计目的是通过调用这个方法可以将一个java对象转换成字符串表示形式
 * 
 * The result should be a concise but informative representation that is easy for a person to read. 
 * 总之，toString()方法需要重写。
 * @author yyds
 *
 */
public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Mytime mt1=new Mytime();
		mt1.setDay(1);
		mt1.setMonth(2);
		mt1.setYear(2021);
		System.out.println(mt1.getYeay()+"."+mt1.getMonth()+"."+mt1.getDay());
		String s1=mt1.toString();
		System.out.println(s1);//重写前m2d11.Mytime@5594a1b5   重写后 2021.2.1
		
		//输出引用时会自动调用该引用的toString()方法
		System.out.println(mt1);
	}
}


class Mytime{
	private int year;
	private int month;
	private int day;
	
	public String toString() {
		return this.year+"."+this.month+"."+this.day;
	}
	public Mytime() {
		
	}
	public Mytime(int year,int month,int day) {
		this.year=year;
		this.month=month;
		this.day=day;
	}
	public void setYear(int year) {
		this.year=year;
	}
	public int getYeay() {
		return this.year;
	}
	public int getMonth() {
		return month;
	}
	public void setMonth(int month) {
		this.month = month;
	}
	public int getDay() {
		return day;
	}
	public void setDay(int day) {
		this.day = day;
	}
}
	
