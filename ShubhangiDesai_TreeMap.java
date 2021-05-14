package collections;
import java.util.Map;
import java.util.*;
public class ShubhangiDesai_TreeMap
{
	public static void main(String[] args) 
	{
		Map<Integer,String> nj=new TreeMap<>();
		addele(nj);
		for(Integer c:nj.keySet()) {
			System.out.println(c+" "+nj.get(c));
		}

	}
public static void addele(Map<Integer,String> nj) {
	nj.put(2,"Alex");
	nj.put(1,"Rosy");
	nj.put(5,"Tom");
	nj.put(3,"Nick");
}
}
