package org.howard.edu.lsp.oopfinal.question1;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class TestLogger {
@Test
@DisplayName("Test singleton design")
public void testLoggerInstances() {
Logger firstLogger = Logger.getInstance();
Logger secondLogger = Logger.getInstance();

firstLogger.logMessage("This is my first log.");
secondLogger.logMessage("This is my second log.");

assertEquals(firstLogger.displayLog(), "Log:\nThis is my first log.\nThis is my second log.\n");
assertEquals(secondLogger.displayLog(), "Log:\nThis is my first log.\nThis is my second log.\n");

assertSame(firstLogger, secondLogger);

}
}