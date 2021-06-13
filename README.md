
## Required setup
In `src/main/resources/application.properties`: 
```
#MySQL Configuration
spring.datasource.url=jdbc:mysql://localhost:3306/employeemanager
spring.datasource.username=ADD_USER
spring.datasource.password=ADD_PASSWORD
spring.jpa.show-sql=true
spring.jpa.hibernate.ddl-auto=update
spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.MySQL5Dialect
```

