package Assignment7ADF2.Controller;

import javafx.scene.text.Text;

public class ctrlCountDown{
    public Text txtNumber;
    public Thread thread;
    public void exit(){
        System.exit(0);
    }
    public void start(){
        thread = new ThreadCount();
        thread.start();
    }

    public void pause(){
        thread.stop();
    }

    public class ThreadCount extends Thread{
        public void run(){
            try {
                for(int i = Integer.parseInt(txtNumber.getText());true;i++){
                    txtNumber.setText(String.valueOf(i));
                    Thread.sleep(1000);
                }
            }catch (InterruptedException ex){}
        }
    }
}
