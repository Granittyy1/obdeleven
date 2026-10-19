package androidx.compose.ui.text.platform.style;

import I.h;
import android.graphics.Shader;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.UpdateAppearance;
import androidx.compose.runtime.C1085f0;
import androidx.compose.runtime.DerivedSnapshotState;
import androidx.compose.runtime.J0;
import androidx.compose.ui.graphics.j0;

/* JADX INFO: compiled from: ShaderBrushSpan.android.kt */
/* JADX INFO: loaded from: classes.dex */
public final class ShaderBrushSpan extends CharacterStyle implements UpdateAppearance {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j0 f15642a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f15643b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C1085f0 f15644c = J0.f(new h(9205357640488583168L));

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final DerivedSnapshotState f15645d = J0.d(new Ia.a<Shader>() { // from class: androidx.compose.ui.text.platform.style.ShaderBrushSpan$shaderState$1
        {
            super(0);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // Ia.a
        public final Shader invoke() {
            if (((h) this.this$0.f15644c.getValue()).f3769a == 9205357640488583168L || h.e(((h) this.this$0.f15644c.getValue()).f3769a)) {
                return null;
            }
            ShaderBrushSpan shaderBrushSpan = this.this$0;
            return shaderBrushSpan.f15642a.b(((h) shaderBrushSpan.f15644c.getValue()).f3769a);
        }
    });

    public ShaderBrushSpan(j0 j0Var, float f10) {
        this.f15642a = j0Var;
        this.f15643b = f10;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        kotlin.jvm.internal.h.i(textPaint, this.f15643b);
        textPaint.setShader((Shader) this.f15645d.getValue());
    }
}
