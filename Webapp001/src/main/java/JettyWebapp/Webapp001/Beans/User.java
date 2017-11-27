package JettyWebapp.Webapp001.Beans;

public class User {

    private String name;
    private Group[] groups;
    private String rights;
        
    
    public User() {
        super();        
    }
   
    public String getName() {
        return name;
    }
    
    public Group[] getGroups() {
        return groups;
    }
    
    public String getRights() {
        return rights;
    }
}
