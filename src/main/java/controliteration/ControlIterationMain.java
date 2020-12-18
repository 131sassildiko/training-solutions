package controliteration;

public class ControlIterationMain {

    public void printWhile(){
        int count=1;
        while (count<3){
            System.out.println("Count is: "+count);
            count++;
        }
    }

    public void printFor (){
        for (int i=0; i<3; i++) {
            System.out.println(i);
        }
    }

    public void printItems (){
        String []numbers = {"zero", "one", "two"};
        for (String n:numbers) {
            System.out.println(n);
        }
    }

    public static void main(String[] args) {
        new ControlIterationMain().printWhile();

    }
}
