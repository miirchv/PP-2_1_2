import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {

        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);

        HelloWorld helloBean1 =
                (HelloWorld) applicationContext.getBean("helloworld");
        HelloWorld helloBean2 =
                (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(helloBean1);
        System.out.println(helloBean2);
        System.out.println(helloBean1 == helloBean2);

        Cat catBean1 =
                (Cat) applicationContext.getBean("cat");
        Cat catBean2 =
                (Cat) applicationContext.getBean("cat");
        System.out.println(catBean1);
        System.out.println(catBean2);
        System.out.println(catBean1 == catBean2);

    }
}