package D7;

import androidx.compose.ui.text.AbstractC1266g;
import androidx.compose.ui.text.InterfaceC1267h;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigServerException;
import io.intercom.android.sdk.survey.block.TextBlockKt;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.util.Date;
import java.util.Set;
import p191p5.InterfaceC2755a;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class m implements InterfaceC2755a, InterfaceC1267h {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f2863b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f2864c;

    public /* synthetic */ m(Object obj, Object obj2) {
        this.f2863b = obj;
        this.f2864c = obj2;
    }

    @Override // androidx.compose.ui.text.InterfaceC1267h
    public void a(AbstractC1266g abstractC1266g) {
        TextBlockKt.appendInlineSources$lambda$11((Ia.l) this.f2863b, (Set) this.f2864c, abstractC1266g);
    }

    /* JADX WARN: Code duplicated, block: B:100:0x010c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:37:0x0088  */
    /* JADX WARN: Code duplicated, block: B:85:0x011f  */
    @Override // p191p5.InterfaceC2755a
    public Object i(p191p5.g gVar) throws Throwable {
        Integer numValueOf;
        Throwable th;
        HttpURLConnection httpURLConnection;
        FirebaseRemoteConfigServerException firebaseRemoteConfigServerException;
        com.google.firebase.remoteconfig.internal.d dVar = (com.google.firebase.remoteconfig.internal.d) this.f2863b;
        p191p5.g gVar2 = (p191p5.g) this.f2864c;
        dVar.getClass();
        boolean z10 = true;
        try {
            if (!gVar2.o()) {
                throw new IOException(gVar2.j());
            }
            synchronized (dVar) {
                dVar.f28611b = true;
                httpURLConnection = (HttpURLConnection) gVar2.k();
                try {
                    int responseCode = httpURLConnection.getResponseCode();
                    numValueOf = Integer.valueOf(responseCode);
                    if (responseCode == 200) {
                        try {
                            synchronized (dVar) {
                                dVar.f28612c = 8;
                            }
                            dVar.f28623o.d(0, com.google.firebase.remoteconfig.internal.c.f28599f);
                            dVar.j(httpURLConnection).c();
                        } catch (IOException unused) {
                            com.google.firebase.remoteconfig.internal.d.b(httpURLConnection);
                            synchronized (dVar) {
                                dVar.f28611b = false;
                                if (numValueOf != null) {
                                    z10 = false;
                                }
                                if (z10) {
                                    dVar.f28622n.getClass();
                                    dVar.k(new Date(System.currentTimeMillis()));
                                }
                                if (z10) {
                                }
                                dVar.h();
                                return p191p5.j.e(null);
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            com.google.firebase.remoteconfig.internal.d.b(httpURLConnection);
                            synchronized (dVar) {
                                dVar.f28611b = false;
                                if (numValueOf != null && !com.google.firebase.remoteconfig.internal.d.d(numValueOf.intValue())) {
                                    z10 = false;
                                }
                                if (z10) {
                                    dVar.f28622n.getClass();
                                    dVar.k(new Date(System.currentTimeMillis()));
                                }
                                if (z10 || numValueOf.intValue() == 200) {
                                    dVar.h();
                                } else {
                                    String strF = String.format("Unable to connect to the server. Try again in a few minutes. HTTP status code: %d", numValueOf);
                                    if (numValueOf.intValue() == 403) {
                                        strF = com.google.firebase.remoteconfig.internal.d.f(httpURLConnection.getErrorStream());
                                    }
                                    dVar.g(new FirebaseRemoteConfigServerException(strF, numValueOf.intValue(), 0));
                                }
                                throw th;
                            }
                        }
                    }
                    com.google.firebase.remoteconfig.internal.d.b(httpURLConnection);
                    synchronized (dVar) {
                        dVar.f28611b = false;
                    }
                    boolean zD = com.google.firebase.remoteconfig.internal.d.d(responseCode);
                    if (zD) {
                        dVar.f28622n.getClass();
                        dVar.k(new Date(System.currentTimeMillis()));
                    }
                    if (zD || responseCode == 200) {
                        dVar.h();
                    } else {
                        String strF2 = String.format("Unable to connect to the server. Try again in a few minutes. HTTP status code: %d", numValueOf);
                        if (responseCode == 403) {
                            strF2 = com.google.firebase.remoteconfig.internal.d.f(httpURLConnection.getErrorStream());
                        }
                        firebaseRemoteConfigServerException = new FirebaseRemoteConfigServerException(strF2, responseCode, 0);
                        dVar.g(firebaseRemoteConfigServerException);
                    }
                } catch (IOException unused2) {
                    numValueOf = null;
                } catch (Throwable th3) {
                    numValueOf = null;
                    th = th3;
                }
                return p191p5.j.e(null);
            }
        } catch (IOException unused3) {
            httpURLConnection = null;
            numValueOf = null;
        } catch (Throwable th4) {
            numValueOf = null;
            th = th4;
            httpURLConnection = null;
        }
        com.google.firebase.remoteconfig.internal.d.b(httpURLConnection);
        synchronized (dVar) {
            dVar.f28611b = false;
            if (numValueOf != null && !com.google.firebase.remoteconfig.internal.d.d(numValueOf.intValue())) {
                z10 = false;
            }
            if (z10) {
                dVar.f28622n.getClass();
                dVar.k(new Date(System.currentTimeMillis()));
            }
            if (!z10 || numValueOf.intValue() == 200) {
                dVar.h();
            } else {
                String strF3 = String.format("Unable to connect to the server. Try again in a few minutes. HTTP status code: %d", numValueOf);
                if (numValueOf.intValue() == 403) {
                    strF3 = com.google.firebase.remoteconfig.internal.d.f(httpURLConnection.getErrorStream());
                }
                firebaseRemoteConfigServerException = new FirebaseRemoteConfigServerException(strF3, numValueOf.intValue(), 0);
                dVar.g(firebaseRemoteConfigServerException);
            }
            return p191p5.j.e(null);
        }
    }
}
