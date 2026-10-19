package p192p6;

import U4.C0804l;
import android.os.Bundle;
import com.google.android.gms.internal.measurement.C1912u0;
import com.google.android.gms.internal.measurement.C1919v0;
import com.google.android.gms.internal.measurement.C1926w0;
import com.google.android.gms.internal.measurement.C1939y0;
import com.google.android.gms.internal.measurement.O0;
import com.google.common.collect.ImmutableSet;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import p131k5.N;
import p205q6.c;
import p205q6.d;
import p205q6.e;
import p205q6.f;
import p205q6.g;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-api@@21.6.1 */
/* JADX INFO: loaded from: classes3.dex */
public final class b implements p192p6.a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static volatile b f45868c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p118j5.a f45869a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ConcurrentHashMap f45870b;

    /* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-api@@21.6.1 */
    public class a implements p192p6.a.InterfaceC0518a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f45871a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ b f45872b;

        public a(b bVar, String str) {
            this.f45871a = str;
            this.f45872b = bVar;
        }

        @Override // p192p6.a.InterfaceC0518a
        public final void a(HashSet hashSet) {
            String str = this.f45871a;
            b bVar = this.f45872b;
            bVar.getClass();
            if (str.isEmpty()) {
                return;
            }
            ConcurrentHashMap concurrentHashMap = bVar.f45870b;
            if (!concurrentHashMap.containsKey(str) || concurrentHashMap.get(str) == null || !str.equals("fiam") || hashSet == null || hashSet.isEmpty()) {
                return;
            }
            ((p205q6.a) concurrentHashMap.get(str)).a(hashSet);
        }
    }

    public b(p118j5.a aVar) {
        C0804l.h(aVar);
        this.f45869a = aVar;
        this.f45870b = new ConcurrentHashMap();
    }

    @Override // p192p6.a
    public final void a(String str, String str2) {
        if (d.d(str) && d.b(str, "_ln")) {
            C1912u0 c1912u0 = this.f45869a.f41134a;
            c1912u0.getClass();
            c1912u0.e(new C1926w0(c1912u0, str, "_ln", str2, true));
        }
    }

    @Override // p192p6.a
    public final Map<String, Object> b(boolean z10) {
        return this.f45869a.f41134a.d(null, null, z10);
    }

    @Override // p192p6.a
    public final void c(Bundle bundle, String str, String str2) {
        if (d.d(str) && d.a(bundle, str2) && d.c(bundle, str, str2)) {
            if ("clx".equals(str) && "_ae".equals(str2)) {
                bundle.putLong("_r", 1L);
            }
            C1912u0 c1912u0 = this.f45869a.f41134a;
            c1912u0.getClass();
            c1912u0.e(new O0(c1912u0, str, str2, bundle, true));
        }
    }

    @Override // p192p6.a
    public final void d(p6.a.c cVar) {
        ObjectInputStream objectInputStream;
        ObjectOutputStream objectOutputStream;
        ImmutableSet<String> immutableSet = d.f46136a;
        String str = cVar.f45854a;
        if (str == null || str.isEmpty()) {
            return;
        }
        Object obj = cVar.f45856c;
        if (obj != null) {
            Object obj2 = null;
            try {
                try {
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
                    try {
                        objectOutputStream.writeObject(obj);
                        objectOutputStream.flush();
                        objectInputStream = new ObjectInputStream(new ByteArrayInputStream(byteArrayOutputStream.toByteArray()));
                        try {
                            Object object = objectInputStream.readObject();
                            objectOutputStream.close();
                            objectInputStream.close();
                            obj2 = object;
                            if (obj2 == null) {
                                return;
                            }
                        } catch (Throwable th) {
                            th = th;
                            if (objectOutputStream != null) {
                                objectOutputStream.close();
                            }
                            if (objectInputStream != null) {
                                objectInputStream.close();
                            }
                            throw th;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        objectInputStream = null;
                    }
                } catch (IOException | ClassNotFoundException unused) {
                }
            } catch (Throwable th3) {
                th = th3;
                objectInputStream = null;
                objectOutputStream = null;
            }
        }
        if (d.d(str) && d.b(str, cVar.f45855b)) {
            String str2 = cVar.f45863k;
            if (str2 != null) {
                if (!d.a(cVar.f45864l, str2)) {
                    return;
                }
                if (!d.c(cVar.f45864l, str, cVar.f45863k)) {
                    return;
                }
            }
            String str3 = cVar.f45861h;
            if (str3 != null) {
                if (!d.a(cVar.f45862i, str3)) {
                    return;
                }
                if (!d.c(cVar.f45862i, str, cVar.f45861h)) {
                    return;
                }
            }
            String str4 = cVar.f45859f;
            if (str4 != null) {
                if (!d.a(cVar.f45860g, str4)) {
                    return;
                }
                if (!d.c(cVar.f45860g, str, cVar.f45859f)) {
                    return;
                }
            }
            Bundle bundle = new Bundle();
            String str5 = cVar.f45854a;
            if (str5 != null) {
                bundle.putString("origin", str5);
            }
            String str6 = cVar.f45855b;
            if (str6 != null) {
                bundle.putString("name", str6);
            }
            Object obj3 = cVar.f45856c;
            if (obj3 != null) {
                N.c(bundle, obj3);
            }
            String str7 = cVar.f45857d;
            if (str7 != null) {
                bundle.putString("trigger_event_name", str7);
            }
            bundle.putLong("trigger_timeout", cVar.f45858e);
            String str8 = cVar.f45859f;
            if (str8 != null) {
                bundle.putString("timed_out_event_name", str8);
            }
            Bundle bundle2 = cVar.f45860g;
            if (bundle2 != null) {
                bundle.putBundle("timed_out_event_params", bundle2);
            }
            String str9 = cVar.f45861h;
            if (str9 != null) {
                bundle.putString("triggered_event_name", str9);
            }
            Bundle bundle3 = cVar.f45862i;
            if (bundle3 != null) {
                bundle.putBundle("triggered_event_params", bundle3);
            }
            bundle.putLong("time_to_live", cVar.j);
            String str10 = cVar.f45863k;
            if (str10 != null) {
                bundle.putString("expired_event_name", str10);
            }
            Bundle bundle4 = cVar.f45864l;
            if (bundle4 != null) {
                bundle.putBundle("expired_event_params", bundle4);
            }
            bundle.putLong("creation_timestamp", cVar.f45865m);
            bundle.putBoolean("active", cVar.f45866n);
            bundle.putLong("triggered_timestamp", cVar.f45867o);
            C1912u0 c1912u0 = this.f45869a.f41134a;
            c1912u0.getClass();
            c1912u0.e(new C1919v0(c1912u0, bundle));
        }
    }

    @Override // p192p6.a
    public final int e(String str) {
        return this.f45869a.f41134a.a(str);
    }

    @Override // p192p6.a
    public final p192p6.a.InterfaceC0518a f(String str, p6.a.b bVar) {
        Object obj;
        e eVar;
        c cVar;
        if (!d.d(str)) {
            return null;
        }
        boolean zIsEmpty = str.isEmpty();
        ConcurrentHashMap concurrentHashMap = this.f45870b;
        if (!zIsEmpty && concurrentHashMap.containsKey(str) && concurrentHashMap.get(str) != null) {
            return null;
        }
        boolean zEquals = "fiam".equals(str);
        p118j5.a aVar = this.f45869a;
        if (zEquals) {
            cVar = new c();
            cVar.f46135b = bVar;
            aVar.a(new f(cVar));
            cVar.f46134a = new HashSet();
        } else if ("clx".equals(str)) {
            eVar = new e();
            eVar.f46142a = bVar;
            aVar.a(new g(eVar));
        } else {
            obj = null;
        }
        if (obj == null) {
            obj = eVar;
            obj = cVar;
            return null;
        }
        obj = eVar;
        obj = cVar;
        concurrentHashMap.put(str, obj);
        return new a(this, str);
    }

    @Override // p192p6.a
    public final void g(String str) {
        C1912u0 c1912u0 = this.f45869a.f41134a;
        c1912u0.getClass();
        c1912u0.e(new C1939y0(c1912u0, str, null, null));
    }

    @Override // p192p6.a
    public final List h(String str) {
        ArrayList arrayList = new ArrayList();
        for (Bundle bundle : this.f45869a.f41134a.c(str, "")) {
            ImmutableSet<String> immutableSet = d.f46136a;
            C0804l.h(bundle);
            p6.a.c cVar = new p6.a.c();
            String str2 = (String) N.b(bundle, "origin", String.class, null);
            C0804l.h(str2);
            cVar.f45854a = str2;
            String str3 = (String) N.b(bundle, "name", String.class, null);
            C0804l.h(str3);
            cVar.f45855b = str3;
            cVar.f45856c = N.b(bundle, "value", Object.class, null);
            cVar.f45857d = (String) N.b(bundle, "trigger_event_name", String.class, null);
            cVar.f45858e = ((Long) N.b(bundle, "trigger_timeout", Long.class, 0L)).longValue();
            cVar.f45859f = (String) N.b(bundle, "timed_out_event_name", String.class, null);
            cVar.f45860g = (Bundle) N.b(bundle, "timed_out_event_params", Bundle.class, null);
            cVar.f45861h = (String) N.b(bundle, "triggered_event_name", String.class, null);
            cVar.f45862i = (Bundle) N.b(bundle, "triggered_event_params", Bundle.class, null);
            cVar.j = ((Long) N.b(bundle, "time_to_live", Long.class, 0L)).longValue();
            cVar.f45863k = (String) N.b(bundle, "expired_event_name", String.class, null);
            cVar.f45864l = (Bundle) N.b(bundle, "expired_event_params", Bundle.class, null);
            cVar.f45866n = ((Boolean) N.b(bundle, "active", Boolean.class, Boolean.FALSE)).booleanValue();
            cVar.f45865m = ((Long) N.b(bundle, "creation_timestamp", Long.class, 0L)).longValue();
            cVar.f45867o = ((Long) N.b(bundle, "triggered_timestamp", Long.class, 0L)).longValue();
            arrayList.add(cVar);
        }
        return arrayList;
    }
}
