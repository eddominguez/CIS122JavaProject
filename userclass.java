// using the package that has three classes
	package User;
	// Package used for Arraylist
	import java.util.ArrayList;
	// Public Class User  from the user package
	public class User {
		// Assinging name as a String
		   private String name;
		   private int age;
		   private int Weight;
		   private int heightinfeet;
		   private int heightininches;
    // setame() method which returns the users name 
   public String setName() {
        return name;
    }
   // this reference to retun string name which will be stored as users name 
    public void setName(String name) {
        this.name = name;
    }
    // set age method that retuns useranme 
    public int setage() {
        return age;
    }
    // setweight method which returns users name 
    public int setweight() {
        return Weight;
    }
 // setheightinfeet method which returns users heigh in feet
       public int setheightinfeet() {
            return heightinfeet;
       }
    // setheightininches method  which returns users height in inches
            public int setheightininches() {
                return  heightininches;
    }
   // to string method to print users information
    public String toString() {
        return "Users Name	=" + name + ", age=" + age + ", weight=" + Weight + "]";
    }
}
  
