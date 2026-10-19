package J4;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import com.google.android.datatransport.runtime.firebase.transport.LogEventDropped;
import com.parse.ParseException;
import com.voltasit.obdeleven.Application;
import com.voltasit.obdeleven.presentation.models.StartView;
import com.voltasit.obdeleven.ui.dialogs.C2134a0;
import com.voltasit.obdeleven.utils.NavigationManager;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p255u9.E;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class o implements q.a, w9.d.b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f3994b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f3995c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f3996d;

    public /* synthetic */ o(Object obj, Object obj2, Object obj3) {
        this.f3994b = obj;
        this.f3995c = obj2;
        this.f3996d = obj3;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x002e A[PHI: r5
      0x002e: PHI (r5v12 com.google.android.datatransport.runtime.firebase.transport.LogEventDropped$Reason) = 
      (r5v5 com.google.android.datatransport.runtime.firebase.transport.LogEventDropped$Reason)
      (r5v6 com.google.android.datatransport.runtime.firebase.transport.LogEventDropped$Reason)
      (r5v7 com.google.android.datatransport.runtime.firebase.transport.LogEventDropped$Reason)
      (r5v8 com.google.android.datatransport.runtime.firebase.transport.LogEventDropped$Reason)
      (r5v9 com.google.android.datatransport.runtime.firebase.transport.LogEventDropped$Reason)
      (r5v10 com.google.android.datatransport.runtime.firebase.transport.LogEventDropped$Reason)
     binds: [B:9:0x002c, B:12:0x0036, B:15:0x003f, B:18:0x0048, B:21:0x0051, B:24:0x005a] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // J4.q.a
    public Object apply(Object obj) {
        HashMap map;
        Cursor cursor = (Cursor) obj;
        q qVar = (q) this.f3994b;
        qVar.getClass();
        while (true) {
            boolean zMoveToNext = cursor.moveToNext();
            map = (HashMap) this.f3995c;
            if (!zMoveToNext) {
                break;
            }
            String string = cursor.getString(0);
            int i10 = cursor.getInt(1);
            LogEventDropped.Reason reason = LogEventDropped.Reason.REASON_UNKNOWN;
            if (i10 != reason.a()) {
                LogEventDropped.Reason reason2 = LogEventDropped.Reason.MESSAGE_TOO_OLD;
                if (i10 == reason2.a()) {
                    reason = reason2;
                } else {
                    reason2 = LogEventDropped.Reason.CACHE_FULL;
                    if (i10 == reason2.a()) {
                        reason = reason2;
                    } else {
                        reason2 = LogEventDropped.Reason.PAYLOAD_TOO_BIG;
                        if (i10 == reason2.a()) {
                            reason = reason2;
                        } else {
                            reason2 = LogEventDropped.Reason.MAX_RETRIES_REACHED;
                            if (i10 == reason2.a()) {
                                reason = reason2;
                            } else {
                                reason2 = LogEventDropped.Reason.INVALID_PAYLOD;
                                if (i10 == reason2.a()) {
                                    reason = reason2;
                                } else {
                                    reason2 = LogEventDropped.Reason.SERVER_ERROR;
                                    if (i10 == reason2.a()) {
                                        reason = reason2;
                                    } else {
                                        G4.a.a("SQLiteEventStore", "%n is not valid. No matched LogEventDropped-Reason found. Treated it as REASON_UNKNOWN", Integer.valueOf(i10));
                                    }
                                }
                            }
                        }
                    }
                }
            }
            long j = cursor.getLong(2);
            if (!map.containsKey(string)) {
                map.put(string, new ArrayList());
            }
            ((List) map.get(string)).add(new LogEventDropped(j, reason));
        }
        Iterator it = map.entrySet().iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            F4.a.C0035a c0035a = (F4.a.C0035a) this.f3996d;
            if (!zHasNext) {
                final long jB = qVar.f4000c.b();
                SQLiteDatabase sQLiteDatabaseJ = qVar.j();
                sQLiteDatabaseJ.beginTransaction();
                try {
                    F4.e eVar = (F4.e) q.B(sQLiteDatabaseJ.rawQuery("SELECT last_metrics_upload_ms FROM global_log_event_state LIMIT 1", new String[0]), new q.a() { // from class: J4.p
                        @Override // J4.q.a
                        public final Object apply(Object obj2) {
                            Cursor cursor2 = (Cursor) obj2;
                            cursor2.moveToNext();
                            return new F4.e(cursor2.getLong(0), jB);
                        }
                    });
                    sQLiteDatabaseJ.setTransactionSuccessful();
                    sQLiteDatabaseJ.endTransaction();
                    c0035a.f3240a = eVar;
                    c0035a.f3242c = new F4.b(new F4.d(qVar.j().compileStatement("PRAGMA page_size").simpleQueryForLong() * qVar.j().compileStatement("PRAGMA page_count").simpleQueryForLong(), e.f3978a.f3970b));
                    c0035a.f3243d = qVar.f4003f.get();
                    return new F4.a(c0035a.f3240a, Collections.unmodifiableList(c0035a.f3241b), c0035a.f3242c, c0035a.f3243d);
                } catch (Throwable th) {
                    sQLiteDatabaseJ.endTransaction();
                    throw th;
                }
            }
            Map.Entry entry = (Map.Entry) it.next();
            int i11 = F4.c.f3245c;
            new ArrayList();
            c0035a.f3241b.add(new F4.c((String) entry.getKey(), Collections.unmodifiableList((List) entry.getValue())));
        }
    }

    @Override // w9.d.b
    public void g(List list, ParseException parseException) {
        p220r9.u uVar = (p220r9.u) this.f3994b;
        NavigationManager.a aVar = (NavigationManager.a) this.f3995c;
        StartView startView = (StartView) this.f3996d;
        C2134a0.a();
        if (list.isEmpty()) {
            aVar.a();
            return;
        }
        if (startView == StartView.AUTO && list.size() == 1) {
            p279w9.b bVar = Application.f29634b;
            Object obj = list.get(0);
            synchronized (bVar) {
                bVar.f47824a.put("DEFAULT_CAR", new w9.b.a(obj, 3600000L));
            }
            aVar.b((E) list.get(0));
            return;
        }
        if (startView == StartView.CAR) {
            Context context = uVar.f46487a;
            List<String> list2 = com.voltasit.obdeleven.a.f29638c;
            String strA = com.voltasit.obdeleven.a.C0320a.a(context).a("selected_car", "");
            Iterator it = list.iterator();
            while (it.hasNext()) {
                E e10 = (E) it.next();
                if (e10.getObjectId().equals(strA)) {
                    p279w9.b bVar2 = Application.f29634b;
                    synchronized (bVar2) {
                        bVar2.f47824a.put("DEFAULT_CAR", new w9.b.a(e10, 3600000L));
                    }
                    aVar.b(e10);
                    return;
                }
            }
        }
        p279w9.b bVar3 = Application.f29634b;
        synchronized (bVar3) {
            bVar3.f47824a.remove("DEFAULT_CAR");
        }
        aVar.a();
    }
}
