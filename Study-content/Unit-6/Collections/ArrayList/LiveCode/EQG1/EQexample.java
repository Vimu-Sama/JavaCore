import java.util.ArrayList ;
import java.util.List ;

class Order{

    static int currOrderNum = 1 ;
    int orderId ;
    String name ;
    int amount ;

    public Order(String name, int amount){
        orderId = currOrderNum ;
        currOrderNum++ ;
        this.name = name ;
        this.amount = amount ;
    }

    @Override
    public String toString(){
        return "\nOrder id-> " + orderId + "\nCustomer Name-> " + name + "\n Order Amount-> " + amount ;
    }
}

class LovelyCakesOrderSystem{
    List<Order> listOfOrders ;

    public LovelyCakesOrderSystem(){
        listOfOrders= new ArrayList<>() ;
    }

    public void AddOrder(Order order){
        listOfOrders.add(order) ;
    }

    public void RemoveOrder(){
        listOfOrders.removeFirst() ;
    }

    public void RemoveInCaseOfRuckus(int index){
        listOfOrders.remove(index) ;
    }

    public void PrintOrdersForUsers(){
        for(var order: listOfOrders){
            System.out.println(order.orderId) ;
        }
    }

    public void PrintAllDetails(){
        for(var order: listOfOrders){
            System.out.println(order) ;
        }
    }

}

public class EQexample {
    public static void main(String[] args) {
        LovelyCakesOrderSystem orderSystem= new LovelyCakesOrderSystem() ;
        orderSystem.AddOrder(new Order("Arpan", 20));
        orderSystem.AddOrder(new Order("Swapnaneel", 100));
        orderSystem.AddOrder(new Order("Mayank", 250));
        orderSystem.PrintOrdersForUsers();
        orderSystem.PrintAllDetails();
        orderSystem.RemoveOrder();
        orderSystem.PrintAllDetails();
    }
}
