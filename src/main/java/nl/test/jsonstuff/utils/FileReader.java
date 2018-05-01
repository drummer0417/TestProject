package nl.test.jsonstuff.utils;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class FileReader {


    public static String readFileFromClasspathAsString(String fileName) {

        String data = null;
        Class clazz = FileReader.class;
        InputStream inputStream = clazz.getResourceAsStream(fileName);
        try {
            data = readFromInputStream(inputStream);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return data;
    }

    private static String readFromInputStream(InputStream inputStream)
            throws IOException {
        StringBuilder resultStringBuilder = new StringBuilder();
        try (BufferedReader br
                     = new BufferedReader(new InputStreamReader(inputStream))) {
            String line;
            while ((line = br.readLine()) != null) {
                resultStringBuilder.append(line).append("\n");
            }
        }
        return resultStringBuilder.toString();
    }

}
