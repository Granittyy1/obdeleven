package p100i;

import android.view.View;
import androidx.drawerlayout.widget.DrawerLayout;

/* JADX INFO: compiled from: ActionBarDrawerToggle.java */
/* JADX INFO: loaded from: classes.dex */
public final class b implements View.OnClickListener {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c f36272b;

    public b(c cVar) {
        this.f36272b = cVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        c cVar = this.f36272b;
        cVar.getClass();
        DrawerLayout drawerLayout = cVar.f36274b;
        int i10 = drawerLayout.i(8388611);
        View viewF = drawerLayout.f(8388611);
        if ((viewF != null ? DrawerLayout.q(viewF) : false) && i10 != 2) {
            drawerLayout.d();
            return;
        }
        if (i10 != 1) {
            View viewF2 = drawerLayout.f(8388611);
            if (viewF2 != null) {
                drawerLayout.r(viewF2);
            } else {
                throw new IllegalArgumentException("No drawer view found with gravity " + DrawerLayout.l(8388611));
            }
        }
    }
}
