package com.example.harish.towersofhanoi;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Stack;

public class MainActivity extends AppCompatActivity {

    Stack  <Integer> s1=new Stack<Integer>();
    Stack  <Integer> s2=new Stack<Integer>();
    Stack  <Integer> s3=new Stack<Integer>();

    public static Button T12,T13,T21,T23,T32,T31,L1,L2,L3;
    public static ImageView im1_1,im1_2,im1_3,im1_4,im1_5,im2_1,im2_2,im2_3,im2_4,im2_5,im3_1,im3_2,im3_3,im3_4,im3_5;
    public static TextView texres;
    public static int ImViewDefLen=200,ImViewDefBre,level;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        T12=(Button)findViewById(R.id.b1to2);
        T13=(Button)findViewById(R.id.b1to3);
        T21=(Button)findViewById(R.id.b2to1);
        T23=(Button)findViewById(R.id.b2to3);
        T31=(Button)findViewById(R.id.b3to1);
        T32=(Button)findViewById(R.id.b3to2);
        L1=(Button)findViewById(R.id.L1);
        L2=(Button)findViewById(R.id.L2);
        L3=(Button)findViewById(R.id.L3);
        im1_1=(ImageView)findViewById(R.id.im1_1);
        im1_2=(ImageView)findViewById(R.id.im1_2);
        im1_3=(ImageView)findViewById(R.id.im1_3);
        im1_4=(ImageView)findViewById(R.id.im1_4);
        im1_5=(ImageView)findViewById(R.id.im1_5);
        im2_1=(ImageView)findViewById(R.id.im2_1);
        im2_2=(ImageView)findViewById(R.id.im2_2);
        im2_3=(ImageView)findViewById(R.id.im2_3);
        im2_4=(ImageView)findViewById(R.id.im2_4);
        im2_5=(ImageView)findViewById(R.id.im2_5);
        im3_1=(ImageView)findViewById(R.id.im3_1);
        im3_2=(ImageView)findViewById(R.id.im3_2);
        im3_3=(ImageView)findViewById(R.id.im3_3);
        im3_4=(ImageView)findViewById(R.id.im3_4);
        im3_5=(ImageView)findViewById(R.id.im3_5);
        texres=(TextView) findViewById(R.id.textresult);
        setContentView(R.layout.activity_main);
    }
    ImageView findimview(int size,int tower){
        im1_1=(ImageView)findViewById(R.id.im1_1);
        im1_2=(ImageView)findViewById(R.id.im1_2);
        im1_3=(ImageView)findViewById(R.id.im1_3);
        im1_4=(ImageView)findViewById(R.id.im1_4);
        im1_5=(ImageView)findViewById(R.id.im1_5);
        im2_1=(ImageView)findViewById(R.id.im2_1);
        im2_2=(ImageView)findViewById(R.id.im2_2);
        im2_3=(ImageView)findViewById(R.id.im2_3);
        im2_4=(ImageView)findViewById(R.id.im2_4);
        im2_5=(ImageView)findViewById(R.id.im2_5);
        im3_1=(ImageView)findViewById(R.id.im3_1);
        im3_2=(ImageView)findViewById(R.id.im3_2);
        im3_3=(ImageView)findViewById(R.id.im3_3);
        im3_4=(ImageView)findViewById(R.id.im3_4);
        im3_5=(ImageView)findViewById(R.id.im3_5);
        if(tower==1){
           switch (size){
               case 0:
                   return im1_1;
               case 1:
                   return im1_2;
               case 2:
                   return im1_3;
               case 3:
                   return im1_4;
               case 4:
                   return im1_5;

           }
        }
        if(tower==2){
            switch (size){
                case 0:
                    return im2_1;
                case 1:
                    return im2_2;
                case 2:
                    return im2_3;
                case 3:
                    return im2_4;
                case 4:
                    return im2_5;
            }
        }
        if(tower==3){
            switch (size){
                case 0:
                    return im3_1;
                case 1:
                    return im3_2;
                case 2:
                    return im3_3;
                case 3:
                    return im3_4;
                case 4:
                    return im3_5;
            }
        }
        return null;
    }
    public void imviewremover(int stackno,int stacksize){
        if(stackno==1){
            switch(stacksize){

                case 1:
                    im1_1.setImageDrawable(null);
                    break;
                case 2:
                    im1_2.setImageDrawable(null);
                    break;
                case 3:
                    im1_3.setImageDrawable(null);
                    break;

                case 4:
                    im1_4.setImageDrawable(null);
                    break;
                case 5:
                    im1_5.setImageDrawable(null);


            }
        }
        else if(stackno==2) {
            switch (stacksize) {

                case 1:
                    im2_1.setImageDrawable(null);
                    break;
                case 2:
                    im2_2.setImageDrawable(null);
                    break;
                case 3:
                    im2_3.setImageDrawable(null);
                    break;

                case 4:
                    im2_4.setImageDrawable(null);
                    break;
                case 5:
                    im2_5.setImageDrawable(null);

            }
        }
        else{
            switch (stacksize) {

                case 1:
                    im3_1.setImageDrawable(null);
                    break;
                case 2:
                    im3_2.setImageDrawable(null);
                    break;
                case 3:
                    im3_3.setImageDrawable(null);
                    break;

                case 4:
                    im3_4.setImageDrawable(null);
                    break;
                case 5:
                    im3_5.setImageDrawable(null);
                    break;
            }
        }
    }
    public void clearall(){
        im1_1=(ImageView)findViewById(R.id.im1_1);
        im1_2=(ImageView)findViewById(R.id.im1_2);
        im1_3=(ImageView)findViewById(R.id.im1_3);
        im1_4=(ImageView)findViewById(R.id.im1_4);
        im1_5=(ImageView)findViewById(R.id.im1_5);
        im2_1=(ImageView)findViewById(R.id.im2_1);
        im2_2=(ImageView)findViewById(R.id.im2_2);
        im2_3=(ImageView)findViewById(R.id.im2_3);
        im2_4=(ImageView)findViewById(R.id.im2_4);
        im2_5=(ImageView)findViewById(R.id.im2_5);
        im3_1=(ImageView)findViewById(R.id.im3_1);
        im3_2=(ImageView)findViewById(R.id.im3_2);
        im3_3=(ImageView)findViewById(R.id.im3_3);
        im3_4=(ImageView)findViewById(R.id.im3_4);
        im3_5=(ImageView)findViewById(R.id.im3_5);
        im1_1.setImageDrawable(null);
        im1_2.setImageDrawable(null);
        im1_3.setImageDrawable(null);
        im1_4.setImageDrawable(null);
        im1_5.setImageDrawable(null);
        im2_1.setImageDrawable(null);
        im2_2.setImageDrawable(null);
        im2_3.setImageDrawable(null);
        im2_4.setImageDrawable(null);
        im2_5.setImageDrawable(null);
        im3_1.setImageDrawable(null);
        im3_2.setImageDrawable(null);
        im3_3.setImageDrawable(null);
        im3_4.setImageDrawable(null);
        im3_5.setImageDrawable(null);
        s1.removeAllElements();
        s2.removeAllElements();
        s3.removeAllElements();

    }
    public void tower1Action(int a,int size,ImageView imP,int level){
        im1_1=(ImageView)findViewById(R.id.im1_1);
        im1_2=(ImageView)findViewById(R.id.im1_2);
        im1_3=(ImageView)findViewById(R.id.im1_3);
        im1_4=(ImageView)findViewById(R.id.im1_4);
        im1_5=(ImageView)findViewById(R.id.im1_5);
        im2_1=(ImageView)findViewById(R.id.im2_1);
        im2_2=(ImageView)findViewById(R.id.im2_2);
        im2_3=(ImageView)findViewById(R.id.im2_3);
        im2_4=(ImageView)findViewById(R.id.im2_4);
        im2_5=(ImageView)findViewById(R.id.im2_5);
        im3_1=(ImageView)findViewById(R.id.im3_1);
        im3_2=(ImageView)findViewById(R.id.im3_2);
        im3_3=(ImageView)findViewById(R.id.im3_3);
        im3_4=(ImageView)findViewById(R.id.im3_4);
        im3_5=(ImageView)findViewById(R.id.im3_5);
        if(size!=level+2){
            s1.push(a);
        }
        switch(a){
            case 1:
                imP.setImageResource(R.drawable.disk5);
                break;
            case 2:
                imP.setImageResource(R.drawable.disk4);
                break;
            case 3:

                imP.setImageResource(R.drawable.disk3);
                break;
            case 4:

                imP.setImageResource(R.drawable.disk2);
                break;
            case 5:
                imP.setImageResource(R.drawable.disk1);
                break;

        }
    }
    public void tower2Action(int a,int size,ImageView imP,int level){
        im1_1=(ImageView)findViewById(R.id.im1_1);
        im1_2=(ImageView)findViewById(R.id.im1_2);
        im1_3=(ImageView)findViewById(R.id.im1_3);
        im1_4=(ImageView)findViewById(R.id.im1_4);
        im1_5=(ImageView)findViewById(R.id.im1_5);
        im2_1=(ImageView)findViewById(R.id.im2_1);
        im2_2=(ImageView)findViewById(R.id.im2_2);
        im2_3=(ImageView)findViewById(R.id.im2_3);
        im2_4=(ImageView)findViewById(R.id.im2_4);
        im2_5=(ImageView)findViewById(R.id.im2_5);
        im3_1=(ImageView)findViewById(R.id.im3_1);
        im3_2=(ImageView)findViewById(R.id.im3_2);
        im3_3=(ImageView)findViewById(R.id.im3_3);
        im3_4=(ImageView)findViewById(R.id.im3_4);
        im3_5=(ImageView)findViewById(R.id.im3_5);
        if(size!=level+2){
            s2.push(a);
        }
        switch(a){
            case 1:
                imP.setImageResource(R.drawable.disk5);
                break;
            case 2:
                imP.setImageResource(R.drawable.disk4);
                break;
            case 3:

                imP.setImageResource(R.drawable.disk3);
                break;
            case 4:

                imP.setImageResource(R.drawable.disk2);
                break;
            case 5:
                imP.setImageResource(R.drawable.disk1);
                break;

        }

    }
    public void tower3Action(int a,int size,ImageView imP,int level) {
        im1_1=(ImageView)findViewById(R.id.im1_1);
        im1_2=(ImageView)findViewById(R.id.im1_2);
        im1_3=(ImageView)findViewById(R.id.im1_3);
        im1_4=(ImageView)findViewById(R.id.im1_4);
        im1_5=(ImageView)findViewById(R.id.im1_5);
        im2_1=(ImageView)findViewById(R.id.im2_1);
        im2_2=(ImageView)findViewById(R.id.im2_2);
        im2_3=(ImageView)findViewById(R.id.im2_3);
        im2_4=(ImageView)findViewById(R.id.im2_4);
        im2_5=(ImageView)findViewById(R.id.im2_5);
        im3_1=(ImageView)findViewById(R.id.im3_1);
        im3_2=(ImageView)findViewById(R.id.im3_2);
        im3_3=(ImageView)findViewById(R.id.im3_3);
        im3_4=(ImageView)findViewById(R.id.im3_4);
        im3_5=(ImageView)findViewById(R.id.im3_5);
        if (size != level + 2) {
            s3.push(a);
        }
        switch(a){
            case 1:
                imP.setImageResource(R.drawable.disk5);
                break;
            case 2:
                imP.setImageResource(R.drawable.disk4);
                break;
            case 3:

                imP.setImageResource(R.drawable.disk3);
                break;
            case 4:

                imP.setImageResource(R.drawable.disk2);
                break;
            case 5:
                imP.setImageResource(R.drawable.disk1);
                break;

        }
    }
    public void LevelOne(View v){
       level=1;
        im1_1=(ImageView)findViewById(R.id.im1_1);
        im1_2=(ImageView)findViewById(R.id.im1_2);
        im1_3=(ImageView)findViewById(R.id.im1_3);
        im1_4=(ImageView)findViewById(R.id.im1_4);
        im1_5=(ImageView)findViewById(R.id.im1_5);
        im2_1=(ImageView)findViewById(R.id.im2_1);
        im2_2=(ImageView)findViewById(R.id.im2_2);
        im2_3=(ImageView)findViewById(R.id.im2_3);
        im2_4=(ImageView)findViewById(R.id.im2_4);
        im2_5=(ImageView)findViewById(R.id.im2_5);
        im3_1=(ImageView)findViewById(R.id.im3_1);
        im3_2=(ImageView)findViewById(R.id.im3_2);
        im3_3=(ImageView)findViewById(R.id.im3_3);
        im3_4=(ImageView)findViewById(R.id.im3_4);
        im3_5=(ImageView)findViewById(R.id.im3_5);
        clearall();;
        texres=(TextView) findViewById(R.id.textresult);
        texres.setText("Level 1");
        if(s1==null)
          tower1Action(1,0,im1_1,1);
        else
            tower1Action(1,s1.size(),im1_1,1);
        tower1Action(2,s1.size(),im1_2,1);
        tower1Action(3,s1.size(),im1_3,1);
    }
    public void LevelTwo(View v){
        level=2;
        texres=(TextView) findViewById(R.id.textresult);
        im1_1=(ImageView)findViewById(R.id.im1_1);
        im1_2=(ImageView)findViewById(R.id.im1_2);
        im1_3=(ImageView)findViewById(R.id.im1_3);
        im1_4=(ImageView)findViewById(R.id.im1_4);
        im1_5=(ImageView)findViewById(R.id.im1_5);
        im2_1=(ImageView)findViewById(R.id.im2_1);
        im2_2=(ImageView)findViewById(R.id.im2_2);
        im2_3=(ImageView)findViewById(R.id.im2_3);
        im2_4=(ImageView)findViewById(R.id.im2_4);
        im2_5=(ImageView)findViewById(R.id.im2_5);
        im3_1=(ImageView)findViewById(R.id.im3_1);
        im3_2=(ImageView)findViewById(R.id.im3_2);
        im3_3=(ImageView)findViewById(R.id.im3_3);
        im3_4=(ImageView)findViewById(R.id.im3_4);
        im3_5=(ImageView)findViewById(R.id.im3_5);
        texres.setText("Level 2");
        clearall();
        if(s1==null)
            tower1Action(1,0,im1_1,2);
        else
            tower1Action(1,s1.size(),im1_1,2);
        tower1Action(2,s1.size(),im1_2,2);
        tower1Action(3,s1.size(),im1_3,2);
        tower1Action(4,s1.size(),im1_4,2);

    }
    public void LevelThree(View v){
        level=3;
        im1_1=(ImageView)findViewById(R.id.im1_1);
        im1_2=(ImageView)findViewById(R.id.im1_2);
        im1_3=(ImageView)findViewById(R.id.im1_3);
        im1_4=(ImageView)findViewById(R.id.im1_4);
        im1_5=(ImageView)findViewById(R.id.im1_5);
        im2_1=(ImageView)findViewById(R.id.im2_1);
        im2_2=(ImageView)findViewById(R.id.im2_2);
        im2_3=(ImageView)findViewById(R.id.im2_3);
        im2_4=(ImageView)findViewById(R.id.im2_4);
        im2_5=(ImageView)findViewById(R.id.im2_5);
        im3_1=(ImageView)findViewById(R.id.im3_1);
        im3_2=(ImageView)findViewById(R.id.im3_2);
        im3_3=(ImageView)findViewById(R.id.im3_3);
        im3_4=(ImageView)findViewById(R.id.im3_4);
        im3_5=(ImageView)findViewById(R.id.im3_5);
        texres=(TextView) findViewById(R.id.textresult);
        texres.setText("Level3");
        clearall();
        tower1Action(1,0,im1_1,3);
        tower1Action(2,s1.size(),im1_2,3);
        tower1Action(3,s1.size(),im1_3,3);
        tower1Action(4,s1.size(),im1_4,3);
        tower1Action(5,s1.size(),im1_5,3);
    }

    public void toweronetotwo(View v){
        texres=(TextView) findViewById(R.id.textresult);
        if(s1.size()==0)
            return;
        int a=s1.peek();
        if(s2.size()==0){
            tower2Action(a,s2.size(),findimview(s2.size(),2),level);
            imviewremover(1,s1.size());
            s1.pop();
            return;
        }
        if(a>s2.peek())
            if(s2.size()<level+2)
              tower2Action(a,s2.size(),findimview(s2.size(),2),level);
        if(a<s2.peek())
            return;
        imviewremover(1,s1.size());
        s1.pop();
    }
    public void toweronetothree(View v){
        texres=(TextView) findViewById(R.id.textresult);
        if(s1.size()==0)
            return;
        int a=s1.peek();
        if(s3.size()==0){
            tower3Action(a,s3.size(),findimview(s3.size(),3),level);
            imviewremover(1,s1.size());
            s1.pop();
            return;
        }
        if(a>s3.peek())
          if(s3.size()<level+2)
                 tower3Action(a,s3.size(),findimview(s3.size(),3),level);
        if(a<s3.peek())
            return;
        imviewremover(1,s1.size());
        s1.pop();
        if(s3.size()==level+2){
            texres.setText("YOU Win");
            s1.removeAllElements();
            s2.removeAllElements();
            s3.removeAllElements();
        }
    }
    public void towertwotoone(View v){
        texres=(TextView) findViewById(R.id.textresult);
        if(s2.size()==0)
            return;
        int a=s2.peek();
        if(s1.size()==0){
            tower1Action(a,s1.size(),findimview(s1.size(),1),level);
            imviewremover(2,s2.size());
            s2.pop();
            return;
        }
        if(a>s1.peek())
         if(s1.size()<level+2)
             tower1Action(a,s1.size(),findimview(s1.size(),1),level);
         if(a<s1.peek())
             return;;
        imviewremover(2,s2.size());
        s2.pop();
    }
    public void towertwotothree(View v){
        texres=(TextView) findViewById(R.id.textresult);
        if(s2.size()==0)
            return;
        int a=s2.peek();
        if(s3.size()==0){
            tower3Action(a,s3.size(),findimview(s3.size(),3),level);
            imviewremover(2,s2.size());
            s2.pop();
            return;

        }
        if(a>s3.peek())
         if(s3.size()<level+2)
             tower3Action(a,s3.size(),findimview(s3.size(),3),level);
        if(a<s3.peek())
            return;
        imviewremover(2,s2.size());
        s2.pop();
        if(s3.size()==level+2){
            texres.setText("YOU Win");
            s1.removeAllElements();
            s2.removeAllElements();
            s3.removeAllElements();
        }

    }
    public void towerthreetotwo(View v){
        if(s3.size()==0)
            return;
        int a=s3.peek();
        if(s2.size()==0){
            tower2Action(a,s2.size(),findimview(s2.size(),2),level);
            imviewremover(3,s3.size());
            s3.pop();
            return;
        }
        if(a>s2.peek())
         if(s2.size()<level+2)
            tower2Action(a,s2.size(),findimview(s2.size(),2),level);
        if(a<s2.peek())
            return;
        imviewremover(3,s3.size());
        s3.pop();
    }
    public void towerthreetoone(View v){

        if(s3.size()==0)
            return;
        int a=s3.peek();
        if(s1.size()==0){
            tower1Action(a,s1.size(),findimview(s1.size(),1),level);
            imviewremover(3,s3.size());
            s3.pop();
            return;
        }
        if(a>s1.peek())
         if(s1.size()<level+2)
             tower1Action(a,s1.size(),findimview(s1.size(),1),level);
         if(a<s1.peek())
             return;
        imviewremover(3,s3.size());
        s3.pop();
    }
}
