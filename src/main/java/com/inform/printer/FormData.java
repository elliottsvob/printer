package com.inform.printer;


import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

@SuppressWarnings("WeakerAccess")
public class FormData implements Map<String,String>{

    private String formName;

    private final Map<String,String> data = new HashMap<>();

    public Set<String> getFieldNames(){
        return data.keySet();
    }

    public String getFormName(){
        return formName;
    }

    public void setFormName(String formName){
        this.formName = formName;
    }

    public int size() {
        return data.size();
    }

    public boolean isEmpty() {
        return data.isEmpty();
    }

    public boolean containsKey(Object key) {
        return data.containsKey(key);
    }

    public boolean containsValue(Object value) {
        return data.containsValue(value);
    }

    public String get(Object key) {
        return data.get(key);
    }

    public String put(String key, String value) {
        return data.put(key,value);
    }

    public String remove(Object key) {
        return data.remove(key);
    }

    public void putAll(Map<? extends String, ? extends String> m) {
        data.putAll(m);
    }

    public void clear(){
        data.clear();
    }

    public Set<String> keySet() {
        return data.keySet();
    }

    public Collection<String> values() {
        return data.values();
    }

    public Set<Entry<String, String>> entrySet() {
        return data.entrySet();
    }

}
