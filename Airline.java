import java.io.*;
import java.lang.*;
import java.util.*;
/*
Instance variables
 */
public class Airline {
    private String airlid;
    private String name;
    private String alias;
    private String location;
    private String iatacode;
    private String icaocode;
    private String callsign;
    private String country;
    private String active;

    /*
    Constructors
     */

    public Airline(String airlid,String name,String alias,String icaocode, String callsign,String country, String active ,String location, String iatacode){
        this.airlid=airlid;
        this.name=name;
        this.iatacode=iatacode;
        this.location=location;
        this.alias=alias;
        this.active=active;
        this.icaocode=icaocode;
        this.callsign=callsign;
        this.country=country;
    }

    public String getAirlid() {
        return airlid;
    }

    public void setAirlid(String airlid) {
        this.airlid = airlid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getIatacode() {
        return iatacode;
    }

    public void setIatacode(String iatacode) {
        this.iatacode = iatacode;
    }

    public String getCountry(){
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getActive() {
        return active;
    }

    public void setActive(String active) {
        this.active = active;
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public String getCallsign() {
        return callsign;
    }

    public void setCallsign(String callsign) {
        this.callsign = callsign;
    }

    public String getIcaocode() {
        return icaocode;
    }

    public void setIcaocode(String icaocode) {
        this.icaocode = icaocode;
    }

    public static void read_airline() throws FileNotFoundException{
        File airlinesfile= new File("C://Users//roger//Documents//ICP2022//airlines.csv");
        Scanner scan =new Scanner(airlinesfile);
        HashMap<String,String> airline_country=new HashMap<>();
        while (scan.hasNextLine()){
            String [] data=scan.nextLine().split(",");
            String airlid_iatacode=data[0]+','+data[3];
            String country=data[6];
            airline_country.put(airlid_iatacode,country);

        }
        scan.close();
        System.out.println(airline_country.values());
    }
    public static void main(String[] args) throws FileNotFoundException{
        File airport_file=new File("C://Users//roger//Documents//ICP2022//airports.csv");
        Scanner scan=new Scanner(airport_file);
        HashMap<String,ArrayList<String>> airport_location=new HashMap<>();
        ArrayList<String> airlines=new ArrayList<>();
        String airline_iatacode;
        while (scan.hasNextLine()){
            String[] data=scan.nextLine().split(",");
            if (data[3]==""||data[3]=="\\N"){
                airline_iatacode=data[0]+','+data[3];
            }
            airline_iatacode=data[0]+','+data[4];
            String country=data[6];
            airlines.add(airline_iatacode);
            airport_location.put(country,airlines);
        }
        scan.close();
        for (String key:airport_location.keySet()){
            System.out.println(airport_location.get(key));
        }

    }


}
