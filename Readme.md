### @Component 已经可以支持声明一个 bean 了，为何还要再弄个 @Bean 出来？


@Component  注解通常表明该类将作为组件类，并告知Spring要为这个类创建bean，
是通过类路径扫描来自动侦测以及自动装配到Spring容器中。


@Bean  注解通常是在标有该注解的方法中定义产生bean，
告诉Spring这个方法将会返回一个对象，这个对象要注册为Spring应用上下文中的bean。


相比于@Component，而@Bean的用途则更加灵活，
当引用第三方库中的类需要装配到Spring容器时，只能通过@Bean来实现