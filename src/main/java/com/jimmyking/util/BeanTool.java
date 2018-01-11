package com.jimmyking.util;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.List;

public class BeanTool{

  public static <T> List<Field> getStaticFields(Class<T> cls) {
    List<Field> fields = new ArrayList<>();
    Field[] declaredFields = cls.getDeclaredFields();
    for (Field f : declaredFields) {
        String modifier = Modifier.toString(f.getModifiers());
        if (modifier.contains("static")) {
            fields.add(f);
        }
    }
    return fields;
}


public static  <T> List<Field> getInstanceFields(Class<T> cls) {
    List<Field> fields = new ArrayList<>();
    Field[] declaredFields = cls.getDeclaredFields();
    for (Field f : declaredFields) {
        String modifier = Modifier.toString(f.getModifiers());
        if (modifier.contains("static")) {
            continue;
        }
        fields.add(f);
    }
    return fields;
}
}