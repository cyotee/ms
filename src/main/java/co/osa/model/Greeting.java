package co.osa.model;

/**
 * Created by robertgreathouse on 2/17/16.
 */
public class Greeting {

    private final long id;
    private final String content;

    public Greeting(long id, String content) {
        this.id = id;
        this.content = content;
    }

    public long getId() {
        return id;
    }

    public String getContent() {
        return content;
    }

    public String toString(){
        return "{\"id\":\"" + this.getId() + "\",\"content\":\"" + this.getContent() +"\"}";
    }
}

