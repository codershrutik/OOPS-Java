public class SmartKitchen{

    private CoffeeMaker brewMaster;
    private Refidgerator icebox;
    private DishWasher dishWasher;

    public SmartKitchen(){
        brewMaster = new CoffeeMaker();
        icebox = new Refidgerator();
        dishWasher = new DishWasher();
    }

    public CoffeeMaker getBrewMaster(){
        return brewMaster;
    }
    public Refidgerator getIceBox(){
        return icebox;
    }
    public DishWasher getDishWasher(){
        return dishWasher;
    }

    public void setKitchenState(boolean coffeeFlag, boolean fridgeFlag, boolean dishWasherFlag){
        
        brewMaster.setHasWorkToDo(coffeeFlag);
        icebox.setHasWorkToDo(fridgeFlag);
        dishWasher.setHasWorkToDo(dishWasherFlag);
    }

    public void doKitchenWork{
        brewMaster.brewCoffee();
        icebox.orderFood();
        dishWasher.doDishes();x
    }
}

class CoffeeMaker{

    private boolean hasWorkToDo;

    public void setHasWorkToDo(boolean hasWorkToDo){
        this.hasWorkToDo = hasWorkToDo;
    }

    public void brewCoffee(){
        if(hasWorkToDo){
            System.out.println("Brewing Coffee");
            hasWorkToDo = false;
        }
    }
}

class Refidgerator{

    private boolean hasWorkToDo;

    public void setHasWorkToDo(boolean hasWorkToDo){
        this.hasWorkToDo = hasWorkToDo;
    }

    public void orderFood(){
        if(hasWorkToDo){
            System.out.println("Ordering Food");
            hasWorkToDo = false;
        }
    }
}

class DishWater{

    private boolean hasWorkToDo;

    public void setHasWorkToDo(boolean hasWorkToDo){
        this.hasWorkToDo = hasWorkToDo;
    }

    public void doDishes(){
        if(hasWorkToDo){
            System.out.println("Washing Dishes");
            hasWorkToDo = false;
        }
    }
}