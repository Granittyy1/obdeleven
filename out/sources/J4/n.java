package J4;

import D2.V;
import Z3.I;
import Z3.x;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.text.Layout;
import android.text.SpannableString;
import androidx.compose.foundation.layout.W;
import androidx.compose.runtime.C1086g;
import androidx.media3.exoplayer.mediacodec.MediaCodecUtil;
import com.facebook.internal.FeatureManager;
import com.facebook.internal.instrument.InstrumentData;
import com.google.android.gms.internal.measurement.Y;
import java.io.File;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;
import java.util.Set;
import kotlin.jvm.internal.i;
import org.json.JSONException;
import org.json.JSONObject;
import p114j1.A;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class n implements q.a, com.google.common.base.c, androidx.compose.ui.text.y, com.google.gson.internal.f, FeatureManager.a, j1.j.a, MediaCodecUtil.e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f3993b;

    public /* synthetic */ n(int i10) {
        this.f3993b = i10;
    }

    public static String c(androidx.compose.ui.h.a aVar, float f10, C1086g c1086g, int i10, C1086g c1086g2) {
        Lb.a.a(c1086g, W.e(aVar, f10));
        return S4.o.p(c1086g2, i10);
    }

    public static String d(Locale locale, String str, String str2, Locale locale2, String str3) {
        kotlin.jvm.internal.i.d(locale, str);
        String lowerCase = str2.toLowerCase(locale2);
        kotlin.jvm.internal.i.d(lowerCase, str3);
        return lowerCase;
    }

    public static StringBuilder f(String str, String str2, long j) {
        StringBuilder sb2 = new StringBuilder(str);
        sb2.append(j);
        sb2.append(str2);
        return sb2;
    }

    @Override // androidx.compose.ui.text.y
    public boolean a(I.f fVar, I.f fVar2) {
        return fVar.f(fVar2);
    }

    @Override // J4.q.a
    public Object apply(Object obj) {
        switch (this.f3993b) {
            case 0:
                return Boolean.valueOf(((Cursor) obj).getCount() > 0);
            default:
                Bundle bundle = (Bundle) obj;
                String str = p102i1.a.f36502r;
                p102i1.a.C0382a c0382a = new p102i1.a.C0382a();
                CharSequence charSequence = bundle.getCharSequence(p102i1.a.f36502r);
                if (charSequence != null) {
                    c0382a.f36527a = charSequence;
                    ArrayList<Bundle> parcelableArrayList = bundle.getParcelableArrayList(p102i1.a.f36503s);
                    if (parcelableArrayList != null) {
                        SpannableString spannableStringValueOf = SpannableString.valueOf(charSequence);
                        for (Bundle bundle2 : parcelableArrayList) {
                            int i10 = bundle2.getInt(p102i1.c.f36545a);
                            int i11 = bundle2.getInt(p102i1.c.f36546b);
                            int i12 = bundle2.getInt(p102i1.c.f36547c);
                            int i13 = bundle2.getInt(p102i1.c.f36548d, -1);
                            Bundle bundle3 = bundle2.getBundle(p102i1.c.f36549e);
                            if (i13 == 1) {
                                bundle3.getClass();
                                String string = bundle3.getString(p102i1.f.f36550c);
                                string.getClass();
                                spannableStringValueOf.setSpan(new p102i1.f(string, bundle3.getInt(p102i1.f.f36551d)), i10, i11, i12);
                            } else if (i13 == 2) {
                                bundle3.getClass();
                                spannableStringValueOf.setSpan(new p102i1.g(bundle3.getInt(p102i1.g.f36554d), bundle3.getInt(p102i1.g.f36555e), bundle3.getInt(p102i1.g.f36556f)), i10, i11, i12);
                            } else if (i13 == 3) {
                                spannableStringValueOf.setSpan(new p102i1.d(), i10, i11, i12);
                            } else if (i13 == 4) {
                                bundle3.getClass();
                                String string2 = bundle3.getString(p102i1.h.f36560b);
                                string2.getClass();
                                spannableStringValueOf.setSpan(new p102i1.h(string2), i10, i11, i12);
                            }
                        }
                        c0382a.f36527a = spannableStringValueOf;
                    }
                }
                Layout.Alignment alignment = (Layout.Alignment) bundle.getSerializable(p102i1.a.f36504t);
                if (alignment != null) {
                    c0382a.f36529c = alignment;
                }
                Layout.Alignment alignment2 = (Layout.Alignment) bundle.getSerializable(p102i1.a.f36505u);
                if (alignment2 != null) {
                    c0382a.f36530d = alignment2;
                }
                Bitmap bitmap = (Bitmap) bundle.getParcelable(p102i1.a.f36506v);
                if (bitmap != null) {
                    c0382a.f36528b = bitmap;
                } else {
                    byte[] byteArray = bundle.getByteArray(p102i1.a.f36507w);
                    if (byteArray != null) {
                        c0382a.f36528b = BitmapFactory.decodeByteArray(byteArray, 0, byteArray.length);
                    }
                }
                String str2 = p102i1.a.f36508x;
                if (bundle.containsKey(str2)) {
                    String str3 = p102i1.a.f36509y;
                    if (bundle.containsKey(str3)) {
                        float f10 = bundle.getFloat(str2);
                        int i14 = bundle.getInt(str3);
                        c0382a.f36531e = f10;
                        c0382a.f36532f = i14;
                    }
                }
                String str4 = p102i1.a.f36510z;
                if (bundle.containsKey(str4)) {
                    c0382a.f36533g = bundle.getInt(str4);
                }
                String str5 = p102i1.a.f36492A;
                if (bundle.containsKey(str5)) {
                    c0382a.f36534h = bundle.getFloat(str5);
                }
                String str6 = p102i1.a.f36493B;
                if (bundle.containsKey(str6)) {
                    c0382a.f36535i = bundle.getInt(str6);
                }
                String str7 = p102i1.a.f36495D;
                if (bundle.containsKey(str7)) {
                    String str8 = p102i1.a.f36494C;
                    if (bundle.containsKey(str8)) {
                        float f11 = bundle.getFloat(str7);
                        int i15 = bundle.getInt(str8);
                        c0382a.f36536k = f11;
                        c0382a.j = i15;
                    }
                }
                String str9 = p102i1.a.f36496E;
                if (bundle.containsKey(str9)) {
                    c0382a.f36537l = bundle.getFloat(str9);
                }
                String str10 = p102i1.a.f36497F;
                if (bundle.containsKey(str10)) {
                    c0382a.f36538m = bundle.getFloat(str10);
                }
                String str11 = p102i1.a.f36498G;
                if (bundle.containsKey(str11)) {
                    c0382a.f36540o = bundle.getInt(str11);
                    c0382a.f36539n = true;
                }
                if (!bundle.getBoolean(p102i1.a.f36499H, false)) {
                    c0382a.f36539n = false;
                }
                String str12 = p102i1.a.f36500I;
                if (bundle.containsKey(str12)) {
                    c0382a.f36541p = bundle.getInt(str12);
                }
                String str13 = p102i1.a.f36501J;
                if (bundle.containsKey(str13)) {
                    c0382a.f36542q = bundle.getFloat(str13);
                }
                return c0382a.a();
        }
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecUtil.e
    public int b(Object obj) {
        String str = ((androidx.media3.exoplayer.mediacodec.d) obj).f18575a;
        if (str.startsWith("OMX.google") || str.startsWith("c2.android")) {
            return 1;
        }
        return (A.f40996a >= 26 || !str.equals("OMX.MTK.AUDIO.DECODER.RAW")) ? 0 : -1;
    }

    @Override // com.facebook.internal.FeatureManager.a
    public void e(boolean z10) {
        File[] fileArrListFiles;
        int i10 = 0;
        switch (this.f3993b) {
            case 7:
                if (z10) {
                    p030c4.b.f22304e.set(true);
                    return;
                } else {
                    p030c4.b.f22304e.set(false);
                    return;
                }
            default:
                if (z10) {
                    synchronized (p215r4.c.f46338b) {
                        Z3.q qVar = Z3.q.f7852a;
                        if (I.a()) {
                            r4.c.a.a();
                        }
                        if (p215r4.c.f46339c == null) {
                            p215r4.c cVar = new p215r4.c(Thread.getDefaultUncaughtExceptionHandler());
                            p215r4.c.f46339c = cVar;
                            Thread.setDefaultUncaughtExceptionHandler(cVar);
                        }
                    }
                    FeatureManager featureManager = FeatureManager.f24975a;
                    if (FeatureManager.b(FeatureManager.Feature.CrashShield)) {
                        Y.f25639b = true;
                        if (I.a() && !p165n4.s.w()) {
                            File fileL = V.l();
                            if (fileL == null) {
                                fileArrListFiles = new File[0];
                            } else {
                                fileArrListFiles = fileL.listFiles(new p190p4.d(i10));
                                if (fileArrListFiles == null) {
                                    fileArrListFiles = new File[0];
                                }
                            }
                            ArrayList arrayList = new ArrayList();
                            int length = fileArrListFiles.length;
                            int i11 = 0;
                            while (i11 < length) {
                                File file = fileArrListFiles[i11];
                                i11++;
                                final InstrumentData instrumentDataA = InstrumentData.a.a(file);
                                if (instrumentDataA.a()) {
                                    JSONObject jSONObject = new JSONObject();
                                    try {
                                        jSONObject.put("crash_shield", instrumentDataA.toString());
                                        String str = Z3.r.j;
                                        arrayList.add(Z3.r.c.i(null, String.format("%s/instruments", Arrays.copyOf(new Object[]{Z3.q.b()}, 1)), jSONObject, new Z3.r.b() { // from class: p4.a
                                            @Override // Z3.r.b
                                            public final void b(x xVar) {
                                                InstrumentData instrumentData = instrumentDataA;
                                                try {
                                                    if (xVar.f7905c == null) {
                                                        JSONObject jSONObject2 = xVar.f7906d;
                                                        if (i.a(jSONObject2 == null ? null : Boolean.valueOf(jSONObject2.getBoolean("success")), Boolean.TRUE)) {
                                                            V.i(instrumentData.f25024a);
                                                        }
                                                    }
                                                } catch (JSONException unused) {
                                                }
                                            }
                                        }));
                                    } catch (JSONException unused) {
                                    }
                                }
                            }
                            if (!arrayList.isEmpty()) {
                                Z3.w wVar = new Z3.w(arrayList);
                                String str2 = Z3.r.j;
                                p165n4.t.c(wVar);
                                new Z3.v(wVar).executeOnExecutor(Z3.q.c(), new Void[0]);
                            }
                        }
                        Set<Object> set = p226s4.a.f46902a;
                    }
                    FeatureManager featureManager2 = FeatureManager.f24975a;
                    if (FeatureManager.b(FeatureManager.Feature.ThreadCheck)) {
                        int i12 = p250u4.a.f47424a;
                        return;
                    }
                    return;
                }
                return;
        }
    }

    @Override // com.google.gson.internal.f
    public Object i() {
        return new ArrayDeque();
    }

    @Override // j1.j.a
    public void invoke(Object obj) {
        ((p162n1.b) obj).getClass();
    }
}
