class Student1 {
	static int last_roll = 100;
	int roll_no;

	// Constructor
	Student1() {
		roll_no = last_roll;
		last_roll++;
	}

	// Overriding hashCode()
	@Override
	public int hashCode() {
		return roll_no;
	}

}

public class OM_hashCode {
	public static void main(String args[]) {
		Student1 s = new Student1();
		Student1 s2 = new Student1();

		// Below two statements are equivalent
		System.out.println(s); //4*160 + 6*161 = 100  -Student1@64
		System.out.println(s2);
		System.out.println(s.roll_no +" "+s2.roll_no);

		System.out.println(s.toString());
	}

}
