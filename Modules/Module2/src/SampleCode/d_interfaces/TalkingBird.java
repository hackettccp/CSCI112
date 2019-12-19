package SampleCode.d_interfaces;

/**
 * TalkingBird interface.
 * 
 * Classes that implement this interface must define a public void method
 * named sayHello().
 */
public interface TalkingBird {
    
    public abstract void sayHello();       //public and abstract keywords not really needed since all methods are inherently public and abstract in an interface
    
}
