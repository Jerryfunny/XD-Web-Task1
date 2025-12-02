@Entity
@Table(name="users")
public class User {
@Id @GeneratedValue private Long id;
private String username;
private String password; // 存储 bcrypt
private String role; // ROLE_USER / ROLE_ADMIN
private LocalDateTime createTime;
}
