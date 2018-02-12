import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

public class prob20 {
    
    public static void main(String[] args) throws IOException {
        File file = new File("prob20-1-in.txt");
	Scanner sc = new Scanner(file);
	int numColumns = sc.nextInt();
	int numRows = sc.nextInt();
        sc.nextLine(); 
        //create the maze
        char[][] maze = new char[numRows][numColumns];
        for (int i = 0; i < numRows; i++) {
            maze[i] = sc.nextLine().trim().toCharArray();
        }
        
        //copy it
        char[][] unchanging = new char[numRows][numColumns];
        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j < numColumns; j++) {
                unchanging[i][j] = maze[i][j];
            }
        }
        
        //create static one
        Maze m = new Maze(maze);
        
        //get starts, points
        Point start = findChar('@');
        Point finish = findChar('X');
        
        //create stacks and nodes
        Stack<Node> path = new Stack();
        Stack<Integer> choices = new Stack();
        Node currentNode = new Node(start.r,start.c);
        path.push(currentNode);
        Node nextNode;
        int count = 0;
        int loop = 0;
        
        //loop till solution
        while(loop <60) {
            //do everyloop
            //print();
            loop++;
            count++;
            //System.out.println("Current node is " + currentNode);
            
            //if the node can go to multiple ones set it as a choice
            if(currentNode.isChoice()) {
                choices.push(count);
            } else {
                //insert code to remove choice
            }
            //if this current node has somewhere to go
            if(currentNode.canContinue()) {
                //get the next node in the order of starting north and going clockwise
                nextNode = currentNode.getNextNode();
                //System.out.println("\tNext node is " + nextNode);
                
                if(nextNode.isX()) { //if the node is X break the loop
                    //System.out.println(nextNode.r + "  " + nextNode.c);
                    //System.out.println("\tFound X");
                    break;
                } else if (nextNode.canContinue()) { 
                    //System.out.println("\tCan continue from " + currentNode + " to " + nextNode);
                    //if it can continue set the current node a new one
                    currentNode=nextNode;
                    path.push(currentNode);
                    //set it as already visited
                    Maze.maze[currentNode.r][currentNode.c] = 'V'; 
                } else { //if it cannot continue set that rotation to false
                    currentNode.setFalse(currentNode.rotation);
                    //set the next node position to false in the array
                    Maze.maze[nextNode.r][nextNode.c]='F';
                    //System.out.println("\tSetting false rotation " + currentNode.rotation + " from" + currentNode);
                }
            } else {
                //System.out.println("\tLast choice is " + choices.peek() + " count is " + count);
                // while the count is greater then the last choice pop and decrement choice
                while(count>choices.peek()) {
                    path.pop();
                    count--;
                }
                //System.out.println("\tsize is " + path.size());
                //System.out.println("\t"+currentNode + " has no good places");
                currentNode = path.lastElement();
            } 
        }
        //System.out.println("size " + path.size());
        int size = path.size();
        for(int i = 0; i < size-1; i++) {
            Node temp = path.pop();
            unchanging[temp.r][temp.c] = '*';
            //System.out.println(i +  " " + temp.r + " " + temp.c);
        }
        for (char[] r: unchanging) {
            for (char c : r) {
                System.out.print(c);
            }
            System.out.println("");
        }
    }
    
    public static void print() {
        for (char[] r: Maze.maze) {
            for (char c : r) {
                System.out.print(c);
            }
            System.out.println("");
        }
    }
    
    public static Point findChar(char find) {
        for (int i = 0; i < Maze.maze.length; i++) {
            for (int j = 0; j < Maze.maze[0].length; j++) {
                if(Maze.maze[i][j]==find) {
                    //flip as j is row number, y, and i is  column, x
                    return new Point(i, j); 
                }
            }
        }
        return null;
    }
}

class Maze {
    public static char[][] maze;  
    public Maze(char[][] maze) {
        this.maze = maze;
    }
}
class Point {
    int r;
    int c;
    
    public Point(int row, int column) {
        this.r=row;
        this.c=column;
    }
}

class Node {
    
    int rotation=0;
    int r;
    int c;
    int[][] valToAdd = {{-1,0},{-1,1},{0,1},{1,1},{1,0},{1,-1},{0,-1},{-1,-1}};
    boolean[] directions = new boolean[valToAdd.length];
    int dontGo; //dont go to specific one since came from here
    boolean first;
    //the directions will go in increments of 45 degrees starting North going clockwise
    
    public Node(int row, int column) {
        this.r=row;
        this.c=column;
        setDirections(r, c);  
    }
    
    public void setDirections(int r, int c) {
        for (int i = 0; i < valToAdd.length; i++) {
            directions[i] = isPassable(r+valToAdd[i][0], c+valToAdd[i][1]);
        }
    }
    
    public boolean isPassable(int r, int c) {
        if(r<0||r>=Maze.maze.length||c<0||c>=Maze.maze[0].length) {
            return false;
        } else {
            return (Maze.maze[r][c]==' '||Maze.maze[r][c]=='X');     
        }
    }
    
    public void setFalse(int i) {
        directions[i] = false;
    }
    
    public boolean canContinue() {
        for (int i = 0; i < directions.length; i++) {
            if(directions[i]) {
                //System.out.println("\tRotation " + i + " is good from " + toString());
                return true;
            }
        }
        return false;
    }
    
    public Node getNextNode() {
        for (int i = 0; i < directions.length; i++) {
            if(directions[i]) {
                rotation = i;
                return new Node(r+valToAdd[i][0], c+valToAdd[i][1]);
            }
        }
        return null;
    }
    
    public boolean isX() {
        return Maze.maze[r][c]=='X';
    }
    
    public boolean isChoice() {
        int times=0;
        //System.out.println("\tchoices are");
        for (int i = 0; i < directions.length; i++) {
            if(directions[i]) {
                //System.out.println(i);
                times++;
            }
        }
        return times>1;
    }
    
    @Override
    public String toString() {
        return "[" + r + "][" + c + "]";
    }
}