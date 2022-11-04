
public class OM_getClass {
	public static void main(String[] args)
    {
        Object obj = new String("Max");
        Class c = obj.getClass();
        System.out.println("Class of Object obj is : "
                           + c.getName());
    }
}

