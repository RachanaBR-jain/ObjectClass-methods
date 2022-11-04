class Student2 {
	private int id;
	private String name;

	public Student2(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
}

public class OM_equals {
	public static void main(String[] args) {
		Student2 c1 = new Student2(10, "Max");
		Student2 c2 = new Student2(10, "Max");
		System.out.println("Using equals+" + c1.equals(c2));
		if (c1 == c2) {
			System.out.println("Equal ");
		} else {
			System.out.println("Not Equal ");
		}

	}

}
