package designpattern.jun.com.designpattern.SingleTon;

import android.util.Log;

/**
 * @Description 枚举单例模式
 * @Creator TigerChain（创建者）
 */

public enum  EnumSingleTon {


    INSTACE; // 定义一个枚举原素，代表 EnumSingleTon 一个实例

    public static final String TAG = "枚举类单例" ;

    /**
     * 枚举中的构造方法只能写成 private 或是不写「不写默认就是 private」，所以枚举防止外部来实例化对象
     */
    EnumSingleTon(){
        Log.e(TAG ,"实例化一次");
    }

    /**
     * 一些额外的方法
     */
    public void doSometing(){
        Log.e(TAG + "地址 ",INSTACE.hashCode()+"") ;
    }

}
