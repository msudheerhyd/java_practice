package com.leetcode.removeNthNode;


	import static java.lang.System.out;

	public class ListNode<T> {

	  /* Dummy data payload */
	  private static final Object DUMMY = new Object();

	  private ListNode<T> next = null;
	  private T data = null;

	  public ListNode() { }

	  public ListNode(T data) {
	    this.data = data;
	  }

	  /*
	   * Add a new node after the current node
	   * Time Complexity: O(1)
	   */
	  public void add(T data) {
	    ListNode<T> newNode = new ListNode<T>(data);
	    newNode.next = this.next;
	    this.next = newNode;
	  }

	  /*
	   * Delete the next node of current node
	   * Time Complexity: O(1)
	   */
	  public T delete() throws Exception {
	    if (isDummy()) { /* The current node is the last node. */
	      throw new Exception("This is a dummy node.");
	    }

	    if (this.next != null) {
	      ListNode<T> nextNode = this.next;
	      T thisData = this.data;
	      this.data = nextNode.data;
	      this.next = nextNode.next;
	      return thisData;
	    } else {
	      throw new UnsupportedOperationException("Next is null.");
	    }
	  }

	  /*
	   * Check whether this node is dummy node
	   */
	  public boolean isDummy() {
	    return data == DUMMY;
	  }

	  /*
	   * Check whether this node is dummy node
	   */
	  @SuppressWarnings("unchecked")
	  public void setDummy() {
	    data = (T)DUMMY;
	  }

	  /* getters, setters and toString() */

	}

