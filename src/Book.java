public class Book {
    public String name;
    public int pageNumber;

    public Book( String name,int pageNumber){
        this.name=name;
        if(pageNumber<0){
            pageNumber=0;

        }
        this.pageNumber=pageNumber;

    }

    public int getPageNumber() {

        return pageNumber;
    }

    public void setName(String name) {

        this.name = name;
    }

}
