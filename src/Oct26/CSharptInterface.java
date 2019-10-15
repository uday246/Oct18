package Oct26;

using System.IO;
using System;
namespace InterfaceDemo {
interface ITurnable{
    void turn();
}
class Page:ITurnable{
    public void turn(){
        Console.WriteLine("You turn a page in a book");
    }
}
class Conrner:ITurnable{
    public void turn(){
        Console.WriteLine("You turn corners to go around the block");
    }
}
class PanCake:ITurnable{
    public void turn(){
        Console.WriteLine("You turn a pancake when it's done on one side");
    }
}
class Leaf:ITurnable{
    public void turn(){
        Console.WriteLine("A leaf turns colors in the fall.");
    }
}
class Program
{
    static void Main()
    {
        ITurnable t= new Page();
        t.turn();
        t= new Conrner();
        t.turn();
        t=new PanCake();
        t.turn();
        t=new Leaf();
        t.turn();
    }
}


}
