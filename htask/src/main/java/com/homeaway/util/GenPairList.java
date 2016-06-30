package com.homeaway.util;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

import com.homeaway.model.GenPair;
@Deprecated
public class GenPairList< F, S > implements List< GenPair< F, S > > {

	private GenPair< F, S > genPairArray[];

	@Override
	public int size() {
		if( genPairArray != null ) {
			return genPairArray.length;
		}

		return 0;
	}
	
	@Override
	@SuppressWarnings( "unchecked" )
	public boolean add( GenPair< F, S > e ) {
		if( genPairArray == null ) {
			genPairArray = new GenPair[ 1 ];
			genPairArray[ 0 ] = e;

			return true;
		} else if( e != null ) {
			genPairArray = joinElement( genPairArray, e );
			return true;
		} else {
			return false;
		}
	}
	
	@Override
	public GenPair< F, S > get( int index ) {
		if( index > -1 && genPairArray != null && (index < (genPairArray.length)) ) {
			return genPairArray[ index ];
		}

		throw new IndexOutOfBoundsException( "Element at index: " + index + " doesn't exist" );
	}
	
	@SuppressWarnings( "rawtypes" )
	private static final GenPair [] joinElement( final GenPair [] array1, final GenPair... array2 ) {

		final GenPair [] joinedArray = new GenPair[ array1.length + array2.length ];

		System.arraycopy( array1, 0, joinedArray, 0, array1.length );
		System.arraycopy( array2, 0, joinedArray, array1.length, array2.length );

		return joinedArray;
	}

	@Override
	public boolean isEmpty() {
		throw new UnsupportedOperationException( "Not implemented yet" );
	}

	@Override
	public boolean contains( Object o ) {
		throw new UnsupportedOperationException( "Not implemented yet" );
	}

	@Override
	public Iterator< GenPair< F, S > > iterator() {
		throw new UnsupportedOperationException( "Not implemented yet" );
	}

	@Override
	public Object [] toArray() {
		throw new UnsupportedOperationException( "Not implemented yet" );
	}

	@Override
	public < T > T [] toArray( T [] a ) {
		throw new UnsupportedOperationException( "Not implemented yet" );
	}

	@Override
	public boolean remove( Object o ) {
		throw new UnsupportedOperationException( "Not implemented yet" );
	}

	@Override
	public boolean containsAll( Collection< ? > c ) {
		throw new UnsupportedOperationException( "Not implemented yet" );
	}

	@Override
	public boolean addAll( Collection< ? extends GenPair< F, S > > c ) {
		throw new UnsupportedOperationException( "Not implemented yet" );
	}

	@Override
	public boolean addAll( int index, Collection< ? extends GenPair< F, S > > c ) {
		throw new UnsupportedOperationException( "Not implemented yet" );
	}

	@Override
	public boolean removeAll( Collection< ? > c ) {
		throw new UnsupportedOperationException( "Not implemented yet" );
	}

	@Override
	public boolean retainAll( Collection< ? > c ) {
		throw new UnsupportedOperationException( "Not implemented yet" );
	}

	@Override
	public void clear() {
		throw new UnsupportedOperationException( "Not implemented yet" );
	}

	@Override
	public GenPair< F, S > set( int index, GenPair< F, S > element ) {
		throw new UnsupportedOperationException( "Not implemented yet" );
	}

	@Override
	public void add( int index, GenPair< F, S > element ) {
		throw new UnsupportedOperationException( "Not implemented yet" );
	}

	@Override
	public GenPair< F, S > remove( int index ) {
		throw new UnsupportedOperationException( "Not implemented yet" );
	}

	@Override
	public int indexOf( Object o ) {
		throw new UnsupportedOperationException( "Not implemented yet" );
	}

	@Override
	public int lastIndexOf( Object o ) {
		throw new UnsupportedOperationException( "Not implemented yet" );
	}

	@Override
	public ListIterator< GenPair< F, S > > listIterator() {
		throw new UnsupportedOperationException( "Not implemented yet" );
	}

	@Override
	public ListIterator< GenPair< F, S > > listIterator( int index ) {
		throw new UnsupportedOperationException( "Not implemented yet" );
	}

	@Override
	public List< GenPair< F, S > > subList( int fromIndex, int toIndex ) {
		throw new UnsupportedOperationException( "Not implemented yet" );
	}
}