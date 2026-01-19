
class Producer extends Thread{
  Queue q;
  int i=1;
  public Producer(Queue q){
    this.q=q;
  }
  public  void run(){

    while(true){
      q.produce(i++);
      
    }
  }
}

class Consumer extends Thread{
  Queue q;
  public Consumer(Queue q){
    this.q=q;
  }
  public void run(){

    while(true){
      q.consume();
      
    }
  }

}

class Queue {
  int data;
  boolean flag=false;

  synchronized public void produce(int i){
    try{
      if(flag==true){
        wait();
        System.out.println("producer waiting satate");
      }else{
        data=i;
        System.out.println("I Have Produced Data "+data);
        flag=true;
        notify();
      }
    }catch(Exception e){
      e.printStackTrace();
    }
  }
  
  synchronized public void consume(){
    try{
      if(flag==false){
        wait();
        System.out.println("consumer waiting state");
      }else{

        System.out.println("I Have Consumed Data "+data);
        flag=false;
        notify();
      }
    }catch(Exception e){
      e.printStackTrace();

    }
  }

}
public class Demo {
  public static void main(String[] args) {
    Queue q=new Queue();

    Producer prod=new Producer(q);
    Consumer c=new Consumer(q);

    // new Producer(q).start();

    prod.start();
    c.start();
  }
  
}
