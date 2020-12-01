package introjunit;

public class Trainer {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNameUpperCase (){
        return name.toUpperCase();
    }

    public Trainer(String name) {
        this.name = name;
    }
}
