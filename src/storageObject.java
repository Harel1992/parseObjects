import java.util.List;
import java.util.Vector;

public class storageObject {
    private String objName;
    private String objSize;
    private List<String> objLocations; //contains a Nodes List
    private List<Double> objLocationsProb; //contains the probability of each Node
    private int objClass;

    public storageObject(String _objName, String _objSize, List<String> _objLocations, List<Double> _objLocationsProb, int _objClass) {
        this.objName = _objName;
        this.objSize = _objSize;
        this.objLocations = _objLocations;
        this.objLocationsProb = _objLocationsProb;
        this.objClass = _objClass;
    }

    public String getObjName() {
        return objName;
    }

    public void setObjName(String objName) {
        this.objName = objName;
    }

    public String getObjSize() {
        return objSize;
    }

    public void setObjSize(String objSize) {
        this.objSize = objSize;
    }

    public List<String> getObjLocations() {
        return objLocations;
    }

    public void setObjLocations(List<String> objLocations) {
        this.objLocations = objLocations;
    }

    public List<Double> getObjLocationsProb() {
        return objLocationsProb;
    }

    public void setObjLocationsProb(List<Double> objLocationsProb) {
        this.objLocationsProb = objLocationsProb;
    }

    public int getObjClass() {
        return objClass;
    }

    public void setObjClass(int objClass) {
        this.objClass = objClass;
    }
}
