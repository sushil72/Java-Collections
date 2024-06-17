import java.util.ArrayList;

class LearningCollections{
    
    public static void main(String[] args) {
        ArrayList<String> list=new ArrayList<>();
        list.add("Susheel");
        list.add("Alok");
        list.add("Alok");
        list.add("Alok");
        list.add(2,"suprashiddha");
        System.out.println(list);

//         Retrieve the first and last element of the ArrayList.
        // System.out.println(list.get(0));
        // System.out.println(list.get(list.size()-1));
// Change the second element of the ArrayList to a new value.
        // list.set(1,"sushil");

        // Remove the element at index 2.
        // list.remove(2);
        // Remove a specific element by value.
            list.remove("Susheel");
            // System.out.println(list.contains("Alok"));
            // System.out.println("is Empty"+list.isEmpty());

            System.out.println("size :"+ list.size());
            list.clear();
            
            System.out.println(list);
            System.out.println("size :"+ list.size());

        System.out.println(list);
    }
}