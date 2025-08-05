>>JSP:-

It stands for Java Server Pages.

It is a type of view technology file which is similar to as that of HTML but provides some extra features to the user in perspective of java.

It provides some specific tags using which we can write the Java logic inside a JSP file.

JSP allows for dynamic content generation by embedding Java code within HTML-like tags.

It understands java objects and allows the user to import java classes inside a JSP

file. We can include another view technology file in a current JSP file.



>>Tag in JSP:-1

1.  Directive tag

It is used to add some external resources to the current JSP file (import statements for java, any other view technology file etc).

2. Declarative tag

This tag is used to declare java components inside the JSP file.

3. Expression tag

This tag is used as a print statement in JSP to access the variables

4.  Scriptlet tag

declared. It is used to write the hard code java logic typically (looping condition)





>>HttpServlet (A):-

It is a specialization of GenericServlet specifically designed to handle HTTP requests.

It extends GenericServlet and provides additional methods specifically for handling HTTP requests such as doGet, doPost, doPut, doDelete, etc.

Use HttpServlet when you are specifically building a servlet for handling HTTP requests.

It provides convenience methods for handling common HTTP operations, making it easier to work with HTTP-specific features.



>>>RequestDispatcher: -

It is an interface present in javax.servlet package.

It is used to forward or include responses to other servlets, a JSP or an HTML file.

It is a part of servlet API which allows servlets to collaborate in processing client

requests.

When you forward a request using RequestDispatcher, the original request URL remains unchanged in the client's browser.

Overall RequestDispatcher provides a way to modularize and organize code in servlet-based web applications.

It has two methods using which we can forward or include the response.

1. forward(req, resp):-

This is useful in cases where you want to perform some processing in one servlet and then hand over the request to another servlet for further processing or response generation.

The control will be given back to the servlet again, but the req and resp object will no longer be available to use in the current servlet.






>>>Lifecycle of a Servlet:-

1. Loading and Instantiation

The servlet container loads the servlet class into memory when it receives the first request for the servlet or during server startup.

Once loaded, the container instantiates the servlet object.

This is an one time process.

YOU ARE UNDER CETV

SURVEILLANCI

2. Initialization (init() Method)

The container invokes the servlet's init() method only once after instantiation.

This is where the servlet initializes resources like database connections or configurationi parameters.

It is also an one time process

The container invokes the servlet's init() method only once after instantiation.

This is where the servlet initializes resources like database connections or configuration parameters.

It is also an one time process.

3. Request Handling (service() Method)

After initialization, the container calls the service() method for each client request.

The service() method determines the request type (e.g., GET, POST) and calls the appropriate method (doGet(), doPost(), etc.).

4. Destruction (destroy() Method)

When the servlet is no longer needed (e.g., the server is shutting down), the servlet container invokes the destroy() method.

Once the destroy() method is invoked the servlet object will be killed and will no longer be available to handle requests.
