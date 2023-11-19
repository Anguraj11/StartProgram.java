package simpleCreate;

import java.util.*;
import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.sql.Date;

/**
 * This class contains the main method .
 * It calls a function called run() which is used to the entire program
 */
public class StartProgram{
	public static void main(String[] args)
	{
		RentSystem rentSystem =new RentSystem();
		rentSystem.run();
	}
}








