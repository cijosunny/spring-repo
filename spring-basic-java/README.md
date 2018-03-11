## Only Java Configuration No XMLs
	- Only thing is there is no applicationContext.xml instead there is only one AppConfig.java
	- AppConfig.java should have a @Configuration annotation at class level
	- <bean> are now defined as methods with @Bean annotation at method level

SetterInjection and Constructor Injection happens as if like normal java program
We will have to create a Setter for Setter Injection
We will have to create a Constructor for Constructor Injection
We will be initializing the Bean in AppConfig, we can use either constructor injection or setter injection while defining a bean
	
### @Autowire
##### @Autowire at member variable expects any one of below method
	- Expects @Repository on @Autowired Type
		If there are more than one implementation of @Autwired type, @Qualifier can be used
	- Expects a @Bean in AppConfig.java with the name of @Autowired member
		If annotated with @Autowired it will inject the bean with the matching type (An exception will be thrown if there are more than one of a type). To specify a name use the @Qualifier annotation.
		
### Scopes
	- 5 Scopes
		- Singleton - One Object, Default Scope - One instance per Spring Container
		- Prototype - New object on each request
		- Request - per HTTP request
		- Session - per user session
		- Global Session - per application session
	
### Using Properties file
##### XML Config
	<context:property-placeholder location="application.properties"/>
	<bean name="customerRepository" 
			class="com.sample.UserRepositoryImpl">
		<property name="dbUserName" value="${dbUserName}"/>	
	</bean>
	
##### Annotation Config
	@Value("${dbUserName}")
	private String dbUserName;	