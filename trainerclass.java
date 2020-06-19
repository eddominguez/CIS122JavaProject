//using the package that has three classes which are Main class, Trainer class and User class
package User;
// importing a java package so that we can create a list later
import java.util.List;
// Extending the User class so that we can use the members of the user class in the trainer class
public class Trainer extends User
{
    private List<User> username;
 
    public List<User> username() {
        return username;
    }
    public void setname(List<User> username) {
        this.username = username;
    }
 
   
    @Override
    public String toString() {
        return "Trainer [username=" + username + ", details=" + super.toString() + "]";
    }
}
