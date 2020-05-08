# graphql-java-server-codegen-example
graphql-java-server-codegen-example

# 开发使用 graphql-java-server-codegen-gradle-plugin
1. build.gradle
```
{
    id "com.contentbig.graphql.server.codegen" version "1.3.0"
}    
```
1. 生成代码生成代码
```shell script
$ ./gradlew clean graphqlCodegen 
```
1. 构建example
```shell script
$ ./gradlew clean build 
```

