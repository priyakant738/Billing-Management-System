package com.billing.Exception;

public class DataException extends RuntimeException{
	
   String linkdata;
   Long id;
    public DataException(String linkdata, Long id) {
	super(String.format("%s id - %s id used in another class", linkdata, id));
	this.linkdata = linkdata;
	this.id = id;
}
   
}
