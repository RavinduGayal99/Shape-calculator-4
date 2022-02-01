import java.util.Scanner;
public class cal4{
	public static void main(String args[]){
		double r,l,w,h;
		double ci1,ci2,r1,r2,cy1,cy2,cu1,cu2,cu3,co1,co2,sp1,sp2,sp3;
		boolean x = true;
		int num;
		Scanner input = new Scanner(System.in);
		circle circle = new circle();
		rectangle rectangle = new rectangle();
		cylinder cylinder = new cylinder();
		cuboid cuboid = new cuboid();
		cone cone = new cone();
		sphere sphere = new sphere();
		Sout Sout = new Sout();

		do{
			System.out.println("1.Circle");
			System.out.println("2.Rectangle");
			System.out.println("3.Cylinder");
			System.out.println("4.Cuboid");
			System.out.println("5.Cone");
			System.out.println("6.Sphere");
			System.out.println("0.Exit");
			System.out.print("Enter a number from the list :");
			num = input.nextInt();
			switch(num){
				case 1:
					System.out.println("You selected Circle!");
					System.out.print("Enter radius of the circle : "); 
        				r = input.nextDouble();
					ci1 = circle.CircumferenceOfCircle(r);
					ci2 = circle.AreaOfCircle(r);
					System.out.println("Circumference Of Circle is "+ci1);
					System.out.println("Area Of Circle is "+ci2);
					break;
				case 2:
					System.out.println("You selected Rectangle!");
					System.out.print("Enter length of the Rectangle : "); 
        				l = input.nextDouble();
					System.out.print("Enter width of the Rectangle : "); 
        				w = input.nextDouble();
					r1 = rectangle.PerimeterOfRectangle(l,w);
					r2 = rectangle.AreaOfRectangle(l,w);
					System.out.println("Perimeter Of Rectangle is "+r1);
					System.out.println("Area Of Rectangle is "+r2);
					break;
				case 3:
					System.out.println("You selected Cylinder!");
					System.out.print("Enter radius of the cylinder : "); 
        				r = input.nextDouble();
					System.out.print("Enter height of the cylinder : "); 
        				h = input.nextDouble();
					cy1 = cylinder.AreaOfCylinder(r,h);
					cy2 = cylinder.VolumeOfCylinder(r,h);
					System.out.println("Area Of Cylinder is "+cy1);
					System.out.println("Volume Of Cylinder is "+cy2);
					break;
				case 4:
					System.out.println("You selected Cuboid!");
					System.out.print("Enter length of the cuboid : "); 
        				l = input.nextDouble();
					System.out.print("Enter width of the cuboid : "); 
        				w = input.nextDouble();
					System.out.print("Enter height of the cuboid : "); 
        				h = input.nextDouble();
					cu1 = cuboid.PerimeterOfCuboid(l,w,h);
					cu2 = cuboid.AreaOfCuboid(l,w,h);
					cu3 = cuboid.VolumeOfCuboid(l,w,h);
					System.out.println("Perimeter Of Cuboid is "+cu1);
					System.out.println("Area Of Cuboid is "+cu2);
					System.out.println("Volume Of Cuboid is "+cu3);
					break;
				case 5:
					System.out.println("You selected Cone!");
					System.out.print("Enter radius of the cone : "); 
        				r = input.nextDouble();
					System.out.print("Enter length of the cone : "); 
        				l = input.nextDouble();
					System.out.print("Enter height of the cone : "); 
        				h = input.nextDouble();
					co1 = cone.AreaOfCone(r,l);
					co2 = cone.VolumeOfCone(r,h);
					System.out.println("Area Of Cone is "+co1);
					System.out.println("Volume Of Cone is "+co2);
					break;
				case 6:
					System.out.println("You selected Sphere!");
					System.out.print("Enter radius of the sphere : "); 
        				r = input.nextDouble();
					sp1 = sphere.CircumferenceOfSphere(r);
					sp2 = sphere.AreaOfSphere(r);
					sp3 = sphere.VolumeOfSphere(r);
					System.out.println("Circumference Of Sphere is "+sp1);
					System.out.println("Area Of Sphere is "+sp2);
					System.out.println("Volume Of Sphere is "+sp3);
					break;
				case 0:
					x = false;
					break;
				default:
					System.out.println("Enter a valid number!");
					break;
			}
		}while(x);
	}
}