import java.util.ArrayList;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.Map;
import java.util.List;

public class DonorBO {
	
	private Map<String,String>  donorMap = new TreeMap<>();
	
	public Map<String, String> getDonorMap() {
		return donorMap;
	}

	public void setDonorMap(Map<String, String> donorMap) {
		this.donorMap = donorMap;
	}

	//This method should add the donorName as key and bloodGroup as value into the donorMap
	public void addDonor(String donorName,String bloodGroup){
		//Fill the code here
		donorMap.put(donorName, bloodGroup);
	
	}
	
	//This method should return the list of donor names whose bloodGroup matches with the bloodGroup passed as parameter
	public List<String> findDonorsByBloodGroup (String bloodGroup){
		//Fill the code here
		List<String> donors= new ArrayList<>();
		for(Map.Entry<String,String> entry : donorMap.entrySet()) {
			donors.add(entry.getKey());
		}
		
		return donors;
	}
	
	 // This method returns the list of blood groups present in the donorMap
    public List<String> getBloodGroups() {
        //Fill the code here
    	Set<String> bloodGroupSet = new TreeSet<>(donorMap.values());
        return new ArrayList<>(bloodGroupSet);
    }
	

}
	 	  	  	 		  	     	      	 	
