package com.leetcode.cloneGraph;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Queue;

import org.w3c.dom.Node;

public class BfsSolution {

	public Node cloenGraph(Node node) {
		Map<Node, Node> map = new HashMap<>();
		Queue<Node> queue = new ArrayDeque<>();
		
		queue.offer(node);
		map.put(node, new Node(node.val, new ArrayList<>()));
		while(!queue.isEmpty()) {
			Node h = queue.poll();
			
			for(Node neighbor : h.neighbors) {
				if(!map.containsKey(neighbor)) {
					map.put(neighbor, new Node(neighbor.val, new ArrayList<>()));
					queue.offer(neighbor);
				}
				map.get(h).neighbors.add(map.get(neighbor));
			}
		}
		
		return map.get(node);
	}
}
