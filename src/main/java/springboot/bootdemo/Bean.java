package springboot.bootdemo;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Null;

public class Bean {
    public interface Update{}
    public interface Add{}
    @NotNull(message ="id不能为空啊亲", groups = {Update.class})
    @Null(message ="id必须为空啊亲",groups = {Add.class})
    Long id;

    String name;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
