package db_postgres;

public class PostgresDatabase {

	public static int errorHandler(String errorMessage) {
		if (errorMessage == null) return 500;
    
		return PostgresErrorHandler.valueOf(errorMessage).getHttpStatus();
	}
}
