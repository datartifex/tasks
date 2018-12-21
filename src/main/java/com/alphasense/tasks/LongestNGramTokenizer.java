package com.alphasense.tasks;

import java.util.Set;
import java.util.HashSet;
import org.apache.log4j.Logger;

import static java.lang.String.format;

/*
 * Coding Task 1. Longest substring without repeating characters.
 */
public class LongestNGramTokenizer extends TaskHelper {

    private final static Logger log = Logger.getLogger(LongestNGramTokenizer.class);

    // Get the longest substring without repeating characters.
    public Payload tokenize(final String string) {
        if (string == null || string.length() == 0) {
            log.warn(format(UNPROCESSABLE_STR_MSG, string));
            return Payload.EmptyPayload;
        }
        
        int longestTokenSize = -1;
        String longestToken = null;

        final Set<Character> tokens = new HashSet<>();

        StringBuilder subs = new StringBuilder();

        for (char c : string.toCharArray()) {
            if (!tokens.contains(c)) {
                tokens.add(c);
                subs.append(c);
            } else {
                tokens.clear();
                tokens.add(c);

                if (subs.length() > longestTokenSize) {
                    longestTokenSize = subs.length();
                    longestToken = subs.toString();
                }

                subs = new StringBuilder();
                subs.append(c);
            }
        }

        log.info(format(LONGEST_SUBSTRING_MSG, string, longestToken, longestTokenSize));
        return new Payload(longestToken, longestTokenSize);
    }

    public static class Payload {

        private String longestToken;
        private int longestTokenSize;

        public static final Payload EmptyPayload = new Payload();
        
        public Payload() {
            this.longestToken = "";
            this.longestTokenSize = 0;
        }
        
        public Payload(final String longestToken, final int longestTokenSize) {
            this.longestToken = longestToken;
            this.longestTokenSize = longestTokenSize;
        }

        public int getLongestTokenSize() {
            return longestTokenSize;
        }

        public void setLongestTokenSize(final int longestTokenSize) {
            this.longestTokenSize = longestTokenSize;
        }

        public String getLongestToken() {
            return longestToken;
        }

        public void setLongestToken(final String longestToken) {
            this.longestToken = longestToken;
        }

    }

}
