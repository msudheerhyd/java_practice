package com.leetcode.alienDictionary;

import java.util.*;

public class Graph {

	private final LinkedList<Integer>[] adjacencyList;
	
	Graph(int nVertices){
		adjacencyList = new LinkedList[nVertices];
		for(int vertexIndex = 0; vertexIndex < nVertices;
				vertexIndex++) {
			adjacencyList[vertexIndex] = new LinkedList<>();
		}
	}
	
	//function to add an edge to graph
	void addEdge(int startVertex, int endVertex) {
		adjacencyList[startVertex].add(endVertex);
	}
	
	private int getNoOfVertices() {
		return adjacencyList.length;
	}
	
	private void topologicalSortUtil(int currentVertex, boolean[] visited,
			Stack<Integer> stack) {
		visited[currentVertex] = true;
		
		for(int adjacentVertex :
			adjacencyList[currentVertex]) {
			if(!visited[adjacentVertex]) {
				topologicalSortUtil(adjacentVertex, visited, stack);
			}
		}
		
		stack.push(currentVertex);
	}
	
	void topologicalSort() {
			Stack<Integer> stack = new Stack<>();
			
			boolean[] visited = new boolean[getNoOfVertices()];
			for(int i=0; i< getNoOfVertices(); i++) {
				visited[i] = false;
			}
			
			for(int i=0; i<getNoOfVertices(); i++) {
				if(!visited[i]) {
					topologicalSortUtil(i, visited, stack);
				}
			}
			
			while (!stack.isEmpty()) {
				System.out.println((char)('a' + stack.pop()) + " ");
			}
	}
	
}


