package com.epam.rd.autotasks.triangle;
class Triangle {
    private Point a, b, c;
    public Triangle(Point a, Point b, Point c) {
        if (isDegenerative(a, b, c)) {
            throw new IllegalArgumentException("Degenerative triangle, please provide valid vertices.");
        }
        this.a = a;
        this.b = b;
        this.c = c;
    }
    private boolean isDegenerative(Point a, Point b, Point c) {
        return (b.y - a.y) * (c.x - b.x) == (c.y - b.y) * (b.x - a.x);
    }
    public double area() {
        return 0.5 * Math.abs((a.x - c.x) * (b.y - a.y) - (a.x - b.x) * (c.y - a.y));
    }
    public Point centroid() {
        double centroidX = (a.x + b.x + c.x) / 3.0;
        double centroidY = (a.y + b.y + c.y) / 3.0;
        return new Point(centroidX, centroidY);
    }
}
