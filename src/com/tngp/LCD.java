package com.tngp;

public class LCD {
    public static void main(String[] args) {
        String _NONE = "   ";
        String _LEFT = "  |\n";
        String _MIDL = " _ \n";
        String _MDLT = " _|\n";
        String _MDRT = "|_ \n";
        String _FULL = "|_|\n";
        String _BOTH = "| |\n";
        String value = "";


        String number = "1";
        String n[] = number.split("",0);
        for(String str : n){
            if(str == "1" ){
                value = _LEFT + _LEFT;
            }
            else if(str == "2"){
                value = _MIDL + _MDLT +_MDRT;
            }
            else if(str == "3"){
                value = _MIDL + _MDLT +_MDLT;
            }
            else if(str == "4"){
                value = _FULL+_LEFT;
            }
            else if(str == "5"){
                value = _MIDL+_MDRT+ _MDLT;
            }
            else if(str == "6"){
                value = _MIDL+_MDRT+_FULL;
            }
            else if(str=="7"){
                value = _MIDL+_LEFT + _LEFT;
            }
            else if(str=="8"){
                value = _MIDL+_FULL+_FULL;
            }
            else if(str=="9"){
                value = _MIDL+_FULL+_LEFT;
            }
            else{
                value =_MIDL+_BOTH+_FULL;
            }
        }


        System.out.println(value );
    }





}
