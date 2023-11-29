class Question {
    public String question;
    public char answer;
    public String[] selection;

    public Question(String question, String[] selection, char answer){ //constructor
    	this.selection = new String[]{"","","",""};
    	setQuestion(question);
    	setSelection(selection);
    	setAnswer(answer);
    }

	public String getQuestion() {//give question
        return this.question;
    }

    public void setQuestion(String q) {//change question
        this.question = q;
    }

    public char getAnswer() {//get answer choice
        return this.answer;
    }

    public void setAnswer(char a) {//set answer choice
        this.answer = a;
    }

    public String[] getSelection() {//get selection
        return this.selection;
    }

    public void setSelection(String[] s) {//set selection
        for(int i = 0; i <s.length; i++){
            this.selection[i] = s[i];
        }
    }
    
    public String toText() { //basically toString method, used for printing out the strings stats
    	String ret = "";
    	ret += this.question;
    	for(String s : this.selection) {
    		ret += "\n" + s;
    	}
    	return ret;
    }
}

