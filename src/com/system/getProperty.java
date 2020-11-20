package com.system;

import java.util.Arrays;

public class getProperty {
    public static void main(String[] args) {
        // java运行时环境
        String java_version = System.getProperty("java.version");
        System.out.println("java_version = " + java_version);

        // java运行时环境供应商
        String java_vendor = System.getProperty("java.vendor");
        System.out.println("java_vendor = " + java_vendor);

        // java供应商的URL
        String java_vendor_url = System.getProperty("java.vendor.url");
        System.out.println("java_vendor_url = " + java_vendor_url);

        // java安装目录
        String java_home = System.getProperty("java.home");
        System.out.println("java_home = " + java_home);

        // java虚拟机规范版本
        String  java_vm_specification_version = System.getProperty("java.vm.specification.version");
        System.out.println("java_vm_specification_version = " + java_vm_specification_version);

        // java虚拟机规范供应商
        String java_vm_specification_vendor = System.getProperty("java.vm.specification.vendor");
        System.out.println("java_vm_specification_vendor = " + java_vm_specification_vendor);

        // java虚拟机规范名称
        String java_vm_specification_name = System.getProperty("java.vm.specification.name");
        System.out.println("java_vm_specification_name = " + java_vm_specification_name);

        // java虚拟机实现版本
        String java_vm_version = System.getProperty("java.vm.version");
        System.out.println("java_vm_version = " + java_vm_version);
        // java虚拟机实现供应商
        String java_vm_vendor = System.getProperty("java.vm.vendor");
        System.out.println("java_vm_vendor = " + java_vm_vendor);

        // java虚拟机实现名称
        String java_vm_name = System.getProperty("java.vm.name");
        System.out.println("java_vm_name = " + java_vm_name);

        // java运行时环境规范版本
        String java_specification_version = System.getProperty("java.specification.version");
        System.out.println("java_specification_version = " + java_specification_version);

        // java运行时环境规范供应商
        String java_specification_vendor = System.getProperty("java.specification.vendor");
        System.out.println("java_specification_vendor = " + java_specification_vendor);

        // java运行时环境规范名称
        String java_specification_name = System.getProperty("java.specification.name");
        System.out.println("java_specification_name = " + java_specification_name);

        // java类格式版本号
        String java_class_version = System.getProperty("java.class.version");
        System.out.println("java_class_version = " + java_class_version);

        // java类路径
        String java_class_path = System.getProperty("java.class.path");
        System.out.println("java_class_path = " + java_class_path);

        // 加载库时搜索的路径列表
        String java_library_path = System.getProperty("java.library.path");
        System.out.println("java_library_path = " + java_library_path);

        // 默认的临时文件路径
        String java_io_tmpdir = System.getProperty("java.io.tmpdir");
        System.out.println("java_io_tmpdir = " + java_io_tmpdir);

        // 要使用的JIT编译器的名称
        String java_compiler = System.getProperty("java.compiler");
        System.out.println("java_compiler = " + java_compiler);

        // 一个或多个扩展目录的路径
        String java_ext_dirs = System.getProperty("java.ext.dirs");
        System.out.println("java_ext_dirs = " + java_ext_dirs);

        // 操作系统的名称
        String os_name = System.getProperty("os.name");
        System.out.println("os_name = " + os_name);

        // 操作系统的架构
        String os_arch = System.getProperty("os.arch");
        System.out.println("os_arch = " + os_arch);

        // 操作系统的版本
        String os_version = System.getProperty("os.version");
        System.out.println("os_version = " + os_version);

        // 文件分隔符(在UNIX系统中是"/")
        String file_separator = System.getProperty("file.separator");
        System.out.println("file_separator = " + file_separator);

        // 路径分隔符(在UNIX系统中是":")
        String path_separator = System.getProperty("path.separator");
        System.out.println("path_separator = " + path_separator);

        // 行分隔符(在UNIX系统中是"/n")
        String line_separator = System.getProperty("line.separator");
        System.out.println("line_separator = " + line_separator);
        // 用户的账户名称
        String user_name = System.getProperty("user.name");
        System.out.println("user_name = " + user_name);

        // 用户的主目录
        String user_home = System.getProperty("user.home");
        System.out.println("user_home = " + user_home);

        // 用户的当前工作目录
        String user_dir = System.getProperty("user.dir");
        System.out.println("user_dir = " + user_dir);
    }
}
