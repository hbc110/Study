package com.memoryAreaOverflow;

/**
 * 虚拟机栈和本地方法栈溢出,内存溢出
 * VM Args: -Xss2M
 * 高风险,系统假死，谨慎运行
 */
public class JavaVMStackOOM {
    private void dontStop(){
        while (true){
        }
    }

    public void stackLeakByThread(){
        while (true){
            Thread thread = new Thread(new Runnable() {
                @Override
                public void run() {
                    dontStop();
                }
            });
            thread.start();
        }
    }

    public static void main(String[] args) throws Throwable{
        JavaVMStackOOM oom = new JavaVMStackOOM();
        oom.stackLeakByThread();

    }

}
