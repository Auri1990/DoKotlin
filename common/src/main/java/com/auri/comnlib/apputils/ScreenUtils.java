package com.auri.comnlib.apputils;

import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewTreeObserver;

import androidx.annotation.NonNull;

public class ScreenUtils {

    /**
     * @return 屏幕宽度。单位：像素
     */
    public static int getScreenWidth(@NonNull Context context) {
        DisplayMetrics dm = context.getApplicationContext().getResources().getDisplayMetrics();
        return dm.widthPixels;
    }

    /**
     * @return 屏幕宽度。单位：dp
     */
    public static float getScreenWidthDp(@NonNull Context context) {
        DisplayMetrics dm = context.getApplicationContext().getResources().getDisplayMetrics();
        return dm.widthPixels * 1f / dm.density;
    }

    /**
     * @return 屏幕高度。单位：像素
     */
    public static int getScreenHeight(@NonNull Context context) {
        DisplayMetrics dm = context.getResources().getDisplayMetrics();
        return dm.heightPixels;
    }

    /**
     * @return 屏幕高度。单位：dp
     */
    public static float getScreenHeightDp(@NonNull Context context) {
        DisplayMetrics dm = context.getResources().getDisplayMetrics();
        return dm.heightPixels * 1f / dm.density;
    }

    /**
     * 获取手机屏幕密度（像素比例：0.75/1.0/1.5/2.0）
     */
    public static float getDensity(@NonNull Context context) {
        DisplayMetrics dm = context.getApplicationContext().getResources().getDisplayMetrics();
        return dm.density;
    }

    /**
     * 获取手机屏幕密度（每寸像素：120/160/240/320）
     */
    public static float getDensityDPI(@NonNull Context context) {
        DisplayMetrics dm = context.getApplicationContext().getResources().getDisplayMetrics();
        return dm.densityDpi;
    }

    /**
     * 获取屏幕尺寸描述
     */
    public static String getScreenResolution(@NonNull Context context) {
        DisplayMetrics dm = new DisplayMetrics();
        dm = context.getApplicationContext().getResources().getDisplayMetrics();
        StringBuffer sb = new StringBuffer(Integer.toString(dm.widthPixels)).append("*").append(Integer.toString(dm.heightPixels));
        return sb.toString();

    }

    /**
     * 获取软键盘高度
     */
    public static void observeSoftKeyboard(Activity activity, final OnSoftKeyboardChangeListener listener) {
        if (activity.getWindow() == null) {
            return;
        }
        final View decorView = activity.getWindow().getDecorView();
        decorView.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() {
            int previousKeyboardHeight = -1;

            @Override
            public void onGlobalLayout() {
                Rect rect = new Rect();
                decorView.getWindowVisibleDisplayFrame(rect);
                int displayHeight = rect.bottom - rect.top;
                int height = decorView.getHeight();
                int keyboardHeight = height - displayHeight;
                if (previousKeyboardHeight != keyboardHeight) {
                    previousKeyboardHeight = keyboardHeight;
                    boolean hide = (double) displayHeight / height > 0.8;
                    if (listener != null) {
                        listener.onSoftKeyBoardChange(keyboardHeight, !hide);
                    }
                }

            }
        });
    }

    public interface OnSoftKeyboardChangeListener {
        void onSoftKeyBoardChange(int softKeybardHeight, boolean visible);
    }

//    /**
//     * 获得状态栏的高度
//     */
//    public static int getStatusHeight(@NonNull Context context) {
//
//        int statusHeight = -1;
//        try {
//            Class clazz = Class.forName("com.android.internal.R$dimen");
//            Object object = clazz.newInstance();
//            int height = Integer.parseInt(clazz.getField("status_bar_height").get(object).toString());
//            statusHeight = context.getResources().getDimensionPixelSize(height);
//        } catch (Exception e) {
//            e.printStackTrace();
//            return getScreenHeight(context);
//        }
//        return statusHeight;
//    }
//
//    public static int getStatusHeightII(@NonNull Context context) {
//        int result = 0;
//        int resourceId = context.getResources().getIdentifier("status_bar_height", "dimen", "android");
//        if (resourceId > 0) {
//            result = context.getResources().getDimensionPixelSize(resourceId);
//        }
//        return result;
//    }


    public static int[] getWindowLocation(View view) {
        int[] location = new int[2];
        view.getLocationInWindow(location);
        return location;
    }

    public static int[] getScreenLocation(View view) {
        int[] location = new int[2];
        view.getLocationOnScreen(location);
        return location;
    }
}
