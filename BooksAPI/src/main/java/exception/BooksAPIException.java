package exception;

public class BooksAPIException extends Exception {
    public BooksAPIException() {
        super();
    }
    public BooksAPIException(String message) {
        super(message);
    }
    public BooksAPIException(String message, Throwable cause) {
        super(message, cause);
    }
    public BooksAPIException(Throwable cause) {
        super(cause);
    }
    protected BooksAPIException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
    
}

