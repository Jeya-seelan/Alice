import java.util.*;
class Alice{
 public static void main(String args[]){
  Scanner in = new Scanner(System.in);
  int n,p=0;
  n = in.nextInt();
  System.out.printf("Alice must go in path-%d",((n%10)+(n/10)));
 }
}