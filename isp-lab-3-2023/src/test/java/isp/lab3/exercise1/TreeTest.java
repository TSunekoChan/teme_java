package isp.lab3.exercise1;

import static org.junit.Assert.assertEquals;

import org.junit.Test;


public class TreeTest {
    Tree tree = new Tree();

    @Test
    public void testTree() {
        assertEquals("Should give the new tree height:", 25, Tree.grow(10));
    }
}