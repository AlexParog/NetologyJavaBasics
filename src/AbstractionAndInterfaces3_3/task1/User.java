package AbstractionAndInterfaces3_3.task1;

public class User {
    private String name;

    public User(String name){
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "имя " +  name;
    }
}
