package cz.self.redis;

import cz.self.entity.User;
import io.leopard.burrow.util.NumberUtil;
import io.leopard.json.Json;
import io.leopard.redis.Redis;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.util.Date;

/**
 * Created by cz on 2016/7/10 0010.
 */
@Repository("UserDao")
public class UserDaoImpl implements UserDao{

    @Resource
    private Redis redis;

    public boolean add(User user) {
        String key = this.getKey(user.getId());
        redis.set(key, Json.toJson(user));
        return true;
    }

    public User get(Long id) {
        String key = this.getKey(id);
        String json = redis.get(key);
        return Json.toObject(json, User.class);
    }

    public boolean delete(Long id, long opuid, Date lastmodify) {
        String key = this.getKey(id);
        Long result = redis.del(key);
        return NumberUtil.toBool(result);
    }

    protected String getKey(Long id) {
        return "user:" + id;
    }
}
