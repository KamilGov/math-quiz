import  java.util.Scanner;

public class MathQuiz {
	
//	This function will run a 5 question basic subtraction quiz. 

	public static void main(String[] args) {
		final   int  NUMBER  =   5;
		int  rightAnswerCount  =   0 ;   
		int  questionCount  =   0 ;   
		long  startTime  = System.currentTimeMillis ();
		String answerList = "";
		Scanner input = new Scanner (System.in);
		
		
	
		while   (questionCount < NUMBER)  {
			
			//			Creating the numbers for each question
			int  number1  =   ( int )( Math . random ()   *   10 );
			int  number2  =   ( int )( Math . random ()   *   10 );
			
			//			Making sure that number1 is bigger than number2 so that the equations don't bring up negative numbers. 
			if (number1 < number2)  {
				int temp = number1; number1 = number2; number2 = temp;
			}
			
			//			Prompt for answer
			System . out . print("What is " + number1 + " - " + number2 + "? ");
			int answer = input.nextInt();
			
			//			Check answer
			if (number1 - number2 == answer) {   
				System.out .println ("You are correct!" );
				rightAnswerCount ++; // Increase the correct answer count 
			}
			else
				System . out . println ("Your answer is wrong.\n" + number1 + " - " + number2 + " should be " + (number1 - number2));
			questionCount ++;
			answerList += "\n" + number1 + "-" + number2 + "=" + answer + ((number1 - number2 == answer)? " correct" : " wrong");
		}
		
		//		Display stats
		long  endTime = System . currentTimeMillis ();
		long  testTime =  endTime - startTime; 
		System.out.println("Correct count is " + rightAnswerCount +	"\nTest time is " + testTime/1000 + " seconds\n" + answerList);

	}

}
