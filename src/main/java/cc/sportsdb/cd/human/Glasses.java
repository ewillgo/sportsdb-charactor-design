package cc.sportsdb.cd.human;

import cc.sportsdb.cd.support.Renderable;
import cc.sportsdb.cd.support.Texture;

import java.awt.*;

public interface Glasses extends Texture, Renderable {

    /**
     * Set glasses' border color
     *
     * @param color The color of the glasses' border
     */
    void setBorderColor(Color color);

    /**
     * Set glasses' size
     *
     * @param size The size of the glasses
     */
    void setSize(int size);
}
