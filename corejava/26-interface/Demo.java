// class to class ->extends
// class to interface ->implements
// interface to interface ->extends
interface A {
  void show(); //by default all methods are public abstaract in interface
  void config(); 
}

class B implements A{
  public void show() {
    System.out.println("in show");
  }

  
  public void config() {
    System.out.println("in congfig");
  }
  

}

class Demo {
  public static void main(String[] args) {
    A obj =new B();
    obj.config();
  }
  
}
