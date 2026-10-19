package S5;

import android.graphics.Outline;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewOutlineProvider;
import com.google.android.material.navigation.NavigationView;

/* JADX INFO: compiled from: ShapeableDelegateV22.java */
/* JADX INFO: loaded from: classes3.dex */
public final class o extends n {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f5671f = false;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public float f5672g = 0.0f;

    /* JADX INFO: compiled from: ShapeableDelegateV22.java */
    public class a extends ViewOutlineProvider {
        public a() {
        }

        @Override // android.view.ViewOutlineProvider
        public final void getOutline(View view, Outline outline) {
            o oVar = o.this;
            if (oVar.f5668c == null || oVar.f5669d.isEmpty()) {
                return;
            }
            RectF rectF = oVar.f5669d;
            outline.setRoundRect((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom, oVar.f5672g);
        }
    }

    public o(NavigationView navigationView) {
        d(navigationView);
    }

    private void d(View view) {
        view.setOutlineProvider(new a());
    }

    @Override // S5.n
    public final void a(NavigationView navigationView) {
        i iVar;
        i iVar2;
        RectF rectF;
        i iVar3 = this.f5668c;
        this.f5672g = (iVar3 == null || (rectF = this.f5669d) == null) ? 0.0f : iVar3.f5612f.a(rectF);
        boolean z10 = false;
        if ((this.f5669d.isEmpty() || (iVar2 = this.f5668c) == null) ? false : iVar2.d(this.f5669d)) {
            z10 = true;
        } else if (!this.f5669d.isEmpty() && (iVar = this.f5668c) != null && this.f5667b && !iVar.d(this.f5669d)) {
            i iVar4 = this.f5668c;
            if ((iVar4.f5607a instanceof h) && (iVar4.f5608b instanceof h) && (iVar4.f5610d instanceof h) && (iVar4.f5609c instanceof h)) {
                float fA = iVar4.f5611e.a(this.f5669d);
                float fA2 = this.f5668c.f5612f.a(this.f5669d);
                float fA3 = this.f5668c.f5614h.a(this.f5669d);
                float fA4 = this.f5668c.f5613g.a(this.f5669d);
                if (fA == 0.0f && fA3 == 0.0f && fA2 == fA4) {
                    RectF rectF2 = this.f5669d;
                    rectF2.set(rectF2.left - fA2, rectF2.top, rectF2.right, rectF2.bottom);
                    this.f5672g = fA2;
                } else if (fA == 0.0f && fA2 == 0.0f && fA3 == fA4) {
                    RectF rectF3 = this.f5669d;
                    rectF3.set(rectF3.left, rectF3.top - fA3, rectF3.right, rectF3.bottom);
                    this.f5672g = fA3;
                } else if (fA2 == 0.0f && fA4 == 0.0f && fA == fA3) {
                    RectF rectF4 = this.f5669d;
                    rectF4.set(rectF4.left, rectF4.top, rectF4.right + fA, rectF4.bottom);
                    this.f5672g = fA;
                } else if (fA3 == 0.0f && fA4 == 0.0f && fA == fA2) {
                    RectF rectF5 = this.f5669d;
                    rectF5.set(rectF5.left, rectF5.top, rectF5.right, rectF5.bottom + fA);
                    this.f5672g = fA;
                }
                z10 = true;
            }
        }
        this.f5671f = z10;
        navigationView.setClipToOutline(!b());
        if (b()) {
            navigationView.invalidate();
        } else {
            navigationView.invalidateOutline();
        }
    }

    @Override // S5.n
    public final boolean b() {
        return !this.f5671f || this.f5666a;
    }
}
