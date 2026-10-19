package A4;

import B4.g;
import B4.n;
import J8.p;
import N7.e;
import V8.o;
import android.util.Log;
import androidx.media3.exoplayer.K;
import com.afollestad.materialdialogs.MaterialDialog;
import com.google.firebase.encoders.EncodingException;
import com.google.firebase.remoteconfig.RemoteConfigRegistrar;
import com.google.gson.JsonIOException;
import com.google.gson.internal.f;
import com.google.internal.firebase.inappmessaging.v1.CampaignProto$ThickContent;
import com.voltasit.obdeleven.data.providers.RemoteConfigCoreProviderImpl;
import com.voltasit.obdeleven.presentation.controlUnit.ControlUnitFragment;
import io.intercom.android.sdk.carousel.CarouselScreenFragment;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.net.ConnectException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.UnknownHostException;
import java.util.EnumMap;
import java.util.Iterator;
import java.util.List;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;
import kotlin.jvm.internal.i;
import p033c7.i0;
import p033c7.j0;
import p114j1.C2480b;
import p114j1.j;
import p134k8.D1;
import p228s6.d;
import p228s6.q;
import p235t1.k;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class b implements d, C2480b.a, p183oa.b, f, p191p5.c, MaterialDialog.c, j.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f587b;

    public /* synthetic */ b(Object obj) {
        this.f587b = obj;
    }

    @Override // p183oa.b
    public void a(Object obj) {
        e eVar = (e) obj;
        j0 j0Var = (j0) this.f587b;
        if (j0Var.f22463b) {
            return;
        }
        boolean z10 = j0Var.f22464c;
        i0 i0Var = j0Var.f22462a;
        if (z10) {
            int i10 = j0Var.f22465d + 1;
            j0Var.f22465d = i10;
            if (i10 >= 5) {
                j0Var.f22464c = false;
                i0Var.a("fresh_install", false);
            }
        }
        Iterator<E> it = eVar.K().iterator();
        while (it.hasNext()) {
            if (((CampaignProto$ThickContent) it.next()).J()) {
                j0Var.f22463b = true;
                i0Var.a("test_device", true);
                Q3.d.C();
                return;
            }
        }
    }

    @Override // com.afollestad.materialdialogs.MaterialDialog.c
    public void b(MaterialDialog materialDialog, int i10) {
        ControlUnitFragment controlUnitFragment = (ControlUnitFragment) this.f587b;
        List<D1> list = controlUnitFragment.f31434t;
        i.b(list);
        D1 d10 = list.get(i10);
        o oVar = new o();
        oVar.f6816s = d10;
        oVar.f6817t = d10.h();
        controlUnitFragment.r().n(oVar, null);
        materialDialog.dismiss();
    }

    @Override // p114j1.C2480b.a
    public void c(Object obj, Object obj2) {
        ((Integer) obj).getClass();
        Integer num = (Integer) obj2;
        final int iIntValue = num.intValue();
        K k10 = (K) this.f587b;
        k10.B0();
        k10.u0(1, 10, num);
        k10.u0(2, 10, num);
        k10.f18033m.e(21, new j.a() { // from class: androidx.media3.exoplayer.D
            @Override // j1.j.a
            public final void invoke(Object obj3) {
                ((g1.v.c) obj3).p(iIntValue);
            }
        });
    }

    public c.b d(Object obj) throws IOException {
        c.a aVar = (c.a) obj;
        c cVar = (c) this.f587b;
        cVar.getClass();
        URL url = aVar.f595a;
        if (Log.isLoggable("TRuntime.".concat("CctTransportBackend"), 4)) {
            String.format("Making request to: %s", url);
        }
        HttpURLConnection httpURLConnection = (HttpURLConnection) aVar.f595a.openConnection();
        httpURLConnection.setConnectTimeout(30000);
        httpURLConnection.setReadTimeout(cVar.f594g);
        httpURLConnection.setDoOutput(true);
        httpURLConnection.setInstanceFollowRedirects(false);
        httpURLConnection.setRequestMethod("POST");
        httpURLConnection.setRequestProperty("User-Agent", "datatransport/3.1.9 android/");
        httpURLConnection.setRequestProperty("Content-Encoding", "gzip");
        httpURLConnection.setRequestProperty("Content-Type", "application/json");
        httpURLConnection.setRequestProperty("Accept-Encoding", "gzip");
        String str = aVar.f597c;
        if (str != null) {
            httpURLConnection.setRequestProperty("X-Goog-Api-Key", str);
        }
        try {
            OutputStream outputStream = httpURLConnection.getOutputStream();
            try {
                GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(outputStream);
                try {
                    N6.d dVar = cVar.f588a;
                    g gVar = aVar.f596b;
                    BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(gZIPOutputStream));
                    N6.e eVar = (N6.e) dVar.f4653b;
                    N6.f fVar = new N6.f(bufferedWriter, eVar.f4658a, eVar.f4659b, eVar.f4660c, eVar.f4661d);
                    fVar.h(gVar);
                    fVar.j();
                    fVar.f4664b.flush();
                    gZIPOutputStream.close();
                    if (outputStream != null) {
                        outputStream.close();
                    }
                    int responseCode = httpURLConnection.getResponseCode();
                    Integer numValueOf = Integer.valueOf(responseCode);
                    if (Log.isLoggable("TRuntime.".concat("CctTransportBackend"), 4)) {
                        String.format("Status Code: %d", numValueOf);
                    }
                    G4.a.a("CctTransportBackend", "Content-Type: %s", httpURLConnection.getHeaderField("Content-Type"));
                    G4.a.a("CctTransportBackend", "Content-Encoding: %s", httpURLConnection.getHeaderField("Content-Encoding"));
                    if (responseCode == 302 || responseCode == 301 || responseCode == 307) {
                        return new c.b(responseCode, new URL(httpURLConnection.getHeaderField("Location")), 0L);
                    }
                    if (responseCode != 200) {
                        return new c.b(responseCode, null, 0L);
                    }
                    InputStream inputStream = httpURLConnection.getInputStream();
                    try {
                        InputStream gZIPInputStream = "gzip".equals(httpURLConnection.getHeaderField("Content-Encoding")) ? new GZIPInputStream(inputStream) : inputStream;
                        try {
                            c.b bVar = new c.b(responseCode, null, n.a(new BufferedReader(new InputStreamReader(gZIPInputStream))).f1587a);
                            if (gZIPInputStream != null) {
                                gZIPInputStream.close();
                            }
                            if (inputStream != null) {
                                inputStream.close();
                            }
                            return bVar;
                        } catch (Throwable th) {
                            if (gZIPInputStream == null) {
                                throw th;
                            }
                            try {
                                gZIPInputStream.close();
                                throw th;
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                                throw th;
                            }
                        }
                    } catch (Throwable th3) {
                        if (inputStream == null) {
                            throw th3;
                        }
                        try {
                            inputStream.close();
                            throw th3;
                        } catch (Throwable th4) {
                            th3.addSuppressed(th4);
                            throw th3;
                        }
                    }
                } catch (Throwable th5) {
                    try {
                        gZIPOutputStream.close();
                        throw th5;
                    } catch (Throwable th6) {
                        th5.addSuppressed(th6);
                        throw th5;
                    }
                }
            } catch (Throwable th7) {
                if (outputStream == null) {
                    throw th7;
                }
                try {
                    outputStream.close();
                    throw th7;
                } catch (Throwable th8) {
                    th7.addSuppressed(th8);
                    throw th7;
                }
            }
        } catch (EncodingException e10) {
            e = e10;
            G4.a.b("CctTransportBackend", "Couldn't encode request, returning with 400", e);
            return new c.b(CarouselScreenFragment.CAROUSEL_ANIMATION_MS, null, 0L);
        } catch (ConnectException e11) {
            e = e11;
            G4.a.b("CctTransportBackend", "Couldn't open connection, returning with 500", e);
            return new c.b(500, null, 0L);
        } catch (UnknownHostException e12) {
            e = e12;
            G4.a.b("CctTransportBackend", "Couldn't open connection, returning with 500", e);
            return new c.b(500, null, 0L);
        } catch (IOException e13) {
            e = e13;
            G4.a.b("CctTransportBackend", "Couldn't encode request, returning with 400", e);
            return new c.b(CarouselScreenFragment.CAROUSEL_ANIMATION_MS, null, 0L);
        }
    }

    @Override // p191p5.c
    public void e(p191p5.g it) {
        RemoteConfigCoreProviderImpl this$0 = (RemoteConfigCoreProviderImpl) this.f587b;
        i.e(this$0, "this$0");
        i.e(it, "it");
        boolean zO = it.o();
        p pVar = this$0.f30247a;
        if (zO) {
            pVar.e("RemoteConfigCoreProviderImpl", "Config params fetched: " + it.k());
            return;
        }
        pVar.b("RemoteConfigCoreProviderImpl", "Fetch failed: " + it.j());
    }

    @Override // p228s6.d
    public Object f(q qVar) {
        return RemoteConfigRegistrar.lambda$getComponents$0((p228s6.p) this.f587b, qVar);
    }

    @Override // com.google.gson.internal.f
    public Object i() {
        Type type = (Type) this.f587b;
        if (!(type instanceof ParameterizedType)) {
            throw new JsonIOException("Invalid EnumMap type: " + type.toString());
        }
        Type type2 = ((ParameterizedType) type).getActualTypeArguments()[0];
        if (type2 instanceof Class) {
            return new EnumMap((Class) type2);
        }
        throw new JsonIOException("Invalid EnumMap type: " + type.toString());
    }

    @Override // j1.j.a
    public void invoke(Object obj) {
        ((p162n1.b) obj).e((k) this.f587b);
    }

    public /* synthetic */ b(n1.b.a aVar, p235t1.j jVar, k kVar, IOException iOException, boolean z10) {
        this.f587b = kVar;
    }
}
