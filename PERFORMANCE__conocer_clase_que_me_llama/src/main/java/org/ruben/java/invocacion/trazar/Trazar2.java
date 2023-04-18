package org.ruben.java.invocacion.trazar;

public class Trazar2 extends Trazar  {
    private final static MySecurityManager mySecurityManager = new MySecurityManager();

    @Override
    public String quienMeLLama(){
        //2152500 mas eficiente SecurityManager: 1046.804 ms.
        return mySecurityManager.getCallerClassName(2).toString();
    }

      /** 
       * A custom security manager that exposes the getClassContext() information
       */
        static class MySecurityManager extends SecurityManager {
            public String getCallerClassName(int callStackDepth) {
                return getClassContext()[callStackDepth].getName();
        }


    }



}
