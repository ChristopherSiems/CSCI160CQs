import java.util.List;
import java.util.Comparator;

class Result {
  public static void miniMaxSum(List<Integer> arr) {
    arr.sort(new Comparator<Integer>() {
      public int compare(Integer num1, Integer num2){
        return num1 - num2;
    }});
    System.out.println(((long) arr.get(0) + arr.get(1) + arr.get(2) + arr.get(3)) + " " + 
      ((long) arr.get(4) + arr.get(3) + arr.get(2) + arr.get(1)));
}}