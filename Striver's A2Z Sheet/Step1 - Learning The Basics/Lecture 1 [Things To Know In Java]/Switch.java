class Switch{
    static double switchCase(int choice, List<Double> arr){
        // code here
        double pi = 3.141592653589793;
        switch(choice){
            case 1:
                return pi*arr.get(0)*arr.get(0);
            case 2:
                return (arr.get(0)*arr.get(1));
            default: 
                return -1;
        }
    }
}