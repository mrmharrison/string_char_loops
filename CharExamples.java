
public class CharExamples{
    public CharExamples()
    {
	char x ='x';
	String xStr = "x";
	char x2 = 'x';

	System.out.println( x==x2  );
	char[] chrs = {'a','b', 'c' };

	for (char c : chrs)
		System.out.println( c);

	String name = "Dom Rech";
	char[] lttrs = name.toCharArray();


System.out.println("loop over char[]");

	for(int i =0 ;i <lttrs.length; i++)
		System.out.println(lttrs[i]);


System.out.println("now substring()");
		//  as substring	
	for(int i =0 ;i < name.length(); i++)
		{	
		System.out.println(name.substring(i, i + 1 )) ;	
		}

System.out.println("now charAt()");
	//` using charAt
	for(int i =0 ;i < name.length(); i++)
		{	
		System.out.println(name.charAt( i )) ;	
		}

	}
}
