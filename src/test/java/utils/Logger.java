package utils;

import com.aventstack.extentreports.Status;

public class Logger {

    public static void pass(String text) {
        System.out.println(text);
        ReportHolder.getReport().log(Status.PASS, text);
    }

    public static void info(String text) {
        System.out.println(text);
        ReportHolder.getReport().log(Status.INFO, text);
    }

    public static void fail(String text) {
        System.out.println(text);
        ReportHolder.getReport().log(Status.FAIL, text);
    }

}
