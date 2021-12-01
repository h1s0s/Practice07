package com.javaex.ex01;

public class Rectangle extends Shape{
	
	private int width;
	private int height;
	
	public Rectangle(String fillColor, int width, int height){
		super(fillColor);
		this.width=width;
		this.height=height;
	}
	
	public int setWidth() {
		return width;
	}
	
	public void draw(){//draw()가 없어서 에러가 났었음
		System.out.println("[사각형]#면색:" +super.fillColor+ " "
				+ " #가로:" + width 
				+" #세로:" + height + "그렸습니다.");                                                                        
	}
	

}


