import java.util.*;

class QueryBuilder {
    private StringBuilder select = new StringBuilder();
    private StringBuilder from = new StringBuilder();
    private StringBuilder join = new StringBuilder();
    private StringBuilder where = new StringBuilder();
    private StringBuilder order = new StringBuilder();
    private int limit;

    public void addSelectColumn(String column) {
        if (select.length() == 0) select.append("SELECT ");
        else select.append(", ");
        select.append(column);
    }

    public void setFrom(String table) {
        from.append(" FROM ").append(table);
    }

    public void addJoin(String table, String condition) {
        join.append(" JOIN ").append(table).append(" ON ").append(condition);
    }

    public void addWhereCondition(String condition, String operator) {
        if (where.length() == 0) where.append(" WHERE ");
        else where.append(" ").append(operator).append(" ");
        where.append(condition);
    }

    public void addOrderBy(String column, String direction) {
        if (order.length() == 0) order.append(" ORDER BY ");
        else order.append(", ");
        order.append(column).append(" ").append(direction);
    }

    public void setLimit(int l) {
        limit = l;
    }

    public String build() {
        return select.toString() + from.toString() + join.toString() +
                where.toString() + order.toString() + " LIMIT " + limit;
    }
}

public class Main {
    public static void main(String[] args) {
        QueryBuilder qb = new QueryBuilder();

        qb.addSelectColumn("u.id");
        qb.addSelectColumn("u.name");
        qb.addSelectColumn("u.email");
        qb.addSelectColumn("o.order_id");
        qb.addSelectColumn("o.amount");

        qb.setFrom("users u");
        qb.addJoin("orders o", "u.id = o.user_id");

        qb.addWhereCondition("u.age > 18", "AND");
        qb.addWhereCondition("o.amount > 500", "AND");
        qb.addWhereCondition("u.status = 'active'", "OR");

        qb.addOrderBy("u.name", "ASC");
        qb.addOrderBy("o.amount", "DESC");

        qb.setLimit(100);

        String query = qb.build();
        System.out.println(query);
        System.out.println("Query Length: " + query.length());
    }
}
