# STARTING WITH DOCKER

Go to the root directory.

Build the docker image with:
`docker build -t mse_microservice .`

Run the docker container with:
`docker run -p 8080:8080 mse_microservice`


--- 
The application is now accessible 
http://localhost:8080/microservice/get

or

http://localhost:8080/microservice/post
