package androidx.appcompat.widget;

import android.view.MenuItem;
import com.voltasit.parse.model.ControlUnitLabelDB;

/* JADX INFO: compiled from: PopupMenu.java */
/* JADX INFO: loaded from: classes.dex */
public final class M implements androidx.appcompat.view.menu.f.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ O f8757b;

    public M(O o10) {
        this.f8757b = o10;
    }

    @Override // androidx.appcompat.view.menu.f.a
    public final boolean a(androidx.appcompat.view.menu.f fVar, MenuItem menuItem) {
        com.voltasit.obdeleven.presentation.controlUnit.kwp.longcoding.o oVar = this.f8757b.f8761c;
        if (oVar == null) {
            return false;
        }
        com.voltasit.obdeleven.presentation.controlUnit.kwp.longcoding.q qVar = oVar.f31825a;
        qVar.getClass();
        ControlUnitLabelDB controlUnitLabelDB = (ControlUnitLabelDB) oVar.f31826b.get(menuItem.getOrder());
        int i10 = controlUnitLabelDB.getInt("bit");
        int i11 = controlUnitLabelDB.getInt("bitLength");
        int i12 = controlUnitLabelDB.getInt("value");
        for (int i13 = 0; i13 < i11; i13++) {
            oVar.f31827c.e(qVar.f31830A, i10 + i13, i12 >> i13);
        }
        qVar.X(qVar.f31830A);
        return true;
    }

    @Override // androidx.appcompat.view.menu.f.a
    public final void b(androidx.appcompat.view.menu.f fVar) {
    }
}
