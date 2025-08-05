>>Servlet:-

Servlet stands for server components.

Servlet is an API which helps to interact between the browser and the application server.

>We can create a servlet by implementing the Servlet(I) interface or extending either of the two abstract class (GenericServlet(A) & HttpServlet(A)).




>>*Servlet Interface:-

=>It is an interface present inside javax.servlet package which is used to develop server side programming application.

=> It has 5 unimplemented methods which define the lifecycle of a servlets.


1.  init() method This method is called by the servlet container to indicate that the servlet is being placed into service.

It is used for one-time initialization tasks, such as loading configuration parameters or establishing database connections.


2.  service(ServletRequest req, ServletResponse res) This method is called by the servlet container to handle each client request.

It is the core method where developers implement the logic to processincoming requests and generate appropriate responses.

The ServletRequest and ServletResponse parameters provide access to the client's request and the server's response, respectively.

3. destroy() This method is called by the servlet container to indicate that the servlet is being taken out of service.

Once this method is called, the servlet instance is no longer available for handling requests.


4. getServletConfig() This method returns a ServletConfig object that contains the servlet's configuration information.


5. getServletInfo() This method returns a string containing information about the servlet, such as its name and version.




>>
GenericServlet (A):-

It is an Abstract class present in javax.servlet package.

It implements the Servlet interface and provides implementation to all the abstract methods except the service() method where the developer is supposed to write the application's business logic.

GenericServlet is a generic, protocol-independent servlet used to design dynamic web application using any kind of protocol.

It is not http specific.

Diagram


>>>Configuration of a Static request:-

1. Whenever a request for a static content is given from the UI, the request enters the server and checks for the for the requested file inside the Application deployed inside the server.

2. Only thing to take care is the server is in running state and the application where the requested file is present must be deployed into the server.

Configuration of a Dynamic request:-

1. whenever a request for dynamic content is given from the UI, the request enters the server and checks for the web.xml file which is also known as the Deployment Descriptor.

2. In web.xml file it checks if there is a cservlet-mapping> tag with the requested "<url-pattern>".

3. Once the curl-pattern> matches then it reads the servlet-name given for the specific

4. <servlet-mapping> tag. It carries the <servlet-name> and checks for a <servlet> tag with the same <servlet-name>.

5. If a <servlet> tag is found with the same name then it gets the information of the <servlet-class> from the <servlet> tag.

6. After this process the instantiation of the servlet is done and further code will be executed.


>>>>Servlet Request:-

ServletRequest is an interface in the Java Servlet API present in javax.servlet package

It provides a way for servlets to read data from a client's request.

It is implemented by the servlet container to encapsulate the details of an HTTP request sent by a client to a servlet.

The ServletRequest interface provides methods to obtain information about the parameters and other attributes of the client's request.

>>>Servlet Response:-

It is an interface in the Java Servlet API present in javax.servlet package.

It defines the methods that a servlet can use to send a response back to the client.

It is implemented by the servlet container to provide an abstraction for handling responses in a servlet.

PrintWriter:-

Printwriter is a Java class in the java.io package that provides methods for printing formatted text to a file.

In the context of servlets and web development, the PrintWriter class is frequently used to send text data (such as HTML content) as the response from a servlet to the client's browser.


>>>Servlet Interview Questions:-

1. What is an Application? What are the different types of application ?

2. What is a StandAlone Application ?

3. What is a Web-based Application?

4. What are the types of Web-based Applications ? Explain.

5. Explain all the web architetures ?

6. What is an API ?

7. What is a Server?

8. What are the different types of Servers ? Explain.

9. What is an URL ?

10. What is the components present in an URL ?

11. What is a Servlet?

12. What is Servlet Interface ?

13. What are the unimplemented methods in Servlet Interface ? Explain

14. What is Generic Servlet?

15. what are the steps to Configure a Static Request ?

16. What are the steps to configure a Dynamic Request?

17. What is the method used to receive the inputs from the view files ?

18. What is the returntype of getParameterMethod()?

19. What is Servlet Request & Servlet Response ?

20. What is PrintWriter ?

21. How can we create an object of PrintWriter ?

22. What is HttpServlet?

23. What is the difference between GenericServlet and HttpServlet?

24. What are the methods present in HttpServlet?

25. What is JSP ?

26. What are the differences between HTML & JSP ?

27. What are the tags used in JSP? Explain

28. What is RequestDispatcher ?

29. What is the method used to create an object of RequestDispatcher ?

30. What are the methods in RequestDispatcher used to carry the data to next layer ?

31. What is the use of sendRedirect() method ?  

32. State differeneces between RequestDispatcher and sendRedirect().

33. What is the difference between forward() and include() method of RequestDispatcher ?

34. Explain Servlet Lifecycle with diagram.