package com.alphasense.tasks;

public enum TargetSumOutputKey {

    OUTPUT_1("7:8"),
    OUTPUT_2("23:33"),
    OUTPUT_3("10:15"),
    OUTPUT_4("0:8"),
    OUTPUT_5("110:70"),
    OUTPUT_6("-1:-1");

    private final String source;

    private TargetSumOutputKey(final String source) {
        this.source = source;
    }

    public int getTargetSum() {
        return Integer.parseInt(source.split(":")[0]);
    }

    public int getFakeTargetSum() {
        return Integer.parseInt(source.split(":")[1]);
    }

}
