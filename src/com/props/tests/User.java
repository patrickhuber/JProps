package com.props.tests;

import com.props.*;


public class User {
	
	private final IProperty<Integer> _id = new Property<Integer>();
	public final IPropertyGetter<Integer> id = _id;
	
	private final IProperty<String> _secret = new Property<String>();
	public final IPropertySetter<String> secret = _secret;
	
	public User(Integer id, String secret){
		_id.set(id);
		_secret.set(secret);
	}
}
