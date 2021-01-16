package com.kubrautman.SpringBootSample.DaoImpl;

import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.kubrautman.SpringBootSample.Dao.ProductDao;
import com.kubrautman.SpringBootSample.Entities.ProductLines;
import com.kubrautman.SpringBootSample.Entities.Products;
import com.kubrautman.SpringBootSample.RowMappers.ProductsRowMapper;
import com.mysql.cj.jdbc.Blob;

@Repository
public class ProductDaoImpl implements ProductDao {

	private JdbcTemplate template;

	public ProductDaoImpl(JdbcTemplate template) {
		this.template = template;
	}

	@Override
	public List<Products> getAllProduct() {
		return (List<Products>) template.query("SELECT * FROM Products", new ProductsRowMapper());
	}

	@Override
	public void addProduct() {
		String sqlInsert = "INSERT INTO products (productCode, productName, productName, productLine"
				+ "productScale, productVendor,productDescription,quantityInStock,buyPrice,MSRP)"
				+ " VALUES (?, ?, ?, ?)";
		template.update(sqlInsert, "Tom", "tomea@mail.com", "USA", "12345");

	}

	@Override
	public void updateProduct(String productCode) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteProduct(String productCode) {
		// TODO Auto-generated method stub

	}

	@Override
	public List<Products> getProductByLine(String productLine) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<ProductLines> getProductLines() {
		String sql = "SELECT * FROM ProductLines";

		List<ProductLines> productLines = new ArrayList<>();

		List<Map<String, Object>> rows = template.queryForList(sql);

		for (Map row : rows) {
			ProductLines obj = new ProductLines();

			obj.setProductLine((String) (row.get("productLine")));
			obj.setTextDescription((String) row.get("textDescription"));
			obj.setHtmlDescription(((String) row.get("htmlDescription")));
			obj.setImage(((Blob) row.get("image")));
			productLines.add(obj);
			
		}
		return productLines;
	}

	@Override
	public List<Products> retrieveProductsByProductLine(String productLine) {
		String sql="Select * from products s where s.productLine ='"+productLine+"'";
		
		return (List<Products>) template.query(sql, new ProductsRowMapper());

	}

	@Override
	public void addProduct(Products products) {
		String sql ="Insert into products ("
				+ "productCode"
				+ ",productName"
				+ ",productLine,"
				+ "productScale"
				+ ",productDescription"
				+ ",quantityInStock"
				+",productVendor"
				+",buyPrice"
				+",mSRP)"
				+ " values (?,?,?,?,?,?,?,?,?)";
		
		 template.update(sql,products.getProductCode(), products.getProductName(),products.getProductLine(), products.getProductScale(),
				products.getProductDescription(),products.getQuantityInStock(), products.getProductVendor(), products.getBuyPrice(),products.getmSRP());

		
	}


}
