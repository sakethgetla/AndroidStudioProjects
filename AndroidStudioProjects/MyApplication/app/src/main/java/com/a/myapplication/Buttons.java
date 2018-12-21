package com.a.myapplication;

import android.graphics.Bitmap;
import android.graphics.Canvas;

public class Buttons {
	Bitmap bmp;
	int pos[] ;
	int size[];


	public Buttons(int pos[], int size[], Bitmap bmp) {
		this.pos = pos;
		this.size = size;
		this.bmp = bmp;

	}

	public boolean clicked(int clickPos[]){
		if(clickPos[0]> pos[0] && clickPos[0]< pos[0]+size[0]){
			if(clickPos[1]> pos[1] && clickPos[1]< pos[1]+size[1]){

				return true;
			}
		}
		return false;

	}


	public void draw(Canvas canvas) {
	}


	public void setSize(int[] size) {
		this.size = size;
	}

	public int[] getSize() {
		return size;
	}

	public void setPos(int[] pos) {
		this.pos = pos;
	}

	public int[] getPos() {
		return pos;
	}

	public void setBmp(Bitmap bmp) {
		this.bmp = bmp;
	}

	public Bitmap getBmp() {
		return bmp;
	}
}
