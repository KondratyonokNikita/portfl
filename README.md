# PORTFL

### application.properties

    spring.datasource.url=jdbc:mysql://localhost:3306/???
    spring.datasource.username=???
    spring.datasource.password=???
    spring.datasource.driver-class-name=com.mysql.jdbc.Driver

### email.properties

    smtp.host=smtp.???.ru
    smtp.port=465
    smtp.protocol=smtps
    smtp.username=???
    smtp.password=???
    
    cloud_name=???
    cloud_api_key=???
    cloud_api_secret=???

### META-INF/persistence.xml

    <persistence xmlns="http://java.sun.com/xml/ns/persistence"
                 xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
                 xsi:schemaLocation="http://java.sun.com/xml/ns/persistence http://java.sun.com/xml/ns/persistence/persistence_2_0.xsd"
                 version="2.0">
        <persistence-unit name="testsa">
            <provider>org.hibernate.ejb.HibernatePersistence</provider>
            <properties>
                <property name="javax.persistence.jdbc.driver" value="com.mysql.jdbc.Driver" />
                <property name="javax.persistence.jdbc.url" value="jdbc:mysql://localhost:3306/???" />
                <property name="javax.persistence.jdbc.user" value="???" />
                <property name="javax.persistence.jdbc.password" value="???" />
                <property name="hibernate.dialect" value="org.hibernate.dialect.MySQLDialect" />
                <property name="hibernate.show_sql" value="true" />
                <property name="hibernate.hbm2ddl.auto" value="update" />
            </properties>
        </persistence-unit>
    </persistence>
