public class PersonTest 
{
    public static void main(String[] args) 
    {
        Person person1 = new Person();
        person1.setName("Sarahi quintero");
        person1.setAge(28);
        person1.setEmail("quintero@gmail.com");

        Person person2 = new Person("Bob", 87, "bob87@gmail.com");

        person2.setName("donald Junior");
        person2.setAge(34);
        person2.setEmail("donaldJunior@gmail.com");

        person1.displayInfo();
        person2.displayInfo();
    }
        
    }
    
