package config;

import com.jfinal.config.*;
import com.jfinal.template.Engine;

public class JfinalConfig extends JFinalConfig {
        public void configConstant(Constants me) {
            me.setDevMode(true);
        }

        public void configRoute(Routes me) {
            // jfinal 4.9.03 版新增了路由扫描功能，不必手动添加路由
            // me.add("/hello", HelloController.class);

            // 使用路由扫描，参数 "demo." 表示只扫描 demo 包及其子包下的路由
            me.scan("controller.");
        }

        public void configEngine(Engine me) {
            me.addSharedFunction("/app/12.vue");
        }
        public void configPlugin(Plugins me) {}
        public void configInterceptor(Interceptors me) {}
        public void configHandler(Handlers me) {}
}
