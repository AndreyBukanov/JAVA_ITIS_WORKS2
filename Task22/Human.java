
public class Human {

    private String name;
    private int age;

    public Human(String name, int age) {   
        this.name = name;
        this.age = age;
    }//end of Human construct

    public String getName() {
        return this.name;
    }//end of getName()

    public int getAge() {
        return this.age;
    }//end of getAge()

    @Override
    public String toString() {
        return this.name + " " + this.age;
    }//end of toString
}
