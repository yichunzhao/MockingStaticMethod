package com.ynz.demo.mockingstatic;

import lombok.extern.slf4j.Slf4j;
import org.mockito.Mockito;

import java.time.ZoneOffset;
import java.time.ZonedDateTime;

@Slf4j
public class UsingMockitoMockingStaticMethodArguments {

    public static void main(String[] args) {

        var expected = ZonedDateTime.of(1990, 9, 01, 12, 30, 1, 1, ZoneOffset.UTC);

        try (var mockedZonedDateTime = Mockito.mockStatic(ZonedDateTime.class)) {
            mockedZonedDateTime.when(() -> ZonedDateTime.now(ZoneOffset.UTC)).thenReturn(expected);
            var currentYear = ZonedDateTime.now(ZoneOffset.UTC).getYear();
            log.info("Current year: {}", currentYear);
        }
    }
}
