package common;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by sca820 on 12 aug., 2022
 */
public class ExampleLoan {
    public static final LoanApplication LOAN_APPLICATION;

    static {
        LoanDetails loanDetails = new LoanDetails();
        loanDetails.setAmount(100000);
        loanDetails.setStartDate("2022-01-01");
        loanDetails.setEndDate("2025-01-01");

        List<Job> jobs = new ArrayList<>();

        Job job = new Job();
        job.setTitle("Freelance Developer");
        job.setAnnualIncome(15000);
        job.setYearsActive(3);
        jobs.add(job);

        job = new Job();
        job.setTitle("Part Time Developer");
        job.setAnnualIncome(10000);
        job.setYearsActive(2);
        jobs.add(job);

        job = new Job();
        job.setTitle("Pluralsight Author");
        job.setAnnualIncome(5000);
        job.setYearsActive(5);
        jobs.add(job);

        LOAN_APPLICATION = new LoanApplication();
        LOAN_APPLICATION.setName("Mrs Joan Smith");
        LOAN_APPLICATION.setPurposeOfLoan("To build an extension to my house");
        LOAN_APPLICATION.setLoanDetails(loanDetails);
        LOAN_APPLICATION.setJobs(jobs);
    }
}
