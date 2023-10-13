
class grades {
    
    private int Midterms;
    private int Finals;
    private int Quizzes;
    
    
    public void Midterms(int midterms){
        this.Midterms = midterms;
    }
    
    public void Finals(int finals){
        this.Finals = finals;
    }
    public void Quizzes(int quizzes){
        this.Quizzes = quizzes;
    }
     
    
    public int getMidterms(){
        return this.Midterms;
    }
    public int getFinals(){
        return this.Finals;
    }
    public int getQuizzes(){
        return this.Quizzes;
    }
 
}
