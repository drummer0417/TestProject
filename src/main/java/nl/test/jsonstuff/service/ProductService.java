package nl.test.jsonstuff.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import nl.test.jsonstuff.models.ProductTree;

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

}
