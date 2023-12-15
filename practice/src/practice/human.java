package practice;

public class human {

	String name;
	int age;
	double weight;
	
    human(String name,int age,double weight){
    	this.name=name;
    	this.age=age;
    	this.weight=weight;
    }
    void  eating() {
    	System.out.println(name+"  is eating");
    }
    void  drinking() {
    	System.out.println(name+"  is drinking");
    }
}
