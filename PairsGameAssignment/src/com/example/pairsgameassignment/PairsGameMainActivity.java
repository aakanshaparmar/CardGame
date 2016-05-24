package com.example.pairsgameassignment;

import java.util.Random;
import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class PairsGameMainActivity extends Activity {
    
	private Random random;
	int oldClick=0, oldValue=0;
	String b=" ";
	String c="*";
    int noOfClicks=0;
    int a,no,x,y,i,count1=0,count2=0,count3=0,count4=0,count5=0,count6=0,count7=0,count8=0;
    int b1c=0, b2c=0, b3c=0, b4c=0, b5c=0, b6c=0, b7c=0, b8c=0; 
    int b9c=0, b10c=0, b11c=0, b12c=0, b13c=0, b14c=0, b15c=0, b16c=0, b17=0, b18=0;
	int b19=1;
     
    @Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_pairs_game_main);
		random = new Random();
		Button.OnClickListener listener =  new Button.OnClickListener() 
        {
	      public void onClick(View dummy)
          { 
	    	  
	    	  i=0;
	    	  no=dummy.getId();
	    	  final Button button1 = (Button) findViewById(no);
	    	  final Button button2 = (Button) findViewById(oldClick);
	    	  final TextView textView = (TextView) findViewById(R.id.textView2);
	    	  final TextView textView1 = (TextView) findViewById(R.id.textView1);
	    	  if(dummy.getId()==R.id.button17)
	    	  {
	    		  noOfClicks=0; y=0; x=0;
	    		  textView1.setText("Score:       ");
	    		  textView.setText(String.valueOf(noOfClicks)); 
	    		  Button button4 = (Button) findViewById(R.id.button1); button4.setText(c);
	    		  button4 = (Button) findViewById(R.id.button2); button4.setText(c);
	    		  button4 = (Button) findViewById(R.id.button3); button4.setText(c);
	    		  button4 = (Button) findViewById(R.id.button4); button4.setText(c);
	    		  button4 = (Button) findViewById(R.id.button5); button4.setText(c);
	    		  button4 = (Button) findViewById(R.id.button6); button4.setText(c);
	    		  button4 = (Button) findViewById(R.id.button7); button4.setText(c);
	    		  button4 = (Button) findViewById(R.id.button8); button4.setText(c);
	    		  button4 = (Button) findViewById(R.id.button9); button4.setText(c);
	    		  button4 = (Button) findViewById(R.id.button10); button4.setText(c);
	    		  button4 = (Button) findViewById(R.id.button11); button4.setText(c);
	    		  button4 = (Button) findViewById(R.id.button12); button4.setText(c);
	    		  button4 = (Button) findViewById(R.id.button13); button4.setText(c);
	    		  button4 = (Button) findViewById(R.id.button14); button4.setText(c);
	    		  button4 = (Button) findViewById(R.id.button15); button4.setText(c);
	    		  button4 = (Button) findViewById(R.id.button16); button4.setText(c);
	    		  
	    	  }
	    	  
	    	  else 
	    	  {
	    	  if(dummy.getId()== R.id.button1){ if (b1c==0)	i=0; else {i++;a=b1c;}}
	    	  else if(dummy.getId()== R.id.button2){ if (b2c==0) i=0; else { i++; a=b2c;}}
	    	  else if(dummy.getId()== R.id.button3){ if (b3c==0) i=0; else { i++; a=b3c;}}
	    	  else if(dummy.getId()== R.id.button4){ if (b4c==0) i=0; else { i++; a=b4c;}}
	    	  else if(dummy.getId()== R.id.button5){ if (b5c==0) i=0; else { i++; a=b5c;}} 
	    	  else if(dummy.getId()== R.id.button6){ if (b6c==0) i=0; else { i++; a=b6c;}}
	    	  else if(dummy.getId()== R.id.button7){ if (b7c==0) i=0; else { i++; a=b7c;}}
	    	  else if(dummy.getId()== R.id.button8){ if (b8c==0) i=0; else { i++; a=b8c;}}
	    	  else if(dummy.getId()== R.id.button9){ if (b9c==0) i=0; else { i++; a=b9c;}}
	    	  else if(dummy.getId()== R.id.button10){ if (b10c==0) i=0; else{ i++; a=b10c;}}
	    	  else if(dummy.getId()== R.id.button11){ if (b11c==0) i=0; else{ i++;a=b11c;}}
	    	  else if(dummy.getId()== R.id.button12){ if (b12c==0) i=0; else { i++;a=b12c;}}
	    	  else if(dummy.getId()== R.id.button13){ if (b13c==0) i=0; else { i++;a=b13c;}}
	    	  else if(dummy.getId()== R.id.button14){ if (b14c==0) i=0; else { i++;a=b14c;}}
	    	  else if(dummy.getId()== R.id.button15){ if (b15c==0) i=0; else { i++;a=b15c;}}
	    	  else if(dummy.getId()== R.id.button16){ if (b16c==0) i=0; else { i++;a=b16c;}}
	    	  
	    	  if(i!=0)
	    		button1.setText(String.valueOf(a));
	    	 
	    	 while(i==0)
	    		  {
	    			  a=random.nextInt(9);
	    			  if(a==1)
                      { if (count1==2) { i=0;} else { count1++; button1.setText(String.valueOf(a)); i++; } }
	    			  else if(a==2) 
	    			  { if (count2==2) { i=0;} else { count2++; button1.setText(String.valueOf(a)); i++;} }
	    			  else if(a==3) 
	    			  { if (count3==2) { i=0;} else { count3++; button1.setText(String.valueOf(a)); i++; } }
	    			  else if(a==4) 
	    			  { if (count4==2) { i=0;} else { count4++; button1.setText(String.valueOf(a));  i++;} }
	    			  else if(a==5) 
	    			  { if (count5==2) { i=0;} else { count5++; button1.setText(String.valueOf(a)); i++;} }
	    			  else if(a==6) 
	    			  { if (count6==2) { i=0;} else { count6++; button1.setText(String.valueOf(a)); i++; } }
	    			  else if(a==7) 
	    			  { if (count7==2) { i=0; } else { count7++; button1.setText(String.valueOf(a)); i++;} }
	    			  else if(a==8)
	    			  { if (count8==2) { i=0;} else { count8++; button1.setText(String.valueOf(a)); i++;} }
	    		 }
	    	 
	    	  if(dummy.getId()== R.id.button1 && b1c==0)	b1c=a;
	    	  else if(dummy.getId()== R.id.button2 && b2c==0)	b2c=a;
	    	  else if(dummy.getId()== R.id.button3 && b3c==0)	b3c=a;
	    	  else if(dummy.getId()== R.id.button4 && b4c==0)	b4c=a;
	    	  else if(dummy.getId()== R.id.button5 && b5c==0)	b5c=a; 
	    	  else if(dummy.getId()== R.id.button6 && b6c==0)	b6c=a;
	    	  else if(dummy.getId()== R.id.button7 && b7c==0)	b7c=a;
	    	  else if(dummy.getId()== R.id.button8 && b8c==0)	b8c=a;
	    	  else if(dummy.getId()== R.id.button9 && b9c==0)	b9c=a;
	    	  else if(dummy.getId()== R.id.button10 && b10c==0)	b10c=a;
	    	  else if(dummy.getId()== R.id.button11 && b11c==0)	b11c=a;
	    	  else if(dummy.getId()== R.id.button12 && b12c==0)	b12c=a;
	    	  else if(dummy.getId()== R.id.button13 && b13c==0)	b13c=a;
	    	  else if(dummy.getId()== R.id.button14 && b14c==0)	b14c=a;
	    	  else if(dummy.getId()== R.id.button15 && b15c==0)	b15c=a;	    	 
	    	  else if(dummy.getId()== R.id.button16 && b16c==0)	b16c=a;
	    	 
	    	 
	    	if(noOfClicks>0 && (no!=oldClick))
	    	{
	    	 if(oldValue==a)
	    	 { button1.setText(b); button2.setText(b); x=-1;y++;}
	    	 else if(oldValue!=-1) 
	    	 { button2.setText(c);}
	    	 else x=0;
	    	}
	    	noOfClicks++;
	        if(y<8) { textView.setText(String.valueOf(noOfClicks));}
	        else if (y==8) {textView.setText(String.valueOf(noOfClicks)); textView1.setText("Total Score: ");} 
	    	oldClick = dummy.getId(); 
	    	if(x==0) oldValue=a; else oldValue=-1;
	    	  } }   
	    };	    
	    Button button3= (Button) findViewById (R.id.button1); 
	    button3.setOnClickListener(listener);
	    button3 = (Button) findViewById (R.id.button2); 
	    button3.setOnClickListener(listener);
	    button3 = (Button) findViewById (R.id.button3); 
	    button3.setOnClickListener(listener);
	    button3 = (Button) findViewById( R.id.button4);
	    button3.setOnClickListener(listener);
	    button3 = (Button) findViewById (R.id.button5); 
	    button3.setOnClickListener(listener);
	    button3 = (Button) findViewById (R.id.button6); 
	    button3.setOnClickListener(listener);
	    button3 = (Button) findViewById (R.id.button7); 
	    button3.setOnClickListener(listener);
	    button3 = (Button) findViewById (R.id.button8); 
	    button3.setOnClickListener(listener);
	    button3 = (Button) findViewById (R.id.button9); 
	    button3.setOnClickListener(listener);
	    button3 = (Button) findViewById (R.id.button10);
	    button3.setOnClickListener(listener);
	    button3 = (Button) findViewById (R.id.button11);
	    button3.setOnClickListener(listener);
	    button3 = (Button) findViewById (R.id.button12);
	    button3.setOnClickListener(listener);
	    button3 = (Button) findViewById (R.id.button13);
	    button3.setOnClickListener(listener);
	    button3 = (Button) findViewById (R.id.button14);
	    button3.setOnClickListener(listener);
	    button3 = (Button) findViewById (R.id.button15);
	    button3.setOnClickListener(listener);
	    button3 = (Button) findViewById (R.id.button16);
	    button3.setOnClickListener(listener);
	    button3 = (Button) findViewById (R.id.button17);
	    button3.setOnClickListener(listener);
	 } 
        
    @Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.pairs_game_main, menu);
		return true;
	}
  }
