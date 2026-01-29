package db_postgres;

public enum PostgresErrorHandler {
	BAD_SQL_SYNTAX(400),
	CONNECTIVITY(401),
	QUERY_EXECUTION(400),
	RETRY_EXHAUSTED(500),
	EXPRESSION(500);
	
	private final int httpStatus;
	
	PostgresErrorHandler(int httpStatus){
		this.httpStatus = httpStatus;
	}
	
	public int getHttpStatus() {
		return httpStatus;
	}
}
