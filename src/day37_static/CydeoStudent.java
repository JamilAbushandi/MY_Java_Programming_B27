package day37_static;

import java.util.Arrays;

public class CydeoStudent {

    String name;
    String city;
    int group;

    static int batchNumber;
    static String schoolName;
    static String[] instructors; // static means one copy, belongs to class, all objects share. String[] type

    static {
        batchNumber = 27;
        schoolName = "Cydeo";
        instructors = new String[]{"Adam", "Asiya", "Saim"}; // created a new String array and assigned into the instructors reference
    }

    public CydeoStudent(String name, String city, int group){
        this.name = name;
        this.city = city;
        this.group = group;
    }

    public static void schoolInfo(){
        System.out.println(schoolName + " Batch " + batchNumber);
        System.out.println("Instructors: " + Arrays.toString(instructors));
    }

    @Override
    public String toString() {
        return "CydeoStudent{" +
                "name='" + name + '\'' +
                ", city='" + city + '\'' +
                ", group=" + group +
                '}';
    }
}
