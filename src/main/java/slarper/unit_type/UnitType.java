package slarper.unit_type;

import slarper.unit_type.callback.CallbackInfo;

public class UnitType {
    public static void main(String[] args) {
        String s = "Hello world!";
        func(s);
        CallbackInfo<Unit> ci = new CallbackInfo<>();
        ci.cancel();
        CallbackInfo<Integer> ci2 = new CallbackInfo<>();
        ci2.setReturnValue(114514);
    }

    public static Unit func(String str) {
        System.out.println(str);
        return Unit.unit;
    }
}
