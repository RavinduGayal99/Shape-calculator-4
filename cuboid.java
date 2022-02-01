public class cuboid{
	static double PerimeterOfCuboid(double l,double w,double h){
		return 4*(l+w+h);
	}
	static double AreaOfCuboid(double l,double w,double h){
		return 2*(l*w+w*h+l*h);
	}
	static double VolumeOfCuboid(double l,double w,double h){
		return l*w*h;
	}
}