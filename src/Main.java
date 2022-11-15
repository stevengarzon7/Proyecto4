public class Main {

    public static void main(String[] args) {


             IntegerSet integerSet1 = new IntegerSet();
             System.out.println("intergerSet1 esta vacio: " + integerSet1);
             IntegerSet integerSet2 = new IntegerSet();
             System.out.println(" set vacio union con set vacio es  set vacio:  " + IntegerSet.union(integerSet1, integerSet2));
             IntegerSet lleno = new IntegerSet();
             for (int i = 0; i < IntegerSet.getMaxSetSize(); i++)
                 {
                     IntegerSet.booleanArray[i] = true;

            }
             System.out.println("set lleno: " + lleno);
             System.out.println("set vacio union lleno = lleno:  " + IntegerSet.union(integerSet1, lleno));

            System.out.println(" set vacio intersection lleno = empty set:  " + IntegerSet.intersection(integerSet1, lleno));
             integerSet1.insertElement(0);
             System.out.println("intergerSet1 solo tiene elemento 0: " + integerSet1);
             System.out.println("intergerSet1 != integerSet2: es igual: " + integerSet1.isEqual(integerSet2));
             System.out.println("intergerSet2 != integerSet1: es igual: " + integerSet2.isEqual(integerSet1));
             integerSet2.insertElement(0);
             System.out.println("intergerSet1 == integerSet2: es igual: " + integerSet1.isEqual(integerSet2));
             integerSet1.deleteElement(0);
             System.out.println("intergerSet1 esta vacio: " + integerSet1);

        }

    }



