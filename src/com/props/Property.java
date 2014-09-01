package com.props;

public class Property<T> implements IProperty<T> {
	private T value;

	public Property(){
	}
	
	public Property(T value){
		set(value);
	}
	
	/* (non-Javadoc)
	 * @see com.props.IReadOnlyProperty#get()
	 */
	@Override
	public T get() {
		return value;
	}

	/* (non-Javadoc)
	 * @see com.props.IWriteOnlyProperty#set(T)
	 */
	@Override
	public void set(T value) {
		this.value = value;
	}	
}
