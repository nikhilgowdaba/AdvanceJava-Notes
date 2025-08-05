>>Spring Framework:-

Spring is a framework of frameworks.

It provides a model of configuration and comprehensive programming for the development of any java application.

The major goal of spring is to handle infrastructure or configuration so that the developer can focus on business logic.

Spring framework encourages a modular approach, making it easier to develop and maintain code.

Dependency injection promotes writing testable code, and the framework integrates well with testing tools.

In Spring the object which are handled by spring container are known as beans.

The most prominent feature of Spring are:-

1. IOC Inversion of control

2. DI Dependency Injection

1. IoC:-

It stands for Inversion of Control.

The process of inverting the control of object creation and lifecycle management by the developer from the application code to the Spring container is known as IoC.

Spring Tor is a core principle of the Spring Framework that handles the creation.and management of objects and their dependencies.

2. DI:-

The process of injecting One Object inside another Object as a dependency in spring is called as Dependency Injection.

In other words we can say injecting one class object inside another class without actually creating the object inside it using the new keyword, but taking the object from the spring bean container.

In order to perform DI both the classes object creations must be handled by the Spring Container.


>>>BeanFactory(I):-

BeanFactory is a basic container that provides fundamental features for managing bean objects.

It is present in org.springframwork.beans.factory package.

It is considered as a Lazy loader because it creates object for the desired class only when it is requested by invoking the the getBean() method from the BeanFactory.

It is memory efficient as compared to ApplicationContext as it doesn't create object for all the bean definitions declared in the spring.xml file once it is loaded.

We can give implementation to BeanFactory interface by creating an object of the XMLBeanFactory which is in composition with FileSystemResource and pass the spring configuration file name inside the constructor of FileSystemResource.

FileSystemResource can read the spring configuration file from the file path itself that mean we need to create the xml file directly inside the project in order to access it.


>>>ApplicationContext(I):-

It is a child interface of BeanFactory also it is an advanced container with some advanced features

It is present in org.springframework.context package.

It is considered to an Eager loader because it creates object for all the bean definition declared in the spring.xml file

once it is loaded into the container. So, when the user invokes the getBean() method for the 1st time it provides the object which is already created.

It is not memory efficient as compared to BeanFactory as it create objects for all the bean definition declared in the spring.xml file once it is loaded and won't wait for the user to ask for it.

We can give implementation to ApplicationContext by creating object of either of the two subclasses of it i.e. ClassPathXmlApplicationContext and AnnotationConfigApplicationContext.

ClassPathXmlApplicationContext can read the spring configuration file form the class path that means we need to place the xml file inside the src/main/java folder.

>> There are two ways to configure the bean:-

1. XML based Configuration

2. Annotation based Configuration

* Annotation Based Configuration:-

In annotation based configuration we don't use xml file for the bean configuration in spring, instead we use some specific annotations over the classes for which we want spring to create the object and maintain the lifecyle of the object.

Here we declare a AppConfig class with @Configurartion and @ComponentScan annotation where we provide the details of the packages that are supposed to be scanned by spring.

In this case we use another sub-class to provide implementation to the ApplicationContext interface i.e, AnnotationConfigApplicationContext and pass the configuration class name in the constructor.

So, once the Configuration class is found and the basepackages details is read, then spring scans all the lasses present in that package as well as its sub-packages, and create beans for all the classes annotated with stereotyped annotations.


>>Annotations in Spring Framework:-

1.@Configuration:-

The @Configuration annotation is used to indicate that a class declares one or more bean definitions and is a source of bean definitions for the Spring application context.

It is a fundamental building block for creating Spring-based applications, particularly when using Java-based configuration instead of XML.

2.@ComponentScan:-

We use @ComponentScan annotation always with @Configuration annotation in order to scan all the stereotyped annotated class present in the package and subpackages for bean creation.

3.@Bean :-

The @Bean annotation is used to declare a method as a bean definition method within a Spring configuration class.

When Spring's container is initialized, the methods annotated with @Bean are Invoked, and the objects returned by these methods are managed as Spring beans within the container.