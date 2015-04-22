package com.classifier.service.impl;

import com.classifier.service.Field;
import com.classifier.service.Optionable;
import java.util.ArrayList;
import java.util.List;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

 //http://localhost:8080/classifierweb/rest/options/
@Path("/options")
@Produces(MediaType.APPLICATION_JSON)
public class ClassifierService implements Optionable{
    
    @Override
    public List<Field> getOptions() {
        return generateOptions();
    }
    
    private List<Field> generateOptions(){
        List<Field> options = new ArrayList<>();
        options.add(new Field("Dataset","file"));
        options.add(new Field("Topology","file"));
        options.add(new Field("Iterations","int"));
        options.add(new Field("Initial Radius","int"));
        options.add(new Field("Final Radius","int"));
        options.add(new Field("Initial Learning Rate","float"));
        options.add(new Field("Final Learning Rate","float"));
        return options;
    }

    
 
}