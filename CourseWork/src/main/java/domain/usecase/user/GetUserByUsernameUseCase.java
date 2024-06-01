package domain.usecase.user;
import domain.entity.Users;
import domain.port.UserRepository;
public class GetUserByUsernameUseCase {

    private UserRepository usersRepository;

    public GetUserByUsernameUseCase(UserRepository usersRepository) {
        this.usersRepository = usersRepository;
    }

    public Users getUserByUsername(String username) {
        return usersRepository.fetchUserByUsername(username);
    }    
}
