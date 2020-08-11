package com.shipmentEvents.handlers;

import java.sql.Timestamp;
import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;

public class TestBean3 {

	
	private String getTimeStamp() {
		long millis = System.currentTimeMillis();
	    Timestamp timestamp = new Timestamp(millis);
		return timestamp.toString();
	}
	
	private int value;

    /**
     * Returns a unique value.
     */
    public int getNext() {
        return value++;
    }
}
