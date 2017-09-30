package cc.sportsdb.cd.human;

import cc.sportsdb.cd.equip.EquipSlot;
import cc.sportsdb.cd.equip.head.HeadEquip;
import cc.sportsdb.cd.support.Renderable;

import java.awt.*;

public abstract class Head implements Renderable {

    protected Color skinColor;
    protected Hair hair;
    protected Brow brow;
    protected Eyes eyes;
    protected Ear ear;
    protected Nose nose;
    protected Mouth mouth;
    protected Glasses glasses;

    protected EquipSlot<HeadEquip> slot;

    protected Color getSkinColor() {
        return skinColor;
    }

    protected void setSkinColor(Color skinColor) {
        this.skinColor = skinColor;
    }

    protected Hair getHair() {
        return hair;
    }

    protected void setHair(Hair hair) {
        this.hair = hair;
    }

    protected Brow getBrow() {
        return brow;
    }

    protected void setBrow(Brow brow) {
        this.brow = brow;
    }

    protected Eyes getEyes() {
        return eyes;
    }

    protected void setEyes(Eyes eyes) {
        this.eyes = eyes;
    }

    protected Ear getEar() {
        return ear;
    }

    protected void setEar(Ear ear) {
        this.ear = ear;
    }

    protected Nose getNose() {
        return nose;
    }

    protected void setNose(Nose nose) {
        this.nose = nose;
    }

    protected Mouth getMouth() {
        return mouth;
    }

    protected void setMouth(Mouth mouth) {
        this.mouth = mouth;
    }

    protected Glasses getGlasses() {
        return glasses;
    }

    protected void setGlasses(Glasses glasses) {
        this.glasses = glasses;
    }

    protected EquipSlot<HeadEquip> getSlot() {
        return slot;
    }

    protected void setSlot(EquipSlot<HeadEquip> slot) {
        this.slot = slot;
    }
}
