public class halfpyramid {
  public static void main(String[] args) {
    int n=4;
    for(int i=1;i<=n;i++){
      for(int outer=1;outer<=i;outer++){
        System.out.print(outer);
      }
      System.out.println();
    }
  }
}
