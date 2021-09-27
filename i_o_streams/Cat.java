import java.io.Serializable;

public class Cat implements Serializable {
    // to be added when an attribute is removed/added
    public static final long serialVersionUID = 1; 
    
    String name;
    int age;
    int weight = 4;
    
    public Cat (String name, int age){
        this.name = name;
        this.age = age;
    }
    
    @Override
    public String toString(){
        return " " + name + " " + age + " " + weight;
    }
    
}