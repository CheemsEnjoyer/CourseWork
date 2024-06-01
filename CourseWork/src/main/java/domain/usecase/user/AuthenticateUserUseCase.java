package domain.usecase.user;
import domain.entity.Users;
import domain.port.UserRepository;
public class AuthenticateUserUseCase {
    
    private UserRepository usersRepository;

    public AuthenticateUserUseCase(UserRepository usersRepository) {
        this.usersRepository = usersRepository;
    }

    public Users authenticateUser(String email, String password) {
        return usersRepository.fetchUserByEmailAndPassword(email, password);
    }
}
