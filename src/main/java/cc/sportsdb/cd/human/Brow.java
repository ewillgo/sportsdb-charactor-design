package cc.sportsdb.cd.human;

import cc.sportsdb.cd.support.Renderable;
import cc.sportsdb.cd.support.Texture;

import java.awt.*;

public interface Brow extends Texture, Renderable {

    /**
     * Set brow's color
     *
     * @param color The color of the brow
     */
    void setColor(Color color);

    /**
     * Set brow's size
     *
     * @param size The size of the brow
     */
    void setSize(int size);
}
