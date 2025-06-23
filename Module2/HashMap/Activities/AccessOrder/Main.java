package Module2.HashMap.Activities.AccessOrder;


public class Main {
    public static void main(String[] args){
        AccessOrderLinkedHashMap lru = new AccessOrderLinkedHashMap(3);
        lru.put(1,new Student("1", "john", "Abraham", "hindi"));
        lru.put(2,new Student("2", "Allu", "Arjun", "Telugu"));
        lru.put(3,new Student("3", "Anubhab ", "Mohanty", "Odia"));
        lru.put(4,new Student("4", "Ntr", "jr.", "Telegu"));
        System.out.println(lru);
    }
}
