package za.co.wethinkcode.student.joyce.model.artefacts;

import za.co.wethinkcode.student.joyce.model.artefacts.*;

public class ArtefactFactory {

    public static Artefact newArtefact(String name, int power, ArtefactType artefactType)
    {
        if (artefactType == ArtefactType.WEAPON)
            return new Weapon(name, power);
        if (artefactType == ArtefactType.ARMOUR)
            return new Armour(name, power);
        if (artefactType == ArtefactType.HELM)
            return new Helm(name, power);
        return null;
    }

}
