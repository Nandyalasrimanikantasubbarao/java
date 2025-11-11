class Book{
  private int pageNum;

  void setPageNum(int pageNo) {
    if(pageNo>=0){

      pageNum = pageNo;
    }else{
      System.out.println("please enter greater than zero numbers");
    }
  }

  int getPageNum() {
    return pageNum;
  }

  void disp(){
    System.out.println("Java and Inheritance is present in page Number: "+pageNum);
  }
}
public class Fundamental {
  public static void main(String[] args) {
    Book b=new Book();


    b.setPageNum(33);
    b.disp();

    System.out.println(b.getPageNum());
  }
  
}
