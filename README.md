# solutions


Solutions to green lights.


## Sample output for the first 20s
0: N = 0; S = 0; E = 0; W = 0
1: N = 0; S = 0; E = 1; W = 1
2: N = 0; S = 0; E = 2; W = 2
3: N = 0; S = 0; E = 3; W = 3
4: N = 1; S = 1; E = 4; W = 4
5: N = 2; S = 2; E = 5; W = 5
6: N = 3; S = 3; E = 5; W = 5
7: N = 4; S = 4; E = 5; W = 5
8: N = 5; S = 5; E = 6; W = 6
9: N = 6; S = 6; E = 7; W = 7
10: N = 6; S = 6; E = 8; W = 8
11: N = 6; S = 6; E = 9; W = 9
12: N = 7; S = 7; E = 10; W = 10
13: N = 8; S = 8; E = 11; W = 11
14: N = 9; S = 9; E = 11; W = 11
15: N = 10; S = 10; E = 11; W = 11
16: N = 11; S = 11; E = 12; W = 12
17: N = 12; S = 12; E = 13; W = 13
18: N = 12; S = 12; E = 14; W = 14
19: N = 12; S = 12; E = 15; W = 15
20: N = 13; S = 13; E = 16; W = 16

```

## Build/deployment steps

For building and running the application you need:

- [JDK 1.8](http://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html)
- [Maven 3](https://maven.apache.org)

mvn clean install

## Running the application locally

There are several ways to run a Spring Boot application on your local machine. One way is to execute the `main` method in the `de.codecentric.springbootsample.Application` class from your IDE.

Alternatively you can use the [Spring Boot Maven plugin](https://docs.spring.io/spring-boot/docs/current/reference/html/build-tool-plugins-maven-plugin.html) like so:

```shell
mvn exec:java
```

