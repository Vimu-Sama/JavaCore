// Generics work better as Containers


class Banner<T> {

    T bannerAttribute ;

    public T getBannerAttribute(){
        return bannerAttribute ;
    }

    public void setBannerAttribute(T t){
        bannerAttribute = t ;
    }
}

public class SingleParamterType {
    public static void main(String[] args) {    
        Banner<Integer> banner = new Banner<>() ;
        banner.setBannerAttribute(10);
    }
}
