
package com.exam;

import com.exam.model.Role;
import com.exam.model.User;
import com.exam.model.UserRole;
import com.exam.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.crypto.bcrypt.BCrypt;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import java.util.HashSet;
import java.util.Set;

@SpringBootApplication
public class ExamserverApplication {

	@Autowired
	private UserService userService;

	@Autowired
	private BCryptPasswordEncoder bCryptPasswordEncoder;
	public static void main(String[] args) {
		SpringApplication.run(ExamserverApplication.class, args);
	}

//	@Override
//	public void run(String... args) throws Exception {
//		System.out.println("starting code");
//
//		User user = new User();
//		user.setFirstName("Adity");
//		user.setLastName("Shaw");
//		user.setUsername("shawadi");
//		user.setPassword(this.bCryptPasswordEncoder.encode("abc"));
//		user.setEmail("adi@gmail.com");
//		user.setProfile("default.png");
//
//		Role role = new Role();
//
//		role.setRoleId(44L);
//		role.setRoleName("ADMIN");
//
//		Set<UserRole> userRoles = new HashSet<>();
//		UserRole userRole = new UserRole();
//		userRole.setRole(role);
//		userRole.setUser(user);
//		userRoles.add(userRole);
//
//		User user1 = this.userService.createUser(user,userRoles);
//		System.out.println(user1.getUsername());
//
//	}
}
