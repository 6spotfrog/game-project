package com.game.window;

import java.awt.Canvas;

public class Game extends Canvas implements Runnable{

	private static final long serialVersionUID = -122979726721218831L;

	private boolean running = false;
	private Thread thread;
	
	public synchronized void start(){
		if(running)
			return;
		
		running = true;
		thread = new Thread(this);
		thread.start();
	}
	
	public void run()
	{
		System.out.println("thread has begun");
	}
	
	public static void main(String args[]){
		new Window(800,600, "game project", new Game());
	}
}
