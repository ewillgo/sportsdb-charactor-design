package cc.sportsdb.cd.human;

import cc.sportsdb.cd.support.Renderable;
import cc.sportsdb.cd.support.Texture;

import java.awt.*;

public interface Mouth extends Texture, Renderable {

    /**
     * Set mouth's color
     *
     * @param color The color of the mouth
     */
    void setColor(Color color);

    /**
     * Set mouth's size
     *
     * @param size The size of the mouth
     */
    void setSize(int size);
}
