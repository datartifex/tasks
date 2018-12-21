package com.alphasense.tasks;

import org.junit.Test;
import java.io.IOException;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import static com.alphasense.tasks.TargetSumInputKey.INPUT_1;
import static com.alphasense.tasks.TargetSumInputKey.INPUT_2;
import static com.alphasense.tasks.TargetSumInputKey.INPUT_3;
import static com.alphasense.tasks.TargetSumInputKey.INPUT_4;
import static com.alphasense.tasks.TargetSumInputKey.INPUT_5;
import static com.alphasense.tasks.TargetSumInputKey.INPUT_6;
import static com.alphasense.tasks.TargetSumOutputKey.OUTPUT_1;
import static com.alphasense.tasks.TargetSumOutputKey.OUTPUT_2;
import static com.alphasense.tasks.TargetSumOutputKey.OUTPUT_3;
import static com.alphasense.tasks.TargetSumOutputKey.OUTPUT_4;
import static com.alphasense.tasks.TargetSumOutputKey.OUTPUT_5;
import static com.alphasense.tasks.TargetSumOutputKey.OUTPUT_6;

public class TargetSumCheckerTest {
    
    private final TargetSumChecker checker;
    
    public TargetSumCheckerTest() {
        this.checker = new TargetSumChecker();
    }

    @Test
    public void testCheck() throws IOException {
        // Example 1
        assertTrue(checker.check(INPUT_1.getSource(), OUTPUT_1.getTargetSum()));
        assertFalse(checker.check(INPUT_1.getSource(), OUTPUT_1.getFakeTargetSum()));
        
        // Example 2
        assertTrue(checker.check(INPUT_2.getSource(), OUTPUT_2.getTargetSum()));
        assertFalse(checker.check(INPUT_2.getSource(), OUTPUT_2.getFakeTargetSum()));
        
        // Example 3
        assertTrue(checker.check(INPUT_3.getSource(), OUTPUT_3.getTargetSum()));
        assertFalse(checker.check(INPUT_3.getSource(), OUTPUT_3.getFakeTargetSum()));
        
        // Example 4
        assertTrue(checker.check(INPUT_4.getSource(), OUTPUT_4.getTargetSum()));
        assertFalse(checker.check(INPUT_4.getSource(), OUTPUT_4.getFakeTargetSum()));
        
        // Example 5
        assertTrue(checker.check(INPUT_5.getSource(), OUTPUT_5.getTargetSum()));
        assertFalse(checker.check(INPUT_5.getSource(), OUTPUT_5.getFakeTargetSum()));
        
        // Example 6
        assertFalse(checker.check(INPUT_6.getSource(), OUTPUT_6.getTargetSum()));
    }
    
}
