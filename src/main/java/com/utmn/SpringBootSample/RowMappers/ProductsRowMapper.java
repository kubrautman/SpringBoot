package com.utmn.SpringBootSample.RowMappers;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.utmn.SpringBootSample.Entities.Products;

public class ProductsRowMapper implements RowMapper<Products> {

	@Override
	public Products mapRow(ResultSet rs, int rowNum) throws SQLException {
		Products product = new Products();
		product.setProductCode(rs.getString("productCode"));
		product.setProductName(rs.getString("productName"));
		product.setProductScale(rs.getString("productScale"));
		product.setProductDescription(rs.getString("productDescription"));
		product.setProductVendor(rs.getString("productVendor"));
		product.setProductLine(rs.getString("productLine"));
		product.setQuantityInStock(rs.getInt("quantityInStock"));
		product.setBuyPrice(rs.getDouble("buyPrice"));
		product.setmSRP(rs.getDouble("mSRP"));
		return product;
	}

}
