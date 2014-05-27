package yt.alex.automation.bdd;

public class Greets {
    private String name;
    
    public String hello() {
        return new StringBuilder().append("Hello ").append(this.name).append(" !").toString();
    }
    
    public void setName(String name){
        this.name = name;
    }
}
