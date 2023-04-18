package org.ruben.java.invocacion.trazar;

public class Trazar1 extends Trazar  {

    //2400800
    @Override
    public String quienMeLLama() {
        return new Exception().getStackTrace()[1].getMethodName();
    }


}
