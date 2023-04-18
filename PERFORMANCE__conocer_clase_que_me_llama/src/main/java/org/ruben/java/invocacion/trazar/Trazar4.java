package org.ruben.java.invocacion.trazar;

public class Trazar4 extends Trazar  {

    @Override
    public String quienMeLLama(){
        //Es muy costoso, Current Thread StackTrace: 5886.964 ms.
        StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
        StackTraceElement ste = stackTraceElements[2];  
        //System.out.println(ste.getClassName()+" "+ste.getMethodName()+" "+ste.getLineNumber());     
        ste.getMethodName();
        ste.getLineNumber();
        return ste.getClassName().toString();
    }


}
