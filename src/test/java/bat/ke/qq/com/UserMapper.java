package bat.ke.qq.com;

import org.apache.ibatis.annotations.Select;

/**
 * 源码学院-Monkey
 * 只为培养BAT程序员而生
 * http://bat.ke.qq.com
 * 往期视频加群:516212256 暗号:6
 */
public interface UserMapper {
 /*  @Results({
           @Result(property ="name",column = "username")
   })*/
   @Select("select id,username as name,age,phone,`desc` from User where id = #{id}")
   User selectUser(Integer id);
}
