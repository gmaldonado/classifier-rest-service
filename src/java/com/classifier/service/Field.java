package com.classifier.service;

import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author gmaldonado
 */
@XmlRootElement
public class Field {
    private String name;
    private String dataType;
    
    public Field(){
        
    }
    
    public Field(String name, String dataType){
        this.name = name;
        this.dataType = dataType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDataType() {
        return dataType;
    }

    public void setDataType(String dataType) {
        this.dataType = dataType;
    }

        
    
}
