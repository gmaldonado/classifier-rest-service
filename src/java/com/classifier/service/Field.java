package com.classifier.service;

import java.util.List;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author gmaldonado
 */
@XmlRootElement
public class Field {
    private String name;
    private String dataType;
    private List<String> selectableItems;
    
    public Field(){
        
    }
    
    public Field(String name, String dataType){
        this.name = name;
        this.dataType = dataType;
    }
    
    public Field(String name, String dataType, List<String> selectableItems){
        this.name = name;
        this.dataType = dataType;
        this.selectableItems = selectableItems;
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

    public List<String> getSelectableItems() {
        return selectableItems;
    }

    public void setSelectableItems(List<String> selectableItems) {
        this.selectableItems = selectableItems;
    }

    
    

        
    
}
