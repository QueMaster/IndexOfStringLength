import java.util.Scanner;
public class StringLength
{
  public static void main(String []args)
  {
  
    Scanner scan = new Scanner(System.in);
	String message  = "Enter a sentence:";
    boolean valid = false;
    String input = " ";
    
    int indexOfFullStop = 0;
    int indexOfQuestion = 0 ;
    int indexOfExclamation = 0 ;
    int lastIndex = 0;
        
	do
	{
		System.out.println(message);
		input = scan.nextLine();
		
		indexOfFullStop = input.indexOf(".");
		indexOfQuestion = input.indexOf("?");
		indexOfExclamation = input.indexOf("!");
		
		if(indexOfFullStop != input.charAt(0) || indexOfQuestion != input.charAt(0) || indexOfExclamation != input.charAt(0))
		{
			//the sentence ended correcttly
			valid = true;
			
			// get the index of the last charater that ends the sentence 
			
			if(indexOfFullStop != input.charAt(-1))
			{
		       lastIndex = indexOfFullStop; 
			   
			} else if (indexOfQuestion != input.charAt(-1))
			{
				lastIndex = indexOfQuestion;
				
			} else if (indexOfExclamation != input.charAt(-1))
			{
				lastIndex = indexOfExclamation;
				
			}else
			{
				// the sentence did not end with one of the charaters
				
				 message = "The sentence must end with a . OR ! OR ? " + "\nEnter the sentence again:";
				
			}
			
			
		}
		
		
		
	}while (valid = true);
  
      int length = lastIndex;
			
	  message = "the length of a sentence is" + length + "characters";
	  System.out.println(message):
  
  
  
  }
}