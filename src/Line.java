public  class Line {
    private final double x1;
    private final double x2;
    private final double y1;
    private final double y2;
    public  Double dist=new Double(0);
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
    public  void Comparision(Line other){
        int val = this.dist.compareTo(other.dist);
        if(val<0){
            System.out.println("Line 1 is smaller than Line 2");

        }
        else if (val==0){
            System.out.println("Both Line are equal");
        }
        else {
            System.out.println("Line 1 is greater than Line 2");
        }
    }

}
