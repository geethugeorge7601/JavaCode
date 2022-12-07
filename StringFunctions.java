class StringFunctions
{
	public static void main(String args[])
	{
	String s ="Hello";
	String s1="World";
	String s2="hello";
	String a="Hi";
	String b="how";

	System.out.println("String length " +s.length());
	System.out.println("Char at" +s.charAt(2));
	System.out.println("index " +s.indexOf('l'));
	System.out.println("String uppercase " +s.toUpperCase());
	System.out.println("String lower case " +s.toLowerCase());
	System.out.println("String equals " +s.equals(s2));
	System.out.println("String equals ignore case " +s.equalsIgnoreCase(s2));
	System.out.println("String substring " +s.substring(2));
	System.out.println("String substring " +s.substring(1,4));
	System.out.println("String concat " +s.concat(" Friends"));
	System.out.println("String contains " +s.contains("l"));
	System.out.println("String replace " +s.replace('e','a'));
		a=a.concat(b);
	System.out.println("String length " +a.length());
	System.out.println(a.concat(b));
	StringBuilder sb=new StringBuilder(s);
	System.out.println("String builder append "+sb.append(" Guys"));
	
	System.out.println("String builder reverse "+sb.reverse());
	System.out.println("String functions");
	
	}
}
