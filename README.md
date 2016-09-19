# AdapterDesignPattern
Implementation of Adapter Design Pattern

The source code for my post at http://jsaidamin.blogspot.com/2016/09/adapter-design-pattern-in-java_18.html

According to Wikipedia:  
"An adapter helps two incompatible interfaces to work together. This is the real world definition for an adapter. Interfaces may be incompatible but the inner functionality should suit the need. The Adapter design pattern allows otherwise incompatible classes to work together by converting the interface of one class into an interface expected by the clients." 

The Adapter pattern should be used when:
• There is an existing class, and its interface does not match the one you need.
• You want to create a reusable class that cooperates with unrelated or unforeseen classes, that is, classes that don’t necessarily
have compatible interfaces.
• There are several existing subclasses to be use, but it’s impractical to adapt their interface by subclassing every one. An object adapter can adapt the interface of its parent class.
