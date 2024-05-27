public class FitnessDetails {
    public String calculateCaloriesBurned(String activityData,int userWeightInKg) {
        
        // Fill the code here
    	String [] parts = activityData.split(":");
    	String activityName = parts[0];
    	String durationInMinutes = parts[1];
    	String intensityLevel = parts[2];
    	double totalCalories = 0;
    	
    	try {
    		int cpm=0;
    		if(activityName.equals("Cycling")) {
    			cpm=5;
    		}
    		else if(activityName.equals("Running")) {
    			cpm=7;
    		}
    		else if(activityName.equals("Walking")) {
    			cpm=3;
    		}
    		else {
    			throw new IllegalArgumentException("Invalid activity name.Thank you for using the fitness tracker.");
    		}
    		int dm = Integer.parseInt(durationInMinutes);
    		int level = Integer.parseInt(intensityLevel);
    		if(userWeightInKg <=0) {
    			throw new ArithmeticException("User weight is invalid.Thank you for using the fitness tracker.");
    		}
    		if(dm<1) {
    			throw new IllegalArgumentException("Invalid duration or intensity.Thank you for using the fitness tracker.");
    		}
    		if(level<1 || level>9)
    		{
    			throw new ArithmeticException("Invalid duration or intensity.Thank you for using the fitness tracker.");
    		}
    		totalCalories = ((cpm*dm*level*60/userWeightInKg));
    		return "Total Calories burned : "+totalCalories+".Thank you for using the fitness tracker.";
    	}
    	catch(NumberFormatException e) {
    		return "Error : Invalid activity name.Thank you for using the fitness tracker.";
    	}
    	finally {
    		
    	}
}
}
