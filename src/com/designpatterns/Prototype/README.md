### **Shallow Copy**

The default implementation of the clone method creates a shallow copy of the source object, it means a new instance of
type Object is created, it copies all the fields to a new instance and returns a new object of type ‘Object’.

This Object explicitly needs to be typecast in object type of source object. This object will have an exact copy of all
the fields of source object including the primitive type and object references. If the source object contains any
references to other objects in field then in the new instance will have only references to those objects, a copy of
those objects is not created. This means if we make changes in shallow copy then changes will get reflected in the
source object. Both instances are not independent.

The clone method in Object class is protected in nature, so not all classes can use the clone() method. You need to
implement Cloneable interface and override the clone method. If the Cloneable interface is not implemented then you will
get CloneNotSupportedException.super.clone () will return shallow copy as per implementation in Object class.

### **Deep Copy**

The deep copy of an object will have an exact copy of all the fields of source object like a shallow copy, but unlike
sallow copy if the source object has any reference to object as fields, then a replica of the object is created by
calling clone method. This means that both source and destination objects are independent of each other. Any change made
in the cloned object will not impact the source object.

### **References**

https://www.edureka.co/blog/shallow-and-deep-copy-java/