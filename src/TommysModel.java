/**
 * Created by tommyrich on 11/28/14.
 */
public class TommysModel {
    private static TommysModel ourInstance = new TommysModel();

    public static TommysModel getInstance() {
        return ourInstance;
    }

    private TommysModel() {
    }
}
