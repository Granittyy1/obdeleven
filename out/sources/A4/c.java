package A4;

import B4.f;
import B4.g;
import B4.h;
import B4.i;
import B4.l;
import B4.m;
import C4.j;
import C4.n;
import C4.o;
import D4.k;
import N6.d;
import N6.e;
import android.content.Context;
import android.content.pm.PackageManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.telephony.TelephonyManager;
import android.util.Log;
import androidx.compose.ui.text.font.s;
import com.braze.Constants;
import com.google.android.datatransport.cct.internal.ClientInfo;
import com.google.android.datatransport.cct.internal.NetworkConnectionInfo;
import com.google.android.datatransport.cct.internal.QosTier;
import com.google.android.datatransport.runtime.backends.BackendResponse;
import io.intercom.android.sdk.models.AttributeType;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;

/* JADX INFO: compiled from: CctTransportBackend.java */
/* JADX INFO: loaded from: classes.dex */
public final class c implements k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f588a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ConnectivityManager f589b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Context f590c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final URL f591d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final L4.a f592e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final L4.a f593f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f594g;

    /* JADX INFO: compiled from: CctTransportBackend.java */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final URL f595a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final g f596b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f597c;

        public a(URL url, g gVar, String str) {
            this.f595a = url;
            this.f596b = gVar;
            this.f597c = str;
        }
    }

    /* JADX INFO: compiled from: CctTransportBackend.java */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f598a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final URL f599b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final long f600c;

        public b(int i10, URL url, long j) {
            this.f598a = i10;
            this.f599b = url;
            this.f600c = j;
        }
    }

    public c(Context context, L4.a aVar, L4.a aVar2) {
        e eVar = new e();
        B4.c cVar = B4.c.f1536a;
        eVar.a(B4.k.class, cVar);
        eVar.a(g.class, cVar);
        B4.e eVar2 = B4.e.f1546a;
        eVar.a(m.class, eVar2);
        eVar.a(i.class, eVar2);
        com.google.android.datatransport.cct.internal.a aVar3 = com.google.android.datatransport.cct.internal.a.f25246a;
        eVar.a(ClientInfo.class, aVar3);
        eVar.a(com.google.android.datatransport.cct.internal.c.class, aVar3);
        B4.b bVar = B4.b.f1524a;
        eVar.a(B4.a.class, bVar);
        eVar.a(f.class, bVar);
        B4.d dVar = B4.d.f1538a;
        eVar.a(l.class, dVar);
        eVar.a(h.class, dVar);
        com.google.android.datatransport.cct.internal.b bVar2 = com.google.android.datatransport.cct.internal.b.f25249a;
        eVar.a(NetworkConnectionInfo.class, bVar2);
        eVar.a(com.google.android.datatransport.cct.internal.d.class, bVar2);
        eVar.f4661d = true;
        this.f588a = new d(eVar);
        this.f590c = context;
        this.f589b = (ConnectivityManager) context.getSystemService("connectivity");
        this.f591d = c(A4.a.f581c);
        this.f592e = aVar2;
        this.f593f = aVar;
        this.f594g = 130000;
    }

    public static URL c(String str) {
        try {
            return new URL(str);
        } catch (MalformedURLException e10) {
            throw new IllegalArgumentException(B7.b.c("Invalid url: ", str), e10);
        }
    }

    @Override // D4.k
    public final com.google.android.datatransport.runtime.backends.a a(D4.a aVar) {
        String str;
        BackendResponse.Status status;
        b bVarD;
        Integer numValueOf;
        String str2;
        BackendResponse.Status status2;
        h.a aVar2;
        BackendResponse.Status status3 = BackendResponse.Status.f25257c;
        HashMap map = new HashMap();
        for (o oVar : aVar.f2786a) {
            String strG = oVar.g();
            if (map.containsKey(strG)) {
                ((List) map.get(strG)).add(oVar);
            } else {
                ArrayList arrayList = new ArrayList();
                arrayList.add(oVar);
                map.put(strG, arrayList);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            o oVar2 = (o) ((List) entry.getValue()).get(0);
            QosTier qosTier = QosTier.DEFAULT;
            long jB = this.f593f.b();
            long jB2 = this.f592e.b();
            com.google.android.datatransport.cct.internal.c cVar = new com.google.android.datatransport.cct.internal.c(new f(Integer.valueOf(oVar2.f("sdk-version")), oVar2.a("model"), oVar2.a("hardware"), oVar2.a("device"), oVar2.a("product"), oVar2.a("os-uild"), oVar2.a("manufacturer"), oVar2.a("fingerprint"), oVar2.a("locale"), oVar2.a("country"), oVar2.a("mcc_mnc"), oVar2.a("application_build")));
            try {
                str2 = null;
                numValueOf = Integer.valueOf(Integer.parseInt((String) entry.getKey()));
            } catch (NumberFormatException unused) {
                numValueOf = null;
                str2 = (String) entry.getKey();
            }
            ArrayList arrayList3 = new ArrayList();
            Iterator it2 = ((List) entry.getValue()).iterator();
            while (it2.hasNext()) {
                o oVar3 = (o) it2.next();
                n nVarD = oVar3.d();
                p311z4.c cVar2 = nVarD.f2391a;
                Iterator it3 = it;
                Iterator it4 = it2;
                boolean zEquals = cVar2.equals(new p311z4.c("proto"));
                byte[] bArr = nVarD.f2392b;
                if (zEquals) {
                    aVar2 = new h.a();
                    aVar2.f1576d = bArr;
                } else {
                    if (cVar2.equals(new p311z4.c("json"))) {
                        String str3 = new String(bArr, Charset.forName("UTF-8"));
                        h.a aVar3 = new h.a();
                        aVar3.f1577e = str3;
                        aVar2 = aVar3;
                    } else {
                        status2 = status3;
                        if (Log.isLoggable("TRuntime.".concat("CctTransportBackend"), 5)) {
                            new StringBuilder("Received event of unsupported encoding ").append(cVar2);
                        }
                    }
                    it2 = it4;
                    it = it3;
                    status3 = status2;
                }
                aVar2.f1573a = Long.valueOf(oVar3.e());
                aVar2.f1575c = Long.valueOf(oVar3.h());
                String str4 = oVar3.b().get("tz-offset");
                aVar2.f1578f = Long.valueOf(str4 == null ? 0L : Long.valueOf(str4).longValue());
                aVar2.f1579g = new com.google.android.datatransport.cct.internal.d(NetworkConnectionInfo.NetworkType.f25242c.get(oVar3.f("net-type")), NetworkConnectionInfo.MobileSubtype.f25239d.get(oVar3.f("mobile-subtype")));
                if (oVar3.c() != null) {
                    aVar2.f1574b = oVar3.c();
                }
                String strB = aVar2.f1573a == null ? " eventTimeMs" : "";
                if (aVar2.f1575c == null) {
                    strB = strB.concat(" eventUptimeMs");
                }
                if (aVar2.f1578f == null) {
                    strB = s.b(strB, " timezoneOffsetSeconds");
                }
                if (!strB.isEmpty()) {
                    throw new IllegalStateException("Missing required properties:".concat(strB));
                }
                status2 = status3;
                arrayList3.add(new h(aVar2.f1573a.longValue(), aVar2.f1574b, aVar2.f1575c.longValue(), aVar2.f1576d, aVar2.f1577e, aVar2.f1578f.longValue(), aVar2.f1579g));
                it2 = it4;
                it = it3;
                status3 = status2;
            }
            arrayList2.add(new i(jB, jB2, cVar, numValueOf, str2, arrayList3));
            it = it;
            status3 = status3;
        }
        BackendResponse.Status status4 = status3;
        int i10 = 5;
        g gVar = new g(arrayList2);
        BackendResponse.Status status5 = BackendResponse.Status.f25258d;
        byte[] bArr2 = aVar.f2787b;
        URL urlC = this.f591d;
        if (bArr2 != null) {
            try {
                A4.a aVarA = A4.a.a(bArr2);
                str = aVarA.f586b;
                if (str == null) {
                    str = null;
                }
                String str5 = aVarA.f585a;
                if (str5 != null) {
                    urlC = c(str5);
                }
            } catch (IllegalArgumentException unused2) {
                return new com.google.android.datatransport.runtime.backends.a(status5, -1L);
            }
        } else {
            str = null;
        }
        try {
            a aVar4 = new a(urlC, gVar, str);
            A4.b bVar = new A4.b(this);
            do {
                bVarD = bVar.d(aVar4);
                URL url = bVarD.f599b;
                if (url != null) {
                    G4.a.a("CctTransportBackend", "Following redirect to: %s", url);
                    aVar4 = new a(url, aVar4.f596b, aVar4.f597c);
                } else {
                    aVar4 = null;
                }
                if (aVar4 == null) {
                    break;
                }
                i10--;
            } while (i10 >= 1);
            int i11 = bVarD.f598a;
            if (i11 == 200) {
                return new com.google.android.datatransport.runtime.backends.a(BackendResponse.Status.f25256b, bVarD.f600c);
            }
            if (i11 < 500 && i11 != 404) {
                return i11 == 400 ? new com.google.android.datatransport.runtime.backends.a(BackendResponse.Status.f25259e, -1L) : new com.google.android.datatransport.runtime.backends.a(status5, -1L);
            }
            status = status4;
            try {
                return new com.google.android.datatransport.runtime.backends.a(status, -1L);
            } catch (IOException e10) {
                e = e10;
                G4.a.b("CctTransportBackend", "Could not make request to the backend", e);
                return new com.google.android.datatransport.runtime.backends.a(status, -1L);
            }
        } catch (IOException e11) {
            e = e11;
            status = status4;
        }
    }

    @Override // D4.k
    public final j b(j jVar) {
        int subtype;
        NetworkInfo activeNetworkInfo = this.f589b.getActiveNetworkInfo();
        j.a aVarI = jVar.i();
        int i10 = Build.VERSION.SDK_INT;
        HashMap map = aVarI.f2374f;
        if (map == null) {
            throw new IllegalStateException("Property \"autoMetadata\" has not been set");
        }
        map.put("sdk-version", String.valueOf(i10));
        aVarI.a("model", Build.MODEL);
        aVarI.a("hardware", Build.HARDWARE);
        aVarI.a("device", Build.DEVICE);
        aVarI.a("product", Build.PRODUCT);
        aVarI.a("os-uild", Build.ID);
        aVarI.a("manufacturer", Build.MANUFACTURER);
        aVarI.a("fingerprint", Build.FINGERPRINT);
        Calendar.getInstance();
        long offset = TimeZone.getDefault().getOffset(Calendar.getInstance().getTimeInMillis()) / Constants.BRAZE_MINIMUM_NOTIFICATION_DURATION_MILLIS;
        HashMap map2 = aVarI.f2374f;
        if (map2 == null) {
            throw new IllegalStateException("Property \"autoMetadata\" has not been set");
        }
        map2.put("tz-offset", String.valueOf(offset));
        int iA = activeNetworkInfo == null ? NetworkConnectionInfo.NetworkType.NONE.a() : activeNetworkInfo.getType();
        HashMap map3 = aVarI.f2374f;
        if (map3 == null) {
            throw new IllegalStateException("Property \"autoMetadata\" has not been set");
        }
        map3.put("net-type", String.valueOf(iA));
        int i11 = -1;
        if (activeNetworkInfo == null) {
            subtype = NetworkConnectionInfo.MobileSubtype.UNKNOWN_MOBILE_SUBTYPE.a();
        } else {
            subtype = activeNetworkInfo.getSubtype();
            if (subtype == -1) {
                subtype = NetworkConnectionInfo.MobileSubtype.COMBINED.a();
            } else if (NetworkConnectionInfo.MobileSubtype.f25239d.get(subtype) == null) {
                subtype = 0;
            }
        }
        HashMap map4 = aVarI.f2374f;
        if (map4 == null) {
            throw new IllegalStateException("Property \"autoMetadata\" has not been set");
        }
        map4.put("mobile-subtype", String.valueOf(subtype));
        aVarI.a("country", Locale.getDefault().getCountry());
        aVarI.a("locale", Locale.getDefault().getLanguage());
        Context context = this.f590c;
        aVarI.a("mcc_mnc", ((TelephonyManager) context.getSystemService(AttributeType.PHONE)).getSimOperator());
        try {
            i11 = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
        } catch (PackageManager.NameNotFoundException e10) {
            G4.a.b("CctTransportBackend", "Unable to find version code for package", e10);
        }
        aVarI.a("application_build", Integer.toString(i11));
        return aVarI.b();
    }
}
