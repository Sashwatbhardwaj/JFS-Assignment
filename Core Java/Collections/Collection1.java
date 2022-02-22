import java.util.HashSet;

public class Collection1 {
	public static void main(String[] args)
	{
		HashSet<String> hs=new HashSet<>();
		hs.add("SASHWAT");
		hs.add("Siddhant");
		hs.add("Varun");
		hs.add("Vamsi");
		hs.add("NIKIL");
		
		System.out.println("Original");
		System.out.println(hs);
		System.out.println(hs.size());
		
		hs.add("SAAs");
		hs.add("asha");
		
		System.out.println("After adding duplicate elements");
		System.out.println(hs);
		System.out.println(hs.size());
	}

}