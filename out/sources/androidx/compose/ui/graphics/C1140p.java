package androidx.compose.ui.graphics;

import android.os.Build;
import androidx.compose.ui.graphics.layer.GraphicsLayerImpl;
import androidx.compose.ui.platform.AndroidComposeView;
import com.voltasit.obdeleven.R;

/* JADX INFO: renamed from: androidx.compose.ui.graphics.p, reason: case insensitive filesystem */
/* JADX INFO: compiled from: AndroidGraphicsContext.android.kt */
/* JADX INFO: loaded from: classes.dex */
public final class C1140p implements S {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static boolean f13775d = true;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AndroidComposeView f13776a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f13777b = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public K.b f13778c;

    public C1140p(AndroidComposeView androidComposeView) {
        this.f13776a = androidComposeView;
    }

    @Override // androidx.compose.ui.graphics.S
    public final void a(androidx.compose.ui.graphics.layer.b bVar) {
        synchronized (this.f13777b) {
            if (!bVar.f13678s) {
                bVar.f13678s = true;
                bVar.b();
            }
            p293xa.r rVar = p293xa.r.f47939a;
        }
    }

    @Override // androidx.compose.ui.graphics.S
    public final androidx.compose.ui.graphics.layer.b b() {
        GraphicsLayerImpl fVar;
        androidx.compose.ui.graphics.layer.b bVar;
        synchronized (this.f13777b) {
            try {
                AndroidComposeView androidComposeView = this.f13776a;
                int i10 = Build.VERSION.SDK_INT;
                if (i10 >= 29) {
                    androidComposeView.getUniqueDrawingId();
                }
                if (i10 >= 29) {
                    fVar = new androidx.compose.ui.graphics.layer.e();
                } else if (f13775d) {
                    try {
                        fVar = new androidx.compose.ui.graphics.layer.d(this.f13776a, new F(), new J.a());
                    } catch (Throwable unused) {
                        f13775d = false;
                        fVar = new androidx.compose.ui.graphics.layer.f(c(this.f13776a));
                    }
                } else {
                    fVar = new androidx.compose.ui.graphics.layer.f(c(this.f13776a));
                }
                bVar = new androidx.compose.ui.graphics.layer.b(fVar);
            } catch (Throwable th) {
                throw th;
            }
        }
        return bVar;
    }

    public final K.a c(AndroidComposeView androidComposeView) {
        K.b bVar = this.f13778c;
        if (bVar != null) {
            return bVar;
        }
        K.b bVar2 = new K.b(androidComposeView.getContext());
        bVar2.setClipChildren(false);
        bVar2.setClipToPadding(false);
        bVar2.setTag(R.id.hide_graphics_layer_in_inspector_tag, Boolean.TRUE);
        androidComposeView.addView(bVar2, -1);
        this.f13778c = bVar2;
        return bVar2;
    }
}
