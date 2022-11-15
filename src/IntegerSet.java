public class IntegerSet {
    private static final int MAX_SET_SIZE = 101;

    public static final boolean[] booleanArray = new boolean[getMaxSetSize()];


    public static IntegerSet union(IntegerSet set1, IntegerSet set2) {

        IntegerSet union = new IntegerSet();
        System.arraycopy(set1.getBooleanArray(), 0, union.getBooleanArray(), 0, getMaxSetSize());
        for (int i = 0; i < getMaxSetSize(); i++) {
            if (set2.getBooleanArray()[i]) {
                union.getBooleanArray()[i] = true;
            }
        }
        return union;
    }

    public static IntegerSet intersection(IntegerSet set1, IntegerSet set2) {
        IntegerSet intersection = new IntegerSet();
        for (int i = 0; i < getMaxSetSize(); i++) {
            intersection.getBooleanArray()[i] = set1.getBooleanArray()[i] && set2.getBooleanArray()[i];
        }
        return intersection;
    }

    public static int getMaxSetSize() {
        return MAX_SET_SIZE;
    }

    public void insertElement(int element) {
        getBooleanArray()[element] = true;
    }

    public void deleteElement(int element) {
        getBooleanArray()[element] = false;
    }

    @Override
    public String toString() {
        boolean isEmpty = true;
        StringBuilder string = new StringBuilder();
        string.append("{ ");
        for (int i = 0; i < getMaxSetSize(); i++) {
            if (getBooleanArray()[i]) {
                isEmpty = false;
                string.append(i).append(' ');
            }
        }
        return isEmpty ? "---" : string.append('}').toString();
    }

    public boolean isEqual(IntegerSet set) {
        for (int i = 0; i < getMaxSetSize(); i++) {
            if (getBooleanArray()[i] != set.getBooleanArray()[i]) {
                return false;
            }
        }
        return true;
    }

    public boolean[] getBooleanArray() {
        return booleanArray;
    }
}