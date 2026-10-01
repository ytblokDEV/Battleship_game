public class Coordinate {

    public int row;
    public int collumn;

    public Coordinate(int row, int collumn){
        this.row = row;
        this.collumn = collumn;
    }

    public int getRow() {
        return row;
    }
    public int getCollumn() {
        return collumn;
    }
    public String toString() {
        return row + " " + collumn;
    }
}
