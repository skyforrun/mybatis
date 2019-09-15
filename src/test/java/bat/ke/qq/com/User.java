package bat.ke.qq.com;

import lombok.Data;
import org.apache.ibatis.type.Alias;

@Alias("user")
@Data
public class User {
    private Integer id;
    private String username;
    private Integer age;
    private String phone;
    private String desc;
}
