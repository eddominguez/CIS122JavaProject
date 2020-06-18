/*------------------------------------------------------------------------------------------------------*/
public class allMethods {
	
/*------------------------------------------------------------------------------------------------------*/	
/*------------------------------------------------------------------------------------------------------*/	
//Start of Alejandro Castillo Code	
/*------------------------------------------------------------------------------------------------------*/		
	//only did three age rages because otherwise is very long and repetitive for demonstration
	public static String healthyFatPercent(int age, double fatPercent) {
		if (age >0 && age <21) {
			if(fatPercent > 2 && fatPercent < 9)
				return"Lean";
				else if (fatPercent>8 && fatPercent <15)
					return "Ideal";
				else if (fatPercent> 14 && fatPercent < 22)
					return "Average";
				else if (fatPercent> 21 )
					return "Over Fat ";
				else 
					return "Not in our range. ";
		}
		else if (age >20 && age <26) {
			if(fatPercent > 3 && fatPercent < 10)
				return"Lean";
				else if (fatPercent>9 && fatPercent <15)
					return "Ideal";
				else if (fatPercent> 14 && fatPercent < 23)
					return "Average";
				else if (fatPercent> 23 )
					return "Over Fat ";
				else 
					return "Not in our range. ";
		}
		else if (age >25 && age <31) {
			if(fatPercent > 3 && fatPercent < 12)
				return"Lean";
				else if (fatPercent>10 && fatPercent <17)
					return "Ideal";
				else if (fatPercent> 15 && fatPercent < 22)
					return "Average";
				else if (fatPercent> 21 )
					return "Over Fat ";
				else 
					return "Not in our range. ";
		}
		else 
			return "age has not yet been defined";
	
	}
	
/*------------------------------------------------------------------------------------------------------*/	
	//This method get information from user to determine how much water is needed in that day
	public static String getHydration(double avgMass, double massBefore,double massAfter,double hours) {
		//drink oz in mass
		
		double workoutloss = hours * 12;
		double loss = massBefore - massAfter; //weight before and after work-out
		double waterFromLoss = (loss/.5)*8; //amount lost but for every .5 drink 8oz of water
		double water = (avgMass - (avgMass*.2) + workoutloss + waterFromLoss);// 
		
		return (""+ water); //gives in oz how much water should be drunk remember to add in HTML " you need to drink:"
	}
  
/*------------------------------------------------------------------------------------------------------*/	
	
  public static String getCarbCountPerMeal(int servings, int carbohydratesPerServing ) {
		double carbCount = servings * carbohydratesPerServing;
		
		if (carbCount < 4) {
			return "You can have  " + (4-carbCount) + "more carb counts";
		}
		 
		else 
			return "you have had " +(carbCount - 4) +"to many carb counts"; 
	}
  
 /*------------------------------------------------------------------------------------------------------*/  
  //This method gets user input to calculate BMR is later used to get calories needed 
  public static String getBMR(String gender, double feet, double inches, int age,double weight) {
		double BMR;
		double height = (feet*12 + inches)*.305; //Formula used uses inches not meters 
		if (gender == "male")
        {
            BMR =  (66 + (6.23 * weight) + (12.7 * height) - (6.8 * age)); //this is the how to obtain BMR if male
            return "" + BMR;
        }
        else if(gender == "female") // to check for female 
        {
            BMR = (665 + (4.35 * weight) + (4.7 * height) - (4.7 * age)); //else statement for when female BMR is needed to be calculated
            return "" +BMR;
        }
        else //If input was not male or female
        	return "incorrect input";
	}
	
