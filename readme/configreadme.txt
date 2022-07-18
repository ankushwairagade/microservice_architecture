

Data-Service
		- Port:  9002
		
@Get Method for testing				/data/live
@Post Method for Adding UserData 		/data/add	
@Get Method for Reading UserData		/data/user/{userId}
@Delete Method for Delete UserData		/data/user/{userId}





User-Service
		- Port: 9001
		
@Get Method for Reading UserInfo	/user/{userId}
@Post Method for Adding UserInfo 	/user/{userId}
@Delete Method for Remove UserInfo	/user/{userId}


APIGATEWAY 
		- Port: 8999
		
 --- config for FallbackControl --- Not Configure
 
 
 EUREKA-SERVER
 		- Port: 8761
 		
 
 KAFKA-SERVICE and EMAIL 
 Produce and Consumer both are in one place
 
 kafka.consumer-server:localhost: 9092
 
 kafka.producer-server:localhost: 9892
 
 
 
 
 		

