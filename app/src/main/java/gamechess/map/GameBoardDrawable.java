package gamechess.map;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.PixelFormat;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.auri.common.utils.PathUtils;

/**
 * Created by cheng.qiu on 2022/10/31
 * Description: 屏幕中心画三个六边形
 */
public class GameBoardDrawable extends Drawable {

    // 一个格子的半径长度，格子默认为正多边形。
    private int gridRadius;
    // 棋盘半径有多少格子
    private int boardRadius;

    // 通用画笔
    Paint mPaint;

    public GameBoardDrawable(int gridRadius, int boardRadius) {
        this.gridRadius = gridRadius;
        this.boardRadius = boardRadius;
        mPaint = new Paint();
    }

    @Override
    protected void onBoundsChange(Rect bounds) {
        super.onBoundsChange(bounds);
    }

    @Override
    public void draw(@NonNull Canvas canvas) {
        // 获取中心点
        Rect bounds = getBounds();
        float[] centerCoordinate = new float[]{bounds.exactCenterX(),bounds.exactCenterY()};
        float[] coordinate0 = PathUtils.calculatePoint(centerCoordinate[0],centerCoordinate[1],gridRadius,0);
        float[] coordinate1 = PathUtils.calculatePoint(centerCoordinate[0],centerCoordinate[1],gridRadius,120);
        float[] coordinate2 = PathUtils.calculatePoint(centerCoordinate[0],centerCoordinate[1],gridRadius,240);

        mPaint.setStyle(Paint.Style.STROKE);
        mPaint.setStrokeWidth(12);
        mPaint.setColor(Color.RED);
        canvas.drawPoints(new float[]{coordinate0[0],coordinate0[1],coordinate1[0],coordinate1[1],coordinate2[0],coordinate2[1]},mPaint);
    }

    @Override
    public void setAlpha(int alpha) {
        mPaint.setAlpha(alpha);
    }

    @Override
    public void setColorFilter(@Nullable ColorFilter colorFilter) {
        mPaint.setColorFilter(colorFilter);
    }

    @Override
    public int getOpacity() {
        return PixelFormat.TRANSLUCENT; // 有可能看到底部被覆盖的内容
    }

    @Override
    public int getIntrinsicWidth() {
        return Double.valueOf(Math.ceil(PathUtils.calculateAdjacentEdge(gridRadius, 60f)) * 3).intValue() + gridRadius * 2;
    }

    @Override
    public int getIntrinsicHeight() {
        return Double.valueOf(Math.ceil(PathUtils.calculateOppositeEdge(gridRadius, 60f)) * 4).intValue();
    }
}
