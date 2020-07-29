package collections.list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class ToDoList {
private LinkedList<String> toDoList=new LinkedList<>();
//We don't want anything to be connected to//our list , so we make them private.
    //We can use any type of parameter that extends class "Object".

    public void addToList(String task){
        //toDoList.add(task);//when adding "0" to 3-th element of the array [12345],
        //we get [123045]
        addInAlphabeticalOrder(task);
    }

    public void addToListAtPosition(int position,String task){
        toDoList.add(position,task);
    }

    public void printToDoList(){
        for(int i=0;i<toDoList.size();i++){
            System.out.println(i+" - " + toDoList.get(i));
        }
    }

    private boolean addInAlphabeticalOrder(String task){
        ListIterator<String> listIter = toDoList.listIterator();
        while(listIter.hasNext()){
        int compared=listIter.next().compareTo(task);
        /*The method returns 0 if the string is equal to the other string.A value less than 0
         is returned if the string is less than the other string (less characters)
         and a value greater than 0 if the string is greater
          than the other string (more characters).*/
            if(compared==0){
                System.out.println("Task already exist in the list ");
                return true;
            }
            else if(compared>0){
                listIter.previous();
                listIter.add(task);
                return true;
            }
        }
        toDoList.add(task);
        return true;
    }

    public void changeTask(int index,String task){
        toDoList.set(index, task);//when setting "0" to 3-th element of the array [12345],
        //we get [12305]
    }

    public void removeTask(String task){
        toDoList.remove(task);//Here remove works by finding object.
        // We can also use remove by finding index.
    }

    public int getTaskPriority(String task){//We want to know task's index
        return toDoList.indexOf(task);//returns us index(int).

    }

}
