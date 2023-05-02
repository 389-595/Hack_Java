public class Point3D {
    public int x;
    public int y;
    public int z;

    public Point3D(int x , int y , int z){
        this.x = x;
        this.y = y;
        this.z = z;
    }


    @Override
    public boolean equals(Object obj){
        if (this == obj) {
            return true;
        } else if (obj == null || this.getClass() != obj.getClass() ) {
            return false;
            
        }

        Point3D other = (Point3D) obj;
        if (this.x == other.x && this.y == other.y && this.z == other.z  ) {
            return true;
        }else{
            return false;
        }
    }

}
