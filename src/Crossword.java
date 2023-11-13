public class Crossword {
    private Square[][] puzzle;

    public Crossword(boolean[][] blackSquares)
    {
        this.puzzle=new Square[blackSquares.length][blackSquares[0].length];
        int val=1;
        for(int i=0;i<blackSquares.length;i++){
            for(int j=0;j<blackSquares[i].length;j++){
                if(toBeLabeled(i,j,blackSquares)){
                    puzzle[i][j]=new Square(blackSquares[i][j],val++);
                }
                else{
                    puzzle[i][j]=new Square(blackSquares[i][j],0);
                }
            }
        }
    }

    private static boolean toBeLabeled(int r, int c, boolean[][] blackSquares)
    {
        if((r==0||c==0|| blackSquares[r - 1][c] || blackSquares[r][c - 1])&& !blackSquares[r][c]){
            return true;
        }
        return false;
    }

    public Square[][] getPuzzle() {
        return puzzle;
    }
}
