package com.javaex.ex01;

public class Circle extends Shape{
	
	private int radius;
	
	public Circle(String fillColor, int radius){     
		super(fillColor);
		this.radius=radius;
	}

	public void draw(){
		System.out.println("[원]#면색:" +super.fillColor+ 
				"  #반지름:" + radius +" 그렸습니다.");                                               
	}
	
}



