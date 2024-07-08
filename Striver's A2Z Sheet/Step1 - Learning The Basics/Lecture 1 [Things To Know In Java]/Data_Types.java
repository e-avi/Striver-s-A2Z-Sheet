class Data_Types {
    static int dataTypeSize(String str) {
        // code here
        String strnew = str.toLowerCase();
        if(strnew.equals("byte") || strnew.equals("boolean")){
            return 1;
        }
        else if(strnew.equals("character") || strnew.equals("short")){
            return 2;
        }
        else if(strnew.equals("integer") || strnew.equals("float")){
            return 4;
        }
        else if(strnew.equals("long") || strnew.equals("double")){
            return 8;
        }
        else{
            return -1;
        }
    }
}