package com.alphasense.tasks;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.apache.log4j.BasicConfigurator;
import org.codehaus.jackson.map.ObjectMapper;

public class TaskHelper {

    protected final ObjectMapper mapper;
    
    protected static final String SUBARRAY_MSG = "the subarray %s was found in %s for the target %s";
    protected static final String NOT_FOUND_ARRAY_MSG = "no subarray was found in %s for the target %s";
    protected static final String UNPROCESSABLE_ARRAY_MSG = "an unprocessable array was detected: array = %s";
    protected static final String UNPROCESSABLE_STR_MSG = "an unprocessable string was detected: string = %s";
    protected static final String LONGEST_SUBSTRING_MSG = "the longest substring in %s is %s with the length of %s";
    
    public TaskHelper() {
        mapper = new ObjectMapper();
        BasicConfigurator.configure();
        Logger.getRootLogger().setLevel(Level.ALL);
    }

}
