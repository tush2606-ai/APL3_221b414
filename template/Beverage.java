abstract class Beverage{
    private void Pour(int qty){
        System.out.println("Pour"+ qty +" ml of Beverage in a glass");
    }
    
    protected abstract void addCondimemt();
    
    protected void Stir(){}
    
    private void Serve(){
        System.out.println("Serve through Waiter");
    }
    
    public void templateMethod(int qty){
        Pour(qty);
        addCondimemt();
        Stir();
        Serve();
    }
}