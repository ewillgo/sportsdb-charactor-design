package cc.sportsdb.cd.human;

import cc.sportsdb.cd.support.Renderable;
import cc.sportsdb.cd.support.Texture;

import java.awt.*;

public interface Hand extends Texture, Renderable {

    /**
     * Set hand's color
     *
     * @param color The color of the hand
     */
    void setColor(Color color);

    /**
     * Set hand's length
     *
     * @param length The length of the hand
     */
    void setLength(int length);

    /**
     * Set hand's size
     *
     * @param size The size of the hand
     */
    void setSize(int size);
}
