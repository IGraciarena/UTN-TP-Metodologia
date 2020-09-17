package NumberThree.Decorator;

import NumberThree.Interface.IPolicy;

public abstract class PolicyDecorator implements IPolicy {
    private IPolicy wrapper;

    public PolicyDecorator(IPolicy wrapper) {
        this.wrapper = wrapper;
    }

    public IPolicy getWrapper() {
        return wrapper;
    }
}
