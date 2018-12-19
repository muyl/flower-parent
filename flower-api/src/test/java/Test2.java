import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

public class Test2 {

    public static void main(String[] args) throws ScriptException {
        String reg = "(%s-800)*0.2";
        System.out.println(String.format(reg, "983"));

        ScriptEngine js =  new ScriptEngineManager().getEngineByName("JavaScript");
        System.out.println(js.eval("(983-800)*0.8*0.2"));
    }
}
