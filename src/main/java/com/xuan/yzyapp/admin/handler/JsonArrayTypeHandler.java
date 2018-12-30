package com.xuan.yzyapp.admin.handler;

import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.apache.ibatis.type.BaseTypeHandler;
import org.apache.ibatis.type.JdbcType;
import org.apache.ibatis.type.MappedJdbcTypes;
import org.apache.ibatis.type.MappedTypes;

import com.alibaba.fastjson.JSONArray;

 /**
  * Json数组转换器
 * @author Administrator
 *
 */
@MappedTypes(List.class)
@MappedJdbcTypes(value=JdbcType.VARCHAR)
public class JsonArrayTypeHandler extends BaseTypeHandler<List<Object>>{

	@Override
	public List<Object> getNullableResult(ResultSet rs, String columnName) throws SQLException {
		String result = rs.getString(columnName);
		if (null != result) {
			return JSONArray.parseArray(result);
		}
		return null;
	}

	@Override
	public List<Object> getNullableResult(ResultSet rs, int columnIndex) throws SQLException {
		String result = rs.getString(columnIndex);
		if (null != result) {
			return JSONArray.parseArray(result);
		}
		return null;
	}

	@Override
	public List<Object> getNullableResult(CallableStatement cs, int columnIndex) throws SQLException {
		String result = cs.getString(columnIndex);
		if (null != result) {
			return JSONArray.parseArray(result);
		}
		return null;
	}

	@Override
	public void setNonNullParameter(PreparedStatement ps, int i, List<Object> parameter, JdbcType jdbctype) throws SQLException {
		ps.setString(i, String.valueOf(JSONArray.toJSONString(parameter)));
		
	}

}
