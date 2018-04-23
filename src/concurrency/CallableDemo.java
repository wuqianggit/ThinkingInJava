package concurrency;

import java.util.ArrayList;
import java.util.concurrent.*;

/**
 *
 * concurrency
 * 从任务中产生返回值
 *
 * 2018/4/23-21:37
 * 2018
 * Created by wuqiang on 2018/4/23.
 */

class TaskWithResult implements Callable<String>{
    /**
     * 返回一个值
     * @return
     * @throws Exception
     */
    private int id;

    public TaskWithResult(int id) {
        this.id = id;
    }

    @Override
    public String call() throws Exception {
        return "id"+id;
    }

}

public class CallableDemo {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executorService = Executors.newCachedThreadPool();/*获取一个线程池*/

        ArrayList<Future<String>> results=new ArrayList<Future<String>>();

        for(int i=0;i<5;i++){
            Future<String> future = executorService.submit(new TaskWithResult(i));
            results.add(future);
        }

        for(Future<String> fs:results){
            System.out.println(fs.get());
        }
    }
}
