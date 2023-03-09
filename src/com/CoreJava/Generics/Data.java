package com.CoreJava.Generics;


public class Data<T> {
	
private T t;

public Data(T t) {
		this.t = t;
	}
  
public void ShowData() {
	  System.out.println("Class of Data is "+t.getClass().getName());
  }

public T GetData() {
	return t;
	}

}
