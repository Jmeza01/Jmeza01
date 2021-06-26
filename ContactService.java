package ContactService;

public class ContactService {

    private String name;
    private String address;
    private String id;
    
    public ContactService (String name, String address, String id) {
    	if(name == null || name.length()>10) {
    		throw new IllegalArgumentException("Invalid input");
    	}
    	if(name == null || address.length()>10) {
    		throw new IllegalArgumentException("Invalid input");
    	}
    	if(name == null || id.length()>10) {
    		throw new IllegalArgumentException("Invalid input");
    	}
    	
    	
    	this.name = name;
    	this.address = address;
    	this.id = id;
    }
    
    public String getName() {
    	return name;
    }
    
    public String getAddress() {
    	return address;
    }
    
    public String getId() {
    	return id;
    }
}