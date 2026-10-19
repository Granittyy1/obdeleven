package androidx.compose.ui.graphics;

import android.graphics.Shader;

/* JADX INFO: compiled from: Brush.kt */
/* JADX INFO: loaded from: classes.dex */
public abstract class j0 extends C {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Shader f13650a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f13651b = 9205357640488583168L;

    @Override // androidx.compose.ui.graphics.C
    public final void a(float f10, long j, d0 d0Var) {
        Shader shaderB = this.f13650a;
        if (shaderB == null || !I.h.a(this.f13651b, j)) {
            if (I.h.e(j)) {
                shaderB = null;
                this.f13650a = null;
                this.f13651b = 9205357640488583168L;
            } else {
                shaderB = b(j);
                this.f13650a = shaderB;
                this.f13651b = j;
            }
        }
        long jC = d0Var.c();
        long j10 = H.f13495b;
        if (!H.c(jC, j10)) {
            d0Var.g(j10);
        }
        if (!kotlin.jvm.internal.i.a(d0Var.f(), shaderB)) {
            d0Var.e(shaderB);
        }
        if (d0Var.a() == f10) {
            return;
        }
        d0Var.b(f10);
    }

    public abstract Shader b(long j);
}
