public class DisplayBoard {
    public static void printBoard(char[][] board){
        System.out.println("_ _ _ _ _ _ _ _ ");
        System.out.println();
        for(int row=0;row<board.length;row++){
            for(int col=0;col<board[row].length;col++){
                System.out.print("  "+board[row][col]); 
                if(col+1!=board[row].length){
                    System.out.print(" | ");
                }
            }
            System.out.println();
            System.out.println("_ _ _ _ _ _ _ _ ");
            System.out.println();
        }
    }
}
