package domain.usecase.user;
import data.repository.UsersRepositoryImp;
import domain.entity.Users;
public class AuthenticateUserUseCase {
    
    private UsersRepositoryImp usersRepositoryImp;

    public AuthenticateUserUseCase() {
        this.usersRepositoryImp = new UsersRepositoryImp();
    }

    public Users authenticateUser(String email, String password) {
        return usersRepositoryImp.fetchUserByEmailAndPassword(email, password);
    }
}
