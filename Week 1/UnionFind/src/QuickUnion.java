public class QuickUnion {
    private int[] ids;
    private int probSize;

    public QuickUnion(int n) {
        if (n > 0) {
            this.probSize = n;
            ids = new int[n];
            for (int i = 0; i < n; i++)
                ids[i] = i;
        }
    }

    public void print() {
        for (int i = 0; i < probSize; i++) {
            System.out.print(ids[i]);
            if (i != probSize - 1)
                System.out.print(", ");
        }
        System.out.println();
    }

    public boolean connected(int point1, int point2) {
        return findRoot(point1) == findRoot(point2);
    }

    private int findRoot(int element) {
        while (ids[element] != element)
            element = ids[element];
        return element;
    }

    public void union(int point1, int point2) {
        int point1ID = findRoot(point1);
        int point2ID = findRoot(point2);
        ids[point1ID] = point2ID;
    }

    public static void main(String[] args) {
        QuickUnion obj = new QuickUnion(10);
        obj.union(4, 3);
        obj.union(3, 8);
        obj.union(6, 5);
        obj.union(9, 4);
        obj.union(2, 1);
        obj.union(5, 0);
        obj.union(7, 2);
        obj.union(6, 1);
        obj.union(7, 3);
        obj.print();
        System.out.println(obj.connected(5, 4));
    }
}
