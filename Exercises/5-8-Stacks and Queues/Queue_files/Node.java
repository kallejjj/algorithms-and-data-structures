class Node<T>
{
	T    data; // Entry in queue
	Node next; // Link to next node

	Node(T dataPortion)
	{
		data = dataPortion;
		next = null;
	} // end constructor

	Node(T dataPortion, Node linkPortion)
	{
		data = dataPortion;
		next = linkPortion;
	} // end constructor

	T getData()
	{
		return data;
	} // end getData

	void setData(T newData)
	{
		data = newData;
	} // end setData

	Node getNextNode()
	{
		return next;
	} // end getNextNode

	void setNextNode(Node nextNode)
	{
		next = nextNode;
	} // end setNextNode
} // end Node
