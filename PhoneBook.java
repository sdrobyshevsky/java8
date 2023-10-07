import org.w3c.dom.ranges.RangeException;

import java.util.*;

class PhoneBook {
    
    private Map<Long, Save> saves = new HashMap<Long, Save>();
    private long nextId;
    private long getNextId() {
        if (nextId < Long.MAX_VALUE && !saves.containsKey(nextId))
            return nextId++;
        nextId = 0;
        while (nextId < Long.MAX_VALUE) { 
            if (!saves.containsKey(nextId))
                return nextId;
            ++nextId;
        }
        throw new RangeException((short)111, "No more IDs availiable");
    }
    public Save addSave(String phone, String name, String address)
            throws CloneNotSupportedException {
        long saveId = getNextId();
        Save save = new Save(saveId, phone, name, address);
        saves.put(saveId, save);
        return (Save)save.clone();
    }
    public Save getSave(long id) throws CloneNotSupportedException {
        if (saves.containsKey(id))
            return (Save)saves.get(id).clone();
        return null;
    }
    public Save updateSave(long id, String phone, String name, String address)
            throws CloneNotSupportedException {
        Save save = new Save(id, phone, name, address);
        saves.put(id, save);
        return getSave(id);
    }
    public void removeSave(long id) {
        saves.remove(id);
    }
    public List<Save> allSaves() {
        List<Save> result = new ArrayList<Save>();
        for (Save save : this.saves.values())
            result.add((Save) save);
        return result;
    }
}