package com.homeaway.htask;

import java.math.BigDecimal;
import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.junit.Test;

import com.homeaway.model.GenPair;
import com.homeaway.util.GenPairList;

/**
 *  
 **/
public class GenPairListTest {

	public static final Log log = LogFactory.getLog( GenPairListTest.class );

	@Test
	public void test() {
		log.info( "Basic test..." );

		List< GenPair< Type1, Type2 > > list = getInnerTypesMockList();

		int size = list.size();
		log.info( "Last element index (size - 1): " + (size - 1) );
		log.info( "Last element (list.get(size - 1)): " + list.get( size - 1 ) );

		boolean added = list.add( new GenPair< Type1, Type2 >( new Type1( 20, "Type1, Element: 20" ), new Type2( 20, "Type2, Element: 20" ) ) );

		log.info( "Added element: " + added );
		log.info( "Last element (list.get(size)): " + list.get( size ) );
	}

	@Test
	public void testListWithInnerTypes() {
		log.warn( "ooo Testing Generic Pair class 'GenPair< F, S >' with inner types" );

		List< GenPair< Type1, Type2 > > list = getInnerTypesMockList();

		for( int i = 0; i < list.size(); i++ ) {
			log.info( "Element at: " + i + " > " + list.get( i ) );
		}
	}

	@Test
	public void testListWithJavaTypes() {
		log.warn( "ooo Testing Generic Pair class 'GenPair< F, S >' with java types" );

		List< GenPair< String, BigDecimal > > list = getJavaTypesMockList();

		for( int i = 0; i < list.size(); i++ ) {
			log.info( "Element at: " + i + " > " + list.get( i ) );
		}
	}

	public static final List< GenPair< String, BigDecimal > > getJavaTypesMockList() {
		List< GenPair< String, BigDecimal > > genListImpl = new GenPairList< String, BigDecimal >();
		genListImpl.add( new GenPair< String, BigDecimal >( "String type 0", new BigDecimal( "0.00" ) ) );
		genListImpl.add( new GenPair< String, BigDecimal >( "String type 1", new BigDecimal( "0.01" ) ) );
		genListImpl.add( new GenPair< String, BigDecimal >( "String type 2", new BigDecimal( "0.02" ) ) );
		genListImpl.add( new GenPair< String, BigDecimal >( "String type 3", new BigDecimal( "0.03" ) ) );
		genListImpl.add( new GenPair< String, BigDecimal >( "String type 4", new BigDecimal( "0.04" ) ) );
		genListImpl.add( new GenPair< String, BigDecimal >( "String type 5", new BigDecimal( "0.05" ) ) );
		genListImpl.add( new GenPair< String, BigDecimal >( "String type 6", new BigDecimal( "0.06" ) ) );
		genListImpl.add( new GenPair< String, BigDecimal >( "String type 7", new BigDecimal( "0.07" ) ) );
		genListImpl.add( new GenPair< String, BigDecimal >( "String type 8", new BigDecimal( "0.08" ) ) );
		genListImpl.add( new GenPair< String, BigDecimal >( "String type 9", new BigDecimal( "0.09" ) ) );
		genListImpl.add( new GenPair< String, BigDecimal >( "String type 10", new BigDecimal( "0.10" ) ) );
		genListImpl.add( new GenPair< String, BigDecimal >( "String type 11", new BigDecimal( "0.11" ) ) );
		genListImpl.add( new GenPair< String, BigDecimal >( "String type 12", new BigDecimal( "0.12" ) ) );
		genListImpl.add( new GenPair< String, BigDecimal >( "String type 13", new BigDecimal( "0.13" ) ) );
		genListImpl.add( new GenPair< String, BigDecimal >( "String type 14", new BigDecimal( "0.14" ) ) );

		return genListImpl;
	}

