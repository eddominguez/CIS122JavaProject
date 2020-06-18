import java.util.HashMap;
import java.util.Scanner;
public class Search_Mobley {

    public static void search(String group, String food) //takes in two variables and returns nothings
    {
        int num = 0;
        //START OF EDWARDS CODE----------------------------------------------------------------------------------------
        //fruit calorie map
        HashMap<String, Integer> fruitCalorieMap = new HashMap<String, Integer>();

        fruitCalorieMap.put("apple", 95);
        fruitCalorieMap.put("banana", 100);
        fruitCalorieMap.put("clementine", 35);
        fruitCalorieMap.put("mango", 202);
        fruitCalorieMap.put("peach", 59);
        fruitCalorieMap.put("orange", 62);
        fruitCalorieMap.put("passion Fruit", 17);
        fruitCalorieMap.put("pear", 101);
        fruitCalorieMap.put("blueberries", 84);

        //vegetable calorie map
        HashMap<String, Integer> vegetableCalorieMap = new HashMap<String, Integer>();

        vegetableCalorieMap.put("broccoli",50);
        vegetableCalorieMap.put("carrot", 41);
        vegetableCalorieMap.put("cucumber",50);
        vegetableCalorieMap.put("cauliflower",146);
        vegetableCalorieMap.put("cherry tomato",20);
        vegetableCalorieMap.put("green Beans",31);
        vegetableCalorieMap.put("zucchini",33);


        //meat and protein substitute calorie map
        HashMap<String, Integer> meatCalorieMap = new HashMap<String, Integer>();

        meatCalorieMap.put("chicken breast", 200);
        meatCalorieMap.put("pork chop", 257);
        meatCalorieMap.put("ground beef patty", 172);
        meatCalorieMap.put("salmon", 220);
        meatCalorieMap.put( "kidney",200 );
        meatCalorieMap.put("honey ham (1 slice)", 27);
        meatCalorieMap.put("turkey breast(1 slice)", 22);



        //dairy calorie map
        HashMap<String, Integer> dairyCalorieMap = new HashMap<String, Integer>();

        dairyCalorieMap.put("almond milk (unsweetened)", 40);
        dairyCalorieMap.put("plain yogurt", 138);
        dairyCalorieMap.put("whole milk", 149);
        dairyCalorieMap.put("skim milk", 86);
        dairyCalorieMap.put("rice milk", 120);
        dairyCalorieMap.put("string cheese", 70);
        dairyCalorieMap.put("swiss cheese", 95);

        //bread and grain calorie map
        HashMap<String, Integer> grainCalorieMap = new HashMap<String, Integer>();

        grainCalorieMap.put("plain bagel", 252);
        grainCalorieMap.put("english muffin", 129);
        grainCalorieMap.put("garlic bread",151);
        grainCalorieMap.put("white bread", 79);
        grainCalorieMap.put("whole wheat bread)", 114);

        //END OF EDWARDS CODE---------------------------------------------------------------------------------------

                if (group.equalsIgnoreCase("meat")) //checks for what food group the user selected
                {
                    if (meatCalorieMap.containsKey(food.toLowerCase())) //checks if we have the food the user input in our database
                    num = meatCalorieMap.get(food.toLowerCase());       //sets calorie value equal to num
                    else
                    {
                        System.out.println("Sorry we don't have that food in our database"); //text prompt
                    }
                }
                else if (group.equalsIgnoreCase("vegetable"))
                {
                    if (vegetableCalorieMap.containsKey(food.toLowerCase()))
                       num = vegetableCalorieMap.get(food.toLowerCase());
                    else
                    {
                        System.out.println("Sorry we don't have that food in our database");
                    }
                }
                else if (group.equalsIgnoreCase("fruit"))
                {
                    if (fruitCalorieMap.containsKey(food.toLowerCase()))
                      num =  fruitCalorieMap.get(food.toLowerCase());
                    else
                    {
                        System.out.println("Sorry we don't have that food in our database");
                    }
                }
                else if (group.equalsIgnoreCase("grain"))
                {
                    if (grainCalorieMap.containsKey(food.toLowerCase()))
                        num =  grainCalorieMap.get(food.toLowerCase());
                    else
                    {
                        System.out.println("Sorry we don't have that food in our database");
                    }
                }
                else if (group.equalsIgnoreCase("dairy"))
                {
                    if (dairyCalorieMap.containsKey(food.toLowerCase()))
                        num =  dairyCalorieMap.get(food.toLowerCase());
                    else
                    {
                        System.out.println("Sorry we don't have that food in our database");
                    }
                }

        if (num != 0) //checks if num has a valid input
        {
            System.out.println(food + " has " + num + " calories in it."); //text prompt
        }
    }
    public static void main(String[] args)
    {

	    Scanner input = new Scanner(System.in); //user input
        String food, group;

        System.out.print("What food group are you looking for Meat, Fruit, or Vegetable? ");
        group = input.nextLine(); //user input is used to get food group

        //checks if user input a valid food group
        if ( group.equalsIgnoreCase("meat") || group.equalsIgnoreCase("fruit") ||
                group.equalsIgnoreCase("vegetable") ||group.equalsIgnoreCase("grain") ||
                group.equalsIgnoreCase("dairy"))
        {
            //text prompt
        System.out.print("What food are you looking for? ");
        //user input is used to get food group
	    food = input.nextLine(); //user input

            //calls the method search and inputs 2 varaibles
            search(group, food);
        }
        else
            {
                //text prompt
            System.out.println("Sorry that food group doesn't exist in our database");
         }

    }
}
