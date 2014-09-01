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

```CSharp
```

```Java
```

### Write Only Property Declaration 
#### (Aka, don't shoot yourself in the foot)

```CSharp
```

```Java
```
