public class Movie{

    private String title;

    public movie(String title){
        this.title = title;
    }
    public void watchMovie(){
        String instanceType = this.getClass().getSimpleName();
        System.out.println(title+" is a "+instanceType+" film");
    }
}

class Adventure extends Movie{

    public Adventure(String title){
        super(title);
    }
    public void watchMovie(){

        super.watchMovie();
        System.out.println("..%s%n".repeat(3));
    }
}