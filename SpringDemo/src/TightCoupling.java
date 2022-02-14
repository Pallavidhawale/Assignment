public class TightCoupling {
    public static void main(String[] args) {
        Author author = new Author();
        Book book = new Book();
        System.out.println(author);
        author.setBook(book); // tight coupling
        
       
     // all ther request land to Servlet container IP address and port number
     // every application contains web.xml, known as gateway of apllication
     //Dispatcher serverlet known as front controller
     //DispatcherServlet TO ALL THE LISTED CONTROLLER



    }
}
