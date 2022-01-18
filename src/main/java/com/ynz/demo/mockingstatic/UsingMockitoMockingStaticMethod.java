package com.ynz.demo.mockingstatic;

import lombok.extern.slf4j.Slf4j;
import org.mockito.Mockito;
import org.mockito.invocation.InvocationOnMock;
import org.mockito.stubbing.Answer;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneOffset;

@Slf4j
public class UsingMockitoMockingStaticMethod {

    public static void main(String[] args) {
        var expected = LocalDateTime.of(2001, 10, 1, 12, 0, 0).atZone(ZoneOffset.UTC).toInstant();

        try (var mockedStatic = Mockito.mockStatic(Instant.class)) {
            mockedStatic.when(Instant::now).then(new Answer<Instant>() {
                @Override
                public Instant answer(InvocationOnMock invocationOnMock) throws Throwable {
                    return expected;
                }
            });

            log.info("current instant: {}", Instant.now());
        }
    }
}
