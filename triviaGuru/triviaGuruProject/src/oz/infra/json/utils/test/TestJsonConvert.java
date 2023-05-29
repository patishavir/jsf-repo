package oz.infra.json.utils.test;

import java.sql.ResultSet;

import oz.infra.json.utils.ResultSetConverter2;
import oz.infra.json.utils.db.ResultSetUtil;

public class TestJsonConvert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			ResultSet rs = ResultSetUtil.getResultSet();
			ResultSetUtil.showResultSetMetaData(rs);
			ResultSetConverter2.convert(rs);
		} catch (Exception ex) {
			ex.printStackTrace();
			System.out.println(ex.toString());
		}
	}

}