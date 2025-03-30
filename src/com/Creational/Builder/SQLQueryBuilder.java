package com.Creational.Builder;

public class SQLQueryBuilder {
	private StringBuilder query = new StringBuilder();
	private boolean where = false;
	private boolean groupBy = false;
	
	public static SQLQueryBuilder select(String... columns) {
		SQLQueryBuilder builder = new SQLQueryBuilder();
		if(columns.length == 0) {
			builder.query.append("SELECT * ");
		}else {
			builder.query.append("SELECT ").append(String.join(", ", columns)).append(" ");
		}
		return builder;
	}
	
	
	public SQLQueryBuilder from(String tableName) {
		 query.append("FROM ").append(tableName).append(" ");
		 return this;
	}
	
	
	//This i have created the method if they are using joins then which type need to use provide in code
	//FOR INNER JOIN
	public SQLQueryBuilder innerJoin(String tableName, String condition) {
		query.append("INNER JOIN ").append(tableName).append(" ON ").append(condition).append(" ");
		return this;
	}
	
	
	//FOR RIGHTJOIN
	public SQLQueryBuilder rightJoin(String tableName, String condition) {
		query.append("RIGHT JOIN ").append(tableName).append(" ON ").append(condition).append(" ");
		return this;
	}
	
	
	public SQLQueryBuilder leftJoin(String tableName, String condition) {
		query.append("LEFT JOIN ").append(tableName).append(" ON ").append(condition).append(" ");
		return this;
	}
	
	public SQLQueryBuilder where(String condition) {
		if(!where) {
			query.append("WHERE ").append(condition).append(" ");
			where = true;
		}else {
			query.append("AND ").append(condition).append(" ");
		}
		return this;
	}
	
	
	public SQLQueryBuilder groupBy(String... columns) {
		if(columns.length>0) {
			query.append("GROUP BY ").append(String.join(", ", columns)).append(" ");
			groupBy = true;
		}
		return this;
	}
	
	public SQLQueryBuilder having(String condition) throws Exception {
		if(groupBy)
			query.append("HAVING ").append(condition).append(" ");
		else
			throw new Exception("HAVING clause required GROUP BY clause..");
		return this;
	}
	
	
	public SQLQueryBuilder orderBy(String column, boolean isAsc) {
		query.append("ORDER BY ").append(column).append(isAsc ? " ASC " : " DSC ");
		return this;
	}
	
	
	public SQLQueryBuilder limit(int limit) {
		query.append("LIMIT ").append(limit).append(" ");
		return this;
	}
	
	public String buildQuery() {
		return query.toString().trim()+";";
	}
	
	
	public static void main(String[] args) throws Exception {
		String sql = SQLQueryBuilder
				.select("c.customer_id", "c.customer_name", "SUM(ord.total_price) AS total_spend")
				.from("customers c")
				.innerJoin("orders ord", "c.customer_id = ord.customer_id")
				.where("c.account_status = 'active'")
				.groupBy("c.customer_id", "c.customer_name")
				.having("SUM(ord.total_price) > 9999")
				.orderBy("total_spend", false)
				.limit(10)
				.buildQuery();
		System.out.println(sql);
	}
}
