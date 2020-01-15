package Day11.Demo2;

public class Proxy implements Worker{
    // 代理对象持有目标对象
    private  Worker realWorker;

    public Proxy(){
        realWorker=new RealWorker2();
    }
    @Override
    public void work() {
        System.out.println("招待工作，了解需求");
        realWorker.work();
        System.out.println("售后服务");
    }
}
