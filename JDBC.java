=>1 JAR files:-

- It stands for Java Archives.
- A JAR file is a type of archive file format used to bundle Java class files, associated metadata, and resources into a single compressed file.

- JAR files are commonly used for packaging and distributing Java applications, libraries, or components.
- JAR files are compressed using the ZIP file format, which helps reduce file size and facilitates faster transfer over networks.
- A JAR file can contain multiple Java class files, along with resources such as images, audio files, configuration files, and other assets required by the application.
JAR files are commonly used for distributing libraries and dependencies that Java applications require.

=> Steps to create a JAR file in Eclipse IDE:-

1. Right click on the project for which you want to create JAR file.

2. Click on the "Export" option.

3. In the 1st dialogue box select "Java => JAR file" and click on Next.

4. In the 2nd dialogue box Select the resource you want to export from the project selected.

5. After that mark the box from "Export java source files and resources".

6. Then select a destination folder where you want to store the JAR file created and click on Finish.

=> Steps to add a JAR file into the current project:-

-

1. Right click on the project click on Build Path => Configure Build Path.

2. In the dialogue box click on the "Libraries" tab.

3. Select classpath if needed else skip.

4. Then click on the "Add External JARs" option and select the JAR file from the destination folder.

5. Then click on Apply and Close.

=> Servers:-

A server is a large computer system or a small software program that provides services or resources to other computers, known as clients, over a network.

> It is the one which serves client request.

> For a server to serve a client request, resource must be available.

Types of web servers:-

1. Web server

2. Application server

3. Database server

1. Web Servers:-

=> A web server handles HTTP requests from clients, typically web browsers, and delivers web content like HTML.

= > It serves static content like HTML pages, images, and files.

Ex: Apache HTTP server, Caddy, Nginx, LiteSpeed web server.

2. Application Servers:-

=> An application server is responsible for executiong application code and business

logic.

> > It handles dynamic content generation and often interacts with databases.

=>Common tasks include transaction management, security and connection pooling.

Ex: Apache Tomcat, WildFly and IBM WebSphere.

3. Database Servers:-

1 => A database server manages and provides access to a database.

=> It stores, retrieves, and manipulates data based on requests from application servers or other clients.

=> Ex: MySQL, PostgreSQL, Oracle Database, MySQL server.




Steps to add Server to the Eclipse IDE:-

1. On the top right corner of the IDE click on search button.

2. Search for "Servers" and click on Enter.

3. In the "Servers" tab click on the option "Click this link to create a new server".

Steps to add Server to the Eclipse IDE:-

1. On the top right corner of the IDE click on search button.

2. Search for "Servers" and click on Enter.

3. In the "Servers" tab click on the option "Click this link to create a new server".

4. In the 1st dialogue box select the server (Apache Tomcat v9.0) and click on Next.

5. In the 2nd dialogue box click on "Browse" button and specify the path of the destination folder where Tomcat server is downloaded.

6. Click on Finish.

> > > Properties file in JDBC:-

A properties file in JDBC is a text file used to store configuration details required to connect with a database.

This file typically includes key-value pair specifying the necessary connection details such as database url, username and password.

It is loaded using the Properties class of java present in java.util package.

Advantages:-

1. Separation of Configuration and Code:

Storing database configuration parameters in a properties file helps keep the code clean and maintainable by separating configuration details from the application logic.

2. Easier Maintenance: Changes to the database connection details can be made directly in the properties file without altering the Java code.

3. Security:

Sensitive information such as database passwords can be managed more securely, and access can be restricted to the properties file.

Steps to read data from the properties file:-

1. Create a file with ".properties" extension directly inside the project.

2. In the Java Application create an object of FileReader class and pass the configuration file name inside the constructor in order to read it inside the java code.

3. Then create an instance of Properties class which is needed to load the content present inside a properties file.

4. Next invoke the load() method using the instance of Properties class and pass the FileReader object reference as the parameter in order to load it to the Properties object.

5. If you have some properties defined inside the file whose key won't be recognized by the Properties object then you have to manually load it using the getProperty() method using Properties object and pass the key as parameter.

6. After that invoke getConnection() method accepting 2 parameters and pass the dbURL and Properties object ref as parameter.

ex: Connection conn = DriverManager.getConnection(String dbURL, Properties p);

JDBC Interview Questions:-

1. What is the drawback of core java ?

2. What is the drawback of File Handling?

3. What is JDBC ?

4. What are the steps for JDBC ?

5. What are the components used from java.sql package?

6. What is a Driver ?

7. What is the difference between Driver (I) and Driver(C)?

8. How many ways can we load & register a Driver? Explain.

9. What is DriverManager?

10. What is a Connection? How to establish a Connection in JDBC?

11. How many types getConnection() methods are present in JDBC ?

12. What is the returntype of getConnection() method ?

13. what is a Database url? Explain.

14. What is a Statement ?

15. What are the types of Statement in JDBC ?

16. What is the returntype of createStatement() method?

17. What is the returntype of prepareStatement() method?

18. What are the methods used to execute a Statement? What are the returntypes ?

19. Why is it necessary to close the Connection ?

20. What are the steps to read the data from .properties file ?

//Step 1 : Load & Register the Driver
// Driver driver = new com.mysql.cj.jdbc.Driver();
// DriverManager.registerDriver(driver);
//New Step 1
Class.forName("com.mysql.cj.jdbc.Driver");
//Step 2 : Establish a Connection
// Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306","root","root");
//New Step 2
Connection connect = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_actordb?user=root&password=root");
//Step 3 : Create a Statement
// Statement st = conn.createStatement();
//New Step 3
PreparedStatement pst = connect.prepareStatement("insert into jdbc_actordb.actor values (?,?,?,?,?)");
<!-- //HardCoded Values
//			pst.setInt(1, 1);
//			pst.setString(2, "King Khan");
//			pst.setInt(3, 59);
//			pst.setString(4, "BollyWood");
//			pst.setString(5, "INDIAN"); -->
//Dynamic Values
System.out.println("Enter the ACTOR ID : ");
pst.setInt(1, sc.nextInt());
sc.nextLine();
System.out.println("Enter the Actor Title : ");
pst.setString(2, sc.nextLine());
System.out.println("Enter the Actor Age : ");
pst.setInt(3, sc.nextInt());
System.out.println("Enter the Actor's Industry : ");
pst.setString(4, sc.next());
System.out.println("Enter the Actor's Nationality : ");
pst.setString(5, sc.next());
//Step 4 : Write a Query
// int rowsInserted = st.executeUpdate("insert into jdbc_actordb.actor values(1,'King Khan',59,'BollyWood','Indian')");
//New Step 4
int rowsInserted = pst.executeUpdate();
//Step 5 : Get the Result
if ( rowsInserted > 0 ) {
System.out.println(rowsInserted+" rows are inserted");
}else {
System.out.println("No rows are inserted.");
}
//Step 6 : Close the Connection
// conn.close();
connect.close();
} catch (SQLException | ClassNotFoundException e) {
e.printStackTrace();
}

    }
