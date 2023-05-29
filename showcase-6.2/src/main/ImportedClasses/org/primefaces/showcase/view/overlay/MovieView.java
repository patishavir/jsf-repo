/*    */ package WEB-INF.classes.org.primefaces.showcase.view.overlay;
/*    */ 
/*    */ import java.util.ArrayList;
/*    */ import java.util.List;
/*    */ import javax.annotation.PostConstruct;
/*    */ import javax.faces.bean.ManagedBean;
/*    */ import org.primefaces.showcase.domain.Movie;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ @ManagedBean
/*    */ public class MovieView
/*    */ {
/*    */   private List<Movie> movieList;
/*    */   
/*    */   public List<Movie> getMovieList() {
/* 31 */     return this.movieList;
/*    */   }
/*    */   
/*    */   @PostConstruct
/*    */   public void init() {
/* 36 */     this.movieList = new ArrayList<Movie>();
/*    */     
/* 38 */     this.movieList.add(new Movie("The Lord of the Rings: The Two Towers", "Peter Jackson", "Fantasy, Epic", 179));
/* 39 */     this.movieList.add(new Movie("The Amazing Spider-Man 2", "Marc Webb", "Action", 142));
/* 40 */     this.movieList.add(new Movie("Iron Man 3", "Shane Black", "Action", 109));
/* 41 */     this.movieList.add(new Movie("Thor: The Dark World", "Alan Taylor", "Action, Fantasy", 112));
/* 42 */     this.movieList.add(new Movie("Avatar", "James Cameron", "Science Fiction", 160));
/* 43 */     this.movieList.add(new Movie("The Lord of the Rings: The Fellowship of the Ring", "Peter Jackson", "Fantasy, Epic", 165));
/* 44 */     this.movieList.add(new Movie("Divergent", "Neil Burger", "Action", 140));
/* 45 */     this.movieList.add(new Movie("The Hobbit: The Desolation of Smaug", "Peter Jackson", "Fantasy", 161));
/* 46 */     this.movieList.add(new Movie("Rio 2", "Carlos Saldanha", "Comedy", 101));
/* 47 */     this.movieList.add(new Movie("Captain America: The Winter Soldier", "Joe Russo", "Action", 136));
/* 48 */     this.movieList.add(new Movie("Fast Five", "Justin Lin", "Action", 132));
/* 49 */     this.movieList.add(new Movie("The Lord of the Rings: The Return of the King", "Peter Jackson", "Fantasy, Epic", 200));
/*    */   }
/*    */ }


/* Location:              D:\oj\j\primefaces\showcase-6.2.war!\WEB-INF\classes\org\primefaces\showcase\view\overlay\MovieView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */