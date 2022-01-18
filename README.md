# MockingStaticMethod

How to mocking static method

maven dependencies, must be higher than version 3.4
''''
<dependency>
<groupId>org.mockito</groupId>
<artifactId>mockito-core</artifactId>
<version>4.2.0</version>
</dependency>
<dependency>
<groupId>org.mockito</groupId>
<artifactId>mockito-inline</artifactId>
<version>4.2.0</version>
</dependency>
''''

> By default all methods are mocked. However, using Mockito.CALLS_REAL_METHODS you can configure the mock to actually trigger the real methods excluding only one.