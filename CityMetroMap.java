import java.util.*;

//Object for our metros
class Station {
  private int id;
  private String stationName;
  private String city;
  private String state;

  public Station(int id, String stationName, String city, String state) {
    this.id = id;
    this.stationName = stationName;
    this.city = city;
    this.state = state;
  }

  public String getCity() {
    return city;
  }

  // Function to change our object to an string and printing values
  public String toString() {
    return "{id: " + id + ", stationName: '" + stationName + "', city: '" + city + "', state: '" + state + "'}";
  }
}

public class CityMetroMap {
  public static void main(String[] args) {
    List<Station> stations = new ArrayList<>();
    stations.add(new Station(1, "Halasuru", "Bangalore", "Karnataka"));
    stations.add(new Station(2, "MG Road", "Bangalore", "Karnataka"));
    stations.add(new Station(6, "Janakpuri West", "Delhi", "New Delhi"));
    stations.add(new Station(7, "Karol Bagh", "Delhi", "New Delhi"));

    Map<String, List<Station>> cityMap = new HashMap<>();

    for (Station station : stations) {
      String city = station.getCity();
      if (!cityMap.containsKey(city)) {
        cityMap.put(city, new ArrayList<>());
      }
      cityMap.get(city).add(station);
    }

    for (Map.Entry<String, List<Station>> entry : cityMap.entrySet()) {
      System.out.println(entry.getKey() + ": " + entry.getValue());
    }
  }
}
