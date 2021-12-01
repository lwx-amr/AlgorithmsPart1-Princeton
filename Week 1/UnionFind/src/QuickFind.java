public class QuickFind {
    private int[] ids;
    private int probSize;

    public QuickFind(int n) {
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
        return ids[point1] == ids[point2];
    }

    public void union(int point1, int point2) {
        if (!connected(point1, point2)) {
            int point1ID = ids[point1];
            int point2ID = ids[point2];
            for (int i = 0; i < probSize; i++)
                if (ids[i] == point1ID)
                    ids[i] = point2ID;
        }
    }

    public static void main(String[] args) {
        QuickFind obj = new QuickFind(10);
        obj.union(4, 3);
        obj.union(3, 8);
        obj.union(6, 5);
        obj.union(9, 4);
        obj.union(2, 1);
        obj.union(5, 0);
        obj.union(7, 2);
        obj.union(6, 1);
        obj.print();
        System.out.println(obj.connected(8, 9));
    }
}
