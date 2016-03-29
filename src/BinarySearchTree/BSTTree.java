package BinarySearchTree;

import DeQueue.Node;

public class BSTTree {

	
		BSTNode root;
		int count;
		
		public BSTTree(){
			this.root = null;
		}
		
		
		public BSTTree(int data){
			this.root = new BSTNode(data);
		}
		
		
		public int getRoot(){
			return this.root.data;
		}
		
		
		public void setRoot(BSTNode n){
			this.root = n;
		}
		
		
		public boolean isEmpty(){
			return this.root ==null;
		}
		
	
			
			
			
	public void insert(int data){
		
			if(isEmpty()){
				this.root = new BSTNode(data);
				this.count++;
			}else{
				BSTNode node = this.root;
				
				while(node.leftChild!=null && node.rightChild!=null){
					if(node.data> data){
						node = node.leftChild;
						}else{
						node = node.rightChild;
						}
				
				}
				
				
				if(node.data>data){
					node.leftChild = new BSTNode(data);
				}else{
					node.rightChild = new BSTNode(data);
				}
				this.count++;
			}
			
					
				
	}
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			public void printInorder(){
				
				  printInOrderRec(root);
				
				  System.out.println("");
				
				}
				
				 
			
				private void printInOrderRec(BSTNode currRoot){
				
				  if ( currRoot == null ){
				
				    return;
				
				  }
				
				  printInOrderRec(currRoot.leftChild);
				
				  System.out.print(currRoot.data+", ");
			
				  printInOrderRec(currRoot.rightChild);
				
				}

				
				
				
			
				
				
				
				
				
				
				
				public int getMinValue(){
					BSTNode node = this.root;
					
					while(node.leftChild!=null){
						node = node.leftChild;
					}
					
					return node.data;
				}
				
				
				
				public int getMaxValue(){
					BSTNode node = this.root;
					
					
					
					while(node.rightChild!=null){
						node = node.rightChild;
					}
					
					return node.data;
				}
				
				
				
				
				
				
				
				public boolean find(int data){
					if(isEmpty()){
						System.out.println("tree is empty");
					}else{
						BSTNode node = this.root;
						if(node.data == data){
							return true;
						}else {
							while (node!=null) {
								if(node.data==data){
									return true;
								}else if(node.data>data){
									node = node.leftChild;
								}else{
									node = node.rightChild;
								}
							}
						}
						
					}
					return false;
				}
				
				
				
				
				
			
				
				
				
				
				public int  countNodes(){
					return this.count;
				}
				
				
				
				
				
			
				
				
				
				
				public void deleteNode(int data){
					BSTNode node = new BSTNode(data);
					if(find(data)==true){
						BSTNode rootNode = this.root;
						while(rootNode!=null){
							if(rootNode.data<node.data){
								rootNode = rootNode.rightChild;
							}else if(rootNode.data>node.data){
								rootNode = rootNode.leftChild;
							}
						}
						
						
						System.out.println(rootNode.data);
						
					}else{
						System.out.println("Node is not in tree");
					}
				}
				
				
				
				
			}
			

		
		
		
		

