package com.alphasense.tasks;

import org.junit.Test;
import java.io.IOException;
import com.alphasense.tasks.LongestNGramTokenizer.Payload;

import static org.junit.Assert.assertEquals;
import static com.alphasense.tasks.LongestNGramInputKey.INPUT_1;
import static com.alphasense.tasks.LongestNGramInputKey.INPUT_2;
import static com.alphasense.tasks.LongestNGramInputKey.INPUT_3;
import static com.alphasense.tasks.LongestNGramInputKey.INPUT_4;
import static com.alphasense.tasks.LongestNGramOutputKey.OUTPUT_1;
import static com.alphasense.tasks.LongestNGramOutputKey.OUTPUT_2;
import static com.alphasense.tasks.LongestNGramOutputKey.OUTPUT_3;
import static com.alphasense.tasks.LongestNGramOutputKey.OUTPUT_4;

public class LongestNGramTokenizerTest {

    private Payload payload;
    private final LongestNGramTokenizer tokenizer;

    public LongestNGramTokenizerTest() {
        this.tokenizer = new LongestNGramTokenizer();
    }

    @Test
    public void testTokenize() throws IOException {
        payload = tokenizer.tokenize(INPUT_1.getSource());
        assertEquals(payload.getLongestToken(), OUTPUT_1.getLongestToken());
        assertEquals(payload.getLongestTokenSize(), OUTPUT_1.getLongestTokenSize());

        payload = tokenizer.tokenize(INPUT_2.getSource());
        assertEquals(payload.getLongestToken(), OUTPUT_2.getLongestToken());
        assertEquals(payload.getLongestTokenSize(), OUTPUT_2.getLongestTokenSize());

        payload = tokenizer.tokenize(INPUT_3.getSource());
        assertEquals(payload.getLongestToken(), OUTPUT_3.getLongestToken());
        assertEquals(payload.getLongestTokenSize(), OUTPUT_3.getLongestTokenSize());
        
        payload = tokenizer.tokenize(INPUT_4.getSource());
        assertEquals(payload.getLongestToken(), OUTPUT_4.getLongestToken());
        assertEquals(payload.getLongestTokenSize(), OUTPUT_4.getLongestTokenSize());
    }

}
