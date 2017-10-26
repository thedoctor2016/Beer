/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.web;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author matthewpowell
 */
public class BeerExpert {
 public List getBrands(String colour){
     List brands= new ArrayList();
     if(colour.equals("amber")){
         brands.add("Jack Amber");
         brands.add("Red Moose");
     }
     else {
         brands.add("Jail Pale Ale");
         brands.add("Gout Stout");
     }
     return(brands);
 }
}
