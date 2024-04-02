import java.util.Scanner;
public class TotalCost {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float pencil = scanner.nextFloat();
        float pen = scanner.nextFloat();
        float eraser = scanner.nextFloat();
        float cost = pencil + pen + eraser;
        float gst = (cost*18/100);
        float totalCost = cost + gst;
        System.out.println("Total Cost Without GST: "+cost);
        System.out.println("GST: "+gst);
        System.out.println("Total Cost Including GST: "+totalCost);
    }
}
