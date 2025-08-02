public class GetterAndSetterMethods {

    /*
    Encapsulation is a principle of hiding internal data of a class &
    only exposing what is necessary through controlled access.
     */

    //An object for this class has been created in Main.java file
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(name != null)
            this.name = name;
        else
            System.out.println("Name can't be null");
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age >= 0)
            this.age = age;
        else
            System.out.println("Age can't be negative");
    }

    @Override
    public String toString() {
        return "{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

}

