package com.game.window;

import java.awt.Canvas;

public class Game extends Canvas implements Runnable{

	private static final long serialVersionUID = -122979726721218831L;

	public void run()
	{
		
	}
	
	public static void main(String args[]){
		new Window(800,600, "game project", new Game());
	}
}
