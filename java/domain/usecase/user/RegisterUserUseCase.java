package domain.usecase.user;
import domain.entity.Users;
import domain.port.UserRepository;
public class RegisterUserUseCase {

    private UserRepository usersRepository;

    public RegisterUserUseCase(UserRepository usersRepository) {
        this.usersRepository = usersRepository;
    }

    public Users registerUser(Users user) {
        int userId = usersRepository.insertUserToDatabase(user);
        
        if (userId != -1) {
            Users registeredUser = new Users(userId, user.getName(), user.getPassword(), user.getEmail());
            return registeredUser;
        } else {
            return null;
        }
    }
}
