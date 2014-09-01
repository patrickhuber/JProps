package com.props.tests;
import com.props.*;
import static org.junit.Assert.*;
import java.lang.reflect.Field;
import org.junit.Test;

public class PropertyFixture {

	@Test
	public void testPersonGivenPropertyWhenFirstNameSetThenHasValue() {
		Person person = new Person(1);
		person.firstName.set("Patrick");
		assertEquals("Patrick", person.firstName.get());
	}

	@Test
	public void testPersonGivenReadOnlyPropertyWhenIdSetThenHasValue(){
		final int expectedPersonId = 12345;
		Person person = new Person(expectedPersonId);
		Integer idValue = person.id.get();
		assertTrue(expectedPersonId == idValue);
	}
	
	@Test
	public void testUserGivenPropertySetterWhenSetThenCanNotGetValue() 
			throws IllegalArgumentException, IllegalAccessException, NoSuchFieldException{
		final String firstSecret = "the sun is shining";		
		final int expectedUserId = 12345;
		User user = new User(expectedUserId, firstSecret);
		
		final String expectedSecret = "but the forcast is poor";
		user.secret.set(expectedSecret);
		
		IProperty<String> secret = getPrivateField(user, "_secret");
		assertTrue(expectedSecret == secret.get());
	}
	
	@SuppressWarnings("unchecked")
	private <T> T getPrivateField(Object obj, String fieldName) throws NoSuchFieldException, IllegalArgumentException, IllegalAccessException{
		Field f = obj.getClass().getDeclaredField(fieldName);
		f.setAccessible(true);
		return (T)f.get(obj);
	}
}
