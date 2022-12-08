package MouseGame;

public class BrickHealth {
    private int brickhealth[][];
    private int row;
    private int col;
    private BrickMap game;
    private int health;

    public BrickHealth(int r, int c, BrickMap bm) {
        row = r;
        col = c;
        game = bm;
        health = r;

        brickhealth = new int[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                brickhealth[i][j] = health;
            }
            health -= 1;
        }
    }
    public int [][] getHealthMap() {return brickhealth;}
    public int getHealth(int r, int c) {return brickhealth[r][c];}
    public int healtMinus(int r, int c) {return brickhealth[r][c] -= 1;}
    public int healthZero(int r, int c) {return brickhealth[r][c] = 0;}
}
