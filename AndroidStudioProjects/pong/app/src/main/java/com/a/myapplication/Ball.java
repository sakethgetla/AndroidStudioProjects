package com.a.myapplication;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.Rect;

public class Ball implements GameObject {
	
	private Point pos;
	private Point lastPos;
	private Point vel;
	private int size;
	private int color;

	Ball(Point pos, Point vel, int size, int color){
		//this.pos = pos;
		this.lastPos = new Point(pos);
		this.pos = new Point(pos);
		this.vel = new Point(vel);
		this.size = size;
		this.color = color;
	}
	public void setPos(Point pos) {
		this.pos = pos;
	}

	public Point getLastPos() {
		return lastPos;
	}
	public Point getPos() {
		return pos;
	}

	public void changeVelX(){
		vel.x *= (-1);
	}

	public void changeVelY(){
		vel.y *= (-1);
	}

	@Override
	public void draw(Canvas canvas) {
		Paint paint = new Paint();
		paint.setColor(color);
		canvas.drawCircle(pos.x - (size/2), pos.y - (size/2), size, paint);
	}

	public void setVel(Point vel) {
		this.vel = vel;
	}
	public void setSize(int size) {
		this.size = size;
	}

	public int getSize() {
		return size;
	}

	public void update(){
		lastPos = pos;
		pos.x += vel.x;
		pos.y += vel.y;
	}
}
