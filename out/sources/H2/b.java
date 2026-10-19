package H2;

import Q2.U;
import Q2.V;
import Q2.W;
import android.database.Cursor;
import android.graphics.Rect;
import android.view.View;
import androidx.core.view.InterfaceC1309y;
import androidx.core.view.O;
import androidx.core.view.n0;
import androidx.room.k;
import androidx.viewpager.widget.ViewPager;
import androidx.work.impl.WorkDatabase_Impl;
import java.util.ArrayList;
import java.util.Set;
import kotlin.jvm.internal.i;

/* JADX INFO: compiled from: ViewPager.java */
/* JADX INFO: loaded from: classes.dex */
public final class b implements InterfaceC1309y, V {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f3626b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f3627c;

    @Override // Q2.V
    public void b(U u10) {
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.f3626b;
        workDatabase_Impl.b();
        workDatabase_Impl.c();
        try {
            ((W) this.f3627c).f(u10);
            workDatabase_Impl.m();
        } finally {
            workDatabase_Impl.j();
        }
    }

    @Override // Q2.V
    public ArrayList c(String str) {
        k kVarH = k.h(1, "SELECT DISTINCT tag FROM worktag WHERE work_spec_id=?");
        if (str == null) {
            kVarH.p0(1);
        } else {
            kVarH.r(1, str);
        }
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.f3626b;
        workDatabase_Impl.b();
        Cursor cursorK = workDatabase_Impl.k(kVarH, null);
        try {
            ArrayList arrayList = new ArrayList(cursorK.getCount());
            while (cursorK.moveToNext()) {
                arrayList.add(cursorK.isNull(0) ? null : cursorK.getString(0));
            }
            return arrayList;
        } finally {
            cursorK.close();
            kVarH.i();
        }
    }

    @Override // Q2.V
    public void d(String str, Set tags) {
        i.e(tags, "tags");
        super.d(str, tags);
    }

    @Override // androidx.core.view.InterfaceC1309y
    public n0 g(View view, n0 n0Var) {
        n0 n0VarI = O.i(view, n0Var);
        if (n0VarI.f16948a.o()) {
            return n0VarI;
        }
        int iB = n0VarI.b();
        Rect rect = (Rect) this.f3626b;
        rect.left = iB;
        rect.top = n0VarI.d();
        rect.right = n0VarI.c();
        rect.bottom = n0VarI.a();
        ViewPager viewPager = (ViewPager) this.f3627c;
        int childCount = viewPager.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            n0 n0VarB = O.b(viewPager.getChildAt(i10), n0VarI);
            rect.left = Math.min(n0VarB.b(), rect.left);
            rect.top = Math.min(n0VarB.d(), rect.top);
            rect.right = Math.min(n0VarB.c(), rect.right);
            rect.bottom = Math.min(n0VarB.a(), rect.bottom);
        }
        return n0VarI.f(rect.left, rect.top, rect.right, rect.bottom);
    }
}
