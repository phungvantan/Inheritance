package tan.dev;

public class Student extends Person {
	float diemToan,diemLy,diemHoa;
	String maSinhVien;
	String Class;
	public Student(String name, int age, String numberPhone, float diemToan, float diemLy, float diemHoa,
			String maSinhVien, String Class) {
		super(name, age, numberPhone);
		this.diemToan = diemToan;
		this.diemLy = diemLy;
		this.diemHoa = diemHoa;
		this.maSinhVien = maSinhVien;
		this.Class = Class;
	}
		
	public float diemTB() {
		return (diemHoa + diemLy + diemToan) / 3;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return String.format("Name: %s -- Age: %d -- SDT: %s -- Diem Toan: %f, Diem Ly: %f, Diem Hoa: %f -- MSSV: %s -- Class:%s", name, age, phonenumber, diemToan, diemLy, diemHoa, maSinhVien,Class);
	}

	@Override
	public float tinhLuong() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public float diemTrungBinh() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	
}
	
	

