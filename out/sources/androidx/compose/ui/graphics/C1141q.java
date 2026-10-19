package androidx.compose.ui.graphics;

import android.graphics.Bitmap;

/* JADX INFO: renamed from: androidx.compose.ui.graphics.q, reason: case insensitive filesystem */
/* JADX INFO: compiled from: AndroidImageBitmap.android.kt */
/* JADX INFO: loaded from: classes.dex */
public final class C1141q implements W {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Bitmap f13790a;

    public C1141q(Bitmap bitmap) {
        this.f13790a = bitmap;
    }

    @Override // androidx.compose.ui.graphics.W
    public final void a() {
        this.f13790a.prepareToDraw();
    }

    @Override // androidx.compose.ui.graphics.W
    public final int b() {
        Bitmap.Config config = this.f13790a.getConfig();
        kotlin.jvm.internal.i.b(config);
        if (config == Bitmap.Config.ALPHA_8) {
            return 1;
        }
        if (config == Bitmap.Config.RGB_565) {
            return 2;
        }
        if (config != Bitmap.Config.ARGB_4444) {
            if (config == Bitmap.Config.RGBA_F16) {
                return 3;
            }
            if (config == Bitmap.Config.HARDWARE) {
                return 4;
            }
        }
        return 0;
    }

    @Override // androidx.compose.ui.graphics.W
    public final int getHeight() {
        return this.f13790a.getHeight();
    }

    @Override // androidx.compose.ui.graphics.W
    public final int getWidth() {
        return this.f13790a.getWidth();
    }
}
