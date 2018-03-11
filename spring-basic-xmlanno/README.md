##XML and Annotation
###Adding annotation to our application
	- Add the spring framework dependencies (spring-context)
	- In applicationContext.xml add context namespace
		<context:annotation-config/>
    	<context:component-scan base-package="org.spring.basic.xmlanno"/>

###Stereotype Annotations
	@Component - any POJO or bean
	@Service - business logic layer
	@Repository - data layer
	Semantically all are same		
	
###Where all can we use @Autowire annotation
	- member
	- constructor
	- setter