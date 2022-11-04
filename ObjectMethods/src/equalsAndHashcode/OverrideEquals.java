package equalsAndHashcode;

class Student2 {
	private int id;
	private String name;

	public Student2(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student2 other = (Student2) obj;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

}

public class OverrideEquals {
	public static void main(String[] args) {
		Student2 c1 = new Student2(10, "Max");
		Student2 c2 = new Student2(10, "Max");
		System.out.println("Using equals: " + c1.equals(c2));
		System.out.println(c1.hashCode());
		System.out.println(c2.hashCode());
		if (c1 == c2) {
			System.out.println("Equal ");
		} else {
			System.out.println("Not Equal ");
		}

	}

}
