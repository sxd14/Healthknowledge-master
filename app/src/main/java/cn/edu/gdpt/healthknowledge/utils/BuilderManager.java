package cn.edu.gdpt.healthknowledge.utils;

import cn.edu.gdpt.healthknowledge.R;

public class BuilderManager {
    private static int[] imageResources = new int[]{ //9个菜单的随机选择的图片
            R.drawable.bat,
            R.drawable.bear,
            R.drawable.bee,
            R.drawable.butterfly,
            R.drawable.cat,
            R.drawable.deer,
            R.drawable.dolphin,
            R.drawable.eagle,
            R.drawable.horse,
            R.drawable.elephant,
            R.drawable.owl,
            R.drawable.peacock,
            R.drawable.pig,
            R.drawable.rat,
            R.drawable.snake,
            R.drawable.squirrel
    };
    private static int[] textResources = new int[]{ //9个菜单中的文本
            R.string.zhongshi,
            R.string.tiyu,
            R.string.xinli,
            R.string.jibing,
            R.string.jiuzhen,
            R.string.weisheng,
            R.string.xingwei,
            R.string.yangsheng,
            R.string.jianfei
    };
    private static int imageResourceIndex = 0;
    private static int textResourceIndex = 0;
    public static int getImageResource() {
        if (imageResourceIndex >= imageResources.length) imageResourceIndex = 0;
        return imageResources[imageResourceIndex++];
    }
    public static int getTextResource() {
        if (textResourceIndex >= textResources.length) textResourceIndex = 0;
        return textResources[textResourceIndex++];
    }
    private static BuilderManager ourInstance = new BuilderManager();
    public static BuilderManager getInstance() {
        return ourInstance;
    }
    private BuilderManager() {
    }
}

