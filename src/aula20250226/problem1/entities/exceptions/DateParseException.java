package aula20250226.problem1.entities.exceptions;

import java.text.ParseException;

public class DateParseException extends ParseException {
    public DateParseException(String message, int errorOffset) {
        super(message, errorOffset);
    }
}
