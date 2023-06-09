package oz.infra.json.utils;

import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class ResultSetConverter1 {
	public static JSONArray convert(ResultSet rs) throws SQLException, JSONException {
		JSONArray jsonArray = new JSONArray();
		ResultSetMetaData rsmd = rs.getMetaData();
		int numColumns = rsmd.getColumnCount();
		while (rs.next()) {
			JSONObject obj = new JSONObject();
			for (int i = 1; i < numColumns + 1; i++) {
				String column_name = rsmd.getColumnName(i);
				switch (rsmd.getColumnType(i)) {
				case java.sql.Types.ARRAY:
					obj.put(column_name, rs.getArray(column_name));
					break;
				case java.sql.Types.BIGINT:
					obj.put(column_name, rs.getInt(column_name));
					break;
				case java.sql.Types.BOOLEAN:
					obj.put(column_name, rs.getBoolean(column_name));
					break;
				case java.sql.Types.BLOB:
					obj.put(column_name, rs.getBlob(column_name));
					break;
				case java.sql.Types.DOUBLE:
					obj.put(column_name, rs.getDouble(column_name));
					break;
				case java.sql.Types.FLOAT:
					obj.put(column_name, rs.getFloat(column_name));
					break;
				case java.sql.Types.INTEGER:
					obj.put(column_name, rs.getInt(column_name));
					break;
				case java.sql.Types.NVARCHAR:
					obj.put(column_name, rs.getNString(column_name));
					break;
				case java.sql.Types.VARCHAR:
					obj.put(column_name, rs.getString(column_name));
					break;
				case java.sql.Types.TINYINT:
					obj.put(column_name, rs.getInt(column_name));
					break;
				case java.sql.Types.SMALLINT:
					obj.put(column_name, rs.getInt(column_name));
					break;
				case java.sql.Types.DATE:
					obj.put(column_name, rs.getDate(column_name));
					break;
				case java.sql.Types.TIMESTAMP:
					obj.put(column_name, rs.getTimestamp(column_name));
					break;
				default:
					obj.put(column_name, rs.getObject(column_name));
					break;
				}
			}
			jsonArray.put(obj);
		}
		return jsonArray;
	}
}
