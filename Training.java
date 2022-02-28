/**
* 
*
* Training.java
*/

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

public class Training {
    private HashMap<String, ArrayList<Double>> TrainingMap;

    // Berechnet Mittelwert aus ArrayList von Doubles
    private double mean (ArrayList<Double> vals) {
        if (vals.isEmpty()) {
            return 0;
        } else {
            double S = 0;
            for (Double time : vals) {
                S = S + time;
            }
            return S / vals.size();
        }
    }

    // Berechnet Minimum aus ArrayList von Doubles
    private double min (ArrayList<Double> vals) {
        Double M = Double.POSITIVE_INFINITY;
        for (Double time : vals) {
            if (time < M) {
                M = time;
            }
        }
        return M;
    }

    // Berechnet Maximum aus ArrayList von Doubles
    private double max (ArrayList<Double> vals) {
        Double M = Double.NEGATIVE_INFINITY;
        for (Double time : vals) {
            if (time > M) {
                M = time;
            }
        }
        return M;
    }

    // Konstruktor, leeres Training
    public Training () {
        TrainingMap = new HashMap<>();
    }

    //eine weitere Trainingszeit zum gegebenen Namen hinzufügen
    public void addTraining (String name, Double time) {
        if (! TrainingMap.containsKey(name)) {
            TrainingMap.put(name, new ArrayList<Double>());
        }
        TrainingMap.get(name).add(time);
    }

    //liefert die Liste aller Trainingszeiten des gegebenen Namens
    public ArrayList<Double> getAll (String name) {
        return TrainingMap.get(name);
    }

    //liefert die durchschnittliche Trainingszeit zum gegebenen Namen
    public double getAverage (String name) {
        return mean(getAll(name));
    }

    //liefert die minimale Trainingszeit zum gegegenen Namen
    public double getMin (String name) {
        return min(getAll(name));
    }

    //liefert die maximale Trainingszeit zum gegegenen Namen
    public double getMax (String name) {
        return max(getAll(name));
    }

    //Anzahl der eingetragenen Namen
    public int size () {
        return TrainingMap.size();
    }

    //liefert maximale Trainingszeit aller eingetragenen Zeiten // zu allen Namen
    public double getOverallMax () {
        Double M = Double.NEGATIVE_INFINITY;
        for (String name : TrainingMap.keySet()) {
            double minorMax = getMax(name);
            if (minorMax > M) {
                M = minorMax;
            }
        }
        return M;
    }

    // Liefert Set aus Namen
    public Set<String> names () {
        return TrainingMap.keySet();
    }
}
