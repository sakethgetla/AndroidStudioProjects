package com.a.myapplication;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.Rect;

public class RectPlayer implements GameObject {

    // private Rect rect;
    private int color;


    private int height = 90;
    private int width = 320;
    private Point pos;
    //private point point= new Point(0,0);


    public RectPlayer(int x, int y, int color) {

        // this.rect = new Rect(x, y, color);
        this.color = color;
        //this.rect.width();
	pos = new Point(x, y);
	//pos.set(pos.x, pos.y);

	


    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }


    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    @Override
    public void draw(Canvas canvas) {
        Paint paint = new Paint();
        paint.setColor(color);

        canvas.drawRect(pos.x, pos.y, pos.x + width, pos.y + height, paint);
    }

    @Override
    public void update() {

    }

	public boolean clicked(int x, int y){
		if(x > pos.x && x < pos.x + width){
			if(y > pos.y && y < pos.y + height){
				//System.out.println("key clicked" );

				return true;
			}
		}
		return false;
	}

    public void update(Point point) {
        pos.x = point.x;
        pos.y = point.y;


    }


}
