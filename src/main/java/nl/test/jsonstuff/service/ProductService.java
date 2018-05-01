package nl.test.jsonstuff.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.github.fge.jsonschema.core.exceptions.ProcessingException;
import com.github.fge.jsonschema.core.report.ProcessingReport;
import com.github.fge.jsonschema.examples.Utils;
import com.github.fge.jsonschema.main.JsonSchema;
import com.github.fge.jsonschema.main.JsonSchemaFactory;
import com.github.fge.jsonschema.main.JsonValidator;
import nl.test.jsonstuff.models.ProductTree;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

import static nl.test.jsonstuff.utils.FileReader.readFileFromClasspathAsString;

public class ProductService {


    public String parseToJson(ProductTree producTree) {

        String result = null;

        ObjectMapper mapper = new ObjectMapper();

        try {
            result = mapper.writeValueAsString(producTree);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        System.out.println("Json: \n" + result);
        return result;
    }

    public boolean isValidJson(String schemaFileName, String data) {

        boolean valid = false;
        JsonNode schemaFile = null;
        ObjectMapper mapper = new ObjectMapper();

        try {
            schemaFile = mapper.readTree(readFileFromClasspathAsString(schemaFileName));
            JsonNode jsonData = mapper.readTree(data);

            final JsonSchemaFactory factory = JsonSchemaFactory.byDefault();
            final JsonSchema jsonSchema = factory.getJsonSchema(schemaFile);


            ProcessingReport report;

            report = jsonSchema.validate(jsonData);

            valid = report.isSuccess();
            System.out.println("isValid: " + report.isSuccess());
            System.out.println(report);

        } catch (IOException e) {
            e.printStackTrace();
        } catch (ProcessingException e) {
            e.printStackTrace();
        }
        return valid;
    }
}
