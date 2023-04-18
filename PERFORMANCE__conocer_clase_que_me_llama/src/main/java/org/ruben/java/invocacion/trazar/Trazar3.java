package org.ruben.java.invocacion.trazar;

public class Trazar3 extends Trazar  {

    @Override
    public String quienMeLLama(){
        //algo menos costoso Throwable StackTrace: 4700.073 ms.
        return new Throwable().getStackTrace()[1].getClassName().toString();
    }



}
