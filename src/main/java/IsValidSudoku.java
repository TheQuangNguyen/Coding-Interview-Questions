import java.util.HashSet;
import java.util.Set;

public class IsValidSudoku {
    // Determine if a 9x9 Sudoku board is valid. Only the filled cells need to be validated according to the following rules:
    // Each row must contain the digits 1-9 without repetition.
    // Each column must contain the digits 1-9 without repetition.
    // Each of the 9 3x3 sub-boxes of the grid must contain the digits 1-9 without repetition.

    public boolean isValidSudoku(char[][] board) {
        Set<String> seen = new HashSet<>();
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                char number = board[i][j];

                if (number == '.') {
                    continue;
                }

                if (!seen.add(number + " in row " + i) || !seen.add(number + " in column " + j) || !seen.add(number + " in row box " + i/3 + " and in column box " + j/3)) {
                    return false;
                }
            }
        }

        return true;
    }

    // Time complexity is O(n) where n is the total number of element within the 2d sudoku array
    // Space complexity is O(n) since there is a chance that the whole sudoku is filled
}
