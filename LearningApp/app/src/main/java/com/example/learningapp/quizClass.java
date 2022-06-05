package com.example.learningapp;

public class quizClass {
        public int image;
        public char op1;
        public char op2;
        public char op3;
        public char ans;

    public char getAns() {
        return ans;
    }

    public void setAns(char ans) {
        this.ans = ans;
    }

    public quizClass(int image, char op1, char op2, char op3, char ans) {
            this.image = image;
            this.op1 = op1;
            this.op2 = op2;
            this.op3 = op3;
            this.ans = ans;
        }
    }
