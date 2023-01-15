# MSE Microservice

# Docker
Go to the root directory.

Build the docker image with:
`docker build -t mse_microservice .`

Run the docker container with:
`docker run -p 8080:8080 mse_microservice`


The application is now accessible. The implemented routes are: 
http://localhost:8080/microservice/get
or
http://localhost:8080/microservice/post
or
http://localhost:8080/microservice/get/{id}


---
## Swagger
The Swagger Doc is available at http://localhost:8080/swagger-ui.html in the browser.
