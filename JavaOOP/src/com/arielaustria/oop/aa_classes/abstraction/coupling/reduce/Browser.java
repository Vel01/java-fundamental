package com.arielaustria.oop.aa_classes.abstraction.coupling.reduce;

public class Browser {

    public void navigate(String address) {

        String ip = findIpAddress(address, true);
        String html = sendHttpRequest(ip);
        System.out.println(html);
    }

    //make these two private to hide or reduce coupling.
    private String sendHttpRequest(String ip) {
        return "<html></html>";
    }

    private String findIpAddress(String address, boolean cache) {
        return "127.0.0.1";
    }

}
