/**
 * to become... honestly I dont know where this is all going, Ill be dead before I accomplish anything worth a salary!
 * mcsippel@jeff:~$ cs12j_zodiac <<< "1982 11 11"
 *Libra ♎
 *Dog 狗
 *mcsippel@jeff:~$
 *
 * @Morgan Sippel A Good Student for CS 12J, mcsippel@jeff.cis.cabrillo.edu
 */

import java.util.Scanner;
import java.util.GregorianCalendar;

public class as03 {

    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);
        System.out.print("In what year were you born?: ");
        int year = userInput.nextInt();
        System.out.print("In what month were you born?: ");
        int month = userInput.nextInt();
        System.out.print("On what day of the month were you born?: ");
        int day = userInput.nextInt();

        GregorianCalendar birthdate = new GregorianCalendar(year, month, day);

        switch (month) {
        case 4:

            if (day <= 18)
                System.out.printf("Pisces \u2653\n");

            else if (day >= 19)
                System.out.printf("Aries \u2648\n");
            break;

        case 5:
            if (day <= 13)
                System.out.printf("Aries \u2648\n");

            else if (day >= 14)
                System.out.printf("Taurus \u2649\n");
            break;

        case 6:
            if (day <= 19)
                System.out.printf("Taurus \u2649\n");

            else if (day >= 20)
                System.out.printf("Gemini \u264A\n");
            break;

        case 7:
            if (day <= 20)
                System.out.printf("Gemini \u264A\n");

            else if (day >= 21)
                System.out.printf("Cancer \u264B\n");
            break;

        case 8:
            if (day <= 9)
                System.out.printf("Cancer \u264B\n");

            else if (day >= 10)
                System.out.printf("Leo \u264C\n");
            break;

        case 9:
            if (day <= 15)
                System.out.printf("Leo \u264C\n");

            else if (day >= 16)
                System.out.printf("Virgo \u264D\n");
            break;

        case 10:
            if (day <= 30)
                System.out.printf("Virgo \u264D\n");

            else if (day >= 31)
                System.out.printf("Libra \u264E\n");
            break;

        case 11:
            if (day <= 22)
                System.out.printf("Libra \u264E\n");


            else if (day >= 23)
                System.out.printf("Scorpius \u264F\n");


            else if (day <= 29)
                System.out.printf("Scorpius \u264F\n");

            else
                System.out.printf("Ophiucus \u26CE\n");
            break;


        case 12:
            if (day <= 17)
                System.out.printf("Ophiucus \u26CE\n");


            else if (day >= 18)
                System.out.printf("Sagittarius \u2650\n");
            break;

        case 1:
            if (day <= 18)
                System.out.printf("Sagittarius \u2650\n");

            else if (day >= 19)
                System.out.printf("Capricorn \u2651\n");
            break;

        case 2:
            if (day <= 15)
                System.out.printf("Capricorn \u2651\n");

            else if (day >= 16)
                System.out.printf("Aquarius \u2652\n");

        case 3:
            if (day <= 11)
                System.out.printf("Aquarius \u2652\n");

            else if (day >= 12)
                System.out.printf("Pisces \u2653\n");
            break;
        }

        switch (year % 12) {
        case 0:
            System.out.print("Monkey \u7334\n");
            break;
        case 1:
            System.out.print("Rooster \u96DE\n");
            break;
        case 2:
            System.out.print("Dog \u72D7\n");
            break;
        case 3:
            System.out.print("Pig \u732A\n");
            break;
        case 4:
            System.out.print("Rat \u9F8D\n");
            break;
        case 5:
            System.out.print("Ox \u725B\n");
            break;
        case 6:
            System.out.print("Tiger \u864E\n");
            break;
        case 7:
            System.out.print("Rabbit \u5154\n");
            break;
        case 8:
            System.out.print("Dragon \u9F8D\n");
            break;
        case 9:
            System.out.print("Snake \u86C7\n");
            break;
        case 10:
            System.out.print("Horse \u99AC\n");
            break;
        case 11:
            System.out.print("Goat \u7F8A\n");
            break;
        }
    }
}
