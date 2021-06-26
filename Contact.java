package Contact;

public class Contact {

    private String name;
    private String id;
    
    public Contact (String name, String id) {
    	if(name == null || name.length()>10) {
    		throw new IllegalArgumentException("Invalid name");
    	}
    	if(id == null || id.length()>10) {
    		throw new IllegalArgumentException("Invalid id");
    	}
    	
    	this.name = name;
    	this.id = id;
    }
    
    public String getName() {
    	return name;
    }
    
    public String getId() {
    	return id;
    }
}
