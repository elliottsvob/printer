package com.inform.printer;

import java.util.Collection;
import java.util.Map;
import java.util.HashMap;
import java.util.Set;
import java.util.ArrayList;
import java.util.List;

public class FormCollection implements Map<String,FormData> {

    private final List<String> formNames = new ArrayList<>();
    private final Map<String,FormData> data = new HashMap<>();

    List<String> getFormNames(){
        return formNames;
    }

    FormData getFormData(String form){
        return data.get(form);
    }

    public FormData put(String key, FormData value) {
        formNames.add(key);
        value.setFormName(key);
        return data.put(key,value);
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

    public FormData get(Object key) {
        return data.get(key);
    }

    public FormData remove(Object key) {
        return data.remove(key);
    }

    public void putAll(Map<? extends String, ? extends FormData> m) {
        data.putAll(m);
    }

    public void clear() {
        formNames.clear();
        data.clear();
    }

    public Set<String> keySet() {
        return data.keySet();
    }

    public Collection<FormData> values() {
        return data.values();
    }

    public Set<Entry<String, FormData>> entrySet() {
        return data.entrySet();
    }

}

