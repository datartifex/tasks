package com.alphasense.tasks;

import java.util.stream.Stream;

public enum TargetSumInputKey {

    INPUT_1("1,2,3,4"),
    INPUT_2("0,20,3,13"),
    INPUT_3("100,10,55,9,5"),
    INPUT_4("0,0,0"),
    INPUT_5("10,40,60"),
    INPUT_6(null);

    private final String source;

    private TargetSumInputKey(final String source) {
        this.source = source;
    }

    public int[] getSource() {
        if (source != null) {
            return Stream.of(source.split(",")).mapToInt(Integer::parseInt).toArray();
        }
        
        return null;
    }

}
