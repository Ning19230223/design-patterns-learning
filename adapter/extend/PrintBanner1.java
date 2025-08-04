package adapter.extend;

import adapter.Banner;

public class PrintBanner1 extends Banner implements Print1{

    public PrintBanner1(String string) {
        super(string);
    }

    @Override
    public void printWeak() {
        showWithParen();
    }

    @Override
    public void printStrong() {
        showWithAster();
    }

}
