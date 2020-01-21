package com.valurin.os;

import javax.ws.rs.GET;


public class App 
{
    public static void main( String[] args )
    {   
        // Database connection
        Database db = new Database();
        db.connect();
    }
}
