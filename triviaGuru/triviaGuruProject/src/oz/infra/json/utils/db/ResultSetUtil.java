package oz.infra.json.utils.db;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.util.Properties;

import oz.infra.constants.OzConstants;
import oz.infra.db.DBUtils;
import oz.infra.db.DBUtilsParameters;

public class ResultSetUtil {
	public static ResultSet getResultSet() {
		Properties properties = new Properties();
		properties.setProperty(DBUtilsParameters.USER_NAME, "postgres");
		properties.setProperty(DBUtilsParameters.PASSWORD, "postgres");
		properties.setProperty(DBUtilsParameters.URL, "jdbc:postgresql://localhost:5432/questionsDB");
		properties.setProperty(DBUtilsParameters.ENCRYPTION_METHOD, "NONE");
		properties.setProperty(DBUtilsParameters.DRIVER_CLASS_NAME, "org.postgresql.Driver");
		Connection conn = DBUtils.getConnection(properties);
		System.out.println(conn.toString());
		ResultSet rs = DBUtils.getResultSet(conn, "select * from questions");
		return rs;
	}

	public static void showResultSetMetaData(final ResultSet rs) {
		try {
			ResultSetMetaData rsmd = rs.getMetaData();
			int columnCount = rsmd.getColumnCount();
			for (int i = 1; i <= columnCount; i++) {
				System.out.println(rsmd.getColumnClassName(i) + OzConstants.TAB + rsmd.getColumnLabel(i)
						+ OzConstants.TAB + rsmd.getColumnName(i) + OzConstants.TAB + rsmd.getColumnTypeName(i)
						+ OzConstants.TAB + rsmd.getColumnType(i) + OzConstants.TAB + rsmd.getColumnTypeName(i)  );
			}
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}
}
