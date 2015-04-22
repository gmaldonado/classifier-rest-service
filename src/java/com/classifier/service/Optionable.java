package com.classifier.service;

import java.util.List;
import javax.ws.rs.GET;
import javax.ws.rs.Produces;


public interface Optionable {
    
        @GET
        @Produces("application/json")
	public List<Field> getOptions();
    
}
