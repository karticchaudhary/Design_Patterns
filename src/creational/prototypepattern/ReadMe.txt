# Prototype design pattern is used in scenarios where application needs to create a number of instances of a class,
which has almost same state or differs very little. In this design pattern, an instance of actual object (i.e. prototype)
is created on starting, and thereafter whenever a new instance is required, this prototype is cloned to have another instance.
The main advantage of this pattern is to have minimal instance creation process which is much costly than cloning process.

#This pattern is a creational pattern (just as the already introduced Factory Pattern) and it comes to play where
performance matters. This pattern is used when creating a new object is costly: you use a prototype and extend it with the
particular implementations of the needed object.
The best use-case for this pattern if an object is created after a costly database operation: you get all the data with the query
(or queries) and you can use this information later to have new objects popul