/* Program for adding Countries Using List*/

package collections;
import java.util.*;
public class ShubhangiDesai_Arraylist{

	public static void main(String[] args) {
		List<String> n=new ArrayList<>();
		addCountries("Usa","Spain","Uk","Germany","Turkey",n);
		for(String j:n)
			System.out.print(j+" ");

	}
	public static void addCountries(String a,String b,String c,String d,String e,List<String>n) 
	{
		n.add(a);
		n.add(b);
		n.add(c);
		n.add(d);
		n.add(e);
	}
}




