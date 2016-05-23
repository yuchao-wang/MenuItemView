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
 * 子布局是Horizontal
 * Created by wangyuchao on 16/3/2.
 */
public class MenuItemViewHorizontal extends LinearLayout {
    public View rootView;

    public ImageView iv_icon;
    public TextView tv_title;
    public TextView tv_hint;
    public ImageView iv_hint;

    public LinearLayout ll_container;


    public MenuItemViewHorizontal(Context context) {
        this(context, null);
    }

    public MenuItemViewHorizontal(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public MenuItemViewHorizontal(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);

        rootView = LayoutInflater.from(context).inflate(R.layout.menu_item_view_horizontal, this, true);

        this.iv_icon = (ImageView) rootView.findViewById(R.id.iv_icon);
        this.tv_title = (TextView) rootView.findViewById(R.id.tv_title);
        this.tv_hint = (TextView) rootView.findViewById(R.id.tv_hint);
        this.iv_hint = (ImageView) rootView.findViewById(R.id.iv_hint);
        this.ll_container = (LinearLayout) rootView.findViewById(R.id.ll_container);

        TypedArray array = context.obtainStyledAttributes(attrs, R.styleable.MenuItemViewHorizontal);

        if (array.hasValue(R.styleable.MenuItemViewHorizontal_item_icon)) {
            setMenuItemIcon(array.getResourceId(R.styleable.MenuItemViewHorizontal_item_icon, 0));
        }

        if (array.hasValue(R.styleable.MenuItemViewHorizontal_item_icon_background)) {
            setMenuItemIconBackground(array.getResourceId(R.styleable.MenuItemViewHorizontal_item_icon_background, R.color.blue));
        }

        if (array.hasValue(R.styleable.MenuItemViewHorizontal_item_icon_visible)) {
            setMenuItemIconVisible(array.getBoolean(R.styleable.MenuItemViewHorizontal_item_icon_visible, true));
        }

        if (array.hasValue(R.styleable.MenuItemViewHorizontal_item_text)) {
            setMenuItemText(array.getString(R.styleable.MenuItemViewHorizontal_item_text));
        }

        if (array.hasValue(R.styleable.MenuItemViewHorizontal_item_hint_text)) {
            setMenuItemHintText(array.getString(R.styleable.MenuItemViewHorizontal_item_hint_text));
        }

        if (array.hasValue(R.styleable.MenuItemViewHorizontal_item_hint_text_visible)) {
            setMenuItemHintTextVisible(array.getBoolean(R.styleable.MenuItemViewHorizontal_item_hint_text_visible, true));
        }

        if (array.hasValue(R.styleable.MenuItemViewHorizontal_item_hint_img)) {
            setMenuItemHintImg(array.getResourceId(R.styleable.MenuItemViewHorizontal_item_hint_img, 0));
        }

        if (array.hasValue(R.styleable.MenuItemViewHorizontal_item_hint_img_background)) {
            setMenuItemHintImgBackground(array.getResourceId(R.styleable.MenuItemViewHorizontal_item_hint_img_background, R.color.blue));
        }

        if (array.hasValue(R.styleable.MenuItemViewHorizontal_item_hint_img_visible)) {
            setMenuItemHintImgVisible(array.getBoolean(R.styleable.MenuItemViewHorizontal_item_hint_img_visible, true));
        }

        array.recycle();

    }

    public void setMenuItemIcon(int menuItemIcon) {
        iv_icon.setImageResource(menuItemIcon);
    }

    public void setMenuItemIconBackground(int menuItemBackground) {
        iv_icon.setBackgroundResource(menuItemBackground);
    }

    public void setMenuItemIconVisible(boolean visible) {
        iv_icon.setVisibility(visible ? View.VISIBLE : View.GONE);
    }

    public void setMenuItemText(String titleText) {
        tv_title.setText(titleText);
    }

    public void setMenuItemHintText(String hintText) {
        tv_hint.setText(hintText);
    }

    public void setMenuItemHintTextVisible(boolean visible) {
        tv_hint.setVisibility(visible ? View.VISIBLE : View.GONE);
    }

    public void setMenuItemHintImg(int menuItemHintImg) {
        iv_hint.setImageResource(menuItemHintImg);
    }

    public void setMenuItemHintImgBackground(int menuItemHintImgBackground) {
        iv_hint.setBackgroundResource(menuItemHintImgBackground);
    }

    public void setMenuItemHintImgVisible(boolean visible) {
        iv_hint.setVisibility(visible ? View.VISIBLE : View.GONE);
    }


    //=================暴露给外面自定义使用=================/

    public ImageView getIconView() {
        return iv_icon;
    }

    public TextView getTitleView() {
        return tv_title;
    }

    public TextView getHintTextView() {
        return tv_hint;
    }

    public ImageView getHintImageView() {
        return iv_hint;
    }

    public LinearLayout getContainerView() {
        return ll_container;
    }
}
