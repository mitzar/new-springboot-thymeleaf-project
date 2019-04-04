package planning.spring.lang.impl;

import planning.spring.lang.Language;

public class English implements Language {

    @Override
    public String getGreeting() {
        return "Hello";
    }

    @Override
    public String getBye() {
        return "Bye Bye";
    }
}