	public static final List< GenPair< Type1, Type2 > > getInnerTypesMockList() {
		List< GenPair< Type1, Type2 > > genListImpl = new GenPairList< Type1, Type2 >();

		log.info( "Size before adding elements: " + genListImpl.size() );

		genListImpl.add( new GenPair< Type1, Type2 >( new Type1( 0, "Type1, Element: 0" ), new Type2( 0, "Type2, Element: 0" ) ) );
		genListImpl.add( new GenPair< Type1, Type2 >( new Type1( 1, "Type1, Element: 1" ), new Type2( 1, "Type2, Element: 1" ) ) );
		genListImpl.add( new GenPair< Type1, Type2 >( new Type1( 2, "Type1, Element: 2" ), new Type2( 2, "Type2, Element: 2" ) ) );
		genListImpl.add( new GenPair< Type1, Type2 >( new Type1( 3, "Type1, Element: 3" ), new Type2( 3, "Type2, Element: 3" ) ) );
		genListImpl.add( new GenPair< Type1, Type2 >( new Type1( 4, "Type1, Element: 4" ), new Type2( 4, "Type2, Element: 4" ) ) );
		genListImpl.add( new GenPair< Type1, Type2 >( new Type1( 5, "Type1, Element: 5" ), new Type2( 5, "Type2, Element: 5" ) ) );
		genListImpl.add( new GenPair< Type1, Type2 >( new Type1( 6, "Type1, Element: 6" ), new Type2( 6, "Type2, Element: 6" ) ) );
		genListImpl.add( new GenPair< Type1, Type2 >( new Type1( 7, "Type1, Element: 7" ), new Type2( 7, "Type2, Element: 7" ) ) );
		genListImpl.add( new GenPair< Type1, Type2 >( new Type1( 8, "Type1, Element: 8" ), new Type2( 8, "Type2, Element: 8" ) ) );
		genListImpl.add( new GenPair< Type1, Type2 >( new Type1( 9, "Type1, Element: 9" ), new Type2( 9, "Type2, Element: 9" ) ) );
		genListImpl.add( new GenPair< Type1, Type2 >( new Type1( 10, "Type1, Element: 10" ), new Type2( 10, "Type2, Element: 10" ) ) );
		genListImpl.add( new GenPair< Type1, Type2 >( new Type1( 11, "Type1, Element: 11" ), new Type2( 11, "Type2, Element: 11" ) ) );
		genListImpl.add( new GenPair< Type1, Type2 >( new Type1( 12, "Type1, Element: 12" ), new Type2( 12, "Type2, Element: 12" ) ) );
		genListImpl.add( new GenPair< Type1, Type2 >( new Type1( 13, "Type1, Element: 13" ), new Type2( 13, "Type2, Element: 13" ) ) );
		genListImpl.add( new GenPair< Type1, Type2 >( new Type1( 14, "Type1, Element: 14" ), new Type2( 14, "Type2, Element: 14" ) ) );

		return genListImpl;
	}

	public static final class Type1 {
		private int		id1;
		private String	property2;

		public Type1( int id1, String property2 ) {
			super();
			this.id1 = id1;
			this.property2 = property2;
		}

		public int getId1() {
			return id1;
		}

		public void setId1( int id1 ) {
			this.id1 = id1;
		}

		public String getProperty2() {
			return property2;
		}

		public void setProperty2( String property2 ) {
			this.property2 = property2;
		}

		@Override
		public String toString() {
			return "Type1 [id1=" + id1 + "]";
		}
	}

	public static final class Type2 {
		private int		id2;
		private String	property1;

		public Type2( int id2, String property1 ) {
			super();
			this.id2 = id2;
			this.property1 = property1;
		}

		public int getId2() {
			return id2;
		}

		public void setId2( int id2 ) {
			this.id2 = id2;
		}

		public String getProperty1() {
			return property1;
		}

		public void setProperty1( String property1 ) {
			this.property1 = property1;
		}

		@Override
		public String toString() {
			return "Type2 [id2=" + id2 + "]";
		}
	}
}