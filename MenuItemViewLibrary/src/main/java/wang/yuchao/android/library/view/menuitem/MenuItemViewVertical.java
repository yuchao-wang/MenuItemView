package wang.yuchao.android.library.view.menuitem;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

/**
 * 子布局是Vertical
 * Created by wangyuchao on 16/3/15.
 */
public class MenuItemViewVertical extends LinearLayout {

    private View rootView;

    private LinearLayout ll_container;
    private ImageView iv_icon;
    private TextView tv_name;

    public MenuItemViewVertical(Context context) {
        this(context, null);
    }

    public MenuItemViewVertical(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public MenuItemViewVertical(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        rootView = LayoutInflater.from(context).inflate(R.layout.menu_item_view_vertical, this, true);

        ll_container = (LinearLayout) rootView.findViewById(R.id.ll_container);
        iv_icon = (ImageView) rootView.findViewById(R.id.iv_icon);
        tv_name = (TextView) rootView.findViewById(R.id.tv_name);

        TypedArray array = context.obtainStyledAttributes(attrs, R.styleable.MenuItemViewVertical);
        if (array.hasValue(R.styleable.MenuItemViewVertical_icon_res)) {
            setMenuItemIcon(array.getResourceId(R.styleable.MenuItemViewVertical_icon_res, 0));
        }
        if (array.hasValue(R.styleable.MenuItemViewVertical_icon_background)) {
            setMenuItemBackground(array.getResourceId(R.styleable.MenuItemViewVertical_icon_background, R.color.green));
        }

        if (array.hasValue(R.styleable.MenuItemViewVertical_text)) {
            setMenuItemText(array.getString(R.styleable.MenuItemViewVertical_text));
        }

        array.recycle();
    }

    public void setMenuItemIcon(int menuItemIcon) {
        iv_icon.setImageResource(menuItemIcon);
    }

    public void setMenuItemBackground(int menuItemBackground) {
        iv_icon.setBackgroundResource(menuItemBackground);
    }

    public void setMenuItemText(String menuItemContent) {
        tv_name.setText(menuItemContent);
    }

    //=================暴露给外面自定义使用=================/

    public LinearLayout getContainerView() {
        return ll_container;
    }

    public ImageView getIconView() {
        return iv_icon;
    }

    public TextView getTitleView() {
        return tv_name;
    }
}
