package Iterator;
import java.util.ArrayList;


public class Iterator implements java.util.Iterator {

    private ArrayList<Integer> list;
    private java.util.Iterator<Integer> itr = null;
    public Iterator(int[][]data){
        list = new ArrayList<Integer>();
        int row = data.length;
        int column = data[0].length;
        int x = 0, y = 0;


        while(row > 0 && column > 0){
            if(row == 1){
                for(int i=0; i<column; i++)
                    list.add(data[x][y++]);
                break;
            }else if(column == 1){
                for(int i=0; i<row; i++)
                    list.add(data[x++][y]);
                break;
            }

            for(int i=0; i<column-1; i++)
                list.add(data[x][y++]); //top->right
            for (int i=0; i<row-1; i++)
                list.add(data[x++][y]); //right->down
            for(int i=0; i<column-1; i++)
                list.add(data[x][y--]); //down-<left
            for (int i=0; i<row-1; i++)
                list.add(data[x--][y]); //left->top
            x++;
            y++;
            row = row-2;
            column = column-2;

        }
        itr = list.iterator();

    }
    public Object next(){
        return (Object)itr.next();
    }

    public boolean hasNext(){
        return itr.hasNext();
    }

    public static void main(String[] args) {


        int[][] data = { {1,2,3,4}, {5, 6, 7, 8}, {9, 10, 11, 12}, {13, 14, 15, 16}};


        Iterator iterator = new Iterator(data);
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
