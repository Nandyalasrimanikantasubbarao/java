
public class Demo {
  public static void main(String a[]){
    int nums[]={3,7,2,4};
    nums[1]=6;
    System.out.println(nums[1]);

    // dynamically creating array
    int num[]=new int[4];
    num[0]=7;

    for(int i=0;i<4;i++){
      System.out.println(nums[i]);
      
    }
  }
  
}
