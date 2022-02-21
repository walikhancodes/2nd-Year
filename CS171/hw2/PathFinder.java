/**
 * Starter code for the Maze path finder problem.
 */
//Wali Khan
//wali.m.khan@emory.edu/2308097
/*THIS  CODE  WAS MY OWN WORK , IT WAS  WRITTEN  WITHOUT  CONSULTING  ANYSOURCES  OUTSIDE  OF  THOSE  APPROVED  BY THE  INSTRUCTOR. Wali Khan*/

import java.io.*;
import java.util.Scanner;
import java.util.ArrayDeque;
import java.util.ArrayList;

/*
 * Recursive class to represent a position in a path
 */
class Position{
	public int i;     //row
	public int j;     //column
	public char val;  //1, 0, or 'X'
	
	// reference to the previous position (parent) that leads to this position on a path
	Position parent;
	
	Position(int x, int y, char v){
		i=x; j = y; val=v;
	}
	
	Position(int x, int y, char v, Position p){
		i=x; j = y; val=v;
		parent=p;
	}

	
}


public class PathFinder {
	
	public static void main(String[] args) throws IOException {
		if(args.length<1){
			System.err.println("***Usage: java PathFinder maze_file");
			System.exit(-1);
		}
		
		char [][] maze;
		maze = readMaze(args[0]);
		printMaze(maze);
		Position [] path = stackSearch(maze);
		System.out.println("stackSearch Solution:");
		printPath(path);
		printMaze(maze);
		
		char [][] maze2 = readMaze(args[0]);
		path = queueSearch(maze2);
		System.out.println("queueSearch Solution:");
		printPath(path);
		printMaze(maze2);
	}
	
	
	public static Position [] stackSearch(char [] [] maze){
		// todo: your path finding algorithm here using the stack to manage search list
		// your algorithm should mark the path in the maze, and return array of Position 
		// objects coressponding to path, or null if no path found

		int n = maze.length; 
		ArrayDeque<Position> stackOfPositions = new ArrayDeque<Position>(); 
		ArrayList<Integer> visitedPositionsI = new ArrayList<Integer>();
		ArrayList<Integer> visitedPositionsJ = new ArrayList<Integer>();
		stackOfPositions.push(new Position(0,0,'X'));
		while(stackOfPositions.size() != 0){
			Position p = stackOfPositions.pop();
			if(p.i == (n-1) && p.j == (n-1)){
				int count = 1;
				Position current = p;
				while(current.i != 0 || current.j != 0){
					current = current.parent; 
					count++; 
				}

				current = p; 
				Position [] result = new Position [count]; 
				int index = 0;

				while (current.i != 0 || current.j != 0){
					result[index++] = current;
					maze[current.i][current.j] = 'X';
					current.val = 'X';
					current = current.parent;
				}
				maze[0][0] = 'X';
				result[index] = new Position(0,0,'X');
				return result;	

			} else {
				int i = p.i;
				int j = p.j;
				int a = i + 1;
				int b = j + 1;
				int c = i - 1;
				int d = j - 1;
			
				visitedPositionsI.add(i);
				visitedPositionsJ.add(j);


				boolean isVisited = false;
			
				if(b != n && maze[i][b] == '0'){
	
					for(int k = 0; k < visitedPositionsI.size(); k++){
						if(visitedPositionsI.get(k) == i && visitedPositionsJ.get(k) == b){
							isVisited = true; 

						}
					}
					if (!isVisited){
						stackOfPositions.push(new Position(i, b, '0', p));
						
					}	
				}
				isVisited = false;
				if(a != n && maze[a][j] == '0'){
			
					for(int k = 0; k < visitedPositionsI.size(); k++){
						if(visitedPositionsI.get(k) == a && visitedPositionsJ.get(k) == j){
							isVisited = true; 

						}
					}
					if (!isVisited){
						stackOfPositions.push(new Position(a, j, '0', p));
						
					}
				}
				isVisited = false;
				if(c != -1 && maze[c][j] == '0'){
				
					for(int k = 0; k < visitedPositionsI.size(); k++){
						if(visitedPositionsI.get(k) == c && visitedPositionsJ.get(k) == j){
							isVisited = true; 

						}
					}
					if (!isVisited){
						stackOfPositions.push(new Position(c, j, '0', p));
						
					}
				}
				isVisited = false;
				if(d >= 0 && maze[i][d] == '0'){
			
					for(int k = 0; k < visitedPositionsI.size(); k++){
						if(visitedPositionsI.get(k) == i && visitedPositionsJ.get(k) == d){
							isVisited = true; 

						}
					}
					if (!isVisited){
						stackOfPositions.push(new Position(i, d, '0', p));
				
					}			
				}	

			}

		}
				
		return null;
	}
	
