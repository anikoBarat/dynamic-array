public class DynamicArray {



    private Integer[] myIntArray;

    private Integer numOfInstances = 10;

    private Integer index = 0;

    public DynamicArray(){
        this.myIntArray =  new Integer[numOfInstances];
    }

    public DynamicArray(Integer numOfInstances){
        this.numOfInstances = numOfInstances;
        this.myIntArray =  new Integer[numOfInstances];
    }


    private void add(Integer instance){

        if(index >= numOfInstances){
            numOfInstances *= 2;
            Integer[] newArray = new Integer[numOfInstances];
            System.arraycopy(myIntArray, 0, newArray, 0, myIntArray.length);
            myIntArray = newArray;
        }

        myIntArray[index] = instance;
        index += 1;


    }

    /*private Integer getLength(){
        Integer reservedIndexes = 0;
        Integer i = 0;
        while(myIntArray[i] != ){
            reservedIndexes += 1;
        }
        return reservedIndexes;
    }*/




    private Integer get(Integer index){
        return myIntArray[index];
    }

    private void remove(Integer index){};

    public static void main(String[] args) {
        DynamicArray da = new DynamicArray();
        for (int i = 1; i < 1001; i++) {
            da.add(i);
            System.out.println(da.get(i-1));
        }
        System.out.println(da.get(0));
        System.out.println(da.get(100));
        System.out.println(da.get(999));
        }

    }


