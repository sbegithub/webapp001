package JettyWebapp.Webapp001.Beans;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement 

public class File {

        
        private String name;
        private String parentFolder;
        private String users;
        private String groups;
            
        
        public File() {
            super();        
        }
       
        public String getName() {
            return name;
        }
        
        public String getParentFolder() {
            return parentFolder;
        }

        public String getUsers() {
            return users;
        }
        
        public String getGroups() {
            return groups;
        }
         
}
