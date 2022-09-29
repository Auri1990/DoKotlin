package gamechess.map;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatImageView;

/**
 * Created by cheng.qiu on 2022/09/23
 * Description:
 */
public class GameBoardView extends AppCompatImageView {
    public GameBoardView(@NonNull Context context) {
        super(context);
    }

    public GameBoardView(@NonNull Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public GameBoardView(@NonNull Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

    }
}
