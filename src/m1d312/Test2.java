package m1d312;
/**
 * Object toString()����
 * Դ����
 *     public String toString() {
        	return getClass().getName() + '@' + Integer.toHexString(hashCode());
    }
 * Դ������toString()������Ĭ��ʵ����
 * 		����@������ڴ��ַת��Ϊʮ�����Ƶ���ʽ
 * 
 * toString()�����Ŀ����ͨ����������������Խ�һ��java����ת�����ַ�����ʾ��ʽ
 * 
 * The result should be a concise but informative representation that is easy for a person to read. 
 * ��֮��toString()������Ҫ��д��
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
		System.out.println(s1);//��дǰm2d11.Mytime@5594a1b5   ��д�� 2021.2.1
		
		//�������ʱ���Զ����ø����õ�toString()����
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
	
