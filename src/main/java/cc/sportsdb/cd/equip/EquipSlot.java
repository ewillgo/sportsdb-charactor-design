package cc.sportsdb.cd.equip;

public interface EquipSlot<T> {

    /**
     * Set equip
     *
     * @param equip The type of the equipment
     */
    void setEquip(T equip);

    /**
     * Get equip
     *
     * @return equip
     */
    T getEquip();
}
