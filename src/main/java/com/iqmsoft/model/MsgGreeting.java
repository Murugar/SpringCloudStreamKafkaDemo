package com.iqmsoft.model;


public class MsgGreeting {
    private long timestamp;
    public long getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(long timestamp) {
		this.timestamp = timestamp;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	private String message;
    
    public MsgGreeting() 
    {
    	
    }
    
    public MsgGreeting(long timestamp, String message) 
    {
    	this.timestamp = timestamp;
    	this.message = message;
    }
    
}
