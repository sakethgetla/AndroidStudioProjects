package com.a.myapplication;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.Rect;

public class Ball implements GameObject {
	
	private Point pos;
	private int size;
	private int color;

	public Ball(Point pos, int size, int color){
		//this.pos = pos;
		this.pos = new Point(pos);
		this.size = size;
		this.color = color;
	}
	public void setPos(Point pos) {
		this.pos = pos;
	}

	public Point getPos() {
		return pos;
	}

	@Override
	public void draw(Canvas canvas) {
	Paint paint = new Paint();
	paint.setColor(color);

	canvas.drawCircle(pos.x - (size/2), pos.y - (size/2), size, paint);
	}

	public void setSize(int size) {
		this.size = size;
	}

	public int getSize() {
		return size;
	}

	public void update(){
	}
}
