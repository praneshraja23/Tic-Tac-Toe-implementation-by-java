import java.util.Scanner;

public class Tic_Tac_Toe {
    public static void main(String[] args) {
        char[][] board=new char[3][3];
        for(int row=0;row<board.length;row++){
            for(int col=0;col<board[row].length;col++){
                board[row][col]=' ';
            }
        }

        char player='X';
        boolean gameOver=false;
        
        Scanner scanner=new Scanner(System.in);
        while(!gameOver)
        {
            DisplayBoard.printBoard(board);
            System.out.println("player "+player+" enter: ");
            int row=scanner.nextInt();
            int col=scanner.nextInt();

            if(board[row][col]==' '){
                board[row][col]=player;
                gameOver=GameCheck.haveWon(board,player);

                if(gameOver){
                    System.out.println("current player "+player+" Won");
                }
                else{
                    player=(player=='X')?'O':'X';
                }
            }
            else{
                System.out.println("Invalid move,Try Again");
            }

        }
        DisplayBoard.printBoard(board);
        scanner.close();
    }
}
