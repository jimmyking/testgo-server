package com.jimmyking.util;

import java.lang.reflect.Field;
import java.util.List;
import java.util.stream.Collectors;
import com.google.common.base.CaseFormat;
import org.apache.ibatis.mapping.SqlSource;
import org.apache.ibatis.scripting.LanguageDriver;
import org.apache.ibatis.scripting.xmltags.XMLLanguageDriver;
import org.apache.ibatis.session.Configuration;

public class InsertParamsDoDriver extends XMLLanguageDriver implements LanguageDriver{

  @Override
    public SqlSource createSqlSource(Configuration configuration, String script, Class<?> parameterType) {
        //insert into table ${record}
        // insert into table (c1,c2) value(f1,f2)
        List<Field> declaredFields = BeanTool.getInstanceFields(parameterType);
        String fields = declaredFields.stream().map(field -> String.format("#{%s}", field.getName()))
                .collect(Collectors.joining(" ,"));
        String columns = declaredFields.stream().map(field -> String.format("`%s`", CaseFormat.LOWER_CAMEL.to(CaseFormat.LOWER_UNDERSCORE, field.getName())))
                .collect(Collectors.joining(","));
        script = "<script> " + String.format("%s (%s) value (%s)", script, columns, fields) + " </script>";
        return super.createSqlSource(configuration, script, parameterType);
    }
}