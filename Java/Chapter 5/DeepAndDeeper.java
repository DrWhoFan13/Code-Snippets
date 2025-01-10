public class DeepAndDeeper
{
	public static void main(String[] args)
	{
		System.out.println("I am starting in main.");
		deep();  //method call for the deep method
					//flow of control branches to deep()
		
		//finally flow of control is back in main
		System.out.println("Now I am back in main");
	}
	
	public static void deep()
	{
		System.out.println("I am now in deep.");
		
		deeper();  //method call for the deeper method
						//flow of control branches to deeper()
						
		//flow of control is back in the deep method
		System.out.println("Now I am back in deep");
		
		//deep method terminates and flow of cotrol branches back 
		//to the calling method which was main
	}
	
	public static void deeper()
	{
		System.out.println("I am now in deeper.");
		
		//deeper method terminates and flow of cotrol branches back 
		//to the calling method which was deep
		
	}
}