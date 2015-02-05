package com.jordanweaver.j_weaver_lab1;

import android.util.Log;

/**
 * Created by jordanweaver on 2/2/15.
 */
public class Calculate {
    int mN1;
    int mN2;
    int mAnswer;



     Calculate(int formula, int firstNum, int secondNum) {
        //operation = number;
        mN1 = firstNum;
        mN2 = secondNum;

        switch (formula) {
            case 0:
                mAnswer = mN1/mN2;

                break;
            case 1:
                mAnswer = mN1*mN2;

                break;
            case 2:
                mAnswer = mN1-mN2;

                break;
            case 3:
                mN1 += mN2;

                mAnswer = mN1;

                break;

        }
    }

    public int getmAnswer() {
        return mAnswer;
    }
}
