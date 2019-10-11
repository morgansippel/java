import java.util.Arrays;

/**
 * This is my solution to the Array Statistics assignment in CS 12J.
 * 
 * @author A student in CS 12J, someone@somewhere.something
 */
public class ArrayStatistics {

  /**
   * Calculates the arithmetic mean of the values in an array, to the precision allowed by the
   * double type.
   * 
   * @param data the values to analyze, all nonnegative, sorted in ascending order, guaranteed to be
   *        of length >= 1
   * @return the arithmetic mean of the values, to double precision
   */



  public static double mean(int[] testValues) {

    // TODO: Implement this method


    int sum = 0;
    for (int n : testValues) {
      sum += n;
    }
    double mean = (double) sum / testValues.length;
    return mean;
  }

  /**
   * Calculates the median of the values in an array, to the precision allowed by the double type.
   * The median is the middle value. If there is no middle value, the median is the mean of the two
   * middle values.
   * 
   * @param data the values to analyze, all nonnegative, sorted in ascending order, guaranteed to be
   *        of length >= 1
   * @return the median of the values, to double precision
   */

  public static double median(int[] testValues) {
    Arrays.parallelSort(testValues);
    if (testValues.length % 2 != 0) {
      return (double) testValues[testValues.length / 2];
    } else {
      return (testValues[testValues.length / 2] + testValues[testValues.length / 2 - 1]) / 2.0;
    }
  }

  /**
   * Calculates the mode of the values in an array, The mode is the value that appears most often.
   * If there is no unique mode, choose the smallest of the set.
   * 
   * @param data the values to analyze, all nonnegative, sorted in ascending order, guaranteed to be
   *        of length >= 1
   * @return the mode of the values
   */
  public static int mode(int[] testValues) {

    /**
     * Calculates the population standard deviation of the values in an array, to the precision
     * allowed by the double type. The population standard deviation is the square root of the mean
     * of the squared difference between each value and the mean value. See:
     * https://en.wikipedia.org/wiki/Standard_deviation
     * 
     * @param data the values to analyze, all nonnegative, sorted in ascending order, guaranteed to
     *        be of length >= 1
     * @return the population standard deviation of the values
     */

    int mode = -1;
    int maxAppearances = -1;

    for (int i = 0; i < testValues.length; i++) {

      int count = 0;

      for (int j = 0; j < testValues.length; j++) {
        if (testValues[i] == testValues[j])
          count++;
      }

      if (count > maxAppearances) {

        mode = testValues[i];
        maxAppearances = count;
      }


    }
    return mode;
  }

  public static double pstddev(int[] testValues) {
    double sum = 0;
    for (double n : testValues) {
      sum += n;
    }
    double mean = ((double) sum / testValues.length);
    double newSum = 0;
    for (double n : testValues) {
      double difference = n - mean;
      double square = difference * difference;
      newSum += square;
    }
    double result = newSum / testValues.length;
    double standardDeviation = Math.sqrt(result);
    return standardDeviation;
  }
}

