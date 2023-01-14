
    import static java.lang.Long.valueOf;

    public class Medicine {
        public String name = "medicine";
        public int value = 2022;
        public String firm_names = "<medicine_firm>";
        public int pacf = 1;
        public double price = 1.5;
        public Medicine(String[] arr) {
            for (int i = 0; i < arr.length; i++) {
                if (arr[i].isEmpty()) continue;
                if(arr[i].charAt(0) == '"'){
                    name = arr[i];
                }
                if(arr[i].charAt(0) == '<'){
                    firm_names = arr[i];
                }
                if(arr[i].indexOf('.') == -1){
                    price = Double.parseDouble(arr[i]);
                }
                else{
                    int temp = Integer.parseInt(arr[i]);
                    if(temp > 100) value = temp;
                    else pacf = temp;
                }
            }
        }

    }


