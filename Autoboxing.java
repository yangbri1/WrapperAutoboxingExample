/* Overview for Wrapper Classes:
 * Wrapper classes allow you to treat primitive data types as Objects. 
 * (Boolean, Byte, Short, Character, Integer, Long, Float, Double)
 * Why???
 * 1) Additional Functionality:
 * - Some methods ONLY unlocks with objs not primitives ...
 * -- Wrapper static helper methods -> i.e. String.valueOf(), Integer.parseInt(), etc.
 * 2) Integration w/ Collections:
 * - Java collections (ArrayList, LinkedList, HashMap) ONLY store objs, no primitive types ...
 * -- To accomodate: Collection will only allow storing of primitive values by providing obj variations of primitive types
 * ---               Hence why wrapper classes come in clutch: int -> Integer
 * 3) Nullability:
 * - Primitive data types in Java ain't all about that -- you could assign falsy values like 0 for int, false for boolean
 * - but never null values UNLESS working with objs ... in comes Intger wrapper class instead of int, etc.
 * 4) Compatibility w/ Generics:
 * - Generic (methods) only work w/ objs, not primitives in Java.
 * - Wrapper classes allow use of generics w/ primitive types via obj rep ...
 * -- allow type-safe collections & algorithms functioning w/ primitives & objs
 */ 

 // 3 ways to convert primitive to its wrapper class
 // 1) "Autoboxing" -- Java implicitly convert primitives -> wrapper classes
 // 2) "Boxing" -- explicitly convert primitives -> wrapper classes
 // 3) "Unboxing" -- explicitly convert wrapper -> primitives

 // access modifier 'public' allows this class to be open essentially everywhere (no restrictions) 
 public class Autoboxing {
    // standard static main() method w/ no return type (void)
    public static void main(String[] args) {
        // declare variable 'b1' w/ byte data type -- ranges from [-128, 127]
        byte b1 = -125;
        // invoke static autoboxDisplay() method which implicitly wraps Byte class around byte 'b1' (autoboxing)
        // Aside: static method can call other static members (variables, methods) ... but can NOT call instance members directly
        autoboxDisplay(b1);
    }

    public static void autoboxDisplay(Byte b){
        System.out.println(b + 5);
    }
 }