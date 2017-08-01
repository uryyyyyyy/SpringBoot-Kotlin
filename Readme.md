
# Spring-boot-web & kotlin

## about

- spring-boot-starter-web: 2.0-M4
- Gradle: 4.
- Kotlin: 1.1.X

## dev run

```
./gradlew bootRun
```

with hot reload

```
./gradlew --continuous compileJava
```

it can work with spring-boot-dev-tools at bootRun(not in executable jar)

## test

```
./gradlew test
```

## build & deploy

```
./gradlew build
java -jar ./build/libs/spring-boot-sample-0.1.0.jar
```

## Licence

MIT