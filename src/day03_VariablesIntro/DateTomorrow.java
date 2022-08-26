package day03_VariablesIntro;

public class DateTomorrow {
    public static void main(String[] args) {

        /*
             declare and assign 3 variables(numbers)
             month, day, year

             print the date in this format:
                Date: month \ day \ year

                also update the day for tomorrow date
                print tomorrow's date in this format:
                    Tomorrow's Date: month \ day \ year
         */

        int month = 6;
        int day = 13;
        int year = 2022;
        System.out.println(month + "\\" + day + "\\" + year);

        int mon, dy, yer;  // made 3 variables, all of them are int type
        mon = 6;
        dy = 13;
        yer = 2022;

        // alternative declaration and assignment:
        System.out.println("Date: "+ mon + "\\" + dy + "\\" + yer);
        // show date for tomorrow
        dy = 14;
        System.out.println("Tomorrows Date: " + mon + "\\" + dy + "\\" + yer);

    }
}
