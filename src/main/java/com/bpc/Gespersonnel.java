package com.bpc;

import javax.swing.*;

/**
*Gespernonnel.java - Point d'entrée du programme (contient le "main")
*@author Jacques André Augustin
*@version 1.0
*/

public class Gespersonnel {

	public static void main(String args[])
	{
		try
		{
			UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
		}
		catch(Exception e)
		{
		}
		GespersonnelInterface prog = new GespersonnelInterface();		
		prog.lancer();
	}

}

