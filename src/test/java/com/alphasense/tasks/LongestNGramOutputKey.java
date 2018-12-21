package com.alphasense.tasks;

public enum LongestNGramOutputKey {
    
    OUTPUT_1("abc:3"),
    OUTPUT_2("b:1"),
    OUTPUT_3("wke:3"),
    OUTPUT_4(":0");
    
    private final String source;

    private LongestNGramOutputKey(final String source) {
        this.source = source;
    }
    
    public String getLongestToken() { return source.split(":")[0]; }
    
    public int getLongestTokenSize() { return Integer.parseInt(source.split(":")[1]); }
    
}
