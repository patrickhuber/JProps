# Java Properties
## Overview
The java properties package was created after long years of development on the .NET platform 
and missing c# property methods. 

## Examples
### Property Declaration

C# Person Class
```CSharp
public class Person
{
    public int Id{get;set;}
    public string FirstName{get;set;}
}
```

Java Equivalent Person Class
```Java
import com.props.*;
public class Person { 

    public final IProperty<Integer> id = new Property<Integer>();
    public final IProperty<String> firstName = new Property<String>();
}
```

### Read Only Property Declaration

C# Person Class
```CSharp
public class Person
{
    private int _id;
    
    public Person(int id)
    {
        _id = id;
    }
    
    public int Id { get { return _id; } }
    
    public string FirstName { get; set; }
}
```

Java Equivalent Person Class
```Java
import com.props.*;

public class Person {
    
    private IProperty<Integer> _id = new Property<Integer>();
    
    public Person(int id){
        _id.set(id);
    }
    
    public IPropertyGetter<Integer> id = _id;
    
    public IProperty<String> firstName = new Property<String>();
}
```

### Write Only Property Declaration 
(If you find a good reason for this, please let me know)

C# User Class
```CSharp
public class User
{
    private int _id;
    private string _secret;
    
    public User(int id, string secret)
    {
        _id = id;
        _secret = secret;
    }
    
    public int Id { get { return _id; } }
    public string Secret { set { _secret = value; } }
}
```

Java equivalent User Class
```Java
import com.props.*;

public class User {
	
	private final IProperty<Integer> _id = new Property<Integer>();
	private final IProperty<String> _secret = new Property<String>();
	
	public User(Integer id, String secret){
		_id.set(id);
		_secret.set(secret);
	}
	
	public final IPropertySetter<String> secret = _secret;
	public final IPropertyGetter<Integer> id = _id;
}
```
