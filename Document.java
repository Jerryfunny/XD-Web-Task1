@Entity
@Table(name="documents")
public class Document {
@Id @GeneratedValue private Long id;
private String name;
private String path; // 存储相对路径
private String type;
private String category;
private Long userId;
private LocalDateTime uploadTime;
}
