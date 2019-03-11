package com.alibaba.cola.dto;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

/**
 * 这是用于在应用程序和调用程序之间传输数据的简单数据对象。
 * This is the simple data object used to transfer data between application and caller.
 *
 * 典型的调用者包括控制器、RPC、MTop等。
 * Typical caller includes controller, RPC, MTop and so on.
 *
 * @author fulan.zjf 2017-10-27 PM 12:19:15
 */
public abstract class ClientObject implements Serializable{
    
    private static final long serialVersionUID = 1L;
    
    /**
     * This is for extended values
     */
    protected Map<String, Object> extValues = new HashMap<String, Object>();

    public Object getExtField(String key){
        if(extValues != null){
            return extValues.get(key);
        }
        return null;
    }

    public void putExtField(String fieldName, Object value){
        this.extValues.put(fieldName, value);
    }

    public Map<String, Object> getExtValues() {
        return extValues;
    }

    public void setExtValues(Map<String, Object> extValues) {
        this.extValues = extValues;
    }
}
