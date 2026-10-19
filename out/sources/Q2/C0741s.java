package Q2;

import android.content.ComponentName;
import android.database.Cursor;
import androidx.work.impl.WorkDatabase_Impl;
import java.util.ArrayList;

/* JADX INFO: renamed from: Q2.s, reason: case insensitive filesystem */
/* JADX INFO: compiled from: WorkNameDao_Impl.java */
/* JADX INFO: loaded from: classes.dex */
public class C0741s implements InterfaceC0740q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f5028a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f5029b;

    public C0741s(WorkDatabase_Impl workDatabase_Impl) {
        this.f5028a = workDatabase_Impl;
        this.f5029b = new r(workDatabase_Impl);
    }

    @Override // Q2.InterfaceC0740q
    public void a(C0739p c0739p) {
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.f5028a;
        workDatabase_Impl.b();
        workDatabase_Impl.c();
        try {
            ((r) this.f5029b).f(c0739p);
            workDatabase_Impl.m();
        } finally {
            workDatabase_Impl.j();
        }
    }

    @Override // Q2.InterfaceC0740q
    public ArrayList b(String str) {
        androidx.room.k kVarH = androidx.room.k.h(1, "SELECT name FROM workname WHERE work_spec_id=?");
        if (str == null) {
            kVarH.p0(1);
        } else {
            kVarH.r(1, str);
        }
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.f5028a;
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

    public C0741s(p012b.b bVar, ComponentName componentName) {
        this.f5028a = bVar;
        this.f5029b = componentName;
    }
}
