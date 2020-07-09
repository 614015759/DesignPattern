package com.atxzy.prototype.deepClone;

import com.atxzy.prototype.improve.Sheep;

import java.io.*;

public class DeepPrototype implements Serializable, Cloneable {

    public String name;//String类型
    public DeepCloneableTarget deepCloneableTarget;//引用类型

    public DeepPrototype() {
    }


    //完成深拷贝实现  - 方式一   使用clone方法


    @Override
    protected DeepPrototype clone() throws CloneNotSupportedException {
        Object deep = null;
        DeepPrototype deepPrototype = null;
        //这里完成对基本数据类型的clone
        deep = super.clone();
        //对引用类型的属性进行单独处理
        deepPrototype = (DeepPrototype) deep;
        deepPrototype.deepCloneableTarget = (DeepCloneableTarget) deepCloneableTarget.clone();
        return deepPrototype;
    }


    //深拷贝方式二  通过对象的序列化实现深拷贝（推荐使用）
    public DeepPrototype deepClone() {
        //创建流对象
        ByteArrayOutputStream bos = null;
        ObjectOutputStream oos = null;
        ByteArrayInputStream bis = null;
        ObjectInputStream ois = null;
        DeepPrototype deepPrototype = null;
        try {
            bos = new ByteArrayOutputStream();
            oos = new ObjectOutputStream(bos);
            oos.writeObject(this);//把当前这个对象以对象流的方式输出（序列化）
            //反序列化
            bis = new ByteArrayInputStream(bos.toByteArray());
            ois = new ObjectInputStream(bis);
            deepPrototype = (DeepPrototype) ois.readObject();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        } finally {
            //关闭流
            try {
                bos.close();
                oos.close();
                bis.close();
                ois.close();
            } catch (IOException e) {
                e.printStackTrace();
            }

        }
        //序列化
        return deepPrototype;
    }


    @Override
    public String toString() {
        return "DeepPrototype{" +
                "name='" + name + '\'' +
                ", deepCloneableTarget=" + deepCloneableTarget +
                '}';
    }
}
