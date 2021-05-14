// Program for numbers
//for and for each loop 
package collections;

import java.util.ArrayList;
import java.util.List;

public class ShubhangiDesai_Arraylist1
{

	public static void main(String[] args) {
		List<Integer> n=new ArrayList<>();
		for(int j=1;j<=10;j++)
			n.add(j);
		for(Integer j:n)
			System.out.print(j+" ");
		System.out.println();
		addele(n);
	}
public static void addele(List<Integer>n) {
	for(int j=11;j<=15;j++) {
		n.add(j);
	}
	for(Integer j:n)
		System.out.print(j);
}
} 