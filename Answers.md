##Answers for Lab 6:

##1. Why does FixedArrayQueue require an explicit constructor?
#it allows us to establish how much space we ne need to allocate for our queue

##2. What happens when you offer an item to a full FixedArrayQueue?
#it will return false since there is no room left within the queue

##3. What happens when you poll an empty FixedArrayQueue?
#it will return null since there are not anymore items left to remove

##4. What is the time and (extra) space complexity of each of the FixedArrayQueue methods?
#All of the time and space complexity for the methods are 0(1)