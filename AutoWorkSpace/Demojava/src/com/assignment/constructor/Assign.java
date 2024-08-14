package com.assignment.constructor;

class  Assigndemo
{
    String firstname;
    String name;
    int usn;
    Assigndemo (String firstname,String name ,int usn)
    {
        firstname=firstname;
        name=name;
        usn=usn;
        System.out.println("firstname:"+firstname);
        System.out.println("name:"+name);
        System.out.println("usn:"+usn);
    }
}
class assigndemo2 {
    String uname;
    String cname;
    int rollnumber;
    assigndemo2(String uname,String cname,int rollnumber)
    {
        uname=uname;
        cname=cname;
        rollnumber=rollnumber;
        System.out.println( "umane:"+uname);
        System.out.println("cname:"+cname);
        System.out.println("rollnumber:"+rollnumber);
    }
}

public class Assign{
    public static void main(String[] args) {
        Assigndemo o1=new Assigndemo("VTU","Dayananada collage",40123);
        assigndemo2 o2=new assigndemo2("autonomous","PES",26646);
    }
}
