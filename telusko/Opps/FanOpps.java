class Fan{
  boolean switchbtn;

  void On(){
    switchbtn=true;
  }

  void FanRunning(){
    if(switchbtn){
      System.out.println("Fan is running");
    }else{
      System.out.println("First switch on the fun to run");
    }
  }

  void off(){
    switchbtn=false;
  }
}
public class FanOpps {
  public static void main(String[] args) {
    Fan f=new Fan();
    f.On();
    f.FanRunning();
    f.off();
    f.FanRunning();
  }
  
}
