package sudoku.problemdomain;
// A cool way to use interfaces is to design parts of your project upfront ahead of time
// This is called design by contract
import java.io.IOException;

public interface IStorage {
    void updateGameData(SudokuGame game) throws IOException; // expecting IO exceptions because this is an IO device
    SudokuGame getGameData() throws IOException;

}
