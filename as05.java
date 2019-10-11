import java.util.Scanner;

public class as05 {

  public static void main (String[] args) {

    String dateMax = "";
    String dateMin = "";
    String timeMax = "";
    String timeMin = "";
    int maxTemp = Integer.MIN_VALUE;
    int minTemp = Integer.MAX_VALUE;
    int count = 0;
    int sum = 0;

    Scanner stdin = new Scanner(System.in);
    while (stdin.hasNext()) {
      String date = stdin.next();
      String time = stdin.next();
      int value = stdin.nextInt();
      count ++;
      sum += value;
      // TODO: Decide whether (and if so, where) to store this date, time and value
      if (value > maxTemp) {
          maxTemp = value;
          dateMax = date;
          timeMax = time;
        } //end if
      if (value < minTemp) {
          minTemp = value;
          dateMin = date;
          timeMin = time;
        } //end if

      }
      System.out.println("Count: " + count);
      System.out.println("Minimum: " + minTemp + " @ " + dateMin + timeMin);
      System.out.println("Maximum: " + maxTemp + " @ " + dateMax + timeMax);
      float average = (float) sum / (float) count;
      System.out.println("Average: " + average);
    }

  }
