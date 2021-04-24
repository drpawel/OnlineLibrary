# OnlineLibrary
***
REST service in OPENApi format. The goal of app is returning list of books by its title or IBAN number.

### Examples

Request `GET /api/book/IBAN/1998484167` with the following body:
```JSON
{
    "Books": [
        {
            "title": "Ferdydurke",
            "author": "Witold Gombrowicz",
            "iban": "1998484167"
        }
    ]
}
```

Request `GET /api/book/title/Ferdydurke` with the following body:
```JSON
{
    "Books": [
        {
            "title": "Ferdydurke",
            "author": "Witold Gombrowicz",
            "iban": "1998484167"
        }
    ]
}
```
Request GET /api-docs with the following body:
```JSON
{
    "openapi": "3.0.1",
    "info": {
        "title": "OpenAPI definition",
        "version": "v0"
    },
    "servers": [
        {
            "url": "http://localhost:8889/",
            "description": "Generated server url"
        }
    ],
    "paths": {
        "/api/book/title/{title}": {
            "get": {
                "tags": [
                    "app-controller"
                ],
                "operationId": "getBookByTitle",
                "parameters": [
                    {
                        "name": "title",
                        "in": "path",
                        "required": true,
                        "schema": {
                            "type": "string"
                        }
                    }
                ],
                "responses": {
                    "200": {
                        "description": "OK",
                        "content": {
                            "application/json": {
                                "schema": {
                                    "type": "object",
                                    "additionalProperties": {
                                        "type": "object"
                                    }
                                }
                            }
                        }
                    }
                }
            }
        },
        "/api/book/IBAN/{IBAN}": {
            "get": {
                "tags": [
                    "app-controller"
                ],
                "operationId": "getBookByIBAN",
                "parameters": [
                    {
                        "name": "IBAN",
                        "in": "path",
                        "required": true,
                        "schema": {
                            "type": "string"
                        }
                    }
                ],
                "responses": {
                    "200": {
                        "description": "OK",
                        "content": {
                            "application/json": {
                                "schema": {
                                    "type": "object",
                                    "additionalProperties": {
                                        "type": "object"
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    },
    "components": {}
}
```

