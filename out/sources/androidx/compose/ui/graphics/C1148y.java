package androidx.compose.ui.graphics;

import android.graphics.Shader;
import android.os.Build;

/* JADX INFO: renamed from: androidx.compose.ui.graphics.y, reason: case insensitive filesystem */
/* JADX INFO: compiled from: AndroidTileMode.android.kt */
/* JADX INFO: loaded from: classes.dex */
public final class C1148y {
    public static final Shader.TileMode a(int i10) {
        if (p0.a(i10, 0)) {
            return Shader.TileMode.CLAMP;
        }
        if (p0.a(i10, 1)) {
            return Shader.TileMode.REPEAT;
        }
        if (p0.a(i10, 2)) {
            return Shader.TileMode.MIRROR;
        }
        if (p0.a(i10, 3)) {
            return Build.VERSION.SDK_INT >= 31 ? Shader.TileMode.DECAL : Shader.TileMode.CLAMP;
        }
        return Shader.TileMode.CLAMP;
    }
}
