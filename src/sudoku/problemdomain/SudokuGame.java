package sudoku.problemdomain;

import java.io.Serializable;

// Serializable is used, so we can read and write to a file easier
// Alt + insert for autocompleted constructors
public class SudokuGame implements Serializable {
    private final GameState gameState;
    private final int[][] gridState;

    public static final int GRID_BOUNDARY = 9;

    public SudokuGame(GameState gameState, int[][] gridState) {
        this.gameState = gameState;
        this.gridState = gridState;
    }

    public GameState getGameState() {
        return gameState;
    }

    public int[][] getCopyOfGridState() {
        //protects the sudoku game object from being changed over time
        return  SudokuUtilities.copyToNewArray(gridState);

    }
}
