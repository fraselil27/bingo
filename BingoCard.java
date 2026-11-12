public class BingoCard
{
    //instance variables
    int board[][];
    public BingoCard(int bboard[][])
    {
        int lenBoard = 5;
        board = new int[5][5];
        toString();
        BingoGame();
    }
    
    public String toString()
    {
        System.out.println("B "+"I "+"N "+"G "+"O ");
        for(int i = 0; i < 5; i++)
        {
            for(int j = 0; j < 5; j++)
            {
                System.out.print(board[i][j] + " ");
            }
            System.out.print("\n");
        }
        return "Hello";
    }
}