package cc.sportsdb.cd.human;

import cc.sportsdb.cd.support.Renderable;
import cc.sportsdb.cd.support.Texture;

import java.awt.*;

public interface Nose extends Texture, Renderable {

    /**
     * Set nose's color
     *
     * @param color The color of the nose
     */
    void setColor(Color color);

    /**
     * Set nose's size
     *
     * @param size The size of the nose
     */
    void setSize(int size);
}
