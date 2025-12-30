class Main {
    int vert;
    int[][] adj;
    Main(int vert){
        this.vert  = vert;
        adj = new int[vert][vert];
    }
    void Addedge(int u , int v){
        adj[u][v] = 1;
        adj[v][u] = 1;
    }
    
    void display(){
        for(int i = 0; i < vert;i++){
            for(int j = 0;j < vert - 1;j++){
                System.out.print(adj[i][j] + " ");
                }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Main m = new Main(4);
        m.Addedge(0 , 1);
        m.Addedge(1 , 2);
        m.Addedge(2 , 3);
        m.display();
    }
}
