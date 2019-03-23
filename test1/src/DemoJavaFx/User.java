package DemoJavaFx;

public class User {
    public Integer id;
    public String username;
    public String email;
    public Integer status;
    public String password;

    public User(Integer id, String username, String email, Integer status,String password) {
        this.id = id;
        this.username = username;
        this.email = email;
        this.status = status;
        this.password = password;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
}
