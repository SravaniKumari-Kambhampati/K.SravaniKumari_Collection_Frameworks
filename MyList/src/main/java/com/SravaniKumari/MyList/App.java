package com.SravaniKumari.MyList;

import org.apache.logging.log4j.*;
public class App 
{
	private static final Logger logger = LogManager.getLogger(App.class);
    public static void main( String[] args )
    {
    	Integer[] array= {23,45};
    	MyList<Integer> list = new MyList<Integer>(array);
    	list.add(23);
    	logger.debug(list);
    }
}