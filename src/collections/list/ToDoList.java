package collections.list;

import java.util.ArrayList;
import java.util.List;

public class ToDoList {
private List<String> toDoList=new ArrayList<>();//We don't want anything to be connected to
    //our list , so we make them private.

    public void addToList(String task){
        toDoList.add(task);//when adding "0" to 3-th element of the array [12345],
        //we get [123045]
    }

    public void addToListAtPosition(int position,String task){
        toDoList.add(position,task);
    }

    public void printToDoList(){
        for(int i=0;i<toDoList.size();i++){
            System.out.println(i+" - " + toDoList.get(i));
        }
    }

    public void changeTask(int index,String task){
        toDoList.set(index, task);//when setting "0" to 3-th element of the array [12345],
        //we get [12305]
    }

    public void removeTask(String task){
        toDoList.remove(task);//Here remove works by finding object.
        // We can use remove by finding index.
    }

    public int getTaskPriority(String task){//We want to know task's index
        return toDoList.indexOf(task);//returns us index(int).

    }

}
