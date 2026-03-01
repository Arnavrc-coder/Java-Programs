public class Difficult_pattern {
	public static void main (String args [] ) 
	{
		char a,j;
		for(a = (char) 65; a <= 69; a++) {
			for(j = a; j >= 65; j--) { 
				System.out.print(j);
			}
			System.out.println();
		}
	}

}
