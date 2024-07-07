import java.util.*;

public class DSU {
    private int[] par;
    private int[] size;

    DSU(int n) {
        par = new int[n];
        size = new int[n];

        for (int i = 0; i < n; i++) {
            par[i] = i;
            size[i] = 1;
        }
    }

    int findPar(int x) {
        if (par[x] == x) return x;
        return par[x] = findPar(par[x]); // Path compression
    }

    void union(int x, int y) {
        int parx = findPar(x);
        int pary = findPar(y);

        if (parx == pary) return;

        // Union by size
        if (size[parx] > size[pary]) {
            par[pary] = parx;
            size[parx] += size[pary];
        } else {
            par[parx] = pary;
            size[pary] += size[parx];
        }
    }

    boolean isSameComponent(int x, int y) {
        return findPar(x) == findPar(y);
    }

    public static void main(String[] args) {
        DSU dsu = new DSU(5);
        
        dsu.union(0, 1);
        dsu.union(1, 2);
        
        System.out.println(dsu.isSameComponent(0, 2)); // true
        System.out.println(dsu.isSameComponent(0, 3)); // false
        
        dsu.union(3, 4);
        System.out.println(dsu.isSameComponent(3, 4)); // true
    }
}
