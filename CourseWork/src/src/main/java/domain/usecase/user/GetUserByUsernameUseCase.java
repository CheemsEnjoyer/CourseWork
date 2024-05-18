package domain.usecase.user;
import data.repository.UsersRepositoryImp;
import domain.entity.Users;
public class GetUserByUsernameUseCase {

    private UsersRepositoryImp usersRepositoryImp;

    public GetUserByUsernameUseCase() {
        this.usersRepositoryImp = new UsersRepositoryImp();
    }

    public Users getUserByUsername(String username) {
        return usersRepositoryImp.fetchUserByUsername(username);
    }    
}
