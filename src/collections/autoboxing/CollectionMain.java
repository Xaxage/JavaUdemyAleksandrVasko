package collections.autoboxing;

import java.util.Arrays;
import java.util.LinkedList;

public class CollectionMain {
    public static void main(String[] args) {
        String[] colors= new String[]{"Red","Green","Blue"};

        LinkedList<String> colorsList=new LinkedList<>(Arrays.asList(colors));
        //converting our array into the LinkedList
        colorsList.add(0,"Orange");//adding one more element in LinkedList

        colors=colorsList.toArray(new String[colorsList.size()]);
        //converting into the array
        for(String i: colors){
            System.out.println(i);
        }
    }
}
