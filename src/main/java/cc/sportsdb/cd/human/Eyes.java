package cc.sportsdb.cd.human;

import cc.sportsdb.cd.support.Renderable;
import cc.sportsdb.cd.support.Texture;

import java.awt.*;

public interface Eyes extends Texture, Renderable {

    /**
     * Set eyes' color
     *
     * @param color The color of the eyes
     */
    void setColor(Color color);

    /**
     * Set eyes' size
     *
     * @param size The size of the eyes
     */
    void setSize(int size);
}
