package sudoku.problemdomain;

import java.util.Objects;

public class Coordinates {
    private final int x;
    private final int y;

    public Coordinates(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getY() {
        return y;
    }

    public int getX() {
        return x;
    }

    @Override // To store elements in a hashmap to keep track of different ui elements
    public boolean equals(Object o){
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Coordinates that = (Coordinates) o;
        return x == that.x && y == that.y;
    }

    @Override // a hash code is a unique identifier generated from data that you give it
    // take the x and y value to generate an identifier
    // from the specific x and y value of the specific coordinates
    public int hashCode(){
        return Objects.hash(x, y);
    }
}