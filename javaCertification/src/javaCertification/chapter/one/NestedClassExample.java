package javaCertification.chapter.one;

public class NestedClassExample{

	 public static void main(String args[]){
	        
	        Human raja = new Human();
	        Human sankar = new Human();
	        raja.name = "NarasimmaRaja";
	        raja.age = 20;
	        raja.weight = 75.25f;
	        
	        sankar.name = " Sankara Narayanan";
	        sankar.age = 26;
	        sankar.weight = 102f;
	        
	        System.out.println("Raja Details");
	        System.out.println("name = " + raja.name);
	        System.out.println("age = " + raja.age);
	        System.out.println("weight = " + raja.weight);
	        
	        System.out.println(" Sankar details");
	        System.out.println("name = " + sankar.name);
	        System.out.println("age = " + sankar.age);
	        System.out.println("weight = " + sankar.weight);
	        }
	}

	class Human {
	       
	    String name;
	    int age;
	    float weight;
	    
	    
	    
	}