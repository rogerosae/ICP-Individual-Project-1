public class Routes {
    /*
    Instance variables
     */
    private String airlineid;
    private int airlinecode;
    private String source_airportcode;
    private int source_airportid;
    private int destination_airportcode;
    private int destination_airportid;
    private String codeshare;
    private int stops;
    private String equipment;

    public Routes(String airlineid,int airlinecode,String source_airportcode,int source_airportid,int destination_airportcode,int destination_airportid,String codeshare,int stops,String equipment){
        this.airlineid=airlineid;
        this.airlinecode=airlinecode;
        this.source_airportcode=source_airportcode;
        this.source_airportid=source_airportid;
        this.destination_airportcode=destination_airportcode;
        this.destination_airportid=destination_airportid;
        this.codeshare=codeshare;
        this.stops=stops;
        this.equipment=equipment;
    }
    public java.lang.String toString(){
        return "Routes{"+"airlineid="+airlineid+",airlinecode="+airlinecode+'\''+"source_airportcode="+source_airportcode+'\''+"source_airportid="+source_airportid+'\''+",destination_airportid="+destination_airportid+'\''+",destination_airportcode="+destination_airportcode+'\''+",codeshare="+codeshare+",stops="+stops+",equipment="+equipment+'\''+ '}';
    }

    public String getAirlineid() {
        return airlineid;
    }

    public int getAirlinecode() {
        return airlinecode;
    }

    public String getSource_airportcode() {
        return source_airportcode;
    }

    public int getSource_airportid() {
        return source_airportid;
    }

    public int getDestination_airportcode() {
        return destination_airportcode;
    }

    public int getDestination_airportid() {
        return destination_airportid;
    }

    public String getCodeshare() {
        return codeshare;
    }

    public int getStops() {
        return stops;
    }

    public String getEquipment() {
        return equipment;
    }
}

