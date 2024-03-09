import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Matrix {
    private List<List<Integer>> mat;

    public Matrix(){
        this.mat = new ArrayList<>();
    }

    public void populate(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the matrix: ");
        int n = Integer.valueOf(scanner.nextLine());
        System.out.println("Enter the rows");
        for(int i = 0; i < n; i++){
            List<Integer> row = new ArrayList<>();
            for(int j = 0; j < n; j++){
                System.out.print(j + 1 + " ");
                row.add(Integer.valueOf(scanner.nextLine()));
            }
            this.mat.add(row);
        }
    }

    public int prims(){
        int sum = 0;
        for(int i = 0; i < this.mat.size(); i++){
            sum += this.mat.get(i).get(i);
        }
        return sum;
    }

    public int secs(){
        int sum = 0;
        for(int i = 0; i < this.mat.size(); i ++){
            sum += this.mat.get(i).get(this.mat.size() - i - 1);
        }
        return sum;
    }

    public int diagdiff(){
        return Math.abs(this.prims() - this.secs());
    }
}
