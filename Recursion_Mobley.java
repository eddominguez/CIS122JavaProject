import java.util.HashMap;
import java.util.Scanner;
//ALEX MOBLEY'S CODE
public class Recursion_Mobley {
    static int num = 0; //variable to be used to add up calories static so it can be accessed inside the method
    static int num2 = 0;

//updated recursion method
//Edward added a way for the user to add a new food to a certain map
//Edward also added the view of possible foods as well as updated print statements to better match the method
// Edwards code is put in between comments saying this is his code and this is the end of his code.

        public static int recursion(String food) //recursion method
        {
            String temp, group;
            Scanner input = new Scanner(System.in); //implementation of scanner

            //START OF EDWARDS CODE-------------------------------------------------------------------------------------

            //----------------------------------------------------------------------------------------------------------

            //----------------------------------------------------------------------------------------------------------

            //----------------------------------------------------------------------------------------------------------

            Scanner customInput = new Scanner(System.in);//for foods not in the list

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

            //----------------------------------------------------------------------------------------------------------

            //----------------------------------------------------------------------------------------------------------

            //----------------------------------------------------------------------------------------------------------

           // System.out.println("What food group are you looking for? Meat, Vegetable, Fruit, Dairy, Grain"); //text prompt
           // System.out.print("Or if you are done type \"Done\": ");
           // group = input.nextLine();//change to next line when String implementation is implemented

            if (!food.equalsIgnoreCase("done")){ //checks if the user wants to add more food or not

                System.out.println("What food group are you looking for? Meat, Vegetable, Fruit, Dairy, Grain"); //text prompt
                System.out.print("Or if you are done type \"Done\": ");
                group = input.nextLine();//change to next line when String implementation is implemented


                //recursion part for meat
                if (group.equalsIgnoreCase("Meat")){//if statement for food group
                    System.out.print("What food did you eat? "); //user prompt for next step
                    System.out.println("Here's a list of the food to choose from");
                    System.out.println("Don't see your food? add it to the list! Type add to add a new food!"); //user adds a meat
                    System.out.println(meatCalorieMap.keySet().toString());
                    food = input.nextLine();       // uses scanner input for getting the food
                    if (meatCalorieMap.containsKey(food.toLowerCase())){  // checks if hashmap contains the food the user input
                        num += meatCalorieMap.get(food.toLowerCase());  //adds up the calorie amount
                    }
//---------------------------adding food to hashmap method done by Edward Dominguez--------------------------------------------------------------------

                    //----------------------------------------------------------------------------------------------------------

                    //----------------------------------------------------------------------------------------------------------
                    else if(food.equalsIgnoreCase("add")) {
                        System.out.println("Let's add a food.");
                        System.out.println("What kind of meat did you eat?: ");
                        String foodCustom = customInput.nextLine().toLowerCase();
                        System.out.println("How many calories did " + foodCustom + " have?: ");
                        Integer customCalorie2 = customInput.nextInt();
                        meatCalorieMap.put(foodCustom.toString(), customCalorie2);
                        num += meatCalorieMap.get(foodCustom);

                    }
                    //--------------------------END OF EDWARDS CODE---------------------------------------------------------------------------------

                    //----------------------------------------------------------------------------------------------------------

                    //----------------------------------------------------------------------------------------------------------
                    else
                    {
                        System.out.println("Im sorry we don't have that food in our database. "); //text prompt
                    }
                    recursion(food);           //recalls the method

                } //recursion part for vegetables
                else if (group.equalsIgnoreCase("Vegetable")){
                    System.out.print("What food did you eat? ");
                    System.out.println("Here's a list of the food to choose from");
                    System.out.println("Don't see your food? add it to the list! Type add to add a new food!"); //user adds a meat
                    System.out.println(vegetableCalorieMap.keySet().toString());
                    food = input.nextLine();
                    if (vegetableCalorieMap.containsKey(food)){
                        num += vegetableCalorieMap.get(food.toLowerCase());
                    }


                    //EDWARDS CODE---------------------------------------------------------------------------------------
                    else if(food.equalsIgnoreCase("add")) {
                        System.out.println("Let's add a food.");
                        System.out.println("What kind of vegetable did you eat?: ");
                        String foodCustom = customInput.nextLine().toLowerCase();
                        System.out.println("How many calories did it have?: ");
                        Integer customCalorie2 = customInput.nextInt();
                        vegetableCalorieMap.put(foodCustom.toString(), customCalorie2);
                        num += vegetableCalorieMap.get(foodCustom);
                    }

                    //END OF EDWARDS CODE-------------------------------------------------------------------------------
                    else
                    {
                        System.out.println("Im sorry we don't have that food in our database. ");
                    }
                    recursion(food);
                }//recursion part for fruit
                else if (group.equalsIgnoreCase("Fruit")){
                    System.out.print("What food did you eat? ");
                    System.out.println("Here's a list of the food to choose from");
                    System.out.println("Don't see your food? add it to the list! Type add to add a new food!"); //user adds a meat
                    System.out.println(fruitCalorieMap.keySet().toString());
                    food = input.nextLine();
                    if (fruitCalorieMap.containsKey(food)){
                        num += fruitCalorieMap.get(food.toLowerCase());
                    }

                    //-------------------------EDWARDS CODE---------------------------------------------------------------------------------

                    //----------------------------------------------------------------------------------------------------------

                    //----------------------------------------------------------------------------------------------------------
                    else if(food.equalsIgnoreCase("add")) {
                        System.out.println("Let's add a food.");
                        System.out.println("What kind of fruit did you eat?: ");
                        String foodCustom = customInput.nextLine().toLowerCase();
                        System.out.println("How many calories does it have?: ");
                        Integer customCalorie2 = customInput.nextInt();
                        meatCalorieMap.put(foodCustom.toString(), customCalorie2);
                        num += meatCalorieMap.get(foodCustom);

                    }

                    //end of edwards code----------------------------------------------------------------------------


                    else
                    {
                        System.out.println("Im sorry we don't have that food in our database. ");
                    }
                    recursion(food);
                }
                //for dairy
                if (group.equalsIgnoreCase("Dairy")){//if statement for food group
                    System.out.print("What food did you eat? "); //user prompt for next step
                    System.out.println("Here's a list of the food to choose from");
                    System.out.println("Don't see your food? add it to the list! Type add to add a new food!"); //user adds a meat
                    System.out.println(dairyCalorieMap.keySet().toString());
                    food = input.nextLine();       // uses scanner input for getting the food
                    if (dairyCalorieMap.containsKey(food.toLowerCase())){  // checks if hashmap contains the food the user input
                        num += dairyCalorieMap.get(food.toLowerCase());  //adds up the calorie amount
                    }
//---------------------------adding food to hashmap method done by Edward Dominguez--------------------------------------------------------------------
                    else if(food.equalsIgnoreCase("add")) {
                        System.out.println("Let's add a food.");
                        System.out.println("What kind of dairy did you eat or drink?: ");
                        String foodCustom = customInput.nextLine().toLowerCase();
                        System.out.println("How many calories does " + foodCustom + " have?: ");
                        Integer customCalorie2 = customInput.nextInt();
                        dairyCalorieMap.put(foodCustom.toString(), customCalorie2);
                        num += dairyCalorieMap.get(foodCustom);
                    }
                    else
                    {
                        System.out.println("Im sorry we don't have that food in our database. "); //text prompt
                    }
                    recursion(food);           //recalls the method
                }
                //for grains
                if (group.equalsIgnoreCase("grain")){//if statement for food group
                    System.out.print("What food did you eat? "); //user prompt for next step
                    System.out.println("Here's a list of the food to choose from");
                    System.out.println("Don't see your food? add it to the list! Type add to add a new food!");
                    System.out.println(grainCalorieMap.keySet().toString());
                    food = input.nextLine();       // uses scanner input for getting the food
                    if (grainCalorieMap.containsKey(food.toLowerCase())){  // checks if hashmap contains the food the user input
                        num += grainCalorieMap.get(food.toLowerCase());  //adds up the calorie amount
                    }
//---------------------------adding food to hashmap method done by Edward Dominguez--------------------------------------------------------------------
                    else if(food.equalsIgnoreCase("add")) {
                        System.out.println("Let's add a food.");
                        System.out.println("What kind of grain did you eat?: ");
                        String foodCustom = customInput.nextLine().toLowerCase();
                        System.out.println("How many calories does " + foodCustom + " have?: ");
                        Integer customCalorie2 = customInput.nextInt();
                        grainCalorieMap.put(foodCustom.toString(), customCalorie2);
                        num += grainCalorieMap.get(foodCustom);
                        //System.out.println(num);
                    }

                    //end of edwards code---------------------------------------------------------------------------------

                    else
                    {
                        System.out.println("Im sorry we don't have that food in our database. "); //text prompt
                    }
                    recursion(food);           //recalls the method
                }
                else if (!group.equalsIgnoreCase("done") && !food.equalsIgnoreCase("done") && num2 != 1)
                {
                    System.out.println("You have entered an incorrect food group, try again."); //text prompt
                    recursion(food);            //recalls the recursion method
                }
            }
            else
                num2 = 1;
            System.out.print("Total calorie amount is: "); //text prompt
            return num; //returns the final value
        }

        public static void main(String[] args) {
            String temp = "temp"; //variable used for method call

            System.out.println(recursion(temp) + "  calories"); //initial call of the method and prints out result

        }
    }