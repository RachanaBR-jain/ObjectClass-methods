
class Student {
	private int id;
	private String name;

	public Student(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + "]";
	}

}

public class OM_toString {

	public static void main(String[] args) {
		Student student = new Student(1, "name");
		System.out.println(student.toString());
		
	}

}
