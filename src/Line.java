public  class Line {
    double x1,x2,y1,y2;
    Double dist=new Double(0);
    public Line(double x1, double y1, double x2, double y2) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }
    public double calculateLength() {

        return dist= Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
    }
    public void checkEquality(Line other){
        if(this.dist.equals(other.dist)){
            System.out.println("Lines are equal");
        }
        else System.out.println("Lines are not equal");
    }

}
