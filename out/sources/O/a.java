package O;

import D2.V;
import Z3.I;
import Z3.q;
import Z3.r;
import Z3.x;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.Spanned;
import androidx.compose.ui.text.y;
import com.facebook.internal.FeatureManager;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.collections.p;
import kotlin.jvm.internal.i;
import okhttp3.m;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p114j1.j;
import p165n4.s;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a implements com.google.common.base.c, y, B7.g.a, j.a, FeatureManager.a, m.b {
    public static int d(float f10, int i10, int i11) {
        return (Float.hashCode(f10) + i10) * i11;
    }

    public static String f(String str, String str2, String str3) {
        return str + str2 + str3;
    }

    public static void g(int i10, int i11, int i12, int i13, int i14) {
        h.a(i10);
        h.a(i11);
        h.a(i12);
        h.a(i13);
        h.a(i14);
    }

    public static void h(com.google.firebase.perf.util.h hVar, p253u7.c cVar, p253u7.c cVar2) {
        cVar.k(hVar.a());
        p277w7.h.c(cVar2);
    }

    @Override // androidx.compose.ui.text.y
    public boolean a(I.f fVar, I.f fVar2) {
        return fVar2.a(fVar.b());
    }

    @Override // com.google.common.base.c
    public Object apply(Object obj) {
        p102i1.a aVar = (p102i1.a) obj;
        aVar.getClass();
        Bundle bundle = new Bundle();
        CharSequence charSequence = aVar.f36511a;
        if (charSequence != null) {
            bundle.putCharSequence(p102i1.a.f36502r, charSequence);
            if (charSequence instanceof Spanned) {
                Spanned spanned = (Spanned) charSequence;
                String str = p102i1.c.f36545a;
                ArrayList<? extends Parcelable> arrayList = new ArrayList<>();
                for (p102i1.f fVar : (p102i1.f[]) spanned.getSpans(0, spanned.length(), p102i1.f.class)) {
                    fVar.getClass();
                    Bundle bundle2 = new Bundle();
                    bundle2.putString(p102i1.f.f36550c, fVar.f36552a);
                    bundle2.putInt(p102i1.f.f36551d, fVar.f36553b);
                    arrayList.add(p102i1.c.a(spanned, fVar, 1, bundle2));
                }
                for (p102i1.g gVar : (p102i1.g[]) spanned.getSpans(0, spanned.length(), p102i1.g.class)) {
                    gVar.getClass();
                    Bundle bundle3 = new Bundle();
                    bundle3.putInt(p102i1.g.f36554d, gVar.f36557a);
                    bundle3.putInt(p102i1.g.f36555e, gVar.f36558b);
                    bundle3.putInt(p102i1.g.f36556f, gVar.f36559c);
                    arrayList.add(p102i1.c.a(spanned, gVar, 2, bundle3));
                }
                for (p102i1.d dVar : (p102i1.d[]) spanned.getSpans(0, spanned.length(), p102i1.d.class)) {
                    arrayList.add(p102i1.c.a(spanned, dVar, 3, null));
                }
                for (p102i1.h hVar : (p102i1.h[]) spanned.getSpans(0, spanned.length(), p102i1.h.class)) {
                    hVar.getClass();
                    Bundle bundle4 = new Bundle();
                    bundle4.putString(p102i1.h.f36560b, hVar.f36561a);
                    arrayList.add(p102i1.c.a(spanned, hVar, 4, bundle4));
                }
                if (!arrayList.isEmpty()) {
                    bundle.putParcelableArrayList(p102i1.a.f36503s, arrayList);
                }
            }
        }
        bundle.putSerializable(p102i1.a.f36504t, aVar.f36512b);
        bundle.putSerializable(p102i1.a.f36505u, aVar.f36513c);
        bundle.putFloat(p102i1.a.f36508x, aVar.f36515e);
        bundle.putInt(p102i1.a.f36509y, aVar.f36516f);
        bundle.putInt(p102i1.a.f36510z, aVar.f36517g);
        bundle.putFloat(p102i1.a.f36492A, aVar.f36518h);
        bundle.putInt(p102i1.a.f36493B, aVar.f36519i);
        bundle.putInt(p102i1.a.f36494C, aVar.f36523n);
        bundle.putFloat(p102i1.a.f36495D, aVar.f36524o);
        bundle.putFloat(p102i1.a.f36496E, aVar.j);
        bundle.putFloat(p102i1.a.f36497F, aVar.f36520k);
        bundle.putBoolean(p102i1.a.f36499H, aVar.f36521l);
        bundle.putInt(p102i1.a.f36498G, aVar.f36522m);
        bundle.putInt(p102i1.a.f36500I, aVar.f36525p);
        bundle.putFloat(p102i1.a.f36501J, aVar.f36526q);
        Bitmap bitmap = aVar.f36514d;
        if (bitmap != null) {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            p241t7.b.k(bitmap.compress(Bitmap.CompressFormat.PNG, 0, byteArrayOutputStream));
            bundle.putByteArray(p102i1.a.f36507w, byteArrayOutputStream.toByteArray());
        }
        return bundle;
    }

    @Override // B7.g.a
    public String b(Context context) {
        ApplicationInfo applicationInfo = context.getApplicationInfo();
        return applicationInfo != null ? String.valueOf(applicationInfo.targetSdkVersion) : "";
    }

    @Override // okhttp3.m.b
    public m c(okhttp3.internal.connection.e eVar) {
        return m.f45561a;
    }

    @Override // com.facebook.internal.FeatureManager.a
    public void e(boolean z10) {
        File[] fileArrListFiles;
        int i10 = 1;
        if (z10) {
            q qVar = q.f7852a;
            if (!I.a() || s.w()) {
                return;
            }
            File fileL = V.l();
            if (fileL == null) {
                fileArrListFiles = new File[0];
            } else {
                fileArrListFiles = fileL.listFiles(new p238t4.c());
                kotlin.jvm.internal.i.d(fileArrListFiles, "reportDir.listFiles { dir, name ->\n      name.matches(Regex(String.format(\"^%s[0-9]+.json$\", InstrumentUtility.ERROR_REPORT_PREFIX)))\n    }");
            }
            final ArrayList arrayList = new ArrayList();
            int length = fileArrListFiles.length;
            int i11 = 0;
            while (i11 < length) {
                File file = fileArrListFiles[i11];
                i11++;
                kotlin.jvm.internal.i.e(file, "file");
                p238t4.a aVar = new p238t4.a();
                String name = file.getName();
                kotlin.jvm.internal.i.d(name, "file.name");
                aVar.f47262a = name;
                JSONObject jSONObjectO = V.o(name);
                if (jSONObjectO != null) {
                    aVar.f47264c = Long.valueOf(jSONObjectO.optLong("timestamp", 0L));
                    aVar.f47263b = jSONObjectO.optString("error_message", null);
                }
                if (aVar.f47263b != null && aVar.f47264c != null) {
                    arrayList.add(aVar);
                }
            }
            p.G(arrayList, new Y1.b(i10));
            JSONArray jSONArray = new JSONArray();
            for (int i12 = 0; i12 < arrayList.size() && i12 < 1000; i12++) {
                jSONArray.put(arrayList.get(i12));
            }
            V.p("error_reports", jSONArray, new r.b() { // from class: t4.b
                @Override // Z3.r.b
                public final void b(x xVar) {
                    ArrayList arrayList2 = arrayList;
                    try {
                        if (xVar.f7905c == null) {
                            JSONObject jSONObject = xVar.f7906d;
                            if (i.a(jSONObject == null ? null : Boolean.valueOf(jSONObject.getBoolean("success")), Boolean.TRUE)) {
                                Iterator it = arrayList2.iterator();
                                while (it.hasNext()) {
                                    V.i(((a) it.next()).f47262a);
                                }
                            }
                        }
                    } catch (JSONException unused) {
                    }
                }
            });
        }
    }

    @Override // j1.j.a
    public void invoke(Object obj) {
        ((p162n1.b) obj).getClass();
    }
}
