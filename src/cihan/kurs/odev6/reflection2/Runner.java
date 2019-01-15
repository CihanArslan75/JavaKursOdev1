package cihan.kurs.odev6.reflection2;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import java.lang.reflect.Field;

public class Runner {

	public static void main(String[] args) {
		
		try {
			Class<?> cls=Class.forName("cihan.kurs.odev6.reflection2.Reflection");
			Object obj = cls.newInstance();
			Constructor<?> cons=cls.getDeclaredConstructor(String.class,Integer.TYPE);
			for(Field field:cls.getDeclaredFields()) {
				System.out.println("Field:"+field.getName());
			}
			System.out.println();
			
			Method setAge =cls.getMethod("setAge",Integer.TYPE);
			setAge.invoke(obj,25);
			Method getAge=cls.getMethod("getAge");
			Object age =getAge.invoke(obj);
			System.out.println("age:"+age);
			Method printNo = cls.getMethod("printNo");
	         // calling static method with null object
	         printNo.invoke(null);
	         // getting the all methods include private with declared methods
	         Method incrementAge = cls.getDeclaredMethod("incrementAge");
	         // accessing to a private method
	         incrementAge.setAccessible(true);
	         incrementAge.invoke(obj);
	         
	         Method toString = cls.getMethod("toString");
	         Object data = toString.invoke(obj);
	         System.out.println("Person:" + data);
			
		}
		catch (ClassNotFoundException e) {
	         System.err.print("The class not found: ");
	         System.err.println(e.getMessage());
	      }
	      catch (InstantiationException e) {
	         System.err.print("The object can not be instantiated from the class: ");
	         System.err.println(e.getMessage());
	      }
	      catch (IllegalAccessException e) {
	         System.err.print("illegal access to method");
	         System.err.println(e.getMessage());
	      }
	      catch (NoSuchMethodException e) {
	         System.err.print("No Such Method as ");
	         System.err.println(e.getMessage());
	      }
	      catch (IllegalArgumentException e) {
	         System.err.print("an illegal argument passing the method ");
	         System.err.println(e.getMessage());
	      }
	      catch (InvocationTargetException e) {
	         System.err.print("an invocation error ");
	         System.err.println(e.getMessage());
	      }

	}

}
