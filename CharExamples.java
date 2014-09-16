
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
	}
}
