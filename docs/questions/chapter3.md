# Questions
1. What are ORM, JPA, and Hibernate?
    - ORM( Object Relational Mapping ) is a technique
    that allows you to fetch and manipulate a database by
    using object-oriented style.
    - JPA(Jakarta Persistance API) Provides the ORM for us.
   
2. How can you create an entity class?
    - Create a new package folder called domain and
    add a Entity class inside that folder.
   
3. How can you create a CrudRepository?
    - By creating a interface that relates to our Entity
   
4. What does a CrudRepository provide for your application?
    - CRUD Operations

5. How can you add demo data to a database with Spring Boot?
    - By using commandline runner

6. How can you access the H2 console?
    - define the h2 path in ```application.properties```
   and go to localhost:8080/h2-console in ur browser.
   
7. How can you connect your Spring Boot application to MariaDB?
    - By adding some configuration inside ```application.properties```
    file.
   ```properties
    spring.datasource.url=jdbc:mariadb://url-goes-here
    spring.datasource.username=root
    spring.datasource.password=
    spring.datasource.driver-class-name=org.mariadb.jdbc.Driver
    spring.jpa.generate-ddl=true
    spring.jpa.hibernate.ddl-auto=create-drop
    ```