package l24Exceptions.homeWork;

import java.util.Objects;

public class belowZeroException extends RuntimeException{

    private String message;
    private int code;

    public belowZeroException(String message, int code) {
        super(message);
        this.message = message;
        this.code = code;
    }

    @Override
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof belowZeroException that)) return false;
        if (code != that.code) return false;
        return Objects.equals(message, that.message);
    }
    @Override
    public int hashCode() {
            return Objects.hash(message, code);
        }

    @Override
    public String toString() {
        return "belowZeroException{" +
                "message='" + message + '\'' +
                ", code=" + code +
                '}';
    }
}
