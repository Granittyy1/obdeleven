package K5;

import android.content.Context;
import android.graphics.Typeface;
import android.text.TextPaint;
import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: TextDrawableHelper.java */
/* JADX INFO: loaded from: classes3.dex */
public final class m {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f4350c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f4351d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final WeakReference<b> f4353f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public P5.d f4354g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextPaint f4348a = new TextPaint(1);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a f4349b = new a();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f4352e = true;

    /* JADX INFO: compiled from: TextDrawableHelper.java */
    public class a extends C.g {
        public a() {
        }

        @Override // C.g
        public final void Z(int i10) {
            m mVar = m.this;
            mVar.f4352e = true;
            b bVar = mVar.f4353f.get();
            if (bVar != null) {
                bVar.a();
            }
        }

        @Override // C.g
        public final void a0(Typeface typeface, boolean z10) {
            if (z10) {
                return;
            }
            m mVar = m.this;
            mVar.f4352e = true;
            b bVar = mVar.f4353f.get();
            if (bVar != null) {
                bVar.a();
            }
        }
    }

    /* JADX INFO: compiled from: TextDrawableHelper.java */
    public interface b {
        void a();

        int[] getState();

        boolean onStateChange(int[] iArr);
    }

    public m(b bVar) {
        this.f4353f = new WeakReference<>(null);
        this.f4353f = new WeakReference<>(bVar);
    }

    public final void a(String str) {
        TextPaint textPaint = this.f4348a;
        this.f4350c = str == null ? 0.0f : textPaint.measureText((CharSequence) str, 0, str.length());
        this.f4351d = str != null ? Math.abs(textPaint.getFontMetrics().ascent) : 0.0f;
        this.f4352e = false;
    }

    public final void b(P5.d dVar, Context context) {
        if (this.f4354g != dVar) {
            this.f4354g = dVar;
            if (dVar != null) {
                TextPaint textPaint = this.f4348a;
                a aVar = this.f4349b;
                dVar.f(context, textPaint, aVar);
                b bVar = this.f4353f.get();
                if (bVar != null) {
                    textPaint.drawableState = bVar.getState();
                }
                dVar.e(context, textPaint, aVar);
                this.f4352e = true;
            }
            b bVar2 = this.f4353f.get();
            if (bVar2 != null) {
                bVar2.a();
                bVar2.onStateChange(bVar2.getState());
            }
        }
    }
}
