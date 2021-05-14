package collections;

import java.util.ArrayList;
import java.util.List;
import java.util.*;

public class ShubhangiDesai_literator{

	public static void main(String[] args){
		Set<String> n=new HashSet<>();
		addCountries("Usa","Spain","Uk","Germany","Turkey",n);
		Iterator<String>j=n.iterator();
		while(j.hasNext()) {
			System.out.println(j.next());
		}
	}
	public static void addCountries(String a,String b,String c,String d,String e,Set<String>n) {
		n.add(a);
		n.add(b);
		n.add(c);
		n.add(d);
		n.add(e);

	}

}
