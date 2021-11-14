### Summary

`Decorator` is a structural design pattern used to attach new behaviors to objects by these objects inside a special wrapper object which contains the behaviors.

### Pros
- extend an object’s behavior without making a new subclass;
- add or remove responsibilities from an object at runtime;
- combine several behaviors by wrapping an object into multiple decorators;
- `Single Responsibility Principle` we can divide a monolithic class that implements many possible variants of behavior into several smaller classes.
- 
### Cons
- removing a specific wrapper from the wrappers stack can be hard;
- implement a decorator in a way that it's behavior does not depend on the order in the decorators stack;
