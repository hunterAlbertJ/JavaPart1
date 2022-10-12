enum Genre {
    ACTION("Action"),
    ROMANCE("Romance"),
    COMEDY("Comedy"),
    HORROR("Horror"),
    DOCUMENTARY("Documentary"),
    SCI_FI("Sci-Fi"),
    ANIMATION("Animation"),
    DRAMA("Drama");
    //everything under here is regular class definition stuff (fields , ctors, methods)

    private String display;

    Genre(String display){
        this.display = display;
        System.out.println("Genre ctor called");
    }


    public String getDisplay(){
        return display;
    }

    public String toString(){
        return getDisplay();
    }

}