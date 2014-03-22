Data Structures
==========

# Linked list

A linkd list is a data structure consisting of a group of nodes which together represent a sequence. Under the 
simplest form, each node is composed of a datum and areference (in other words, a link) to the next node in the sequence.

# Queue

A queue is a data structure that supports FIFO operations, including enqueue and dequeue. The first node that is added to the data structure is also the first node that is removed.
To enqueue, we mainly need to get the last node and set its next reference to the new queue. The new queue then becomes that last node. To dequeue, we make a copy of the first node and return that to the user; the first node then becomes the previous first node's next node, or null, if none are available. 
