package equalsAndHashcode;

class Student3 {
	private int id;
	private String name;

	public Student3(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student3 other = (Student3) obj;
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
/*
 * when we override equals(), 
 * it is recommended to also override the hashCode() method.
 *  If we don’t do so, equal objects may get different hash-values; and hash based collections,
 *   including HashMap, HashSet, and Hashtable do not work properly (see this for more details).
 */
public class OverrideEqualsAndHashCode {
	public static void main(String[] args) {
		Student3 c1 = new Student3(10, "Max");
		Student3 c2 = new Student3(10, "Max");
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
