/**
 * If the owner owns only one train station, the rent is 500
 * If the owner owns two of them, the rent is 1000
 * If the owner owns three of them, the rent is 2000
 * If the owner owns four of them, the rent is 4000
 */
public class TrainStationPropertyCell extends PropertyCell {
    public static final int TRAIN_STATION_COST = 500;
    public static final TrainStationPropertyCell[] TRAIN_STATION_ARRAY = {
            new TrainStationPropertyCell("Kowloon"),
            new TrainStationPropertyCell("Mongkok"),
            new TrainStationPropertyCell("Central"),
            new TrainStationPropertyCell("Shatin")
    };


    //TODO add some other methods if necessary
 
}
