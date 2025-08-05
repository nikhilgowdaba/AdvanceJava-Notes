>>Spring MVC:-

MVC Stands for Model View Controller.

Spring MVC is a web framework provided by the Spring for building web applications in Java.

Spring MVC architecture is majorly based on client-server architecture.

It follows the MVC architectural pattern, which divides an application into three interconnected components: Model, View, and Controller.

1. Model

The Model represents the application's data and business logic. It encapsulates the state of the manipulate that data. application and provides methods to

In Spring MVC, the Model typically consists of objects that represent entities in the application, such as users, products, orders, etc.

2. View

The View represents the presentation layer of the application, responsible for rendering the user interface based on the data provided by the Model.

Views are responsible for generating HTML output that is sent back to the client's web browser for display.

3. Controller

The Controller acts as an intermediary between the Model and the View. It receives incoming requests from the client, processesthem, and determines how to respond.

In Spring MVC, Controllers are implemented as Java classes annotated with @Controller or @RestController annotations.

Controllers contain handler methods annotated with @RequestMapping that map specific URL patterns to business logic.


>> Flow of a request in Spring MVC Architecture: -

Whenever a request is triggered from client it hits the configuration file known as web.xml file(Deployment Descripter).

If there is no information present in the web.xml file it tries to search for the DispatcherServlet class.

We use a custom initializer class which must be a child of AbstractAnnotationConfigDispatcherServletInitializer(Abstract class) as a replacement of web.xml file.

The DispatcherServlet is responsible for 2 jobs using its specific overridden methods, first job is to invoke the spring bean container and creating the respective objects for the mentioned classes in the AppConfig class and second job is receiving the dynamic URL request coming from the U.I and send back the responses after processing the request.

The DispatcherServlet uses HandlerMapper and HandlerAdapter to achieve the above mentioned goal.

The HandlerMapper contain the information of all the handler methods present in the classes annotated with @Controller annotation.

After this all the respective handler details are sent back to the DispatcherServlet, using this information the DispatcherServlet talks to the HandlerAdapter and forwards the request to the respective Controller layer of the Application.

The HandlerAdapter acts as a connecting bridge between DispatcherServlet and Controller layers of the application.

Once the data is received on the Controller layer, it is then forwarded to other layers of the application to process the request.

Once the data is processed and the response is ready to be sent back to the client from the controller layer it again takes the help of HandlerAdapter to reach the DispatcherServlet.

Then the DispatcherServlet takes the help of the view resolver to get the information of the view technology file that needs to be rendered on the browser based on the request received and processed.

After the view technology file details is received then the DispatcherServlet will give back the response to the client.