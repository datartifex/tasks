package com.alphasense.tasks;

public enum LongestNGramInputKey {

    INPUT_1("abcabcbb"),
    INPUT_2("bbbbb"),
    INPUT_3("pwwkew"),
    INPUT_4(null);

    private final String source;

    private LongestNGramInputKey(final String source) {
        this.source = source;
    }
    
    public String getSource() { return source; }
    
}
