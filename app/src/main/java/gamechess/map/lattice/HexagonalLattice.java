package gamechess.map.lattice;

import android.graphics.Color;

import androidx.annotation.ColorInt;
import androidx.annotation.Size;

/**
 * Created by cheng.qiu on 2022/07/29
 * Description: 六边形格子。Lattice 结构框架；Hexagonal 六角形；
 */
public class HexagonalLattice {

    // 生成地图网格时定义的绝对坐标 x y z h。x y z 分别代表水平面方向，h 代表垂直方向
    private int[] coordinateParams = {0, 0, 0, 0};

    // 格子的视觉中心点，在镜头移动的情况下，中心点会发生变化。一般情况下，默认是绝对中心点
    private int[] visionCenterPoint = {0, 0};

    private final float strokeWidth = 1;

    @ColorInt
    private int strokeColor = Color.BLUE;

    public HexagonalLattice(@Size(4) int[] coordinateParams) {
        this.coordinateParams = coordinateParams;
    }
}
