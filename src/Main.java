import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.TransformerException;

public class Main {
    public static void main(String[] args) throws ParserConfigurationException, TransformerException {
        int[] array = {4, 3, 5, 2, 14, 10};
        System.out.println(getDifference(array));

        System.out.println(getOddAvg(array));

        Department department = new Department(50,"IT");
        Department department2 = new Department(45,"Finances");
        Department department3 = new Department(50,"IT");
//        department.setPeople(15);
        System.out.println(department.getPeople());

        System.out.println(department.equals(department3));

        System.out.println(department.hashCode());
        System.out.println(department3.hashCode());

    XMLUtils.createXML();
    }
    public static int getDifference(int[] array){
        int max = array[0];
        int min = array[0];

        for (int i = 1; i < array.length; i++){
            if (max < array[i]){
                max = array[i];
            }if (min > array[i]){
                min = array[i];
            }
        }
        return max - min;
    }
    public static int getOddAvg(int[] array){
        int sum = 0;
        int avg;
        int count = 0;
        for (int i = 1; i < array.length; i+=2){
            sum += array[i];
            count++;
        }
        avg = sum/count;
        return avg;
    }
}