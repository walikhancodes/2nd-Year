//Wali Khan
//2308097
//wali.m.khan@emory.edu
/*
THIS CODE WAS MY OWN WORK , IT WAS WRITTEN WITHOUT CONSULTING
CODE WRITTEN BY OTHER STUDENTS . Wali Khan 
*/

public class BSTIndex{

	class Node{

		public String key;
		public MovieInfo data;
		public Node left;
		public Node right;

		public Node(String key, MovieInfo data){
			this.key = key;
			this.data = data;

		}

		public Node(String key, MovieInfo data, Node left, Node right){
			this.key = key;
			this.data = data;
			this.left = left;
			this.right = right;
		}
	}

	private Node root;
	
	public BSTIndex(){
		root = null; 
	}

	public MovieInfo findExact(String key){
		key = key.toLowerCase();
		Node current = root;
		String keyOfCurrent; 
		while(current != null){
			keyOfCurrent = current.key;
			int x = key.compareTo(keyOfCurrent);
			if(x > 0){
				current = current.right;
			} else if (x < 0){
				current = current.left;
			} else{
				return current.data; 
			}
		}
		return null; 
	}

	public MovieInfo findPrefix(String prefix){
		prefix = prefix.toLowerCase();
		Node current = root;
		String keyOfCurrent;
		String pattern = "(\\w+)([\\*])";
		prefix = prefix.replaceAll(pattern, "$1");
		while(current != null){
			keyOfCurrent = current.key;
			if(prefix.length() <= keyOfCurrent.length()){
				keyOfCurrent = keyOfCurrent.substring(0, prefix.length());
			}
			int x = prefix.compareTo(keyOfCurrent);
			if(x > 0){
				current = current.right;
			} else if(x < 0){
				current = current.left;	 
			} else{
				return current.data;
			}
		}
		return null; 
	}

	public void insert(MovieInfo data){
		String key = data.shortName.toLowerCase();
		if(root == null){
			root = new Node(key, data, null, null);
		}
		Node current = root;
		while(current != null){
			int x = key.compareTo(current.key);
			if(x > 0){
				if(current.right != null){
					current = current.right;
				}else {
					current.right = new Node(key, data, null, null);
					break;
				}
			} else if(x < 0){
				if(current.left != null){
					current = current.left;
				} else{
					current.left = new Node(key, data, null, null);
					break;
				}
			} else{
				current.data = data;
				break;
			}
		}

	}

}