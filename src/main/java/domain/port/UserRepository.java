package domain.port;
import domain.entity.Users;
public interface UserRepository {
    Users fetchUserByEmailAndPassword(String email, String password);
    Users fetchUserByUsername(String username);
    int insertUserToDatabase(Users user);
}
