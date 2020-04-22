/**
 * The main class belongs to this package.
 */
package com.austria.language.masteral.aa_getting_started;

/**
 * Class called Main
 */
public class Main {

    /**
     * The main method of the Main.class
     *
     * @param args argument passed value.
     */
    public static void main(String[] args) {
        /**
         * System is a class in java.lang package
         * out is a field a member in System.class
         * println is a method a member in System.class
         */
        System.out.println("Hello, World!");
    }

    /**
     * How java code executed?
     * Source code -> Java compiler -> Byte Code -> Java Virtual Machine -> Native Code
     * Java compiler convert our code into java byte code.
     * This compiler comes from java development kit.
     * Terminal: (file converted to bytes)
     *  javac Main.class
     *  dir
     *
     *  This java byte code is platform independent
     *  means it can run in Windows, Linux etc. as long
     *  it runs Java Runtime Environment (JRE) it has
     *  a component Java Virtual Machine (JVM)
     *
     *  JVM takes java byte code and translate it into
     *  native code (Windows, Mac, ...) that they can
     *  understand
     *
     *  How to invoked JVM to run java program?
     *  Terminal:
     *  Go to src via "cd .."
     *  java com.austria.language.masteral.aa_getting_started.Main.class
     */


}
