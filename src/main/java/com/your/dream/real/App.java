package com.your.dream.real;

/**
 * Hello world!
 *
 */
public class App 
{
	private App() 
	{
		// do not create App class directly
	}
	
    public static void main( String[] args ) {
    	AppController appController = new AppController();
    	appController.run();
    }
}
