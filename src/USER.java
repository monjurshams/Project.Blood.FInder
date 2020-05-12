public class USER {
private String name,age,number;


public USER(String name, String age, String number)
{
    this.name=name;
    this.age=age;
    this.number=number;
}

private void setNUMBER(String number) {
    // TODO Auto-generated method stub
    this.number=number;
}

public void setAge(String age) {
    // TODO Auto-generated method stub
    this.age = age;
}

public void setName(String Name) {
    // TODO Auto-generated method stub
    this.name = name;
}

public String getName()
{
    return name;
}

public String getAge()
{
    return age;
}

public String getNumber()
{
    return number;
}


}