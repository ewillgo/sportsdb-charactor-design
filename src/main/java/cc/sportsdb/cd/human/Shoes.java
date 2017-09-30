package cc.sportsdb.cd.human;

import cc.sportsdb.cd.support.Renderable;
import cc.sportsdb.cd.support.Texture;

import java.awt.*;

public interface Shoes extends Texture, Renderable {
    /**
     * Set shoes's color
     *
     * @param color The color of the shoes
     */
    void setColor(Color color);

    /**
     * Set shoes's size
     *
     * @param size The size of the shoes
     */
    void setSize(int size);
}
