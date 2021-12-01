public class WeightedQuickUnion {
    private int[] ids, weights;
    private int probSize;

    public WeightedQuickUnion(int n) {
        if (n > 0) {
            this.probSize = n;
            ids = new int[n];
            weights = new int[n];
            for (int i = 0; i < n; i++)
                ids[i] = i;
            for (int i = 0; i < n; i++)
                weights[i] = 1;
        }
    }

    public void print() {
        for (int i = 0; i < probSize; i++) {
            System.out.print(weights[i]);
            if (i != probSize - 1)
                System.out.print(", ");
        }
        System.out.println();
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
        while (ids[element] != element) {
            ids[element] = ids[ids[element]];
            element = ids[element];
        }
        return element;
    }

    public void union(int point1, int point2) {
        int point1ID = findRoot(point1);
        int point2ID = findRoot(point2);
        if (weights[point1ID] < weights[point2ID]) {
            ids[point1ID] = point2ID;
            weights[point2ID] += weights[point1ID];
        } else {
            ids[point2ID] = point1ID;
            weights[point1ID] += weights[point2ID];
        }
    }

    public static void main(String[] args) {
        WeightedQuickUnion obj = new WeightedQuickUnion(10);
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
