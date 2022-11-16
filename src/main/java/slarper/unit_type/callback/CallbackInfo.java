package slarper.unit_type.callback;

import slarper.unit_type.Unit;

public class CallbackInfo<R> {

    String name;
    boolean cancellable;
    boolean canceled;
    R returnValue;

    public Unit setReturnValue(R value) {
        this.returnValue = value;
        this.cancel();
        return Unit.unit;
    }

    public R getReturnValue() {
        return this.returnValue;
    }

    public boolean isCancellable() {
        return cancellable;
    }

    public Unit cancel() {
        if (this.isCancellable()) {
            this.canceled = true;
        }

        return Unit.unit;
    }
}
