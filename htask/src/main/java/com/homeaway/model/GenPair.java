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
}