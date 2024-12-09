package com.theelitelions20.HurricanePredictor;

import com.theelitelions20.HurricanePredictor.model.evacuation.Evacuation;
import com.theelitelions20.HurricanePredictor.model.evacuation.EvacuationDao;
import com.theelitelions20.HurricanePredictor.model.home.Home;
import com.theelitelions20.HurricanePredictor.model.home.HomeDao;
import com.theelitelions20.HurricanePredictor.model.safety.Safety;
import com.theelitelions20.HurricanePredictor.model.safety.SafetyDao;
import com.theelitelions20.HurricanePredictor.model.user.User;
import com.theelitelions20.HurricanePredictor.model.user.UserDao;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class HurricanePredictorApplicationTests {

	@Autowired
	//private UserDao userDao;
	//private HomeDao homeDao;
	//private SafetyDao safetyDao;
	private EvacuationDao evacuationDao;
/*
	//@Test
	void addUserTest() {
		User user = new User();
		user.setFirstName("Sabrina");
		user.setLastName("Lang");
		user.setAge(22);
		user.setUsername("CSabrina96");
		userDao.save(user);
	}


 */

	/*@Test
	void addHomeTest(){
		Home home = new Home();
		home.setHurricaneName("Milton");
		home.setStormNearby(true);
		home.setCurrentWindSpeed(13.7f);
		homeDao.save(home);
	}


	 */
	@Test
	void addEvacuationTest(){
		Evacuation evacuation = new Evacuation();
		evacuation.setShelterAddress("Larry");
		evacuation.setShelter("BRADON TRAIN");
		evacuationDao.save(evacuation);
	}


}
