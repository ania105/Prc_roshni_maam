package p33;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer sb = new StringBuffer("Hello, World");
		
		sb.insert(7, "Java");
		System.out.println("1. Insert: "+ sb);
		
		sb.reverse();
		System.out.println("2. Reverse: "+ sb);
		
		sb.delete(0, 11);
		System.out.println("3. Delete: "+ sb);
		
		sb.replace(4, 8, "World");
		System.out.println("4. Replace: "+ sb);
		
		String substring = sb.substring(2, 6);
		System.out.println("5. Substring: "+sb);
	}

}
