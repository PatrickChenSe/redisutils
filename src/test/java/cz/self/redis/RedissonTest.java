package cz.self.redis;

import org.junit.Test;
import org.redisson.Config;
import org.redisson.RedissonClient;
import org.redisson.SingleServerConfig;
import org.redisson.core.RBucket;
import org.redisson.core.RLock;

import java.util.concurrent.TimeUnit;

/**
 * Created by cz
 */
public class RedissonTest {
    @Test
    public void test() throws InterruptedException {
        //redisson配置
        Config config = new Config();
        SingleServerConfig singleSerververConfig = config.useSingleServer();
        singleSerververConfig.setAddress("127.0.0.1:6379");
        singleSerververConfig.setPassword("redis");
        //redisson客户端
        RedissonClient redissonClient = RedisUtils.getInstance().getRedisson(config);
        RBucket<Object> rBucket = RedisUtils.getInstance().getRBucket(redissonClient, "key");
        rBucket.set("wangnian");
        System.out.println(rBucket.get());
        while (true) {
            RLock lock = redissonClient.getLock("lock");
            lock.tryLock(0, 1, TimeUnit.SECONDS);//第一个参数代表等待时间，第二是代表超过时间释放锁，第三个代表设置的时间制
            try {
                System.out.println("执行");
            } finally {
                lock.unlock();
            }
        }
    }
}
