import java.util.Scanner;
public class TicTacToe {
	String player;
	String computer;
     public static void main(String[] args){
          System.out.println("Welcome to TicTacToe program");
          char[] board = createBoard();
	   TicTacToe choiceBoard=new TicTacToe();
          choiceBoard.assignBoard();
 }

   public static char[] createBoard() {
          char[] board=new char[10];
   for(int i=0;i<10;i++){
             board[i]= ' ';
   }
     return board;
}
   public String assignBoard() {
        Scanner input=new Scanner(System.in);
        System.out.println("enter ur choice 0/x");
	player=input.next();
        if(player=="0")
                   computer="x";
              else
                   computer="0";
              return player;
         }
       }


