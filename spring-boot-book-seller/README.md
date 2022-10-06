#Spring Boot Book Seller

## Endpoints

###Sign-Up


POST /api/authentication/sign-up HTTP/1.1
Host: localhost:8080
Content-Type: application/json


{
"name": "yy",
"username":"yy",
"password":"yy"
}


###Sign-In

POST /api/authentication/sign-in HTTP/1.1
Host: localhost:8080
Content-Type: application/json


{
"username":"yy",
"password":"yy"
}

#### Make-admin

PUT /api/internal/make-admin/admin HTTP/1.1
Host: localhost:8080
Authorization: Bearer InternalApiKey1234!