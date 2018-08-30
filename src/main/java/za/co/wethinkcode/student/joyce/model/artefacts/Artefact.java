package za.co.wethinkcode.student.joyce.model.artefacts;

public class Artefact {

    protected String name;
    protected int power;
    protected ArtefactType artefactType;

     public Artefact(String name, int power, ArtefactType artefactType){

         this.name = name;
         this.power = power;
         this.artefactType = artefactType;
     }
 }
