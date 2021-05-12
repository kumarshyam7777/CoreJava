package SmartProgramming.controlstatements;

public class Equality {

	public static void main(String[] args) {
		String s = new String("Shyam");
		String s1= "Shyam";
		
		Thread th = new Thread();
		Object obj = new Object();
		
		s1=(String) obj;
		
		System.out.println(s==s1);
		System.out.println(s.equals(s1));
		
		System.out.println(s==obj);

	}

}
