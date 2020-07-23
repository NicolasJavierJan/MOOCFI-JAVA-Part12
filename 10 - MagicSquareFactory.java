
public class MagicSquareFactory {

    public MagicSquare createMagicSquare(int size) {

        MagicSquare square = new MagicSquare(size);

        // implement the creation of a magic square with the Siamese method algorithm here
        int value = 1;
        int row = 0;
        int col = (size / 2);
        int currentRow = 0;
        int currentCol = (size / 2);
        
        for (int i = 0; i < (size * size); i++){
            square.placeValue(col, row, value);
            row = row - 1;
            if (row < 0){
                row = (size - 1);
            }
            col = col + 1;
            if (col > (size - 1)){
                col = 0;
            }
            if (square.readValue(col, row) != 0){
                row = currentRow;
                col = currentCol;
                row = row + 1;
                if (row < 0){
                    row = (size - 1);
                }
            }            
            currentRow = row;
            currentCol = col;
            value++;            
        }          
        return square;
    }
}
