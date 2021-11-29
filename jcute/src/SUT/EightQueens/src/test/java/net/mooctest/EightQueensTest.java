package net.mooctest;

import static org.junit.Assert.*;
import org.junit.Test;

public class EightQueensTest {

    @Test
    public void testQueen() {
        Queen queen = new Queen(0, 0);
        queen.moveDown(1);
        assertEquals(queen.getRow(), 1);
        queen.moveDown(7);
        assertEquals(queen.getRow(), 0);
        queen.moveDown(14);
        assertEquals(queen.getRow(), 7);
        queen.setRow(0);
        assertTrue(queen.canAttack(new Queen(0, 4)));
        assertFalse(queen.canAttack(new Queen(1, 2)));
        assertTrue(queen.canAttack(new Queen(1, 1)));
    }

    @Test
    public void testNode() {
        Node node = new Node();
        node.setState(new Queen[] { new Queen(0, 0), new Queen(1, 1), new Queen(2, 3), new Queen(3, 4), new Queen(4, 5), new Queen(5, 6), new Queen(6, 7), new Queen(7, 0) });
        assertNotEquals(node.computeHeuristic(), 0);
        Node node2 = new Node();
        node2.setState(new Queen[] { new Queen(0, 0), new Queen(2, 1), new Queen(7, 2), new Queen(5, 3), new Queen(3, 4), new Queen(1, 5), new Queen(4, 6), new Queen(6, 7) });
        assertEquals(node2.computeHeuristic(), 1);
        assertEquals(node2.compareTo(node), -1);
        assertEquals(node.compareTo(node2), 1);
        assertEquals(node.compareTo(node), 0);
    }

    @Test
    public void testHillClimbing() {
        HillClimbing hillclimbing = new HillClimbing(new Queen[] { new Queen(0, 0), new Queen(2, 1), new Queen(7, 2), new Queen(5, 3), new Queen(3, 4), new Queen(1, 5), new Queen(4, 6), new Queen(6, 7) });
        Node node = new Node();
        node.setState(new Queen[] { new Queen(0, 0), new Queen(2, 1), new Queen(7, 2), new Queen(5, 3), new Queen(3, 4), new Queen(1, 5), new Queen(4, 6), new Queen(6, 7) });
        Node noderst = hillclimbing.hillClimbing();
        assertEquals(noderst.toString(), node.toString());
        assertEquals(noderst.getHeuristic(), 1);
        hillclimbing = new HillClimbing();
        hillclimbing.startState();
        node = hillclimbing.getStartNode();
        noderst = hillclimbing.hillClimbing();
        assertTrue(noderst.getHeuristic() <= node.getHeuristic());
    }

    @Test
    public void testRandomRestart() {
        RandomRestart rndrestart = new RandomRestart(new EightQueens().generateBoard());
        Node node = rndrestart.randomRestart();
        assertEquals(node.getHeuristic(), 0);
    }

    @Test
    public void testSimulatedAnnealing() {
        SimulatedAnnealing annealing = new SimulatedAnnealing(new EightQueens().generateBoard());
        Node node = annealing.getStartNode();
        Node node2 = annealing.simulatedAnneal(25.0f, 0.001f);
        assertTrue(node2.getHeuristic() <= node.getHeuristic());
        annealing = new SimulatedAnnealing(new Queen[] { new Queen(0, 0), new Queen(2, 1), new Queen(7, 2), new Queen(5, 3), new Queen(3, 4), new Queen(1, 5), new Queen(4, 6), new Queen(6, 7) });
        node = annealing.getStartNode();
        node2 = annealing.simulatedAnneal(25.0f, 0.001f);
        assertTrue(node2.getHeuristic() <= node.getHeuristic());
    }
}

