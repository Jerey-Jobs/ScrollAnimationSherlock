package cn.jerey.animationlib;

/**
 * @Explain：执行动画回调，在MyFramelayout中实现；
 * @Author:LYL
 * @Version:
 * @Time:2017/6/14
 */

public interface SherlockAnitationCallBack {
    /**
     * 执行自定义动画方法；
     */
    public void excuteAnitation(float moveRadio);

    /**
     * 恢复初始状态；
     */
    public void resetViewAnitation();
}
