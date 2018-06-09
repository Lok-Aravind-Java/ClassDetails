package employerdetails;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class SettingEValues {
	static Scanner s;
	static Employee[] eobjs;

	public static void main(String[] args) {

		Employer empobj = new Employer();
		empobj.employerDetails();
		SettingEValues sev = new SettingEValues();

		sev.toStringValues();

		ascend();

		System.out.println("Employer Details are ");

		empobj.displayEmployerDetails();

		File f = new File("Employee.txt");

		try {
			f.createNewFile();
			FileOutputStream fop = new FileOutputStream("Employee.txt");
			ObjectOutputStream oos = new ObjectOutputStream(fop);
			oos.writeObject(eobjs);

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		try {
			FileInputStream fip = new FileInputStream("Employee.txt");
			ObjectInputStream oip = new ObjectInputStream(fip);
			Employee[] sevobj = (Employee[]) oip.readObject();
			for (Employee a : sevobj) {
				System.out.println("name" + a.getEname());
				System.out.println("Department" + a.getEdept());
				System.out.println("Adress" + a.getEadd());
				System.out.println("Id" + a.getEid());
				System.out.println("Salary" + a.getEsalary());
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public void toStringValues() {
		s = new Scanner(System.in);
		eobjs = new Employee[4];
		for (int i = 0; i < eobjs.length; i++) {
			eobjs[i] = new Employee();

			System.out.println("Enter employee " + i + " name ");
			eobjs[i].setEname(s.next());

			System.out.println("Enter employee " + i + " adress ");
			eobjs[i].setEadd(s.next());

			System.out.println("Enter employee " + i + " dept ");
			eobjs[i].setEdept(s.next());

			System.out.println("Enter employee " + i + " id ");
			eobjs[i].setEid(s.nextInt());

			System.out.println("Enter employee " + i + " salary ");
			eobjs[i].setEsalary(s.nextInt());

		}

	}

	public static void ascend() {
		int p, q, tem;
		int a[] = new int[4];

		for (int n = 0; n < a.length; n++) {
			a[n] = (int) eobjs[n].esalary;
		}

		int x = a.length;
		for (p = 0; p < x; p++) {
			for (q = p + 1; q < x; q++) {
				if (a[p] < a[q]) {
					tem = a[p];
					a[p] = a[q];
					a[q] = tem;
				}
			}
		}

		for (int h = 0; h < a.length; h++) {
			for (int k = 0; k < a.length; k++) {
				if (eobjs[h].esalary == a[k]) {
					System.out.println("Employee " + h + " Name " + eobjs[h].getEname());
					System.out.println("Employee  " + h + " Dept " + eobjs[h].getEdept());
					System.out.println("Employee " + h + "  Address " + eobjs[h].getEadd());
					System.out.println("Employee " + h + "  ID " + eobjs[h].getEid());
					System.out.println("Employee " + h + "  salary " + eobjs[h].getEsalary());
				}
			}
		}

	}

}
