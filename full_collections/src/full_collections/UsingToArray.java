package full_collections;

import java.util.Arrays;
import java.util.LinkedList;

public class UsingToArray {
    public  UsingToArray(){
        String[] colors={"black","blue","yellow"};
        LinkedList<String> links=new LinkedList<String>(Arrays.asList(colors));
        links.addLast("red");
        links.add("pink");
        links.add(3,"green");
        links.addFirst("cyan");
        colors=links.toArray(new String[links.size()]);
        System.out.println("Colors:");
        for(String color:colors){
            System.out.println(color);
        }
    }

    public static void main(String[] args) {
        new UsingToArray();
    }
}

