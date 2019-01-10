package cn.mini523.aigou.query;

public class AjaxResult {
    private boolean success=true;
    private String message="登录成功";

    private Object object;

    public boolean isSuccess() {
        return success;
    }

    public AjaxResult setSuccess(boolean success) {
        this.success = success;
        return this;
    }

    public String getMessage() {
        return message;
    }

    public AjaxResult setMessage(String message) {
        this.message = message;
        return this;
    }

    public static AjaxResult me(){
        return new AjaxResult();
    }

    public Object getObject() {
        return object;
    }

    public void setObject(Object object) {
        this.object = object;
    }
}
