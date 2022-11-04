package equals;
/*
 * The Java String class equals() method compares the two given strings based on the content of the string.
 *  If any character is not matched, it returns false. 
 *  If all characters are matched, it returns true.

The String equals() method overrides the equals() method of the Object class.
 */

public class equalsInString {
	
	public static void comparingStringwithDifferentDataTypes() {
		String str = "a";
		String str1 = "123";
		String str2 = "45.89";
		String str3 = "false";
		Character c = new Character('a');
		Integer i = new Integer(123);
		Float f = new Float(45.89);
		Boolean b = new Boolean(false);
		System.out.println(str.equals(c));
		System.out.println(str1.equals(i));
		System.out.println(str2.equals(f));
		System.out.println(str3.equals(b));
		// the above print statements show a false value because
		// we are comparing a String with different data types
		// To achieve the true value, we have to convert
		// the different data types into the string using the toString() method
		System.out.println(str.equals(c.toString()));
		System.out.println(str1.equals(i.toString()));
		System.out.println(str2.equals(f.toString()));
		System.out.println(str3.equals(b.toString()));
	}

	public static void main(String args[]) {
		String s1 = "Rachana";
		String s2 = "Rachana";
		String s3 = "RACHANA";
		String s4 = "Rc  ac";
		System.out.println(s1.equals(s2));// true because content and case is same
		System.out.println(s1.equals(s3));// false because case is not same
		System.out.println(s1.equals(s4));// false because content is not same
		System.out.println("----comparingStringwithDifferentDataTypes()------");
		comparingStringwithDifferentDataTypes();
	}

}
