# Spring Boot 3 + Postgresql + Microstream - Example

- Java 17
- Spring Boot 3
- Microstream
- Postgresql


Running
--
`` mvn spring-boot:run ``

```
POST http://localhost:8080/students
Content-Type: application/json

{
    "name": "Bruce"
}
```

### Note

To use Record you need to put extra config in jvm args

``--add-exports java.base/jdk.internal.misc=ALL-UNNAMED``
