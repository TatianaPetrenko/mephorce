
import net.tatianap.mvntest.domain.User;
import net.tatianap.mvntest.dao.UserDAOImpl;
public class Main {
    public static void main(String[] args) {
    
        UserDAOImpl userDAOImpl = new UserDAOImpl();
        
        User nuser = userDAOImpl.getUserByID(2);
        
        System.out.println(nuser.getName());
    
    }
}
