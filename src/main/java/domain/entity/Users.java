package domain.entity;


public class Users {
    private int id;
    private String name;
    private String password;
    private String email;
    
        @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", link=" + password +
                ", isPaid=" + email;
    
    }
    
    public Users(int id, String name, String password, String email) {
        this.id=id;
        this.name = name;
        this.password = password;
        this.email = email;
    }
    
    public int getId() {
        return id;
    }
    
    public String getName() {
        return name;
    }
    
    public String getPassword() {
        return password;
    }
    
    public String getEmail() {
        return email;
    }
    
    public void logout() {
        this.name = null;
    }
    
}
