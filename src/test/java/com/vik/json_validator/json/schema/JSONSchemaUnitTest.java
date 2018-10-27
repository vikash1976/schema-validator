package com.vik.json_validator.json.schema;

import org.everit.json.schema.Schema;
import org.everit.json.schema.ValidationException;
import org.everit.json.schema.loader.SchemaLoader;
import org.json.JSONObject;
import org.json.JSONTokener;
import org.junit.Test;

public class JSONSchemaUnitTest {

	@Test(expected = ValidationException.class)
	public void givenInvalidInput_whenValidating_thenInvalid() {

		JSONObject jsonSchema = new JSONObject(
				new JSONTokener(JSONSchemaUnitTest.class.getResourceAsStream("/schema.json")));
		JSONObject jsonSubject = new JSONObject(
				new JSONTokener(JSONSchemaUnitTest.class.getResourceAsStream("/product_invalid.json")));

		Schema schema = SchemaLoader.load(jsonSchema);
		schema.validate(jsonSubject);
	}

	@Test
	public void givenValidInput_whenValidating_thenValid() {

		JSONObject jsonSchema = new JSONObject(
				new JSONTokener(JSONSchemaUnitTest.class.getResourceAsStream("/schema.json")));
		JSONObject jsonSubject = new JSONObject(
				new JSONTokener(JSONSchemaUnitTest.class.getResourceAsStream("/product_valid.json")));

		Schema schema = SchemaLoader.load(jsonSchema);
		schema.validate(jsonSubject);
	}

	@Test( expected = ValidationException.class )
	public void givenInvalidRectangle_whenValidating_thenInvalid() {

		JSONObject jsonSchema = new JSONObject(
				new JSONTokener(JSONSchemaUnitTest.class.getResourceAsStream("/rectangle_schema.json")));
		JSONObject jsonSubject = new JSONObject(
				new JSONTokener(JSONSchemaUnitTest.class.getResourceAsStream("/rectangle_invalid.json")));

		Schema schema = SchemaLoader.load(jsonSchema);

		try {
			schema.validate(jsonSubject);
		} 
			 
			 
		catch (ValidationException e) {
			System.out.println(e.getMessage());
			e.getCausingExceptions().stream().map(ValidationException::getMessage).forEach(System.out::println);
		}
		// schema.validate(jsonSubject);
	}

	@Test
	public void givenValidRectangleInput_whenValidating_thenValid() {

		JSONObject jsonSchema = new JSONObject(
				new JSONTokener(JSONSchemaUnitTest.class.getResourceAsStream("/rectangle_schema.json")));
		JSONObject jsonSubject = new JSONObject(
				new JSONTokener(JSONSchemaUnitTest.class.getResourceAsStream("/rectangle_valid.json")));

		Schema schema = SchemaLoader.load(jsonSchema);
		schema.validate(jsonSubject);
	}
	
	
	@Test
	public void givenValidTRMBothConfig_whenValidating_thenValid() {

		JSONObject jsonSchema = new JSONObject(
				new JSONTokener(JSONSchemaUnitTest.class.getResourceAsStream("/envConfigSchema.json")));
		JSONObject jsonSubject = new JSONObject(
				new JSONTokener(JSONSchemaUnitTest.class.getResourceAsStream("/config_both.json")));

		Schema schema = SchemaLoader.load(jsonSchema);
		schema.validate(jsonSubject);
	}

	@Test
	public void givenValidTRMEnvConfig_whenValidating_thenValid() {

		JSONObject jsonSchema = new JSONObject(
				new JSONTokener(JSONSchemaUnitTest.class.getResourceAsStream("/envConfigSchema.json")));
		JSONObject jsonSubject = new JSONObject(
				new JSONTokener(JSONSchemaUnitTest.class.getResourceAsStream("/config_envOnly.json")));

		Schema schema = SchemaLoader.load(jsonSchema);
		schema.validate(jsonSubject);
	}
	@Test
	public void givenValidTRMDeployConfig_whenValidating_thenValid() {

		JSONObject jsonSchema = new JSONObject(
				new JSONTokener(JSONSchemaUnitTest.class.getResourceAsStream("/envConfigSchema.json")));
		JSONObject jsonSubject = new JSONObject(
				new JSONTokener(JSONSchemaUnitTest.class.getResourceAsStream("/config_deployOnly.json")));

		Schema schema = SchemaLoader.load(jsonSchema);
		schema.validate(jsonSubject);
	}
	
	@Test( /*expected = ValidationException.class*/ )
	public void givenInvalidEnvConfig_whenValidating_thenInvalid() {

		JSONObject jsonSchema = new JSONObject(
				new JSONTokener(JSONSchemaUnitTest.class.getResourceAsStream("/envConfigSchema.json")));
		JSONObject jsonSubject = new JSONObject(
				new JSONTokener(JSONSchemaUnitTest.class.getResourceAsStream("/envConfig_invalid.json")));

		Schema schema = SchemaLoader.load(jsonSchema);

		try {
			schema.validate(jsonSubject);
		} /*
			 * catch (ValidationException e) { // prints #/rectangle/a: -5.0 is
			 * not higher or equal to 0 System.out.println(e.getMessage()); }
			 */
		catch (ValidationException e) {
			System.out.println(e.getMessage());
			e.getCausingExceptions().stream().map(ValidationException::getMessage).forEach(System.out::println);
		}
		// schema.validate(jsonSubject);
	}
	
	@Test( /*expected = ValidationException.class*/ )
	public void givenInvalidTRMEnvConfig_whenValidating_thenInvalid() {

		JSONObject jsonSchema = new JSONObject(
				new JSONTokener(JSONSchemaUnitTest.class.getResourceAsStream("/envConfigSchema.json")));
		JSONObject jsonSubject = new JSONObject(
				new JSONTokener(JSONSchemaUnitTest.class.getResourceAsStream("/config_none.json")));

		Schema schema = SchemaLoader.load(jsonSchema);

		try {
			schema.validate(jsonSubject);
		} 
			 //catch (ValidationException e) { // prints #/rectangle/a: -5.0 is * not higher or equal to 0 
				// System.out.println(e.getMessage()); }
			// }
			 
		catch (ValidationException e) {
			System.out.println(e.getMessage());
			e.getCausingExceptions().stream().map(ValidationException::getMessage).forEach(System.out::println);
		}
		// schema.validate(jsonSubject);
	}

}
