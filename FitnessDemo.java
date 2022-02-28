/**

*
* FitnessDemo.java
*/

public class FitnessDemo {
    public static void main (String[] args) {
        Training train = new Training();

        train.addTraining("Namenloser Sportstudent", 2.0);
        train.addTraining("Namenloser Sportstudent", 2.5);
        train.addTraining("Namenloser Sportstudent", 1.2);
        train.addTraining("Namenloser Sportstudent", 3.7);
        train.addTraining("Namenloser Sportstudent", 2.8);
        train.addTraining("Namenloser Sportstudent", 2.3);
        train.addTraining("Namenloser Sportstudent", 3.3);

        train.addTraining("Namenloser ambitionierter Biologiestudent", 1.5);
        train.addTraining("Namenloser ambitionierter Biologiestudent", 2.3);
        train.addTraining("Namenloser ambitionierter Biologiestudent", 1.8);
        train.addTraining("Namenloser ambitionierter Biologiestudent", 1.7);

        train.addTraining("Namenloser mittlerer Psychologiestudent", 1.4);
        train.addTraining("Namenloser mittlerer Psychologiestudent", 1.2);
        train.addTraining("Namenloser mittlerer Psychologiestudent", 0.9);

        train.addTraining("Namenloser handelsueblicher Informatikstudent", 0.002);

        System.out.println("Trainingliste mit " + train.size() + " Personen");
        for (String name : train.names()) {
            System.out.println(name + ": " + train.getAll(name) + ", Schnitt: " + train.getAverage(name) + ", min/max: " + train.getMin(name) + "/" + train.getMax(name));
        }
        System.out.println();
        System.out.println("Insgesamtes Maximum: " + train.getOverallMax());
    }
}
