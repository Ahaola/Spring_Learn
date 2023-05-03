import com.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
//        ApplicationContext context= new ClassPathXmlApplicationContext("spring-config.xml");
//        UserController userController = context.getBean(UserController.class);
//        userController.sayHi();

//        ApplicationContext context= new ClassPathXmlApplicationContext("spring-config.xml");
//        UserService userService = context.getBean(UserService.class);
//        userService.sayHi();

//        ApplicationContext context= new ClassPathXmlApplicationContext("spring-config.xml");
//        UserRepository userRepository = context.getBean(UserRepository.class);
//        userRepository.sayHi();

//        ApplicationContext context= new ClassPathXmlApplicationContext("spring-config.xml");
//        UserConfiguration userConfiguration = context.getBean(UserConfiguration.class);
//        userConfiguration.sayHi();


//        ApplicationContext context= new ClassPathXmlApplicationContext("spring-config.xml");
//        UserComponent userComponent = context.getBean(UserComponent.class);
//        userComponent.sayHi();

//      User user = context.getBean("user1", User.class);
//        ApplicationContext context= new ClassPathXmlApplicationContext("spring-config.xml");
//        User user = context.getBean(User.class);//只使用类属性
//        System.out.println(user);

//        ApplicationContext context= new ClassPathXmlApplicationContext("spring-config.xml");
//        User user = context.getBean("user1",User.class);//只使用类属性
//        System.out.println(user);

        ApplicationContext context= new ClassPathXmlApplicationContext("spring-config.xml");
        UserController4 userController4 = context.getBean(UserController4.class);
        userController4.sayHi();
    }
}
