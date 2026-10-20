public class PersonTest 
{
    public static void main(String[] args) 
    {
        Person person1 = new Person("Sarahi quintero",28,"sarahi@gmail.com");
        Person person2 = new Person("nick white",11,"white@gmail.com");
        person1.setAge(29);

        String updatedName=person1.getName();
        int updatedAge=person1.getAge();
        System.out.println("Updated check via getter: "+updatedName+" is now "+ updatedAge);



        person1.displayInfo();
        person2.displayInfo();
    }
        
    }
    
