package JettyWebapp.Webapp001.Beans;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement 

public class Folder {

  
    private String name;
    private String parentFolder;
    private Folder[] childFolders;
    private File[] childFiles;
    private String users;
    private String groups;
        
    
    public Folder() {
        super();        
    }
   
    public String getName() {
        return name;
    }
    
    public String getParentFolder() {
        return parentFolder;
    }
    
    public Folder[] getChildFolders() {
        return childFolders;
    }
    
    public File[] getChildFiles() {
        return childFiles;
    }

    public String getUsers() {
        return users;
    }
    
    public String getGroups() {
        return groups;
    }
     
}