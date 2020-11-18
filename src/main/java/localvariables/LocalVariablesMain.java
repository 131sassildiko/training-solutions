package localvariables;

public class LocalVariablesMain {
    public static void main(String[] args) {
        boolean b;
        b=false;
        System.out.println(b);

        int a = 2;
        int i = 3;
        int j = 4;

        int k = i;

        double d = 3.14;
        d=i;
        i= (int) d;


        String s = "Hello World";
        String t = s;

        {
            int x = 0;
        System.out.println(x);

    }
    }
}
