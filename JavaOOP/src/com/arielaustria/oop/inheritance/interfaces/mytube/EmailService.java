package com.arielaustria.oop.inheritance.interfaces.mytube;

public class EmailService implements NotificationService {
    @Override
    public void notify(User user) {
        System.out.println("The video of " + user.getEmail() + " is now ready!");
    }
}
