package D7;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import com.google.android.datatransport.Priority;
import com.google.firebase.messaging.H;
import com.google.firebase.remoteconfig.internal.ConfigFetchHandler;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.ListIterator;
import java.util.Set;
import p191p5.InterfaceC2755a;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class h implements InterfaceC2755a, J4.q.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f2846b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f2847c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f2848d;

    public /* synthetic */ h(Object obj, int i10, Object obj2) {
        this.f2846b = i10;
        this.f2847c = obj;
        this.f2848d = obj2;
    }

    @Override // J4.q.a
    public Object apply(Object obj) {
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
        J4.q qVar = (J4.q) this.f2847c;
        J4.e eVar = qVar.f4002e;
        int iC = eVar.c();
        C4.l lVar = (C4.l) this.f2848d;
        ArrayList arrayListS = qVar.s(sQLiteDatabase, lVar, iC);
        for (Priority priority : Priority.values()) {
            if (priority != lVar.f2382c) {
                int iC2 = eVar.c() - arrayListS.size();
                if (iC2 <= 0) {
                    break;
                }
                arrayListS.addAll(qVar.s(sQLiteDatabase, lVar.d(priority), iC2));
            }
        }
        HashMap map = new HashMap();
        StringBuilder sb2 = new StringBuilder("event_id IN (");
        for (int i10 = 0; i10 < arrayListS.size(); i10++) {
            sb2.append(((J4.h) arrayListS.get(i10)).b());
            if (i10 < arrayListS.size() - 1) {
                sb2.append(',');
            }
        }
        sb2.append(')');
        Cursor cursorQuery = sQLiteDatabase.query("event_metadata", new String[]{"event_id", "name", "value"}, sb2.toString(), null, null, null, null);
        while (cursorQuery.moveToNext()) {
            try {
                long j = cursorQuery.getLong(0);
                Set hashSet = (Set) map.get(Long.valueOf(j));
                if (hashSet == null) {
                    hashSet = new HashSet();
                    map.put(Long.valueOf(j), hashSet);
                }
                hashSet.add(new J4.q.b(cursorQuery.getString(1), cursorQuery.getString(2)));
            } catch (Throwable th) {
                cursorQuery.close();
                throw th;
            }
        }
        cursorQuery.close();
        ListIterator listIterator = arrayListS.listIterator();
        while (listIterator.hasNext()) {
            J4.h hVar = (J4.h) listIterator.next();
            if (map.containsKey(Long.valueOf(hVar.b()))) {
                C4.j.a aVarI = hVar.a().i();
                for (J4.q.b bVar : (Set) map.get(Long.valueOf(hVar.b()))) {
                    aVarI.a(bVar.f4004a, bVar.f4005b);
                }
                listIterator.set(new J4.b(hVar.b(), hVar.c(), aVarI.b()));
            }
        }
        return arrayListS;
    }

    @Override // p191p5.InterfaceC2755a
    public Object i(p191p5.g gVar) {
        switch (this.f2846b) {
            case 0:
                return ((ConfigFetchHandler) this.f2847c).b(gVar, 0L, (HashMap) this.f2848d);
            default:
                H h8 = (H) this.f2847c;
                String str = (String) this.f2848d;
                synchronized (h8) {
                    h8.f28279b.remove(str);
                    break;
                }
                return gVar;
        }
    }
}
