package org.example.employewagebuilder;

public class EmployeWage {
    public static final int IS_FULL_TIME = 1;
    public static final int IS_PART_TIME = 2;

    private final String company;
    private final int rate_per_hour;
    private final int no_of_working_days;
    private final int max_hrs_per_month;

    public EmployeWage(String company, int rate_per_hour, int no_of_working_days, int max_hrs_per_month) {
        this.company = company;
        this.rate_per_hour = rate_per_hour;
        this.no_of_working_days = no_of_working_days;
        this.max_hrs_per_month = max_hrs_per_month;
    }

    public static void main(String[] args) {
        EmployeWage c1 = new EmployeWage("Dmart", 20, 5, 10);
        int totalworkingdays = 0, totalemphrs = 0;
        int emphrs = 0;
        while (totalemphrs <= c1.max_hrs_per_month && totalworkingdays < c1.no_of_working_days) {
            totalworkingdays++;
            int empcheck = (int) Math.floor(Math.random() * 10 )% 3 ;
            switch (empcheck) {
                case IS_FULL_TIME:
                    emphrs = 8;
                    break;
                case IS_PART_TIME:
                    emphrs = 4;
                    break;
            }
            totalemphrs += emphrs;
            System.out.println("Day#: " + totalworkingdays  + " Emp hrs " + totalemphrs);
        }

        int totalempwage = totalemphrs * c1.rate_per_hour;
        System.out.println("Total Employee Wage of " +c1.company + " is " +totalempwage);
    }
}
