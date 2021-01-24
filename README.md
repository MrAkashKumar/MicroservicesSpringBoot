# MicroservicesSpringBoot
it is micro-services spring boot application. we are creating API Gateway layer, registry service layer and two other service layer. it is communicating each to other. Every service goes to API Gateway layer. We are using multi technologies in this project like cloud services and other 

STEP 1 :: First run registery-service

STEP 2 :: After Run API-Gatway Service

STEP 3 :: After Run Employee-service 

STEP 4 :: After Run Company Service

*****************************************--------------*********************************

if you want to run on your local machine then use this command

Step 1 :: git clone https://github.com/MrAkashKumar/MicroservicesSpringBoot.git

Step 2 :: Import IDE (suggested IDE like :: Intellij IDEA) but you can use any IDE

Step 3 :: mvn clean install 

Step 4 :: Configure as per module and run 

Step 5 :: Enjoy and learn 

--------------***************----------------**************--------------***************

API Details of each services 

..............**********.........................*******************.....................
STEP 1 :: Create company details
      URL : localhost:9191/com/api/company
      TYPE : POST
      Request Body:: 
          {
              "companyName":"Anything",
              "companyLocation":"PUNE",
              "companyCode":"CODE"
          }
          
STEP 2 :: GET Company Details

    URL:: localhost:9191/com/api/company/1
    TYPE:: GET
    Response 
    
STEP 3 :: Create Employee details 
    URL :: localhost:9191/emp/api/employee
    TYPE :: POST
    Request Body::
        {
              "employeeName":"Akash Kumar",
               "email":"akash.kumar@comany.com",
                "employeeCode":"Comany123",
                "companyId":"1"
        }    
        
STEP 4 :: GET Employee Details
 
    URL :: localhost:9191/emp/api/employee/1
    TYPE:: GET
    Response
    
    
Enjoy End !!!!!!!!!!

Thanks

if anything confusion please let me know


