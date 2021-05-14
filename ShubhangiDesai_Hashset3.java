package collections;
import java.util.*;
public class ShubhangiDesai_Hashset3
{

	public static void main(String[] args) {
		Map<Integer,String> nj=new HashMap<>();
		addele(nj);
		for(Integer c:nj.keySet()) {
			System.out.println(c+" "+nj.get(c));
		}

	}
	public static void addele(Map<Integer,String> nj) {
	nj.put(1,"Tracy");
	nj.put(2,"Bella");
}
}
