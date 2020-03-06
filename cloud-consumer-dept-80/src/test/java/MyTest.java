public class MyTest {

    public static final String B_B = "aaa";


    public int compute() {
        int a = 1;
        int b = 2;
        int c = (a * b) * 10;
        return c;
    }

    public static void main(String[] args) {
        MyTest myTest = new MyTest();
        myTest.compute();
    }


}
