# The builder pattern, as name implies, is an alternative way to construct complex objects. This should be used only when
you want to build different immutable objects using same object building process.

# Builder Pattern says that "construct a complex object from simple objects using step-by-step approach".
The construction is controlled by a director object that only needs to know the type of object it is to create.

# Builder pattern was introduced to solve some of the problems with Factory and Abstract Factory design patterns when the Object contains a lot of attributes.
There are three major issues with Factory and Abstract Factory design patterns when the Object contains a lot of attributes.
1. Too Many arguments to pass from client program to the Factory class that can be error prone because most of the time,
the type of arguments are same and from client side its hard to maintain the order of the argument.
2. Some of the parameters might be optional but in Factory pattern, we are forced to send all the parameters and optional
parameters need to send as NULL.
3. If the object is heavy and its creation is complex, then all that complexity will be part of Factory classes that is confusing.

# Builder pattern solves the issue with large number of optional parameters and inconsistent state by providing a way to
build the object step-by-step and provide a method that will actually return the final Object.