 /*------------------------------------------------------------------------------------------------------*/
  //Lets user know how many calories are need to maintain current body weight depending on many paramaters 
  //including gender and level of exercise	
	public static double getCal(int E,String gender, double feet,double inches, int age,double weight) {
		
/*Enter level of exercise: 
(1)-None 
(2)-light 
(3)-moderately 						This should be included in the HTML or user to understand
(4)-intensely 
(5)-extreme */  
		
		double B = Double.parseDouble(getBMR(gender, feet, inches,  age, weight)); //Parameters needed for BMR uses method above  
		if(E == 1)			  //E is exercise 
			return (B * 1.2); //returns BMR multiplied by Exercise entered used the internet to find what to multiply depending on level
		else if (E==2)
			return(B * 1.375);
	    else if(E==3)
	    	return(B * 1.55);
	    else if(E==4)
	    	return(B * 1.725);
	    else
	    	return(B * 1.9);
		
			
	
}

/*------------------------------------------------------------------------------------------------------*/
	//Uses a standard formula to get BMI for user 
public static double getBMI(double weightInPounds, double feet, double inches) {
		double weightInKilos = weightInPounds * 0.45; //pounds entered converted to kilos
		double heightInMeters = ((feet + (inches/12)) * .305); //converts the feet and inches entered into meters which is what is used for BMI
        double BMI = weightInKilos / (heightInMeters * heightInMeters);  //uses BMI calculation
		
		return BMI;
}

/*------------------------------------------------------------------------------------------------------*/
	//This method interprets the BMI the user got prior
	public static String interpretBMI(double BMI) {         //This method uses the BMI calculated with getBMI 
		if (BMI >= 0 && BMI < 18.5 ) 	//Has to be above 0 //to interpret the data into a String 
            return "Underweight";							//will show in box              										
        else if (BMI >= 18.5 && BMI < 25) 					//This is common in a lot of nutrition apps
            return "Normal";
        else if (BMI >= 25 && BMI < 30) 
            return "Overweight";
        else if(BMI > 30)
            return "Obese";
        else 
        	return "BMI entered did not match any of our ranges, please try again."; //This is used in case something besides a number is used
        
	}
	
	
/*------------------------------------------------------------------------------------------------------*/
	//returns the amount of calories lost depending on heart right, this is different for genders and the amount of exercise done
	//returned a String because might work better with HTML?
	public static String caloriesPExcercise(String gender,double heartRate,double weight,int age, int timeHours) {
		double weightInKilos = weight * 0.453592; 
		double calories;
		if (gender == "male") {
			 calories = (-55 + (.63*heartRate)+(weightInKilos*.1988)+(.2017*age)/4.2*60*timeHours);
		return ""	+ calories;
		}
		else {
			calories = (-20 + (.45*heartRate)-(weightInKilos*.13)+(.017*age)/4.2*60*timeHours);
			
			return "" + calories;
			
		}
			
			
	}
	
/*------------------------------------------------------------------------------------------------------*/
//This method uses the age range entered to determine how much someone should sleep
	/*Enter What age group you belong to.
	 * Newborn 0-3 months
	 * Infant 4-11 months
	 * Toddler 1-2 years
	 * Preschool 3-5 years
	 * Children 6-13 years
	 * Teenagers14-17 years								HTML FORMAT
	 * Young Adults 18-25 years
	 * Adults 26-64 years
	 * Older Adults 65+ years
	 * */
	public static String goodSleep(String ageRange) {
		
		if(ageRange == "Newborn") { //0-3 months
			return "Sleep range is between 14-17 hours.";
		}
		else if(ageRange == "Infant") { //4-11 months
			return "Sleep range is between 12-15 hours";
		}
		else if(ageRange == "Toddler") { //1-2 years
			return"Sleep range is between 11-14 hours";
		}
		else if(ageRange == "Preschooler") { //3-5 years
	return"Sleep range is between 10-13 hours";
}
		else if(ageRange == "Children") { //6-13 years
	return "Sleep range is between 9-11 hours";
}
		else if(ageRange == "Teenagers") { //14-17 years
	return "Sleep range is between 8-10 hours";
}
		else if(ageRange == "Young Adults") { //18-25 years
	return "Sleep range is between 7-9 hours";
}
		else if(ageRange == "Adults") { //26-64 years
	return "Sleep range is between 8-10 hours";
}
		else if(ageRange == "Older Adults") {  //65+ years
	return "Sleep range is between 7-9 hours";
}
		else {
	return"Incorrect range";
}
	}

/*------------------------------------------------------------------------------------------------------*/		
	//1 watt is equal to 860 calories per hour. I found this equation online it is used in classes
	public static String caloriesToWatts(double calories, int Hoursdodone) {
		double Watts = (calories/860)*Hoursdodone;
		
		return "" + Watts;
	}
	

/*------------------------------------------------------------------------------------------------------*/	
/*------------------------------------------------------------------------------------------------------*/	
}
