package tan.dev;

import java.util.Scanner;

public class MainApp {
	static Person[] input() {
		Person[] std = new Person[10];
		for (int i = 0; i < 4; i++) {
			System.out.printf("Nhap Giao Vien Thu:%d\n",i+1);
			Scanner sc = new Scanner(System.in);
			System.out.println("Name: ");
			String name = sc.next();
			System.out.println("Age:");
			int age = sc.nextInt();
			System.out.println("PhoneNumber: ");
			String  numberPhone = sc.next();
			System.out.println("Ma Giao Vien: ");
			String idTeacher = sc.next();
			System.out.println("He So Luong = ");
			float heSoLuong = sc.nextFloat();
			Teacher tea = new Teacher(name, age, numberPhone, idTeacher, heSoLuong);
			std[i] = tea;
		}
		for (int i = 4; i < 10; i++) {
			System.out.printf("Nhap Sinh Vien Thu:%d\n",i+1);
			Scanner sc = new Scanner(System.in);
			System.out.println("Name: ");
			String name = sc.next();
			System.out.println("Age:");
			int age = sc.nextInt();
			System.out.println("PhoneNumber: ");
			String numberPhone = sc.next();
			System.out.println("Diem Toan: ");
			float diemToan = sc.nextFloat();
			System.out.println("Diem Ly: ");
			float diemLy = sc.nextFloat();
			System.out.println("Diem Hoa: ");
			float diemHoa = sc.nextFloat();
			System.out.println("Ma Sinh Vien: ");
			String maSinhVien = sc.next();
			System.out.println("Class: ");
			String Class = sc.next();
			Student student = new Student(name, age, numberPhone, diemToan, diemLy, diemHoa, maSinhVien, Class);
			std[i] = student;
		}
		return std;
	}
	static void print(Person[] persons) {
		for (int i = 0; i < 4; i++) {
			System.out.printf("GV %d: ",i);
			System.out.println(persons[i].toString());
		}
		for (int i = 4; i < 10; i++) {
			System.out.printf("SV %d: ",i);
			System.out.println(persons[i].toString());		
		}
	}
	static float findTeacher(Person[] persons) {
		float prevMax = persons[0].tinhLuong();
		for (int i = 0; i < 4; i++) {
			if(persons[i].tinhLuong() > prevMax) {
				prevMax = persons[i].tinhLuong();
			}
		}
		return prevMax;
	}
	static float findStudent(Person[] persons) {
		float preMax = persons[4].diemTB();
		for (int i = 4; i < 10; i++) {
			if (persons[i].diemTB() > preMax) {
				preMax = persons[i].diemTB();
			}
		}
		return preMax;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person[] persons = new Person[10];
		persons = input();
		print(persons);
		float maxTearche = findTeacher(persons);
		float maxStudent = findStudent(persons);
		System.out.printf("GV co Luong cao nhat: %f,SV co Diem TB cao nhat: %f",maxTearche,maxStudent);
		
	}

}
