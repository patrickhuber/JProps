package com.props.tests;
import java.util.Date;

import com.props.*;

public class Person {
	private final IProperty<Integer> _id = new Property<Integer>();
	public final IPropertyGetter<Integer> id = _id;
	public final IProperty<String> firstName = new Property<String>();
	public final IProperty<String> lastName = new Property<String>();
	public final IProperty<Date> dateOfBirth = new Property<Date>();
	
	public Person(int id)
	{
		_id.set(id);
	}
}
