package cc.sportsdb.cd.human;

import cc.sportsdb.cd.support.Moveable;
import cc.sportsdb.cd.support.Renderable;

public abstract class Human implements Moveable, Renderable {

    protected String id;
    protected String name;
    protected Head head;
    protected Body body;

    protected String getId() {
        return id;
    }

    protected void setId(String id) {
        this.id = id;
    }

    protected String getName() {
        return name;
    }

    protected void setName(String name) {
        this.name = name;
    }

    protected Head getHead() {
        return head;
    }

    protected void setHead(Head head) {
        this.head = head;
    }

    protected Body getBody() {
        return body;
    }

    protected void setBody(Body body) {
        this.body = body;
    }

}
