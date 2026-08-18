import java.util.scanner;

public class NasaQuizzApp {

    public static void main(string[] args
){

          Scanner scanner = new Scanner(
system.in);
          int score = 0;

          System.out.println("\nHi Everyone,
This is a Nasa Quizz App.  Are you ready to test your knowledge and skills about the lovely subject space?"
);

          System.out.println("\nQuestion 1: What does NASA stand for?"); //
First Question 
        System.out.print("Answer: ");
        String answer1 = scanner.nextLinr().trim();

          if(answer1.equalsIgnoreCase(
"National aeronautics and space administration")) {
             
            system.out.println
("Let's gooo! You got it right and your points are increased"
);
            score++;
          }
          else{
               System.out.println("Sorry you got it wrong"
);
          }

          system.out.println(
"Your total score is:" + score);

          System.out.println("\nQuestion 2: what is its natural satellite?"); //
second question 
        System.out.print("Answer: ");
        String answer2 = scanner.nextLinr().trim();

        if(answer2.equalsIgnoreCase(
"the Moon")) {
             
            system.out.println
("Let's gooo! You got it right and your points are increased"
);
            score++;
          }
          else{
               System.out.println("Sorry you got it wrong"
);
          }

          system.out.println(
"Your total score is:" + score);

          System.out.println("\nQuestion 3:  which vehicle is commonly used to launch spacecraft into space?"); //
Third question 
         System.out.print("Answer: ");
        String answer3 = scanner.nextLinr().trim();

        if(answer3.equalsIgnoreCase(
"Rocket")) {
             
            system.out.println
("Let's gooo! You got it right and your points are increased"
);
            score++;
          }
          else{
               System.out.println("Sorry you got it wrong"
);
          }

          system.out.println(
"Your total score is:" + score);

          System.out.println("\nQuestion 4:  which planet is known as the red planet"); //
Fourth question 
         System.out.print("Answer: ");
        String answer4 = scanner.nextLinr().trim();

        if(answer4.equalsIgnoreCase(
"Mars")) {
             
            system.out.println
("Let's gooo! You got it right and your points are increased"
);
            score++;
          }
          else{
               System.out.println("Sorry you got it wrong"
);
          }

          system.out.println(
"Your total score is:" + score);

        system.out.println(
"Your total score is:" + score);

          System.out.println("\nQuestion 5:  which planet is  famous for its ring"); //
fifth question 
         System.out.print("Answer: ");
        String answer5 = scanner.nextLinr().trim();

        if(answer5.equalsIgnoreCase(
"Saturn")) {
             
            system.out.println
("Let's gooo! You got it right and your points are increased"
);
            score++;
          }
          else{
               System.out.println("Sorry you got it wrong"
);
          }

          system.out.println(
"Your total score is:" + score);
         
          System.out.println("\nQuestion 6:  Which planet is the hottest in our solar system?"); //
Sixth question 
         System.out.print("Answer: ");
        String answer6 = scanner.nextLinr().trim();

        if(answer6.equalsIgnoreCase(
"Venus")) {
             
            system.out.println
("Let's gooo! You got it right and your points are increased"
);
            score++;
          }
          else{
               System.out.println("Sorry you got it wrong"
);
          }

          system.out.println(
"Your total score is:" + score);
         
           System.out.println("\nThank you for  taking part in this Quizz! I you liked it! \n Your scorebat the end is " + score);

             Scanner.closer();


}









}
          

