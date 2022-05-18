import java.util.ArrayList;
import java.util.Scanner;
public class Test {
    public static void main(String[] args) {

        ArrayList<Sphere> listSphere = new ArrayList<Sphere>();
        Scanner input = new Scanner(System.in);
        int numOfCirclesandCubes = 2;
        int sumSphereArea = 0;
        int sumCubeArea = 0;
        for (int i = 0; i < numOfCirclesandCubes; i++) {
            try {
                System.out.println("Enter radius of sphere " + (i+1) + ": ");
                Sphere s = new Sphere(Integer.parseInt(input.next()));
                listSphere.add(s);
            } catch (Exception ex) {
                System.out.println("Invalid data type.");
            }
        }
        System.out.println("List of spheres:");
        for (Sphere element : listSphere) {
            System.out.println(element.toString());
            System.out.print("Colored: " + element.isPainted());
            System.out.format("\tArea=%.3f \tVolume=%.3f\n",element.area(), element.volume());
            sumSphereArea += element.area();
        }

        ArrayList<Cube> listCube = new ArrayList<Cube>();
        for (int i = 0; i < numOfCirclesandCubes; i++) {
            try {
                System.out.println("Enter the length of the cube side " + (i+1) + ": ");
                Cube c = new Cube(Integer.parseInt(input.next()));
                listCube.add(c);
            } catch (Exception ex) {
                System.out.println("Invalid data type.");
            }
        }
        System.out.println("List of cubes:");
        for (Cube cube : listCube) {
            System.out.println(cube.toString());
            System.out.print("Colored: " + cube.isPainted());
            System.out.format("\tArea=%.3f \tVolume=%.3f\n",cube.area(), cube.volume());
            sumCubeArea += cube.area();
        }
        System.out.println("The sum of the area of all the spheres and cubes is  : " + (sumSphereArea + sumCubeArea));
    }
}
