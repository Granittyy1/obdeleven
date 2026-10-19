package S5;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;
import com.google.android.material.navigation.NavigationView;

/* JADX INFO: compiled from: ShapeableDelegateV33.java */
/* JADX INFO: loaded from: classes3.dex */
public final class p extends n {

    /* JADX INFO: compiled from: ShapeableDelegateV33.java */
    public class a extends ViewOutlineProvider {
        public a() {
        }

        @Override // android.view.ViewOutlineProvider
        public final void getOutline(View view, Outline outline) {
            p pVar = p.this;
            if (pVar.f5670e.isEmpty()) {
                return;
            }
            outline.setPath(pVar.f5670e);
        }
    }

    public p(NavigationView navigationView) {
        d(navigationView);
    }

    private void d(View view) {
        view.setOutlineProvider(new a());
    }

    @Override // S5.n
    public final void a(NavigationView navigationView) {
        navigationView.setClipToOutline(!this.f5666a);
        if (this.f5666a) {
            navigationView.invalidate();
        } else {
            navigationView.invalidateOutline();
        }
    }

    @Override // S5.n
    public final boolean b() {
        return this.f5666a;
    }
}
