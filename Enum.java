import groovy.lang.ObjectRange;

import javax.swing.text.rtf.RTFEditorKit;

class Outer
{
    enum Directions{east,west,north,south;}  //Semicolons can be used
}
enum Week{Sunday,Monday,Tuesday,Wednesday,Thursday,Friday,Saturday}

enum EnumConstructor{
    hi(9),hello(10);
    private int a=5;
    EnumConstructor(int a)
    {
        System.out.println(++a);
    }
}

enum Rainbow{
    VIOLET {
        void print() {
            System.out.println("Violet");
        }
    },
    INDIGO {
        void  print() {
            System.out.println("Indigo");
        }
    },
    BLUE {
         void print() {
             System.out.println("Blue");
         }
    },
    GREEN {
        void print() {
            System.out.println("Green");
        }
    },
        YELLOW
        {
            public void print() {
                System.out.println("Yellow");
            }
        },

        ORANGE
        {
            public void print() {
                System.out.println("Orange");
            }
        },
        RED
        {
           public void print() {
               System.out.println("Red");
           }
        };
    abstract void print();
    }

public class Enum {
    public enum TrafficSignal{RED,YELLOW,GREEN}
    public static void main(String[] args)
    {
        TrafficSignal signal=TrafficSignal.GREEN;
        System.out.println(signal);
        System.out.println(signal.ordinal());
        System.out.println(TrafficSignal.valueOf("GREEN"));
        System.out.println(TrafficSignal.valueOf("RED").ordinal());
        System.out.println(TrafficSignal.values());

        for(TrafficSignal t:TrafficSignal.values())
        {
            System.out.println(t.ordinal()+ " --> " +t);
        }

        for (Outer.Directions d: Outer.Directions.values())
        {
            System.out.println(d.ordinal()+" --> "+d);
        }

        for (Week w: Week.values())
        {
            System.out.println(w.ordinal()+" --> "+w);
        }
        Week w=Week.Monday;
        switch(w)
        {
            case Sunday -> System.out.println("Week-end");
            case Monday -> System.out.println("Week Day");
        }
        EnumConstructor e=EnumConstructor.hello;
        Rainbow colors=Rainbow.BLUE;
        colors.print();
        colors=Rainbow.RED;
        colors.print();
    }
}
