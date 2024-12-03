package com.theelitelions20.HurricanePredictor;

import com.theelitelions20.HurricanePredictor.model.user.User;
import com.theelitelions20.HurricanePredictor.model.user.UserDao;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class HurricanePredictorApplicationTests {

	@Autowired
	private UserDao userDao;

	@Test
	void addUserTest() {
		User user = new User();
		user.setFirstName("Sabrina");
		user.setLastName("Lang");
		user.setAge(22);
		user.setUsername("CSabrina96");
		userDao.save(user);
	}

}
