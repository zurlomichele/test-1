public class Main 
{
	public static void main(String[] args) 
	{
        System.out.println("Ciao");
        System.out.println("Michele Zurlo!");
		Prova p = new Prova();
		p.prova();
    }
		


	public class Prova 
	{
		public static int prova () 
		{

		    for (int x = 1; x < 20; x = x + 1)
			{
		        System.out.println("X vale:" + x);
			}
		}
	}

}
