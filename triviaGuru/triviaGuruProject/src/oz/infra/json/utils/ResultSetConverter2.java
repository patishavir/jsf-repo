package oz.infra.json.utils;

import java.sql.ResultSet;
import java.sql.ResultSetMetaData;

import org.json.JSONArray;
import org.json.JSONObject;

import oz.infra.json.utils.db.ResultSetUtil;

public class ResultSetConverter2 {
	public static void main(final String[] args) {

		ResultSet rs = ResultSetUtil.getResultSet();
		try {
			// convert(rs);
			ResultSetConverter2.convert(rs);
		} catch (Exception ex) {
			ex.printStackTrace();
			System.out.println(ex.toString());
		}

	}

	public static JSONArray convert(final ResultSet rs) throws Exception {
		JSONArray jsonArray = new JSONArray();
		ResultSetMetaData rsmd = rs.getMetaData();
		int numColumns = rsmd.getColumnCount();
		while (rs.next()) {
			JSONObject obj = new JSONObject();
			for (int i = 1; i <= numColumns; i++) {
				String column_name = rsmd.getColumnName(i);
				obj.put(column_name, rs.getObject(column_name));
			}
			jsonArray.put(obj);
		}
		System.out.println(jsonArray.toString());
		return jsonArray;
	}
}