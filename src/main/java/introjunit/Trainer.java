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
        return name.toLowerCase();
    }

    public Trainer(String name) {
        this.name = name;
    }
}
