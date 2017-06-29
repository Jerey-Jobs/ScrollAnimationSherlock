package cn.jerey.animationlib;

/**
 * @Explain：执行动画回调，在MyFramelayout中实现；
 */

public interface SherlockAnitationCallBack {
    /**
     * 执行自定义动画方法；
     */
    void excuteAnitation(float moveRadio);

    /**
     * 恢复初始状态；
     */
    void resetViewAnitation();
}
