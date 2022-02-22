import java.util.TreeMap;
import java.util.*;
public class Collection {
	public static void main(String[] args)
	{
		TreeMap<Long,String> contact=new TreeMap<>();
		contact.put((long) 952489604, "Ashok");
		contact.put((long) 993355664, "Bhola");
		contact.put((long) 989874853, "SASHWAT");
		contact.put((long) 967775097, "BHARDAJ");
		System.out.println(contact.keySet());
		System.out.println(contact.values());
		System.out.println(contact);
	}
}