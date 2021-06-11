package tan.dev;

public class Teacher extends Person {
	String maGiaoVien;
	float heSoLuong;
	public Teacher(String name, int age, String phonenumber, String maGiaoVien, float heSoLuong) {
		super(name, age, phonenumber);
		this.maGiaoVien = maGiaoVien;
		this.heSoLuong = heSoLuong;
	}
	
	public float tinhLuong() {
		return heSoLuong * 1000000;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return String.format("Name: %s -- Age: %d -- SDT: %s -- MSGV: %s, HSL: %f", name, age, phonenumber, maGiaoVien, heSoLuong);
	}

	@Override
	public float diemTB() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public float diemTrungBinh() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	
}

