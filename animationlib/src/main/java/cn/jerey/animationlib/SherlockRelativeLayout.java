package cn.jerey.animationlib;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.RelativeLayout;

/**
 * Created by Xiamin on 2017/6/28.
 */

public class SherlockRelativeLayout extends RelativeLayout implements ISherlockViewGroup{
    public SherlockRelativeLayout(Context context) {
        super(context);
    }

    public SherlockRelativeLayout(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public SherlockRelativeLayout(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }
}
