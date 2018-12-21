package com.alphasense.tasks;

import java.util.Queue;
import java.io.IOException;
import java.util.LinkedList;
import org.apache.log4j.Logger;

import static java.lang.String.format;

/*
 * Coding Task 2. Find subarray with given sum.
 */
public class TargetSumChecker extends TaskHelper {
    
    private final static Logger log = Logger.getLogger(TargetSumChecker.class);

    /*
     * Time complexity: worst case O(N).
     */
    public boolean check(final int[] array, final int target) throws IOException {
        if (array == null || array.length == 0) {
            log.warn(format(UNPROCESSABLE_ARRAY_MSG, mapper.writeValueAsString(array)));
            return false;            
        }
        
        int sum = 0;
        final Queue<Integer> window = new LinkedList<>();
        
        for (int number : array) {
            sum += number;
            window.add(number);
            
            while (sum > target && !window.isEmpty()) {
                sum -= window.remove();
            }
            
            if (sum == target) {
                log.info(format(SUBARRAY_MSG, window, mapper.writeValueAsString(array), target));
                return true;
            }
        }
        
        log.info(format(NOT_FOUND_ARRAY_MSG, mapper.writeValueAsString(array), target));
        return false;
    }
    
}
