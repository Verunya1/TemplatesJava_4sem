package home.work.praka8.template_method;

public class RussianFlag extends AbstractThreeRowsFlag {

    @Override
    void drawUpperLevel() {
        Colors.paintWhiteColor();
    }

    @Override
    void drawMiddleLevel() {
        Colors.paintBlueColor();
    }

    @Override
    void drawBottomLevel() {
        Colors.paintRedColor();
    }
}
