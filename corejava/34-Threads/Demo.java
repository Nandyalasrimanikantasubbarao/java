// class A extends Thread{
//   public void run(){
//     for(int i=1;i<=10;i++){
//       System.out.println("hi");
//       try{

//         Thread.sleep(10);
//       }catch(InterruptedException e){
//         e.printStackTrace();
//       }
//     }
//   }
// }
// class B extends Thread{
//   public void run(){
//     for(int i=1;i<=10;i++){
//       System.out.println("hello");
//       try{

//         Thread.sleep(10);
//       }catch(InterruptedException e){
//         e.printStackTrace();
//       }
//     }
//   }
// }
// public class Demo {
//   public static void main(String[] args) {
//     A obj1=new A();
//     B obj2=new B();
    
//     obj1.start();
//     try{
    
//       Thread.sleep(2);
//     }catch(InterruptedException e){
//       e.printStackTrace();
//     }

//     obj2.start();
//   }
  
// }


////other why of creating threads

// public class Demo {
//   public static void main(String[] args) {
//     Runnable obj1=()->
//     {
//       for(int i=1;i<=10;i++)
//         {
//         System.out.println("hi");
//         try{

//           Thread.sleep(10);
//         }catch(InterruptedException e){
//           e.printStackTrace();
//         }
//       }

//     };

//     Runnable obj2=()->
//     {
//       for(int i=1;i<=10;i++)
//         {
//         System.out.println("hello");
//         try{

//           Thread.sleep(10);
//         }catch(InterruptedException e){
//           e.printStackTrace();
//         }
//       }

//     };


//     Thread t1=new Thread(obj1);
//     Thread t2=new Thread(obj2);


//     t1.start();
//     t2.start();
//   }
  
// }

class Counter{
  int count;
  public void increment(){
    count++;
    // System.out.println(count);
  }
}
public class Demo {
  public static void main(String[] args) throws InterruptedException{

    Counter c=new Counter();
    Runnable obj1=()->
    {
      for(int i=1;i<=10;i++){
        c.increment();
        
        
        
      }
      
    };
    
    Runnable obj2=()->
    {
      for(int i=1;i<=10;i++)
      {
          c.increment();
        
      }

    };


    Thread t1=new Thread(obj1);
    Thread t2=new Thread(obj2);


    t1.start();
    t2.start();

    
    
    t1.join();
    t2.join();
    
    System.out.println(c.count);
  }
}