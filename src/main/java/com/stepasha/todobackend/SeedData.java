//package com.stepasha.todobackend;
//
//
//import com.stepasha.todobackend.models.Role;
//import com.stepasha.todobackend.models.Todo;
//import com.stepasha.todobackend.models.User;
//import com.stepasha.todobackend.services.RoleService;
//import com.stepasha.todobackend.services.UserService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.CommandLineRunner;
//import org.springframework.stereotype.Component;
//import org.springframework.transaction.annotation.Transactional;
//
//import java.util.Date;
//
//@Transactional
//@Component
//public class SeedData implements CommandLineRunner {
//    @Autowired
//    RoleService roleService;
//
//    @Autowired
//    UserService userService;
//
//
//    @Override
//    public void run(String[] args) throws Exception {
//        Role r1 = new Role("admin");
//        Role r2 = new Role("user");
//        Role r3 = new Role("data");
//
//        r1 = roleService.save(r1);
//        r2 = roleService.save(r2);
//        r3 = roleService.save(r3);
//
//        User u1 = new User(
//        );
//        u1.addRole(r1);
//        u1.addRole(r2);
//        u1.addRole(r3);
//        u1.getTodos()
//                .add(new Todo("Finish java-orders-swagger",
//                        new Date(),
//                        u1));
//        u1.getTodos()
//                .add(new Todo("Feed the turtles",
//                        new Date(),
//                        u1));
//        u1.getTodos()
//                .add(new Todo("Complete the sprint challenge",
//                        new Date(),
//                        u1));
//
//        userService.save(u1);
//
//        User u2 = new User(
//        );
//        u2.addRole(r2);
//        u2.addRole(r3);
//        u2.getTodos()
//                .add(new Todo("Walk the dogs",
//                        new Date(),
//                        u2));
//        u2.getTodos()
//                .add(new Todo("provide feedback to my instructor",
//                        new Date(),
//                        u2));
//        userService.save(u2);
//
//        // user
//        User u3 = new User(
//        );
//        u3.addRole(r2);
//        userService.save(u3);
//
//
//        User u4 = new User(
//        );
//        u4.addRole(r2);
//        userService.save(u4);
//
//        User u5 = new User(
//        );
//        userService.save(u5);
//    }
//}
