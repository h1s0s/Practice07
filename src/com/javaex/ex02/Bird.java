package com.javaex.ex02;

public abstract class Bird {
    protected String name;
    
    public void setName(String name) {
    	this.name = name;
    }
    public String getName() {
    	return name;
    }
    
    public abstract void sing();
 
    public abstract void fly();
   
    public abstract void showName();
}
