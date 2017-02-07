
import java.util.Random;
import java.util.Scanner;


public class NewMain {
    
    public static void RockPaperScissors(){
    
    int count=0;
    int cScore =0;
    int uScore =0;
    Random rnd = new Random();
    int aRandom;
    char ch;
    Scanner sc = new Scanner(System.in);
    
    System.out.println("Let's play Rock Paper Scissors! Remember, it's 3 rounds.");
    while (count !=3) {        
        do{
            System.out.print("("+ (3-count) + ") "+ " --Make a choice (Rr/Pp/Ss): ");
            //take the first caharacter of the given input
            ch = sc.next().charAt(0); 
        }while(!( ch == 'R' || ch == 'r' || ch == 'P' || ch == 'p' || ch == 'S' || ch == 's'   ));
        //create a random integer between 0 and 2 inclusively so that we can make operations based on their values
        aRandom = rnd.nextInt(2) +1;
        switch(aRandom){
            case 0:                             //Rock
                    switch(ch){
                        case 'R':
                        case 'r':
                                System.out.println("\nRock-Rock. It is deuce! " + uScore + "-" + cScore);
                                count--;
                            break;
                            
                        case 'P':
                        case 'p':
                                System.out.println("\nPaper-Rock. You are in advance! "+ ++uScore + "-" + cScore);
                            break;
                            
                        case 'S':
                        case 's':
                                System.out.println("\nScissors-Rock. I am in advance. "+ uScore + "-" + ++cScore);
                            break;
                    }
                break;
                
            case 1:                             //Paper
                    switch(ch){
                            case 'R':
                            case 'r':
                                    System.out.println("\nRock-Paper. I am in advance! "+ uScore + "-" + ++cScore);
                                break;

                            case 'P':
                            case 'p':
                                    System.out.println("\nPaper-Paper. It is deuce! "+ uScore + "-" + cScore);
                                    count--;
                                break;

                            case 'S':
                            case 's':
                                    System.out.println("\nScissors-Paper. You are in advance! "+ ++uScore + "-" + cScore);
                                break;
                    }
                break;
            case 2:                             //Scissors
                switch(ch){
                        case 'R':
                        case 'r':
                                System.out.println("\nRock-Scissors. You are in advance! "+ ++uScore + "-" + cScore);
                            break;
                            
                        case 'P':
                        case 'p':
                                System.out.println("\nPaper-Scissors. I am in advance! "+ uScore + "-" + ++cScore);
                            break;
                            
                        case 'S':
                        case 's':
                                System.out.println("\nScissors-Scissors. It is deuce! " + uScore + "-" + cScore);
                                count--;
                            break;
                    }
                break;
        }// aRandom switch
        count++;
        
    } //    while loop 
    
//    DISPLAY THE RESULT ------------------------------------------------------

    System.out.println("\n\nThe Results\n------------------------------\nUser Score: " + uScore + "\nComputer Score: " + cScore);
    if(cScore < uScore)
        System.out.println("The User wins!");
    else
        System.out.println("The computer wins!");
    
}
    

    
    public static void main(String[] args) {
        // TODO code application logic here
        RockPaperScissors();
        
    }
    
}
