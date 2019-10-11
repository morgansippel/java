

public class Assignment06 {
  public static void main(String[] args) {
    int[] testValues = { 2, 4, 4, 4, 5, 5, 7, 9 };
    System.out.println("This should be 5: " + ArrayStatistics.mean(testValues));
    System.out.println("This should be 4.5: " + ArrayStatistics.median(testValues));
    System.out.println("This should be 4: " + ArrayStatistics.mode(testValues));
    System.out.println("This should be 2: " + ArrayStatistics.pstddev(testValues));
  }
}
