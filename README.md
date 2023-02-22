# movie-book

### Description

Simple Restful API with the main goal to book tickets online for movies. The API uses MongoDB Atlas as a database.

## Used Technologies:
* **Spring Boot** 3.0.1(Data JPA, Security, Spring Web)
* **MongoDB Atlas**
* **JWT** for api authentication
* **Heroku** for deployment

## How to use:
* First of all you have to register or authenticate and get the token, since all the other endpoints need tokens.
* Users can only access get endpoints.
* All other CREATE, UPDATE , DELETE operations needs *ADMIN* role


## Models:
* Hall
* Movie
* Schedule
* Session


## Endpoint logic:
**Get method for single object patterns:**  *url/api/{model_name}/{unique_key}*

**Get method for all objects patterns:**  *url/api/{model_name}*

**All CREATE patterns:** *url/api/admin/{model_name}*

**All UPDATE , DELETE patterns:** *url/api/admin/{model_name}/{unique_key}*

**Endpoint to buy a ticket:** *url/api/tickets/book/{session}/{row}/{seat}*