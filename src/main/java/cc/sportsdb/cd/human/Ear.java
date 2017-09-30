package cc.sportsdb.cd.human;

import cc.sportsdb.cd.support.Renderable;
import cc.sportsdb.cd.support.Texture;

import java.awt.*;

public interface Ear extends Texture, Renderable {

    /**
     * Set ear's color
     *
     * @param color The color of the ear
     */
    void setColor(Color color);

    /**
     * Set ear's size
     *
     * @param size The size of the ear
     */
    void setSize(int size);
}
