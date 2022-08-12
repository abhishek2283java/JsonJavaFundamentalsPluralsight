package produce_json.usingBindingAPI;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;
import common.ExampleLoan;
import common.LoanApplication;

import java.io.IOException;

/**
 * Created by sca820 on 12 aug., 2022
 */
public class ProducingWithBindingApi {
    public static void main(String[] args) throws IOException {
        LoanApplication loanApplication = ExampleLoan.LOAN_APPLICATION;
        System.out.println(loanApplication);
        System.out.println();
        toJsonString(loanApplication);
    }

    private static void toJsonString(LoanApplication loanApplication) throws JsonProcessingException {
        ObjectMapper objectMapper = new ObjectMapper();
        final ObjectWriter objectWriter = objectMapper.writerWithDefaultPrettyPrinter();
        final String jsonString = objectWriter.writeValueAsString(loanApplication);
        System.out.println(jsonString);
    }
}
