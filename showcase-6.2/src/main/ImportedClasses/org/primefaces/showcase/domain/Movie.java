/*    */ package WEB-INF.classes.org.primefaces.showcase.domain;
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
/*    */ public class Movie
/*    */ {
/*    */   private String movie;
/*    */   private String directedBy;
/*    */   private String genres;
/*    */   private int runTime;
/*    */   
/*    */   public Movie() {}
/*    */   
/*    */   public Movie(String movie, String directedBy, String genres, int runTime) {
/* 28 */     this.movie = movie;
/* 29 */     this.directedBy = directedBy;
/* 30 */     this.genres = genres;
/* 31 */     this.runTime = runTime;
/*    */   }
/*    */   
/*    */   public String getMovie() {
/* 35 */     return this.movie;
/*    */   }
/*    */   
/*    */   public void setMovie(String movie) {
/* 39 */     this.movie = movie;
/*    */   }
/*    */   
/*    */   public String getDirectedBy() {
/* 43 */     return this.directedBy;
/*    */   }
/*    */   
/*    */   public void setDirectedBy(String directedBy) {
/* 47 */     this.directedBy = directedBy;
/*    */   }
/*    */   
/*    */   public String getGenres() {
/* 51 */     return this.genres;
/*    */   }
/*    */   
/*    */   public void setGenres(String genres) {
/* 55 */     this.genres = genres;
/*    */   }
/*    */   
/*    */   public int getRunTime() {
/* 59 */     return this.runTime;
/*    */   }
/*    */   
/*    */   public void setRunTime(int runTime) {
/* 63 */     this.runTime = runTime;
/*    */   }
/*    */ }


/* Location:              D:\oj\j\primefaces\showcase-6.2.war!\WEB-INF\classes\org\primefaces\showcase\domain\Movie.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */