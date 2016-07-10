package cz.self.redis;

import cz.self.entity.User;
import org.junit.Test;
import org.junit.Before; 
import org.junit.After;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/** 
* UserDaoImpl Tester. 
* 
* @author <Authors name> 
* @since
* @version 1.0 
*/
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"/applicationContext-test.xml"})
public class UserDaoImplTest {

    @Autowired
    private UserDao userDao;

@Before
public void before() throws Exception { 
} 

@After
public void after() throws Exception { 
} 

/** 
* 
* Method: add(User user) 
* 
*/ 
@Test
public void testAdd() throws Exception { 
    User user = new User();
    user.setId(10000l);
    user.setName("cz");
    user.setSex("M");
    userDao.add(user);
}

/** 
* 
* Method: get(Long id) 
* 
*/ 
@Test
public void testGet() throws Exception { 
//TODO: Test goes here... 
} 

/** 
* 
* Method: delete(Long id, long opuid, Date lastmodify) 
* 
*/ 
@Test
public void testDelete() throws Exception { 
//TODO: Test goes here... 
} 

/** 
* 
* Method: getKey(Long id) 
* 
*/ 
@Test
public void testGetKey() throws Exception { 
//TODO: Test goes here... 
} 


} 
