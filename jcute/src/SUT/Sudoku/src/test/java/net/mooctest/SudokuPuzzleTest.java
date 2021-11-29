package net.mooctest;

import static org.junit.Assert.*;
import org.junit.Test;

public class SudokuPuzzleTest {

    @Test
    public void testSudokuPuzzle() {
        SudokuPuzzle puzzle = new SudokuPuzzle(SudokuPuzzleType.SIXBYSIX.getRows(), SudokuPuzzleType.SIXBYSIX.getColumns(), SudokuPuzzleType.SIXBYSIX.getBoxWidth(), SudokuPuzzleType.SIXBYSIX.getBoxHeight(), SudokuPuzzleType.SIXBYSIX.getValidValues());
        assertTrue(puzzle.inRange(2, 2));
        assertFalse(puzzle.inRange(12, 12));
        assertFalse(puzzle.boardFull());
        assertTrue(puzzle.isValidValue("1"));
        assertFalse(puzzle.isValidValue("233"));
        assertTrue(puzzle.numInBox(0, 0, ""));
        assertFalse(puzzle.numInBox(0, 0, "2"));
        assertFalse(puzzle.numInBox(12, 12, ""));
        assertTrue(puzzle.numInRow(0, ""));
        assertFalse(puzzle.numInRow(0, "2"));
        assertFalse(puzzle.numInRow(12, ""));
        assertTrue(puzzle.numInCol(0, ""));
        assertFalse(puzzle.numInCol(0, "2"));
        assertFalse(puzzle.numInCol(12, ""));
        assertTrue(puzzle.isValidMove(0, 0, "1"));
        assertTrue(puzzle.isValidMove(0, 0, "233"));
        assertFalse(puzzle.isValidMove(0, 0, ""));
        assertFalse(puzzle.isValidMove(12, 12, "2"));
        puzzle.makeMove(0, 0, "233", true);
        assertEquals(puzzle.getValue(0, 0), "");
        puzzle.makeMove(0, 0, "1", false);
        assertEquals(puzzle.getValue(0, 0), "1");
        puzzle.makeMove(0, 0, "5", true);
        assertEquals(puzzle.getValue(0, 0), "1");
        String[][] board = puzzle.getBoard();
        for (int i = 0; i < puzzle.getNumRows(); ++i) for (int j = 0; j < puzzle.getNumColumns(); ++j) {
            board[i][j] = "5";
        }
        assertTrue(puzzle.boardFull());
    }

    @Test
    public void testSudokuGenerator() {
        SudokuGenerator sudoku = new SudokuGenerator();
        SudokuPuzzle puzzle = sudoku.generateRandomSudoku(SudokuPuzzleType.SIXBYSIX);
        assertFalse(puzzle.boardFull());
        puzzle = new SudokuPuzzle(SudokuPuzzleType.SIXBYSIX.getRows(), SudokuPuzzleType.SIXBYSIX.getColumns(), SudokuPuzzleType.SIXBYSIX.getBoxWidth(), SudokuPuzzleType.SIXBYSIX.getBoxHeight(), SudokuPuzzleType.SIXBYSIX.getValidValues());
        assertFalse(sudoku.backtrackSudokuSolver(-1, 0, puzzle));
        assertTrue(sudoku.backtrackSudokuSolver(0, 0, puzzle));
        puzzle = new SudokuPuzzle(SudokuPuzzleType.SIXBYSIX.getRows(), SudokuPuzzleType.SIXBYSIX.getColumns(), SudokuPuzzleType.SIXBYSIX.getBoxWidth(), SudokuPuzzleType.SIXBYSIX.getBoxHeight(), SudokuPuzzleType.SIXBYSIX.getValidValues());
        puzzle.makeMove(0, 0, "5", true);
        assertTrue(sudoku.backtrackSudokuSolver(0, 0, puzzle));
    }
}

