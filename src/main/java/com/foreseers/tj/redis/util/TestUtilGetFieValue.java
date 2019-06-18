package com.foreseers.tj.redis.util;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class TestUtilGetFieValue {

	
	//根据属性名 获得属性值
	/*param fieName 属性名
	 * param o 对象实体类
	 * 
	 */
	public static Object getFieldValueByName(String fieName,Object o) {
		try {
			String firstLtter = fieName.substring(0, 1).toUpperCase();
			System.out.println("firstLtter"+firstLtter);
			String getter = "get"+firstLtter+fieName.substring(1);
			System.out.println("getter"+getter);
			Method method = o.getClass().getMethod(getter, new Class[] {});
			
			Object value = method.invoke(o, new Object[] {});
			
			return value;
			
		}catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
			return null;
		}

	}
	
	
	 /**
     * 获取防止注入新的对象
     * @param o                 传入对象
     * @return
 
    public Object getRightParameterObject(Object o){
        try{
            String[] strs=getFiledName(o);//属性名数组
            for(String s:strs){
                Object obj=getFieldValueByName(s, o);//属性值
                if(obj == null){
                    continue;
                }
                String firstLetter = s.substring(0, 1).toUpperCase();
                String getter = "set" + firstLetter + s.substring(1);
                System.out.println(getter);
                Method method = o.getClass().getMethod(getter, String.class);
                method.invoke(o,StringUtil.getWhereNewValue(obj.toString()));//这个地方对属性值进行操作，对属性值过滤什么的
                //}
            }
        } catch(Exception e){
           // logger.error(e.getMessage(), e);
            return null;
        }finally {
             
        }
        return o;
    }
   */     
    
    
   /**
    * 获取对象的所有属性值，返回一个对象数组
    * @param o                 传入对象
    */
   private Object[] getFiledValues(Object o) {
       String[] fieldNames = this.getFiledName(o);
       Object[] value = new Object[fieldNames.length];
       for (int i = 0; i < fieldNames.length; i++) {
           value[i] = this.getFieldValueByName(fieldNames[i], o);
       }
       return value;
   }
	
   
    /**
     * 获取属性名数组
     * @param o                 传入对象
     */
    private String[] getFiledName(Object o) {
        Field[] fields = o.getClass().getDeclaredFields();
        String[] fieldNames = new String[fields.length];
        for (int i = 0; i < fields.length; i++) {
            //System.out.println(fields[i].getType());
            fieldNames[i] = fields[i].getName();
        }
        return fieldNames;
    }
    
    
    
}
