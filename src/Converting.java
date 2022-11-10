import java.util.Scanner;

public class Converting {

  public static float metricConverter(String sourceMetric, String targetMetric, float sourceNum) {
    float targetNum = 0;
    switch (sourceMetric) {
      case "km":
        switch (targetMetric) {
          case "m":
            targetNum = sourceNum * 1000;
            break;
          case "mile":
            targetNum = sourceNum / (float) 1.6;
            break;
        }
        case "mm":
        switch (targetMetric) {
          case "in":
            targetNum = sourceNum * (float) 0.039370;
            break;
        }
        case "kg":
        switch (targetMetric) {
          case "lb":
            targetNum = sourceNum * (float) 2.2046;
            break;
        }
        case "m":
        switch (targetMetric) {
          case "ft":
            targetNum = sourceNum * (float) 3.2808;
            break;
        }
        case "cm":
        switch (targetMetric) {
          case "in":
            targetNum = sourceNum * (float) 0.39370;
            break;
        }
      case "Nothing":
        break;
      default:
        System.out.println("Your input is not handled, please try again");
        return targetNum;
    }
    System.out.printf("%.2f %s = %.2f %s%n" , sourceNum, sourceMetric, targetNum,targetMetric);    
    return targetNum;
  

  }

  public static void main(String[] args) throws Exception {
    System.out.println("Welcome to Metric Converter!\nAvailable operations:\nkm to m or mile\nmm to in\ncm to in\nkg to lg\nm to ft");
    Scanner scanner = new Scanner(System.in);
    String str;
    String[] strArray;
    float sourceNum;
    String sourceMetric;
    String targetMetric;
    while (true) {
      System.out.println("please input your metric to be converted, for example, 1kg = 1b");
      str = scanner.nextLine();
      if (str.equals("exit")) {
        System.out.println("Thank you. Goodbye!");
        scanner.close();
        break;
      }
      strArray = str.split(" ");
      if (strArray.length != 4) {
        System.out.println("Your input is not valid. Please try again");
        continue;
      } else {
        sourceNum = Float.parseFloat(strArray[0]);
        sourceMetric = strArray[1];
        targetMetric = strArray[3];
        metricConverter(sourceMetric, targetMetric, sourceNum);
      }
    }
    scanner.close();
  }
}
