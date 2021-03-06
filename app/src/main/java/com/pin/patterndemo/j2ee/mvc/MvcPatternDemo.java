package com.pin.patterndemo.j2ee.mvc;

/**
 * MVC 模式代表 Model-View-Controller（模型-视图-控制器） 模式。这种模式用于应用程序的分层开发。
 * <p>
 * Model（模型） - 模型代表一个存取数据的对象或 JAVA POJO。它也可以带有逻辑，在数据变化时更新控制器。
 * <p>
 * View（视图） - 视图代表模型包含的数据的可视化。
 * <p>
 * Controller（控制器） - 控制器作用于模型和视图上。它控制数据流向模型对象，并在数据变化时更新视图。它使视图与模型分离开。
 * <p>
 * PS:Android开发中很常见的包括更进一步的MVP或者MVVM，其最终的目的都是为了解耦，将逻辑处理从页面中解放出来
 */

public class MvcPatternDemo {
    public static void main(String[] args) {

        //从数据库获取学生记录
        Student model = retriveStudentFromDatabase();

        //创建一个视图：把学生详细信息输出到控制台
        StudentView view = new StudentView();

        StudentController controller = new StudentController(model, view);

        controller.updateView();

        //更新模型数据
        controller.setStudentName("John");

        controller.updateView();
    }

    private static Student retriveStudentFromDatabase() {
        Student student = new Student();
        student.setName("Robert");
        student.setRollNo("10");
        return student;
    }
}
