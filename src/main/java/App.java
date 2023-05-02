import com.User;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

public class App {
    public static void main(String[] args) {
//        //获取Spring上下文
        ApplicationContext context= new ClassPathXmlApplicationContext("spring-config.xml");
        //获取指定Bean对象
//        User user = context.getBean(User.class);
//        user.sayHi("多次注册出现问题");
//        User user = (User)context.getBean("user");
        //使用bean对象
//        user.sayHi("ApplicationContext");
        //第三种方法
        User user3 = context.getBean("user",User.class);
        user3.sayHi("根据bean的id和bean的类型获取bean");

        //获取spring上下文
        //这个方法在spring3.1之前使用的，当然现在也可以使用，以后可能被废除
        BeanFactory beanFactory = new XmlBeanFactory(new ClassPathResource("spring-config.xml"));
//        //获取指定的Bean对象
//        User user = (User) beanFactory.getBean("user");
//        //使用Bean对象
//        user.sayHi("BeanFactory方法");
    }
}
