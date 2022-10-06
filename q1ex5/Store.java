
package q1ex5;
import java.util.*;

public class Store {
  private String name;
  private double earnings;
  private ArrayList<Item> itemList;
  private static ArrayList<Store> storeList = new ArrayList();

  public Store(String name){
      this.name = name;
      this.earnings = 0;
      this.itemList = new ArrayList();
      Store.storeList.add(this);
  }

  public String getName(){
    return name;
  }
  public double getEarnings(){
    return earnings;
  }
  public void sellItem(int index){
    // check if index is within the size of the itemList (if not, print statement that there are only x items in the store)
    // get Item at index from itemList and add its cost to earnings
    // print statement indicating the sale
    if((index > 0)&&(index<this.itemList.size())){
        this.earnings += this.itemList.get(index).getCost();
        return;
    }
    System.out.println("There are only "+ this.itemList.size()+" items in the store");
  }
  public void sellItem(String name){
      
  }
  public void sellItem(Item i){
    // check if Item i exists in the store (there is a method that can help with this) (if not, print statement that the store doesn't sell it)
    // get Item i from itemList and add its cost to getEarnings
    // print statement indicating the sale
  }
  public void addItem(Item i){
    this.itemList.add(i);
  }
  public void filterType(String type){
    this.itemList.forEach((e) ->{ 
            if(e.getType().equalsIgnoreCase(type)){
                System.out.println(e);
            }
    });
  
  }
  public void filterCheap(double maxCost){
    // loop over itemList and print all items with a cost lower than or equal to the specified value   
    this.itemList.forEach((e) ->{ 
            if(e.getCost()<maxCost){
                System.out.println(e.getName());
            }
    });
  }
  public void filterExpensive(double minCost){
    // loop over itemList and print all items with a cost higher than or equal to the specified value
  
    this.itemList.forEach((e) ->{ 
            if(e.getCost()>minCost){
                System.out.println(e.getName());
            }
    });
  }
  public static void printStats(){
    // loop over storeList and print the name and the earnings'Store.java'

  }
}
