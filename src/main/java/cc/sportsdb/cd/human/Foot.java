package cc.sportsdb.cd.human;

import cc.sportsdb.cd.support.Renderable;
import cc.sportsdb.cd.support.Texture;

import java.awt.*;

public interface Foot extends Texture, Renderable {
    /**
     * Set foot's color
     *
     * @param color The color of the foot
     */
    void setColor(Color color);

    /**
     * Set foot's length
     *
     * @param length The length of the foot
     */
    void setLength(int length);

    /**
     * Set foot's size
     *
     * @param size The size of the foot
     */
    void setSize(int size);
}
