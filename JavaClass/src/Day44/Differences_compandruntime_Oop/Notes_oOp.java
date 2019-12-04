package Day44.Differences_compandruntime_Oop;
public class Notes_oOp {
    /*
    runtime  poly = overriding
    compile time poly is  overloading = same name different parameters

     */
    /*
    Polymorphism !!
    In simple words, polymorphism is the ability by which, we can create functions or reference variables which
    behaves differently in different programmatic context.

     */
  // DIFFERENCES :
    /*
    Compile time Polymorphism ;
    In Compile time Polymorphism, call is resolved by the compiler.
    It is also known as Static binding, Early binding and overloading as well.
    Overloading is compile time polymorphism where more than one methods share the same name with different parameters
     or signature and different return type.
     It is achieved by function overloading and operator overloading.
     It provides fast execution because known early at compile time.
     Compile time polymorphism is less flexible as all things execute at compile time.
     */


     /*
     Run time Polymorphism  ;
     In Run time Polymorphism, call is not resolved by the compiler.
     It is also known as Dynamic binding, Late binding and overriding as well.
     Overriding is run time polymorphism having same method with same parameters or signature,
      but associated in a class & its subclass.
      It is achieved by virtual functions and pointers.
      It provides slow execution as compare to early binding because it is known at runtime.
      Run time polymorphism is more flexible as all things execute at run time.
      */







}
