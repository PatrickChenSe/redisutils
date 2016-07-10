package cz.self.redis;

import cz.self.entity.User;

import java.util.Date;

/**
 * Created by cz on 2016/7/10 0010.
 */
public interface UserDao {

    boolean add(User user);

    User get(Long id);

    boolean delete(Long id, long opuid, Date lastmodify);

}
