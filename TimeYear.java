public enum TimeYear {

    winter(-20){

    },
    summer(20){
        @Override
        String getDescription(){
            return "Теплое время года";
        }
    },
    spring(5),
    autumn(-5);
    int temp;
    TimeYear(int temp) {
        this.temp = temp;

    }
    String getDescription(){
        return "Холодное время года";
    }

}