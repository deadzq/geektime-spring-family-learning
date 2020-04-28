package com.example.annotationdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 注解:Annotation
 * - 从JDK1.5引入
 * - 位于源码中(代码/注释/注解),使用其他工具进行处理的标签
 * - 注解用来修饰程序的元素,但不会对被修饰的对象有直接的影响
 * - 只有通过某种配套的工具才会对注解信息进行访问和处理
 * - 主要用途
 *  - 提供信息给编译器/IDE工具
 *  - 可用于其他工具来产生额外的代码/配置文件等
 *  - 有一些注解可在程序运行时访问,增加程序的动态性
 *
 * @Override 表示继承和覆写 自带注解
 * @Deprecated 表示废弃 自带注解
 * @SuppressWarnings 表示压制警告 自带注解
 * @SafeVarargs 不会对不定项参数做危险操作 自带注解
 * @FunctionInterface 声明功能性接口 自带注解
 *
 * JDK预定义的元注解(部分) 修饰注解的注解
 * @Target 设置目标范围 元注解 限定注解可以作用的位置
 * @Retention 设置保持性 元注解
 * @Documented 文档 元注解
 * @Inherited 注解继承 元注解
 * @Repeatable 此注解可以重复修饰 元注解
 *
 * 注解使用位置除了@Target限定位置
 * 其他允许的位置有
 * - 包
 * - 类
 * - 接口
 * - 方法
 * - 构造器
 * - 成员变量
 * - 局部变量/形参变量/类型参数
 *
 */
@SpringBootApplication
public class AnnotationDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(AnnotationDemoApplication.class, args);
    }

}