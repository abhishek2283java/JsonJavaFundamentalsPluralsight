package produce_json.usingStringFormats;


import common.ExampleLoan;
import common.Job;
import common.LoanApplication;
import common.LoanDetails;

import java.util.List;

import static java.util.stream.Collectors.joining;

/**
 * Created by sca820 on 12 aug., 2022
 */
public class ProducingWithStringFormats {
    public static void main(String[] args) {
        LoanApplication loanApplication = ExampleLoan.LOAN_APPLICATION;
        System.out.println("loanApplication = " + loanApplication);
        System.out.println();
        System.out.println(toJsonString(loanApplication));
    }

    private static CharSequence toJsonString(LoanApplication loanApplication) {
        return String.format(
                "{\n" +
                "  \"name\": \"%s\",\n" +
                "  \"purpose\": \"%s\",\n" +
                "  \"loanDetails\": %s,\n" +
                "  \"jobs\": %s\n" +
                "}\n",
                loanApplication.getName(),
                loanApplication.getPurposeOfLoan(),
                toJsonString(loanApplication.getLoanDetails()),
                toJsonString(loanApplication.getJobs()));
    }

    private static CharSequence toJsonString(List<Job> jobs) {
        return jobs
                .stream()
                .map(job -> String.format(
                        "    {\n" +
                                "      \"title\": \"%s\",\n" +
                                "      \"annualIncome\": %g,\n" +
                                "      \"yearsActive\": \"%d\"\n" +
                                "    }",
                        job.getTitle(),
                        job.getAnnualIncome(),
                        job.getYearsActive()))
                .collect(joining(",\n", "[\n", "\n  ]"));
    }

    private static CharSequence toJsonString(LoanDetails loanDetails) {
        return String.format(
                "{\n" +
                "    \"amount\": %g,\n" +
                "    \"startDate\": \"%s\",\n" +
                "    \"endDate\": \"%s\"\n" +
                "  }",
                loanDetails.getAmount(),
                loanDetails.getStartDate(),
                loanDetails.getEndDate()
        );
    }
}