	public static Position [] queueSearch(char [] [] maze){
		// todo: your path finding algorithm here using the queue to manage search list
		// your algorithm should mark the path in the maze, and return array of Position 
		// objects coressponding to path, or null if no path found
		int n = maze.length; 
		ArrayDeque<Position> stackOfPositions = new ArrayDeque<Position>(); 
		ArrayList<Integer> visitedPositionsI = new ArrayList<Integer>();
		ArrayList<Integer> visitedPositionsJ = new ArrayList<Integer>();
		stackOfPositions.add(new Position(0,0,'X'));
		while(stackOfPositions.size() != 0){
			Position p = stackOfPositions.remove();
			if(p.i == (n-1) && p.j == (n-1)){
				int count = 1;
				Position current = p;
				while(current.i != 0 || current.j != 0){
					current = current.parent; 
					count++; 
				}

				current = p; 
				Position [] result = new Position [count]; 
				int index = 0;

				while (current.i != 0 || current.j != 0){
					result[index++] = current;
					maze[current.i][current.j] = 'X';
					current.val = 'X';
					current = current.parent;
				}
				maze[0][0] = 'X';
				result[index] = new Position(0,0,'X');
				return result;	

			} else {
				int i = p.i;
				int j = p.j;
				int a = i + 1;
				int b = j + 1;
				int c = i - 1;
				int d = j - 1;
			
				visitedPositionsI.add(i);
				visitedPositionsJ.add(j);


				boolean isVisited = false;
			
				if(b != n && maze[i][b] == '0'){
	
					for(int k = 0; k < visitedPositionsI.size(); k++){
						if(visitedPositionsI.get(k) == i && visitedPositionsJ.get(k) == b){
							isVisited = true; 

						}
					}
					if (!isVisited){
						stackOfPositions.add(new Position(i, b, '0', p));
						
					}	
				}
				isVisited = false;
				if(a != n && maze[a][j] == '0'){
			
					for(int k = 0; k < visitedPositionsI.size(); k++){
						if(visitedPositionsI.get(k) == a && visitedPositionsJ.get(k) == j){
							isVisited = true; 

						}
					}
					if (!isVisited){
						stackOfPositions.add(new Position(a, j, '0', p));
						
					}
				}
				isVisited = false;
				if(c != -1 && maze[c][j] == '0'){
				
					for(int k = 0; k < visitedPositionsI.size(); k++){
						if(visitedPositionsI.get(k) == c && visitedPositionsJ.get(k) == j){
							isVisited = true; 

						}
					}
					if (!isVisited){
						stackOfPositions.add(new Position(c, j, '0', p));
						
					}
				}
				isVisited = false;
				if(d >= 0 && maze[i][d] == '0'){
			
					for(int k = 0; k < visitedPositionsI.size(); k++){
						if(visitedPositionsI.get(k) == i && visitedPositionsJ.get(k) == d){
							isVisited = true; 

						}
					}
					if (!isVisited){
						stackOfPositions.add(new Position(i, d, '0', p));
				
					}			
				}	

			}

		}
		
		return null;
		
	}
	
	public static void printPath(Position [] path){

		// todo: print the path to the stdout
		if(path == null){
			System.out.println("There is no Path!");
		} else{
		System.out.print("Path: (");
		for(int l = path.length-1; l > 0; l--){
			System.out.print("[" + path[l].i + "][" + path[l].j +"], " );

		}
		System.out.println("[" + path[0].i + "][" + path[0].j + "])");

	}}
	
	/**
	 * Reads maze file in format:
	 * N  -- size of maze
	 * 0 1 0 1 0 1 -- space-separated 
	 * @param filename
	 * @return
	 * @throws IOException
	 */
	public static char [][] readMaze(String filename) throws IOException{
		char [][] maze;
		Scanner scanner;
		try{
			scanner = new Scanner(new FileInputStream(filename));
		}
		catch(IOException ex){
			System.err.println("*** Invalid filename: " + filename);
			return null;
		}
		
		int N = scanner.nextInt();
		scanner.nextLine();
		maze = new char[N][N];
		int i=0;
		while(i < N && scanner.hasNext()){
			String line =  scanner.nextLine();
			String [] tokens = line.split("\\s+");
			int j = 0;
			for (; j< tokens.length; j++){
				maze[i][j] = tokens[j].charAt(0);
			}
			if(j!=N){
				System.err.println("*** Invalid line: " + i + " has wrong # columns: " + j);
				return null;
			}
			i++;
		}
		if(i!=N){
			System.err.println("*** Invalid file: has wrong number of rows: " + i);
			return null;
		}
		return maze;
	}
	
	public static void printMaze(char[][] maze){
		
		if(maze==null || maze[0] == null){
			System.err.println("*** Invalid maze array");
			return;
		}
		
		for(int i=0; i< maze.length; i++){
			for(int j = 0; j< maze[0].length; j++){
				System.out.print(maze[i][j] + " ");	
			}
			System.out.println();
		}
		
		System.out.println();
	}

}
