class Main extends AbstractDemo {
  @Override
  public void print(){
    System.out.println("Its a print");
  }
  public static void main(String[] args) {
    Main obj = new Main();
    obj.print();
    obj.display();
  }
}