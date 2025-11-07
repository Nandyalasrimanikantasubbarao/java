public class Npattern {
  public static void main(String[] args) {
    int n=5;
    for(int i=0;i<n;i++){
      for(int j=0;j<n;j++){
        if(j==0 || j==n-1 || j==i){
          System.out.print("* ");
        }else{
          System.out.print("  ");
        }
      }
      System.out.println();
    }
  }
  
}
