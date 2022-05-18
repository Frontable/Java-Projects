public abstract class Shape3D {
    private int faces;
    private int vertices;
    private int edges;
    public Shape3D() { }
    public Shape3D(int faces, int vertices, int edges) {
        this.faces = faces;
        this.vertices = vertices;
        this.edges = edges;
    }
    public abstract boolean isPainted();
    public String toString() {
        return "Shape3D{" + "faces=" + faces + ", vertices=" + vertices + ", edges=" + edges + '}';
    }
}
