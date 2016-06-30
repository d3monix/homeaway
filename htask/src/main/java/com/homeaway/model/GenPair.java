package com.homeaway.model;

public class GenPair< F, S > {
	
	private F	firstElement;
	private S	secundElement;

	public GenPair( F firstElement, S secundElement ) {
		super();
		this.firstElement = firstElement;
		this.secundElement = secundElement;
	}

	public F getFirstElement() {
		return firstElement;
	}

	public void setFirstElement( F firstElement ) {
		this.firstElement = firstElement;
	}

	public S getSecundElement() {
		return secundElement;
	}

	public void setSecundElement( S secundElement ) {
		this.secundElement = secundElement;
	}

	@Override
	public String toString() {
		return "GenPair [firstElement=" + firstElement + (firstElement != null ? " class=" + firstElement.getClass().getSimpleName() : "") + ", secundElement=" + secundElement
				+ (secundElement != null ? " class=" + secundElement.getClass().getSimpleName() : "") + "]";
	}
	
	@SuppressWarnings( { "rawtypes", "unchecked" } )
	public int size() {
		return size( ((GenPair< GenPair, GenPair >)this).getSecundElement() );
	}
	

	@SuppressWarnings( "rawtypes" )
	public int add( GenPair genPair ) {
		return add( genPair, this );
	}
	
	@SuppressWarnings( "rawtypes" )
	public GenPair get( int index ) {
		return get( index, this );
	}
	
	@SuppressWarnings( { "unchecked", "rawtypes" } )
	private int size( GenPair< GenPair, GenPair > genPair ) {
		return (genPair != null ? 1 + size( genPair.getSecundElement() ) : 0);
	}

	@SuppressWarnings( { "unchecked", "rawtypes" } )
	private int add( GenPair genPair, GenPair tree ) {
		if( tree != null ) {
			if( tree.getSecundElement() != null ) {
				return 1 + add( genPair, (GenPair)tree.getSecundElement() );
			} else {
				tree.setSecundElement( genPair );
				return 1;
			}
		}

		return 0;
	}
	
	@SuppressWarnings( "rawtypes" )
	private GenPair get( int index, GenPair tree ) {
		if( tree != null && index > -1 ) {
			int search = 0;

			GenPair searchedGenPair = (GenPair)tree.getSecundElement();
		
			while( searchedGenPair != null && search <= index ) {
				if( search == index ) {
					return searchedGenPair;
				}
				
				searchedGenPair = (GenPair)searchedGenPair.getSecundElement();
				search++;
			}
		}

		return null;
	}
}