package tan.dev;

public abstract class Person  {
	String name;
	int age;
	String phonenumber;
	public Person(String name, int age, String phonenumber) {
		super();
		this.name = name;
		this.age = age;
		this.phonenumber = phonenumber;
	}
	public abstract String toString();
	public abstract float diemTrungBinh();
	public abstract float tinhLuong();
	protected abstract float diemTB();
	
	
}
