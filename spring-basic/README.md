Spring removes "configuration codes" from your application
Spring context is a sort of HashMap

##Beans
Beans are POJOs used in application context
Beans can replace keyword new
Define class, use Interfaces

##Injection
###Setter Injection
It is name based

###Constructor Injection
It is index based
Should define a constructor for each possibility

##Autowire
	- to reduce xml configuration
####Types
	- Constructor - 
	- byType - If exactly one bean exist in the container of that Type, needs a setter wih that type
	- byName - needs a setter with the name of the bean
	- no
	







