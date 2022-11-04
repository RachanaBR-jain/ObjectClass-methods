
public class OM_finalize {
	public static void main(String[] args) {
		OM_finalize t = new OM_finalize();
		System.out.println(t.hashCode());

		t = null;

		// calling garbage collector
		System.gc(); //will call finalize method

		System.out.println("end");
	}

	@Override
	protected void finalize() {
		System.out.println("finalize method called");
	}

}
