package introduction;
import java.util.*;
public class corejava {

	public static void main(String[] args) {
		int i1=9;
		String s="rfhrekjh";
		double f=5.867777;
		float fg=0.6777f;
		char c='%';
		int[] arr=new int[45];
		arr[0]=9;
		arr[1]=9;
		int[] arr1= {1,2,45,6,7,8};
		String[] arr2=new String[34];
		String[] arr3= {"fe","fefgh","rfkehk"};
		for(int i=0;i<arr1.length;i++) {
			System.out.println(arr1[i]);
		}
		for(int i : arr1)
			if(i%2==0)
				System.out.println(i+"is multiple of 2");
			else
				System.out.println(i+"is not multiple of 2");
//		array is a static data type 
//		array list is a dynamic data type
		ArrayList<String> a=new ArrayList();
		a.add("gtrj");
		a.add("efe");
		a.get(1);
		System.out.println(a.get(1));
		for(int i=0;i<a.size();i++)
			System.out.println(a.get(i));
//		if element exist in array list
		if (a.contains("efe"))
			System.out.println(a.contains("efe"));
//		convert array to arraylist
		List<String> nameArratlist=Arrays.asList(arr2);
		nameArratlist.contains("hjhjh");
//		string literal(both will point to same locator)
		String s1="hi i am ";
		String s2="hi i am ";
//		String object.have different locator
		String s3=new String("Welcome");
		String s4=new String("Welcome");
		String[] splitstring=s1.split("i");
		for(String i:splitstring)
			System.out.println(i.trim());
//		revrese a string
		String rev="mango";
		String output="",output2="";
		for(int i=0;i<rev.length();i++)
			output=rev.charAt(i)+output;
		System.out.println("reverse of "+rev+" is "+output);
		for(int i=rev.length()-1;i>=0;i--)
			output2=output2+rev.charAt(i);
		System.out.println("reverse of "+rev+" is "+output2);

			
			System.out.println();
			
		
		
		
	}

}
