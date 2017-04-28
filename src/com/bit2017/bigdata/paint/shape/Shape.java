package com.bit2017.bigdata.paint.shape;

import com.bit2017.bigdata.paint.i.Drawable;

public abstract class Shape implements Drawable{ // 추상클래스 new 선언이 불가능.
	private String fillColor;
	private String lineColor;
	
	public String getFillColor() {
		return fillColor;
	}
	
	public void setFillColor(String fillColor) {
		this.fillColor = fillColor;
	}
	
	public String getLineColor() {
		return lineColor;
	}
	
	public void setLineColor(String lineColor) {
		this.lineColor = lineColor;
	}
	
}