# Microservices

## Description 

A small assignment to familarize myself with the communication between microservices, assigned by my university module "modern software development".

<details>
  <summary>Peak assignment</summary>

  Explore microservices! (including API tools like Swagger, Kong, Dropwizard, etc.). Build a small one with nano-functions ;-) (Hint: Consider Spring Boot, FastAPI, Restful-Flask, or others). Feel free to deploy on Docker and establish some form of communication.

</details>


## Docker setup
Go to the root directory.

Build the docker image with:
`docker build -t mse_microservice .`

Run the docker container with:
`docker run -p 8080:8080 mse_microservice`


The application is now accessible. 

The implemented routes are:
- `http://localhost:8080/microservice/get`
- `http://localhost:8080/microservice/post`
- `http://localhost:8080/microservice/get/{id}`


## Swagger Setup
The Swagger Doc is available at http://localhost:8080/swagger-ui.html in the browser.
