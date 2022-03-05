package com;

public class Thr extends Thread
{
 	public void run()
 	{
  		System.out.println("concurrent thread started running..");
}
 	public static void main( String args[] )
 	{
  		Thr mt = new  Thr();
  		mt.start();
 	}
}
