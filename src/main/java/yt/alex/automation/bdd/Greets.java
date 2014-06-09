package yt.alex.automation.bdd;

import lombok.Data;


public @Data class Greets {
    private String name;
    
    public String hello() {
        return new StringBuilder().append("Hello ").append(this.name).append(" !").toString();
    }
}
