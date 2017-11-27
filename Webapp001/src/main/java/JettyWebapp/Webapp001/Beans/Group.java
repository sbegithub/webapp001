package JettyWebapp.Webapp001.Beans;

public class Group {

    private String name;
    private User[] users;
    private String rights;
        
    
    public Group() {
        super();        
    }
   
    public String getName() {
        return name;
    }
    
    public User[] getUsers() {
        return users;
    }
    
    public String getRights() {
        return rights;
    }
    
     
}