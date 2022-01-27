package CovidVaccination;
import java.io.Serializable;

class covid implements Serializable {
    String name,gender,vacc,hos;
    int age,NID;
    public String toString(){
        return "||\t"+name+"\t"+age+"\t"+gender+"\t"+NID+"\t"+vacc+"\t"+hos+"||";
    }

}
