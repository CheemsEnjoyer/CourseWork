package domain.usecase.user;
import domain.entity.Users;
import javax.swing.JOptionPane;
import data.repository.UsersRepositoryImp;
public class RegisterUserUseCase {

    private UsersRepositoryImp userRepository;

    public RegisterUserUseCase() {
        this.userRepository = new UsersRepositoryImp();
    }

    public Users registerUser(Users user) {
        int userId = userRepository.insertUserToDatabase(user);
        
        if (userId != -1) {
            Users registeredUser = new Users(userId, user.getName(), user.getPassword(), user.getEmail());
            JOptionPane.showMessageDialog(null, "Пользователь успешно зарегистрирован!");
            return registeredUser;
        } else {
            JOptionPane.showMessageDialog(null, "Ошибка при регистрации пользователя!");
            return null;
        }
    }
}
