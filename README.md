
# UserManagement
user management using java Spring boot with validation input
## Framework

 - Java Spring Boot 
 - JPA
 - H2 Database
 - Hibernate
 - lombok


## API Reference

#### Get all items

```http
  GET /getusers
```


#### Add User

```http
  GET /getuser/{id}
```

| Parameter | Type     | Description                       |
| :-------- | :------- | :-------------------------------- |
| `id`      | `int` | **Required**. Id of item to fetch |


#### Post User


```http
  POST /user
```


#### Update User

```http
  PUT /getuser/{id}/{name}
```

| Parameter | Type     | Description                       |
| :-------- | :------- | :-------------------------------- |
| `id`      | `int` | **Required**. Id of item to fetch |
|  `name`   | `String` | **Optinal** Name to update|


#### Delete User

```http
  DELETE /delete/{id}
```

| Parameter | Type     | Description                       |
| :-------- | :------- | :-------------------------------- |
| `id`      | `int` | **Required**. Id of item to delete |



## Authors

- [@Yogesh](https://github.com/Yogesh-VasanthaKumar/)


