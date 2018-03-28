import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.FutureTask;

public class ThreadDemos {
	
	private static int POOL_NUM = 10;     //线程池数量
	
	public static void main(String[] args){
		
        ThreadDemo01 threadDemo01 = new ThreadDemo01();
        threadDemo01.setName("我是自定义的线程1");
        threadDemo01.start();       
        System.out.println(Thread.currentThread().toString()); 
        
        System.out.println(Thread.currentThread().getName());
        Thread t1 = new Thread(new MyThread());
        t1.start();
        
        Callable<Object> oneCallable = new Tickets<Object>();
        FutureTask<Object> oneTask = new FutureTask<Object>(oneCallable);
        	Thread t = new Thread(oneTask);
        	System.out.println(Thread.currentThread().getName());
        	t.start();
        	
        	
        	ExecutorService executorService = Executors.newFixedThreadPool(5);  
        for(int i = 0; i<POOL_NUM; i++)  
        {  
        		RunnableThread thread = new RunnableThread();
            //Thread.sleep(1000);
            executorService.execute(thread);  
        }
        //关闭线程池
        executorService.shutdown();
    }
}

class ThreadDemo01 extends Thread {
    public ThreadDemo01(){
        //编写子类的构造方法，可缺省
    }
    public void run(){
        //编写自己的线程代码
        System.out.println(Thread.currentThread().getName());
    }
}

class MyThread implements Runnable{
    @Override
    public void run() {
        // TODO Auto-generated method stub
        System.out.println(Thread.currentThread().getName()+"-->我是通过实现接口的线程实现方式！");
    }   
}

class Tickets<Object> implements Callable<Object>{

    //重写call方法
    @Override
    public Object call() throws Exception {
        // TODO Auto-generated method stub
        System.out.println(Thread.currentThread().getName()+"-->我是通过实现Callable接口通过FutureTask包装器来实现的线程");
        return null;
    }   
}

class RunnableThread implements Runnable  
{     
    @Override
    public void run()  
    {  
        System.out.println("通过线程池方式创建的线程：" + Thread.currentThread().getName() + " ");  

    }  
}  
