class Browser{
    void openWebsite(){
        System.out.println("It is normal browser");
    }
}
class Chrome extends Browser{
    @Override
    void openWebsite(){
        System.out.println("It is chrome browser");
    }
}
class Firefox extends Browser{
    @Override
    void openWebsite(){
        System.out.println("It is firefox browser");
    }
}
public class Poly_ride_5 {
    public static void main(String[] args) {
        Browser cBrowser = new Chrome();
        Browser fBrowser = new Firefox();
        cBrowser.openWebsite();
        fBrowser.openWebsite();
    }
    
}
