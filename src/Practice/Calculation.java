package Practice;

public class Calculation {
    public static void main(String args[]) {

    }

    int z;
    int value;

    public Calculation(int value) {
        this.value = value;
    }
    public Calculation(int value, int z, String hello){
        this.value = value;
        this.z = z;

    }

    public int addition(int a, int b) {
        return z =a+b;
    }

    public int Substr(int a, int b) {
        return z =a-b;
    }

    public void display() {
        System.out.println("this is the parent class");
    }


    public static class My_Cal extends Calculation{


        public My_Cal(int value) {
            super(value);
            // TODO Auto-generated constructor stub
        }

        public int Multiply(int a, int b) {
            return z =a*b;
        }

        public void display(){
            System.out.println("this is the sub-class");
        }
        public void display2(){
            super.display();
        }
//        public void display(){
//            System.out.println("this is the sub-class");
//        }


        public  static void main(String args[]) {
            int a = 16;
            int b = 4;
            My_Cal obj1 = new My_Cal(3);

            obj1.addition(a, b);
            obj1.Substr(a, b);
            obj1.Multiply(a, b);

            obj1.display();
            obj1.display2();

        }


    }
//
//    static {
//        System.out.println(4);
//    }

}
