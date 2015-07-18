<snippet>
  <content><![CDATA[
# ${1:Student Management System}

This is a simple student management system created with spring framework,javascript,
MongoDB etc.

## Installation

1. Clone the repository to local machine
2. Go to folder where pom.xml is located
3. Execute command 'mvn clean install'
4. For Intelij Idea IDE execute command 'mvn idea:idea'  (if you are using eclipse IDE please use 'mvn eclipse:eclipse')
5. Create a local tomcat configuration using your IDE (use artifact CingleVueProject:war exploded for deployment)
6. Run tomcat configuration
7. Start MongoDB in default settings (in default port) (you can set mongodb properties in src/main/webapp/resources/database.properties file)
7. If everything's ok, you can access web application via "localhost:8080/students" in your browser

]]></content>
  <tabTrigger>readme</tabTrigger>
</snippet>