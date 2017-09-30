package cc.sportsdb.cd.human;

import cc.sportsdb.cd.equip.EquipSlot;
import cc.sportsdb.cd.equip.body.BodyEquip;
import cc.sportsdb.cd.support.Renderable;

import java.awt.*;

public abstract class Body implements Renderable {

    protected Color skinColor;
    protected LeftHand leftHand;
    protected RightHand rightHand;
    protected LeftFoot leftFoot;
    protected RightFoot rightFoot;
    protected LeftShoe leftShoe;
    protected RightShoe rightShoe;

    protected EquipSlot<BodyEquip> bodyEquipSlot;

}
