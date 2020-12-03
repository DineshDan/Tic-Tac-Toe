import java.util.Scanner;
import java.util.ArrayList;
public class TicTacToe {
	String player;
	String computer;
     public static void main(String[] args){
          System.out.println("Welcome to TicTacToe program");
          char[] board = createBoard();
	   TicTacToe Board=new TicTacToe();
          Board.assignBoard();
         showBoard(board);
         int userMove = getuserMove(board,userInput);
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
   public static void showBoard(char[] board) {
                       for(int i=0;i<3;i++) {
    System.out.println(board[i]+"|"+board[i+1]+"|"+board[i+2]+"|");

             }
       }
    public static int userMove(char[] board,Scanner userInput) {
	Integer [] validcells={1,2,3,4,5,6,7,8,9};
	while(true){
       
	Systen.out.println("enter the next move(1-9):");
	int index = userInput.nextInt();
	if(Arrays.asList(validcells).contains(index) && isspacefree(board,index))
	return index;
            }

    }
 private static boolean isspacefree(char[] board, int index) {
   return board[index] == ' ' ;
 }

}
