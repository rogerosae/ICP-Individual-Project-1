public class Airport {
    /*
    Instance variables
     */
    private int airport_id;
    private String name;
    private String city;
    private String country;
    private String iatacode;
    private String icaocode;
    private double latitude;
    private double longitude;
    private double altitude;
    private double timezone;
    private String DST;
    private String database_timezone;
    private String type;
    private String source;
/*
Constructors
 */
    public Airport(int airport_id,String name,String city,String country,String iatacode,String iacocode,double latitude,double longitude,double altitude,double timezone,String DST,String database_timezone,String type,String source){
        this.airport_id=airport_id;
        this.name=name;
        this.city=city;
        this.country=country;
        this.iatacode=iatacode;
        this.icaocode=iacocode;
        this.latitude=latitude;
        this.longitude=longitude;
        this.altitude=altitude;
        this.timezone=timezone;
        this.DST=DST;
        this.database_timezone=database_timezone;
        this.type=type;
        this.source=source;
    }
    public Airport(){
        this.airport_id=0;
        this.name="";
        this.city="";
        this.country="";
        this.iatacode="";
        this.icaocode="";
        this.latitude=0.0;
        this.longitude=0.0;
        this.altitude=0.0;
        this.timezone=0.0;
        this.DST="";
        this.database_timezone="";
    }
    @java.lang.Override
    public java.lang.String toString(){
        return "Airport{"+"airport_id="+airport_id+",name="+name+'\''+",city="+city+'\''+",country="+country+'\''+",iatacode="+iatacode+'\''+",icaocode="+icaocode+'\''+",latitude="+latitude+",longitude="+longitude+"altitude="+altitude+",timezone="+timezone+",DST="+DST+'\''+"database_timezone="+database_timezone+'\''+",type="+type+'\''+",source="+source+'\''+'}';

    }
    public int getAirport_id(){
        return this.airport_id;
    }

    public String getName() {
        return name;
    }

    public String getCity() {
        return city;
    }

    public String getCountry() {
        return country;
    }

    public String getIatacode() {
        return iatacode;
    }

    public double getLatitude() {
        return latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public double getAltitude() {
        return altitude;
    }

    public double getTimezone() {
        return timezone;
    }

    public String getDST() {
        return DST;
    }

    public String getIcaocode() {
        return icaocode;
    }

    public String getDatabase_timezone() {
        return database_timezone;
    }

    public String getType() {
        return type;
    }

    public String getSource() {
        return source;
    }

}


