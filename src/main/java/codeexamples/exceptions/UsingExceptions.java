package codeexamples.exceptions;

public class UsingExceptions {

    public static void main(String[] args){

        try{
            method1();
        } catch (Exception e) {
            System.out.println(e.getMessage());
            e.printStackTrace();

            StackTraceElement[] traceElements = e.getStackTrace();

            System.out.printf("%nStack trace%n");
            System.out.println("Class\t\tFile\t\t\tLine\tMethod");

            for (StackTraceElement element : traceElements){
                System.out.printf("%s\t", element.getClassLoaderName());
                System.out.printf("%s\t", element.getFileName());
                System.out.printf("%s\t", element.getLineNumber());
                System.out.printf("%s\n", element.getMethodName());
            }

        }

    }

    public static void method1() throws Exception {
        method2();
    }

    public static void method2() throws Exception {
        method3();
    }

    public static void method3() throws Exception {
        throw new Exception("Exception from method 3");
    }
}
