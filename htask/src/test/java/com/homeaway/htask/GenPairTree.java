package com.homeaway.htask;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.junit.Test;

import com.homeaway.model.GenPair;

public class GenPairTree {

	public static final Log log = LogFactory.getLog( GenPairListTest.class );

	@Test
	@SuppressWarnings( { "rawtypes", "unchecked" } )
	public void test() {
		GenPair gp1 = new GenPair( null, null );
		GenPair gp2 = new GenPair( null, null );
		GenPair gp3 = new GenPair( null, null );
		GenPair gp4 = new GenPair( null, null );
		GenPair gp5 = new GenPair( null, null );

		GenPair list = new GenPair( null, null );
		
		printElementHashCode( "ELEMENT ADDED > " + list.add( gp1 ) + " ", gp1 );
		printElementHashCode( "ELEMENT ADDED > " + list.add( gp2 ) + " ", gp2 );
		printElementHashCode( "ELEMENT ADDED > " + list.add( gp3 ) + " ", gp3 );
		printElementHashCode( "ELEMENT ADDED > " + list.add( gp4 ) + " ", gp4 );
		printElementHashCode( "ELEMENT ADDED > " + list.add( gp5 ) + " ", gp5 );
		
		int size = list.size();
		
		log.info( "'List' size: " + size );
		
		GenPair element1 = list.get( size - 1 );
		
		printElementHashCode( "LAST ELEMENT (list.get(size - 1)) > ", element1 );
		
		GenPair gp6 = new GenPair( null, null );
		
		log.info( "ELEMENT ADDED > " + list.add( gp6 ) + ", HASHCODE: " + gp6.hashCode() );
		
		GenPair element2 = list.get( size );
		
		printElementHashCode( "LAST ELEMENT (list.get(size)) >", element2 );
	}
	
	@SuppressWarnings( "rawtypes" )
	public static final void printElementHashCode( String text, GenPair element ) {
		log.info( text + (element != null ? "OK" : "null") + ", HASHCODE: " + (element != null ? element.hashCode() : "null") );
	}
}