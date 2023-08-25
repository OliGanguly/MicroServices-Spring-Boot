# MicroServices-Spring-Boot


Inter service communication via API Calls
 ## Business service layer
* Department service [own db]
* Employee service [own db]


## Helper Services
* Service Registry - It is a server itself which has details about all the other services connected to it , its a hub which know how many services are attached to it , and how mant instance of that perticular service are also attached to it .

## Eureka server
It is server where different microservices will register themselves and serach about each other,
say we have 10 microservices and one microservices want to connect to other microservice .

![Service-Registry](https://github.com/OliGanguly/MicroServices-Spring-Boot/assets/82031303/ced303ff-e166-4121-80f6-7778aaec46ce)

* Creating a service-Registry -> eureka , spring web dependency

Two services are UP in Eureka server
![Screenshot 2023-08-25 111400](https://github.com/OliGanguly/MicroServices-Spring-Boot/assets/82031303/d5804125-7bc0-48d2-97a6-a6ba08577b9e)

ZipKin
![Zipkin1](https://github.com/OliGanguly/MicroServices-Spring-Boot/assets/82031303/673dca9a-ad6b-4775-bfbf-79cfbe1ad4d8)


